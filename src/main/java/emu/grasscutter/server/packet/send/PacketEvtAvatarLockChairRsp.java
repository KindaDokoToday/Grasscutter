package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.entity.EntityAvatar;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.fight.EvtAvatarLockChairReq;
import io.grasscutter.net.proto.fight.EvtAvatarLockChairRsp;
import emu.grasscutter.net.proto.RetcodeOuterClass;

public class PacketEvtAvatarLockChairRsp extends BasePacket {
    public PacketEvtAvatarLockChairRsp(
            int clientSequence, EntityAvatar entityAvatar, EvtAvatarLockChairReq lockChairReq) {
        super(PacketOpcodes.EvtAvatarLockChairRsp);

        EvtAvatarLockChairRsp p =
                EvtAvatarLockChairRsp.newBuilder()
                        .setRetcode(RetcodeOuterClass.Retcode.RET_SUCC_VALUE)
                        .setEntityId(entityAvatar.getId())
                        .setPosition(lockChairReq.getPosition())
                        .setChairId(lockChairReq.getChairId())
                        .build();

        this.setData(p);
    }
}
