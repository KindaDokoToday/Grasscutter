package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.player.ChangeGameTimeReq;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketChangeGameTimeRsp;

@Opcodes(PacketOpcodes.ChangeGameTimeReq)
public class HandlerChangeGameTimeReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = ChangeGameTimeReq.parseFrom(payload);

        session.getPlayer().getWorld().changeTime(req.getGameTime(), req.getExtraDays());
        session
                .getPlayer()
                .sendPacket(new PacketChangeGameTimeRsp(session.getPlayer(), req.getExtraDays()));
    }
}
