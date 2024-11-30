package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.scene.SceneAreaWeatherNotify;

public class PacketSceneAreaWeatherNotify extends BasePacket {

    public PacketSceneAreaWeatherNotify(Player player) {
        super(PacketOpcodes.SceneAreaWeatherNotify);

        SceneAreaWeatherNotify proto =
                SceneAreaWeatherNotify.newBuilder()
                        .setWeatherAreaId(player.getWeatherId())
                        .setClimateType(player.getClimate().getValue())
                        .build();

        this.setData(proto);
    }
}
