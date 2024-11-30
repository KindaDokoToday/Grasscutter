package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.player.CompoundQueueData;
import io.grasscutter.net.proto.player.GetCompoundDataRsp;
import io.grasscutter.net.proto.retcode.Retcode;
import java.util.*;

public class PacketGetCompoundDataRsp extends BasePacket {
    public PacketGetCompoundDataRsp(
            Set<Integer> unlockedCompounds, List<CompoundQueueData> compoundQueueData) {
        super(PacketOpcodes.GetCompoundDataRsp);
        var proto =
                GetCompoundDataRsp.newBuilder()
                        .addAllUnlockCompoundList(unlockedCompounds)
                        .addAllCompoundQueueDataList(compoundQueueData)
                        .setRetcode(Retcode.RET_SUCC_VALUE)
                        .build();
        setData(proto);
    }
}
