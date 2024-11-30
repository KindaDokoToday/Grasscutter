package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.ugc.CheckUgcStateReq;
import io.grasscutter.net.proto.retcode.Retcode;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketCheckUgcStateRsp;
import lombok.val;

@Opcodes(PacketOpcodes.CheckUgcStateReq)
public class HandlerCheckUgcStateReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        val req = CheckUgcStateReq.parseFrom(payload);

        session.send(new PacketCheckUgcStateRsp(Retcode.RET_SUCC));
    }
}
