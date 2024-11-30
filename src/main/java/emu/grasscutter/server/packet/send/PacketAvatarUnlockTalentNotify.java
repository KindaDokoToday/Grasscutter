package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.avatar.Avatar;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.skill.AvatarUnlockTalentNotify;

public class PacketAvatarUnlockTalentNotify extends BasePacket {

    public PacketAvatarUnlockTalentNotify(Avatar avatar, int talentId) {
        super(PacketOpcodes.AvatarUnlockTalentNotify);

        AvatarUnlockTalentNotify proto =
                AvatarUnlockTalentNotify.newBuilder()
                        .setAvatarGuid(avatar.getGuid())
                        .setEntityId(avatar.getEntityId())
                        .setTalentId(talentId)
                        .setSkillDepotId(avatar.getSkillDepotId())
                        .build();

        this.setData(proto);
    }
}
