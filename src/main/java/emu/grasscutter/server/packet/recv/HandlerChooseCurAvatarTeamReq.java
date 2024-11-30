package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.avatar.ChooseCurAvatarTeamReq;
import emu.grasscutter.server.game.GameSession;

@Opcodes(PacketOpcodes.ChooseCurAvatarTeamReq)
public class HandlerChooseCurAvatarTeamReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        ChooseCurAvatarTeamReq req = ChooseCurAvatarTeamReq.parseFrom(payload);

        session.getPlayer().getTeamManager().setCurrentTeam(req.getTeamId());
    }
}
