package emu.grasscutter.server.packet.recv;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.ability.AbilityInvokeEntry;
import io.grasscutter.net.proto.ability.ClientAbilitiesInitFinishCombineNotify;
import io.grasscutter.net.proto.ability.EntityAbilityInvokeEntry;
import emu.grasscutter.server.game.GameSession;

@Opcodes(PacketOpcodes.ClientAbilitiesInitFinishCombineNotify)
public class HandlerClientAbilitiesInitFinishCombineNotify extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        ClientAbilitiesInitFinishCombineNotify notif =
                ClientAbilitiesInitFinishCombineNotify.parseFrom(payload);

        Player player = session.getPlayer();

        // Call skill end in the player's ability manager.
        player.getAbilityManager().onSkillEnd(player);

        for (EntityAbilityInvokeEntry entry : notif.getEntityInvokeListList()) {
            for (AbilityInvokeEntry ability : entry.getInvokesList()) {
                player.getAbilityManager().onAbilityInvoke(ability);
                player.getClientAbilityInitFinishHandler().addEntry(ability.getForwardType(), ability);
            }

            if (entry.getInvokesList().size() > 0) {
                session.getPlayer().getClientAbilityInitFinishHandler().update(session.getPlayer());
            }
        }
    }
}
