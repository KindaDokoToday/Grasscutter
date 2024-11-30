package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.item.ForgeGetQueueDataRsp;
import io.grasscutter.net.proto.item.ForgeQueueData;
import io.grasscutter.net.proto.retcode.Retcode;
import java.util.Map;

public class PacketForgeGetQueueDataRsp extends BasePacket {

    public PacketForgeGetQueueDataRsp(
            Retcode retcode, int numQueues, Map<Integer, ForgeQueueData> queueData) {
        super(PacketOpcodes.ForgeGetQueueDataRsp);

        ForgeGetQueueDataRsp.Builder builder =
                ForgeGetQueueDataRsp.newBuilder().setRetcode(retcode.getNumber()).setMaxQueueNum(numQueues);

        for (int queueId : queueData.keySet()) {
            var data = queueData.get(queueId);
            builder.putForgeQueueMap(queueId, data);
        }

        this.setData(builder.build());
    }
}
