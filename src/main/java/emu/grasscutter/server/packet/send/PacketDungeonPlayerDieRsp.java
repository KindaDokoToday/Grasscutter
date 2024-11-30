package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.dungeon.DungeonPlayerDieRsp;
import io.grasscutter.net.proto.retcode.Retcode;

public class PacketDungeonPlayerDieRsp extends BasePacket {

    public PacketDungeonPlayerDieRsp(Retcode retcode) {
        super(PacketOpcodes.DungeonPlayerDieRsp);

        DungeonPlayerDieRsp proto =
                DungeonPlayerDieRsp.newBuilder().setRetcode(retcode.getNumber()).build();

        this.setData(proto);
    }
}
