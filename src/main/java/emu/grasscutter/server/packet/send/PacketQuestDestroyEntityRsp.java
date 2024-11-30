package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.quest.QuestDestroyEntityReq;
import io.grasscutter.net.proto.quest.QuestDestroyEntityRsp;
import io.grasscutter.net.proto.retcode.Retcode;

public class PacketQuestDestroyEntityRsp extends BasePacket {

    public PacketQuestDestroyEntityRsp(boolean success, QuestDestroyEntityReq req) {
        super(PacketOpcodes.QuestDestroyEntityRsp);

        this.setData(
                QuestDestroyEntityRsp.newBuilder()
                        .setQuestId(req.getQuestId())
                        .setEntityId(req.getEntityId())
                        .setSceneId(req.getSceneId())
                        .setRetcode(success ? Retcode.RET_SUCC_VALUE : Retcode.RET_FAIL_VALUE));
    }
}
