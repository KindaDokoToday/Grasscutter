package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.scene.GetSceneAreaReq;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketGetSceneAreaRsp;

@Opcodes(PacketOpcodes.GetSceneAreaReq)
public class HandlerGetSceneAreaReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        GetSceneAreaReq req = GetSceneAreaReq.parseFrom(payload);

        session.send(new PacketGetSceneAreaRsp(session.getPlayer(), req.getSceneId()));
    }
}
