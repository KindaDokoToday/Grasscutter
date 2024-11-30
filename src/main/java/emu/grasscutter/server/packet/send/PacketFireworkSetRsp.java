package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.widget.ReformFireworksRsp;
import io.grasscutter.net.proto.retcode.Retcode;

public class PacketFireworkSetRsp extends BasePacket {
    public PacketFireworkSetRsp() {
        super(PacketOpcodes.ReformFireworksRsp);

        this.setData(ReformFireworksRsp.newBuilder().setRetcode(Retcode.RET_SUCC.getNumber()));
    }
}
