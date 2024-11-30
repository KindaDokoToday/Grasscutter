package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.player.ChangeGameTimeRsp;

public class PacketChangeGameTimeRsp extends BasePacket {

    public PacketChangeGameTimeRsp(Player player, int extraDays) {
        super(PacketOpcodes.ChangeGameTimeRsp);

        ChangeGameTimeRsp proto =
                ChangeGameTimeRsp.newBuilder()
                        .setCurGameTime(player.getWorld().getGameTime())
                        .setExtraDays(extraDays)
                        .build();

        this.setData(proto);
    }
}
