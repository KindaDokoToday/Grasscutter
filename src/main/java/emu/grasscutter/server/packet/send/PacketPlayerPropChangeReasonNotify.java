package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.PlayerProperty;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.property.PlayerPropChangeReasonNotify;
import io.grasscutter.net.proto.property.PropChangeReason;

public class PacketPlayerPropChangeReasonNotify extends BasePacket {

    public PacketPlayerPropChangeReasonNotify(
            Player player,
            PlayerProperty prop,
            int oldValue,
            int newValue,
            PropChangeReason changeReason) {
        super(PacketOpcodes.PlayerPropChangeReasonNotify);

        this.buildHeader(0);

        PlayerPropChangeReasonNotify proto =
                PlayerPropChangeReasonNotify.newBuilder()
                        .setPropType(prop.getId())
                        .setReason(changeReason)
                        .setOldValue(oldValue)
                        .setCurValue(newValue)
                        .build();

        this.setData(proto);
    }
}
