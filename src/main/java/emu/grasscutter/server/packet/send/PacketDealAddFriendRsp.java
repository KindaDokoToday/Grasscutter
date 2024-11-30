package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.social.DealAddFriendResultType;
import io.grasscutter.net.proto.social.DealAddFriendRsp;

public class PacketDealAddFriendRsp extends BasePacket {

    public PacketDealAddFriendRsp(int targetUid, DealAddFriendResultType result) {
        super(PacketOpcodes.DealAddFriendRsp);

        DealAddFriendRsp proto =
                DealAddFriendRsp.newBuilder()
                        .setTargetUid(targetUid)
                        .setDealAddFriendResult(result)
                        .build();

        this.setData(proto);
    }
}
