package emu.grasscutter.server.packet.recv;

import emu.grasscutter.game.entity.EntityAvatar;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.fight.EvtAvatarLockChairReq;
import emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketEvtAvatarLockChairRsp;

@Opcodes(PacketOpcodes.EvtAvatarLockChairReq)
public class HandlerEvtAvatarLockChairReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        PacketHead head = PacketHead.parseFrom(header);
        EvtAvatarLockChairReq lockChairReq = EvtAvatarLockChairReq.parseFrom(payload);

        EntityAvatar entityAvatar = session.getPlayer().getTeamManager().getCurrentAvatarEntity();

        session.send(
                new PacketEvtAvatarLockChairRsp(head.getClientSequenceId(), entityAvatar, lockChairReq));
    }
}
