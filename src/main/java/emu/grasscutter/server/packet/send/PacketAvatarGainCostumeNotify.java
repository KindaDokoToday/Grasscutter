package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.avatar.AvatarGainCostumeNotify;

public class PacketAvatarGainCostumeNotify extends BasePacket {

    public PacketAvatarGainCostumeNotify(int costumeId) {
        super(PacketOpcodes.AvatarGainCostumeNotify);

        AvatarGainCostumeNotify proto =
                AvatarGainCostumeNotify.newBuilder().setCostumeId(costumeId).build();

        this.setData(proto);
    }
}
