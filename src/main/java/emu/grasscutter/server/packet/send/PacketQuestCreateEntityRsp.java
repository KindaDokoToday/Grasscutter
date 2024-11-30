package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.quest.QuestCreateEntityReq;
import io.grasscutter.net.proto.quest.QuestCreateEntityRsp;
import io.grasscutter.net.proto.retcode.Retcode;

public class PacketQuestCreateEntityRsp extends BasePacket {

    public PacketQuestCreateEntityRsp(int entityId, QuestCreateEntityReq req) {
        super(PacketOpcodes.QuestCreateEntityRsp);

        this.setData(
                QuestCreateEntityRsp.newBuilder()
                        .setQuestId(req.getQuestId())
                        .setEntity(req.getEntity())
                        .setParentQuestId(req.getParentQuestId())
                        .setIsRewind(req.getIsRewind())
                        .setEntityId(entityId)
                        .setRetcode(entityId != -1 ? Retcode.RET_SUCC_VALUE : Retcode.RET_FAIL_VALUE));
    }
}
