package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.battle_pass.SetBattlePassViewedReq;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketSetBattlePassViewedRsp;

@Opcodes(PacketOpcodes.SetBattlePassViewedReq)
public class HandlerSetBattlePassViewedReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = SetBattlePassViewedReq.parseFrom(payload);

        session.getPlayer().getBattlePassManager().updateViewed();
        session.send(new PacketSetBattlePassViewedRsp(req.getScheduleId()));
    }
}
