package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.fight.AiSyncInfo;
import io.grasscutter.net.proto.fight.EntityAiSyncNotify;

public class PacketEntityAiSyncNotify extends BasePacket {

    public PacketEntityAiSyncNotify(EntityAiSyncNotify notify) {
        super(PacketOpcodes.EntityAiSyncNotify, true);

        EntityAiSyncNotify.Builder proto = EntityAiSyncNotify.newBuilder();

        for (int monsterId : notify.getLocalAvatarAlertedMonsterListList()) {
            proto.addInfoList(AiSyncInfo.newBuilder().setEntityId(monsterId).setHasPathToTarget(true));
        }

        this.setData(proto);
    }
}
