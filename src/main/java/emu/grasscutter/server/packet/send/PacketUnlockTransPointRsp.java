package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.retcode.Retcode;
import io.grasscutter.net.proto.scene.UnlockTransPointRsp;

public class PacketUnlockTransPointRsp extends BasePacket {
    public PacketUnlockTransPointRsp(Retcode retcode) {
        super(PacketOpcodes.UnlockTransPointRsp);

        UnlockTransPointRsp proto =
                UnlockTransPointRsp.newBuilder().setRetcode(retcode.getNumber()).build();

        this.setData(proto);
    }
}
