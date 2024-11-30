package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.TowerTeamOuterClass;
import io.grasscutter.net.proto.tower.TowerTeamSelectReq;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketTowerTeamSelectRsp;

@Opcodes(PacketOpcodes.TowerTeamSelectReq)
public class HandlerTowerTeamSelectReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        TowerTeamSelectReq req = TowerTeamSelectReq.parseFrom(payload);

        var towerTeams =
                req.getTowerTeamListList().stream()
                        .map(TowerTeamOuterClass.TowerTeam::getAvatarGuidListList)
                        .toList();

        session.getPlayer().getTowerManager().teamSelect(req.getFloorId(), towerTeams);

        session.send(new PacketTowerTeamSelectRsp());
    }
}
