package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.avatar.AvatarExpeditionCallBackReq;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketAvatarExpeditionCallBackRsp;

@Opcodes(PacketOpcodes.AvatarExpeditionCallBackReq)
public class HandlerAvatarExpeditionCallBackReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        AvatarExpeditionCallBackReq req = AvatarExpeditionCallBackReq.parseFrom(payload);
        var player = session.getPlayer();

        for (int i = 0; i < req.getAvatarGuidCount(); i++) {
            player.removeExpeditionInfo(req.getAvatarGuid(i));
        }

        player.save();
        session.send(new PacketAvatarExpeditionCallBackRsp(player.getExpeditionInfo()));
    }
}
