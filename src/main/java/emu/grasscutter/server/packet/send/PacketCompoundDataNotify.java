package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.player.CompoundDataNotify;
import io.grasscutter.net.proto.player.CompoundQueueData;
import java.util.*;

public class PacketCompoundDataNotify extends BasePacket {

    public PacketCompoundDataNotify(
            Set<Integer> unlockedCompounds, List<CompoundQueueData> compoundQueueData) {
        super(PacketOpcodes.CompoundDataNotify);
        var proto =
                CompoundDataNotify.newBuilder()
                        .addAllUnlockCompoundList(unlockedCompounds)
                        .addAllCompoundQueueDataList(compoundQueueData)
                        .build();
        this.setData(proto);
    }
}
