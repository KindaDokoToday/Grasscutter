package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.scene.EnterSceneDoneRsp;

public class PacketEnterSceneDoneRsp extends BasePacket {

    public PacketEnterSceneDoneRsp(Player player) {
        super(PacketOpcodes.EnterSceneDoneRsp);

        EnterSceneDoneRsp p =
                EnterSceneDoneRsp.newBuilder().setEnterSceneToken(player.getEnterSceneToken()).build();

        this.setData(p);
    }
}
