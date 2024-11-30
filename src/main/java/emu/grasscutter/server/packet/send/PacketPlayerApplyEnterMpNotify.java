package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.mp.PlayerApplyEnterMpNotify;

public class PacketPlayerApplyEnterMpNotify extends BasePacket {

    public PacketPlayerApplyEnterMpNotify(Player srcPlayer) {
        super(PacketOpcodes.PlayerApplyEnterMpNotify);

        PlayerApplyEnterMpNotify proto =
                PlayerApplyEnterMpNotify.newBuilder()
                        .setSrcPlayerInfo(srcPlayer.getOnlinePlayerInfo())
                        .build();

        this.setData(proto);
    }
}
