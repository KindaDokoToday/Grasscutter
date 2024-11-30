package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.fight.EvtAvatarSitDownNotify;

public class PacketEvtAvatarSitDownNotify extends BasePacket {

    public PacketEvtAvatarSitDownNotify(EvtAvatarSitDownNotify notify) {
        super(PacketOpcodes.EvtAvatarSitDownNotify);

        EvtAvatarSitDownNotify proto =
                EvtAvatarSitDownNotify.newBuilder()
                        .setEntityId(notify.getEntityId())
                        .setPosition(notify.getPosition())
                        .setChairId(notify.getChairId())
                        .build();

        this.setData(proto);
    }
}
