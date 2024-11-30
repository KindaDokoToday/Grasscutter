package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.player.PlayerLevelRewardUpdateNotify;
import java.util.Set;

public class PacketPlayerLevelRewardUpdateNotify extends BasePacket {

    public PacketPlayerLevelRewardUpdateNotify(Set<Integer> rewardedLevels) {
        super(PacketOpcodes.PlayerLevelRewardUpdateNotify);

        PlayerLevelRewardUpdateNotify.Builder proto = PlayerLevelRewardUpdateNotify.newBuilder();

        for (Integer level : rewardedLevels) {
            proto.addLevelList(level);
        }

        this.setData(proto.build());
    }
}
