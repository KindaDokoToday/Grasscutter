package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.quest.BargainRecord;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.quest.BargainStartNotify;

public final class PacketBargainStartNotify extends BasePacket {
    public PacketBargainStartNotify(BargainRecord record) {
        super(PacketOpcodes.BargainStartNotify);

        this.setData(
                BargainStartNotify.newBuilder()
                        .setBargainId(record.getBargainId())
                        .setSnapshot(record.toSnapshot()));
    }
}
