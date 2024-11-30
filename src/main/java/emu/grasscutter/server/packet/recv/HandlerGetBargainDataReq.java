package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.quest.GetBargainDataReq;
import io.grasscutter.net.proto.retcode.Retcode;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketGetBargainDataRsp;

@Opcodes(PacketOpcodes.GetBargainDataReq)
public final class HandlerGetBargainDataReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var packet = GetBargainDataReq.parseFrom(payload);

        var bargainId = packet.getBargainId();
        var bargain = session.getPlayer().getPlayerProgress().getBargains().get(bargainId);
        if (bargain == null) {
            session.send(new PacketGetBargainDataRsp(Retcode.RET_BARGAIN_NOT_ACTIVATED));
            return;
        }

        session.send(new PacketGetBargainDataRsp(bargain));
    }
}
