package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.social.DeleteFriendReq;
import emu.grasscutter.server.game.GameSession;

@Opcodes(PacketOpcodes.DeleteFriendReq)
public class HandlerDeleteFriendReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        DeleteFriendReq req = DeleteFriendReq.parseFrom(payload);

        session.getPlayer().getFriendsList().deleteFriend(req.getTargetUid());
    }
}
