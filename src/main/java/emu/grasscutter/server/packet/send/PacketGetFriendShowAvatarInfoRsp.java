package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.social.GetFriendShowAvatarInfoRsp;
import io.grasscutter.net.proto.define.ShowAvatarInfo;
import java.util.List;

@Opcodes(PacketOpcodes.GetFriendShowAvatarInfoRsp)
public class PacketGetFriendShowAvatarInfoRsp extends BasePacket {

    public PacketGetFriendShowAvatarInfoRsp(int uid, List<ShowAvatarInfo> showAvatarInfoList) {
        super(PacketOpcodes.GetFriendShowAvatarInfoRsp);

        GetFriendShowAvatarInfoRsp.Builder p =
                GetFriendShowAvatarInfoRsp.newBuilder()
                        .setUid(uid)
                        .addAllShowAvatarInfoList(showAvatarInfoList);

        this.setData(p.build());
    }
}
