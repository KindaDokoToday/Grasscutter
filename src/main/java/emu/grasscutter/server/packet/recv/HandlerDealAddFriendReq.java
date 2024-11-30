package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.social.DealAddFriendReq;
import emu.grasscutter.server.game.GameSession;

@Opcodes(PacketOpcodes.DealAddFriendReq)
public class HandlerDealAddFriendReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        DealAddFriendReq req = DealAddFriendReq.parseFrom(payload);

        session
                .getPlayer()
                .getFriendsList()
                .handleFriendRequest(req.getTargetUid(), req.getDealAddFriendResult());
    }
}
