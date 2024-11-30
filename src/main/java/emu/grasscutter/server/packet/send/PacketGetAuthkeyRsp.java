package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.mail.GetAuthkeyRsp;
import emu.grasscutter.net.proto.RetcodeOuterClass;

public class PacketGetAuthkeyRsp extends BasePacket {

    public PacketGetAuthkeyRsp() {
        super(PacketOpcodes.GetAuthkeyRsp);

        GetAuthkeyRsp proto =
                GetAuthkeyRsp.newBuilder()
                        .setRetcode(RetcodeOuterClass.Retcode.RET_SVR_ERROR_VALUE)
                        .build();

        this.setData(proto);
    }
}
