package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.social.GetPlayerSocialDetailRsp;
import emu.grasscutter.net.proto.RetcodeOuterClass;
import io.grasscutter.net.proto.social.SocialDetail;

public class PacketGetPlayerSocialDetailRsp extends BasePacket {

    public PacketGetPlayerSocialDetailRsp(SocialDetail.Builder detail) {
        super(PacketOpcodes.GetPlayerSocialDetailRsp);

        GetPlayerSocialDetailRsp.Builder proto = GetPlayerSocialDetailRsp.newBuilder();

        if (detail != null) {
            proto.setDetailData(detail);
        } else {
            proto.setRetcode(RetcodeOuterClass.Retcode.RET_SVR_ERROR_VALUE);
        }

        this.setData(proto);
    }
}
