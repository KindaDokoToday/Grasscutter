package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.social.AskAddFriendRsp;

public class PacketAskAddFriendRsp extends BasePacket {

    public PacketAskAddFriendRsp(int targetUid) {
        super(PacketOpcodes.AskAddFriendRsp);

        AskAddFriendRsp proto = AskAddFriendRsp.newBuilder().setTargetUid(targetUid).build();

        this.setData(proto);
    }
}
