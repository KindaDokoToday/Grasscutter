package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.fight.EntityAiSyncNotify;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketEntityAiSyncNotify;

@Opcodes(PacketOpcodes.EntityAiSyncNotify)
public class HandlerEntityAiSyncNotify extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        EntityAiSyncNotify notify = EntityAiSyncNotify.parseFrom(payload);

        if (notify.getLocalAvatarAlertedMonsterListCount() > 0) {
            session.getPlayer().getScene().broadcastPacket(new PacketEntityAiSyncNotify(notify));
        }
    }
}
