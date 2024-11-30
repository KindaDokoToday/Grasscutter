package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.world.Position;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.scene.PersonalSceneJumpRsp;

public class PacketPersonalSceneJumpRsp extends BasePacket {

    public PacketPersonalSceneJumpRsp(int sceneId, Position pos) {
        super(PacketOpcodes.PersonalSceneJumpRsp);

        PersonalSceneJumpRsp proto =
                PersonalSceneJumpRsp.newBuilder().setDestSceneId(sceneId).setDestPos(pos.toProto()).build();

        this.setData(proto);
    }
}
