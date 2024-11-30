package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.scene.CutSceneBeginNotify;

public class PacketCutsceneBeginNotify extends BasePacket {

    public PacketCutsceneBeginNotify(int cutsceneId) {
        super(PacketOpcodes.CutSceneBeginNotify);

        setData(CutSceneBeginNotify.newBuilder().setCutsceneId(cutsceneId));
    }
}
