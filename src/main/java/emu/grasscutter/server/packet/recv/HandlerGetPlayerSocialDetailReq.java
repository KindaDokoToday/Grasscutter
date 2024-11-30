package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.social.GetPlayerSocialDetailReq;
import io.grasscutter.net.proto.social.SocialDetail;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketGetPlayerSocialDetailRsp;

@Opcodes(PacketOpcodes.GetPlayerSocialDetailReq)
public class HandlerGetPlayerSocialDetailReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        GetPlayerSocialDetailReq req = GetPlayerSocialDetailReq.parseFrom(payload);

        SocialDetail.Builder detail = session.getServer().getSocialDetailByUid(req.getUid());

        if (detail != null) {
            detail.setIsFriend(session.getPlayer().getFriendsList().isFriendsWith(req.getUid()));
        }

        session.send(new PacketGetPlayerSocialDetailRsp(detail));
    }
}
