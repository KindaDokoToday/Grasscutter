package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.item.ReliquaryDecomposeReq;
import emu.grasscutter.server.game.GameSession;

@Opcodes(PacketOpcodes.ReliquaryDecomposeReq)
public class HandlerReliquaryDecomposeReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        ReliquaryDecomposeReq req = ReliquaryDecomposeReq.parseFrom(payload);
        session
                .getServer()
                .getCombineSystem()
                .decomposeReliquaries(
                        session.getPlayer(), req.getConfigId(), req.getTargetCount(), req.getGuidListList());
    }
}
