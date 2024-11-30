package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.player.PlayerDataNotify;
import io.grasscutter.net.proto.define.PropValue;

public class PacketPlayerDataNotify extends BasePacket {

    public PacketPlayerDataNotify(Player player) {
        super(PacketOpcodes.PlayerDataNotify, 2);

        PlayerDataNotify.Builder p =
                PlayerDataNotify.newBuilder()
                        .setNickName(player.getNickname())
                        .setServerTime(System.currentTimeMillis())
                        .setIsFirstLoginToday(true)
                        .setRegionId(player.getRegionId());

        player
                .getProperties()
                .forEach(
                        (key, value) -> {
                            p.putPropMap(
                                    key, PropValue.newBuilder().setType(key).setIval(value).setVal(value).build());
                        });

        this.setData(p.build());
    }
}
