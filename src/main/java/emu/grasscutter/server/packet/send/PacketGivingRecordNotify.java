package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.player.GivingRecordNotify;
import io.grasscutter.net.proto.player.GivingRecord;
import java.util.Collection;

public final class PacketGivingRecordNotify extends BasePacket {
    public PacketGivingRecordNotify(Collection<GivingRecord> records) {
        super(PacketOpcodes.GivingRecordNotify);

        this.setData(GivingRecordNotify.newBuilder().addAllGivingRecordList(records).build());
    }
}
