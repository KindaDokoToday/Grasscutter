package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.social.DeleteFriendNotify;

public class PacketDeleteFriendNotify extends BasePacket {

    public PacketDeleteFriendNotify(int targetUid) {
        super(PacketOpcodes.DeleteFriendNotify);

        DeleteFriendNotify proto = DeleteFriendNotify.newBuilder().setTargetUid(targetUid).build();

        this.setData(proto);
    }
}
