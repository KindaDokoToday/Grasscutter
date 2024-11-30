package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.battle_pass.TakeBattlePassRewardReq;
import emu.grasscutter.server.game.GameSession;

@Opcodes(PacketOpcodes.TakeBattlePassRewardReq)
public class HandlerTakeBattlePassRewardReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = TakeBattlePassRewardReq.parseFrom(payload);

        session.getPlayer().getBattlePassManager().takeReward(req.getTakeOptionListList());
    }
}
