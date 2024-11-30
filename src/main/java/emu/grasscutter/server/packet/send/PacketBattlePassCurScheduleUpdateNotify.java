package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.battle_pass.BattlePassCurScheduleUpdateNotify;

public class PacketBattlePassCurScheduleUpdateNotify extends BasePacket {

    public PacketBattlePassCurScheduleUpdateNotify(Player player) {
        super(PacketOpcodes.BattlePassCurScheduleUpdateNotify);

        var proto = BattlePassCurScheduleUpdateNotify.newBuilder();

        proto
                .setHaveCurSchedule(true)
                .setCurSchedule(player.getBattlePassManager().getScheduleProto())
                .build();

        setData(proto.build());
    }
}
