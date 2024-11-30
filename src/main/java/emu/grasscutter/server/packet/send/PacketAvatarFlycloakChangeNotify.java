package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.avatar.Avatar;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.avatar.AvatarFlycloakChangeNotify;

public class PacketAvatarFlycloakChangeNotify extends BasePacket {

    public PacketAvatarFlycloakChangeNotify(Avatar avatar) {
        super(PacketOpcodes.AvatarFlycloakChangeNotify);

        AvatarFlycloakChangeNotify proto =
                AvatarFlycloakChangeNotify.newBuilder()
                        .setAvatarGuid(avatar.getGuid())
                        .setFlycloakId(avatar.getFlyCloak())
                        .build();

        this.setData(proto);
    }
}
