package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.fight.MonsterForceAlertNotify;

// Sets openState to value
public class PacketMonsterForceAlertNotify extends BasePacket {

    public PacketMonsterForceAlertNotify(int monsterId) {
        super(PacketOpcodes.MonsterForceAlertNotify);

        MonsterForceAlertNotify proto =
                MonsterForceAlertNotify.newBuilder().setMonsterEntityId(monsterId).build();

        this.setData(proto);
    }
}
