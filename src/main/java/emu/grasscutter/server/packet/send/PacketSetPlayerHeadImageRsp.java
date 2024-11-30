package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.define.ProfilePicture;
import io.grasscutter.net.proto.social.SetPlayerHeadImageRsp;

public class PacketSetPlayerHeadImageRsp extends BasePacket {

    public PacketSetPlayerHeadImageRsp(Player player) {
        super(PacketOpcodes.SetPlayerHeadImageRsp);

        SetPlayerHeadImageRsp proto =
                SetPlayerHeadImageRsp.newBuilder()
                        .setProfilePicture(ProfilePicture.newBuilder().setAvatarId(player.getHeadImage()))
                        .build();

        this.setData(proto);
    }
}
