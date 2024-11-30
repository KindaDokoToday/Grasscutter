package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.retcode.Retcode;
import io.grasscutter.net.proto.player.SetOpenStateRsp;

public class PacketSetOpenStateRsp extends BasePacket {
    public PacketSetOpenStateRsp(int openState, int value) {
        super(PacketOpcodes.SetOpenStateRsp);

        SetOpenStateRsp proto = SetOpenStateRsp.newBuilder().setKey(openState).setValue(value).build();

        this.setData(proto);
    }

    public PacketSetOpenStateRsp(Retcode retcode) {
        super(PacketOpcodes.SetOpenStateRsp);

        SetOpenStateRsp proto = SetOpenStateRsp.newBuilder().setRetcode(retcode.getNumber()).build();

        this.setData(proto);
    }
}
