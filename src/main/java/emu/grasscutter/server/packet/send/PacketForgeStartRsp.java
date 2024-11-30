package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.item.ForgeStartRsp;
import io.grasscutter.net.proto.retcode.Retcode;

public class PacketForgeStartRsp extends BasePacket {

    public PacketForgeStartRsp(Retcode retcode) {
        super(PacketOpcodes.ForgeStartRsp);

        ForgeStartRsp proto = ForgeStartRsp.newBuilder().setRetcode(retcode.getNumber()).build();

        this.setData(proto);
    }
}
