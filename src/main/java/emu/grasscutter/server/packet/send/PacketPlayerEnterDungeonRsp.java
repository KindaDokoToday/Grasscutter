package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.dungeon.PlayerEnterDungeonRsp;
import io.grasscutter.net.proto.retcode.Retcode;

public class PacketPlayerEnterDungeonRsp extends BasePacket {

    public PacketPlayerEnterDungeonRsp(int pointId, int dungeonId, boolean success) {
        super(PacketOpcodes.PlayerEnterDungeonRsp);

        PlayerEnterDungeonRsp proto =
                PlayerEnterDungeonRsp.newBuilder()
                        .setPointId(pointId)
                        .setDungeonId(dungeonId)
                        .setRetcode(success ? Retcode.RET_SUCC_VALUE : Retcode.RET_FAIL_VALUE)
                        .build();

        this.setData(proto);
    }
}
