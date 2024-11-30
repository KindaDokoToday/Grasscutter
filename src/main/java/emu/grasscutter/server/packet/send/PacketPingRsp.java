package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.misc.PingRsp;

public class PacketPingRsp extends BasePacket {

    public PacketPingRsp(int clientSeq, int time) {
        super(PacketOpcodes.PingRsp, clientSeq);

        PingRsp p = PingRsp.newBuilder().setClientTime(time).build();

        this.setData(p.toByteArray());
    }
}
