package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.scene.EndCameraSceneLookNotify;

public class PacketEndCameraSceneLookNotify extends BasePacket {

    public PacketEndCameraSceneLookNotify() {
        super(PacketOpcodes.EndCameraSceneLookNotify);

        this.setData(EndCameraSceneLookNotify.newBuilder());
    }
}
