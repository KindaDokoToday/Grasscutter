package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.home.HomeModuleSeenRsp;
import java.util.List;

public class PacketHomeModuleSeenRsp extends BasePacket {

    public PacketHomeModuleSeenRsp(List<Integer> seen) {
        super(PacketOpcodes.HomeModuleSeenRsp);

        HomeModuleSeenRsp proto = HomeModuleSeenRsp.newBuilder().addAllSeenModuleIdList(seen).build();

        this.setData(proto);
    }
}
