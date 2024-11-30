package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.scene.SceneEntityDrownRsp;

public class PacketSceneEntityDrownRsp extends BasePacket {

    public PacketSceneEntityDrownRsp(int entityId) {
        super(PacketOpcodes.SceneEntityDrownRsp);

        SceneEntityDrownRsp proto = SceneEntityDrownRsp.newBuilder().setEntityId(entityId).build();

        this.setData(proto);
    }
}
