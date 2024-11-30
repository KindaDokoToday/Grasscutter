package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.tower.TowerTeamSelectRsp;

public class PacketTowerTeamSelectRsp extends BasePacket {

    public PacketTowerTeamSelectRsp() {
        super(PacketOpcodes.TowerTeamSelectRsp);

        TowerTeamSelectRsp proto = TowerTeamSelectRsp.newBuilder().build();

        this.setData(proto);
    }
}
