package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.ugc.CheckUgcUpdateRsp;
import io.grasscutter.net.proto.ugc.UgcType;

public class PacketCheckUgcUpdateRsp extends BasePacket {

    public PacketCheckUgcUpdateRsp(UgcType ugcType) {
        super(PacketOpcodes.CheckUgcUpdateRsp);

        var proto = CheckUgcUpdateRsp.newBuilder();

        proto.setUgcType(ugcType);

        this.setData(proto);
    }
}
