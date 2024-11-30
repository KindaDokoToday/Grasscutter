package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.scene.WorldPlayerReviveRsp;

public class PacketWorldPlayerReviveRsp extends BasePacket {

    public PacketWorldPlayerReviveRsp() {
        super(PacketOpcodes.WorldPlayerReviveRsp);

        WorldPlayerReviveRsp.Builder proto = WorldPlayerReviveRsp.newBuilder();

        this.setData(proto.build());
    }
}
