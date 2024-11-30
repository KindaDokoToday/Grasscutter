package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.world.World;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.misc.PlayerRTTInfo;
import io.grasscutter.net.proto.misc.WorldPlayerRTTNotify;

public class PacketWorldPlayerRTTNotify extends BasePacket {

    public PacketWorldPlayerRTTNotify(World world) {
        super(PacketOpcodes.WorldPlayerRTTNotify);

        WorldPlayerRTTNotify.Builder proto = WorldPlayerRTTNotify.newBuilder();

        for (Player player : world.getPlayers()) {
            proto.addPlayerRttList(
                    PlayerRTTInfo.newBuilder()
                            .setUid(player.getUid())
                            .setRtt(10) // TODO - put player ping here
                    );
        }

        this.setData(proto);
    }
}
