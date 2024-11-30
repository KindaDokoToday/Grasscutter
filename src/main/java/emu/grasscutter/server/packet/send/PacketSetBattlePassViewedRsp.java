package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.battle_pass.SetBattlePassViewedRsp;

public class PacketSetBattlePassViewedRsp extends BasePacket {

    public PacketSetBattlePassViewedRsp(int scheduleId) {
        super(PacketOpcodes.SetBattlePassViewedRsp);

        SetBattlePassViewedRsp proto =
                SetBattlePassViewedRsp.newBuilder().setScheduleId(scheduleId).build();

        this.setData(proto);
    }
}
