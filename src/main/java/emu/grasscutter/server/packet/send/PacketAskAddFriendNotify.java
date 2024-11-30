package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.friends.Friendship;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.social.AskAddFriendNotify;

public class PacketAskAddFriendNotify extends BasePacket {

    public PacketAskAddFriendNotify(Friendship friendship) {
        super(PacketOpcodes.AskAddFriendNotify);

        AskAddFriendNotify proto =
                AskAddFriendNotify.newBuilder()
                        .setTargetUid(friendship.getFriendId())
                        .setTargetFriendBrief(friendship.toProto())
                        .build();

        this.setData(proto);
    }
}
