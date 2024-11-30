package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.avatar.AvatarGainFlycloakNotify;

public class PacketAvatarGainFlycloakNotify extends BasePacket {

    public PacketAvatarGainFlycloakNotify(int flycloak) {
        super(PacketOpcodes.AvatarGainFlycloakNotify);

        AvatarGainFlycloakNotify proto =
                AvatarGainFlycloakNotify.newBuilder().setFlycloakId(flycloak).build();

        this.setData(proto);
    }
}
