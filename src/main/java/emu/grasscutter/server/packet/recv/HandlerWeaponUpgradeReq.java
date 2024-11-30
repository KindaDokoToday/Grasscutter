package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.item.WeaponUpgradeReq;
import emu.grasscutter.server.game.GameSession;

@Opcodes(PacketOpcodes.WeaponUpgradeReq)
public class HandlerWeaponUpgradeReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        WeaponUpgradeReq req = WeaponUpgradeReq.parseFrom(payload);

        // Level up weapon
        session
                .getServer()
                .getInventorySystem()
                .upgradeWeapon(
                        session.getPlayer(),
                        req.getTargetWeaponGuid(),
                        req.getFoodWeaponGuidListList(),
                        req.getItemParamListList());
    }
}
