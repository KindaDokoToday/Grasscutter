package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.quest.BargainRecord;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.quest.GetAllActivatedBargainDataRsp;
import io.grasscutter.net.proto.retcode.Retcode;
import java.util.Collection;

public final class PacketGetAllActivatedBargainDataRsp extends BasePacket {
    public PacketGetAllActivatedBargainDataRsp(Collection<BargainRecord> records) {
        super(PacketOpcodes.GetAllActivatedBargainDataRsp);

        this.setData(
                GetAllActivatedBargainDataRsp.newBuilder()
                        .setRetcode(Retcode.RET_SUCC.getNumber())
                        .addAllSnapshotList(records.stream().map(BargainRecord::toSnapshot).toList()));
    }
}
