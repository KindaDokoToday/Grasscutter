package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.player.CompoundQueueData;
import io.grasscutter.net.proto.player.PlayerCompoundMaterialRsp;
import io.grasscutter.net.proto.retcode.Retcode;

public class PacketPlayerCompoundMaterialRsp extends BasePacket {
    /**
     * Builder for successful message.
     *
     * @param compoundQueueData new compound queue
     */
    public PacketPlayerCompoundMaterialRsp(CompoundQueueData compoundQueueData) {
        super(PacketOpcodes.PlayerCompoundMaterialRsp);
        PlayerCompoundMaterialRsp proto =
                PlayerCompoundMaterialRsp.newBuilder()
                        .setCompoundQueueData(compoundQueueData)
                        .setRetcode(Retcode.RET_SUCC_VALUE)
                        .build();
        setData(proto);
    }

    /**
     * Builder for failed message.
     *
     * @param retcode error code
     */
    public PacketPlayerCompoundMaterialRsp(int retcode) {
        super(PacketOpcodes.PlayerCompoundMaterialRsp);
        PlayerCompoundMaterialRsp proto =
                PlayerCompoundMaterialRsp.newBuilder().setRetcode(retcode).build();
        setData(proto);
    }
}
