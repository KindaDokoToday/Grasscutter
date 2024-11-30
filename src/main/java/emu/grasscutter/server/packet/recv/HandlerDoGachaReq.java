package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.gacha.DoGachaReq;
import emu.grasscutter.server.game.GameSession;

@Opcodes(PacketOpcodes.DoGachaReq)
public class HandlerDoGachaReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        DoGachaReq req = DoGachaReq.parseFrom(payload);

        session
                .getServer()
                .getGachaSystem()
                .doPulls(session.getPlayer(), req.getGachaScheduleId(), req.getGachaTimes());
    }
}
