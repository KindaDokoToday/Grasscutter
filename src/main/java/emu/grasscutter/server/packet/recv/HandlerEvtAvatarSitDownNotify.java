package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.fight.EvtAvatarSitDownNotify;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketEvtAvatarSitDownNotify;

@Opcodes(PacketOpcodes.EvtAvatarSitDownNotify)
public class HandlerEvtAvatarSitDownNotify extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        EvtAvatarSitDownNotify notify = EvtAvatarSitDownNotify.parseFrom(payload);

        session.getPlayer().getScene().broadcastPacket(new PacketEvtAvatarSitDownNotify(notify));
    }
}
