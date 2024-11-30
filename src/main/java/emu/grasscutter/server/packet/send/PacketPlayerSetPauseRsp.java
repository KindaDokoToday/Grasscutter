package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.player.PlayerSetPauseRsp;
import io.grasscutter.net.proto.retcode.Retcode;

public class PacketPlayerSetPauseRsp extends BasePacket {

    public PacketPlayerSetPauseRsp(Retcode retcode) {
        super(PacketOpcodes.PlayerSetPauseRsp);

        this.setData(PlayerSetPauseRsp.newBuilder().setRetcode(retcode.getNumber()));
    }
}
