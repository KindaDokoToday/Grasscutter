package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.entity.EntityMonster;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.monster.MonsterSummonTagNotify;
import java.util.*;

public class PacketMonsterSummonTagNotify extends BasePacket {

    public PacketMonsterSummonTagNotify(EntityMonster monsterEntity) {
        super(PacketOpcodes.MonsterSummonTagNotify);

        var proto = MonsterSummonTagNotify.newBuilder().setMonsterEntityId(monsterEntity.getId());
        monsterEntity.getSummonTagMap().forEach((k, v) -> proto.putSummonTagMap(k, v == null ? 0 : 1));

        this.setData(proto.build());
    }
}
