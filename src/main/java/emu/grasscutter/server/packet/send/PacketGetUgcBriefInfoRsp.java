package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.ugc.GetUgcBriefInfoRsp;
import emu.grasscutter.net.proto.RetcodeOuterClass;
import io.grasscutter.net.proto.ugc.UgcMusicBriefInfo;
import io.grasscutter.net.proto.ugc.UgcType;

public class PacketGetUgcBriefInfoRsp extends BasePacket {

    public PacketGetUgcBriefInfoRsp(RetcodeOuterClass.Retcode ret, UgcType unknownEnum1) {
        super(PacketOpcodes.GetUgcBriefInfoRsp);

        var proto = GetUgcBriefInfoRsp.newBuilder();

        proto.setRetcode(ret.getNumber()).setUgcType(unknownEnum1);

        this.setData(proto);
    }

    public PacketGetUgcBriefInfoRsp(UgcMusicBriefInfo briefInfo, UgcType ugcType) {
        super(PacketOpcodes.GetUgcBriefInfoRsp);

        var proto = GetUgcBriefInfoRsp.newBuilder();

        proto.setMusicBriefInfo(briefInfo).setUgcType(ugcType);

        this.setData(proto);
    }
}
