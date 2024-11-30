package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.scene.SceneInitFinishRsp;

public class PacketSceneInitFinishRsp extends BasePacket {

    public PacketSceneInitFinishRsp(Player player) {
        super(PacketOpcodes.SceneInitFinishRsp, 11);

        SceneInitFinishRsp p =
                SceneInitFinishRsp.newBuilder().setEnterSceneToken(player.getEnterSceneToken()).build();

        this.setData(p.toByteArray());
    }
}
