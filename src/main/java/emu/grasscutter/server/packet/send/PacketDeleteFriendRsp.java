package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.social.DeleteFriendRsp;

public class PacketDeleteFriendRsp extends BasePacket {

    public PacketDeleteFriendRsp(int targetUid) {
        super(PacketOpcodes.DeleteFriendRsp);

        DeleteFriendRsp proto = DeleteFriendRsp.newBuilder().setTargetUid(targetUid).build();

        this.setData(proto);
    }
}
