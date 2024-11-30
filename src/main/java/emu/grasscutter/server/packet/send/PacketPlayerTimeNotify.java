package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.player.PlayerTimeNotify;

public class PacketPlayerTimeNotify extends BasePacket {

    public PacketPlayerTimeNotify(Player player) {
        super(PacketOpcodes.PlayerTimeNotify);

        PlayerTimeNotify proto =
                PlayerTimeNotify.newBuilder()
                        .setIsPaused(player.isPaused())
                        .setPlayerTime(player.getClientTime())
                        .setServerTime(System.currentTimeMillis())
                        .build();

        this.setData(proto);
    }
}
