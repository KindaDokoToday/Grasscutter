package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.friends.Friendship;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.social.GetPlayerAskFriendListRsp;

public class PacketGetPlayerAskFriendListRsp extends BasePacket {

    public PacketGetPlayerAskFriendListRsp(Player player) {
        super(PacketOpcodes.GetPlayerAskFriendListRsp);

        GetPlayerAskFriendListRsp.Builder proto = GetPlayerAskFriendListRsp.newBuilder();

        for (Friendship friendship : player.getFriendsList().getPendingFriends().values()) {
            if (friendship.getAskerId() == player.getUid()) {
                continue;
            }
            proto.addAskFriendList(friendship.toProto());
        }

        this.setData(proto);
    }
}
