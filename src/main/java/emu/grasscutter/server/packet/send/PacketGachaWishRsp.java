package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.gacha.GachaWishRsp;

public class PacketGachaWishRsp extends BasePacket {

    public PacketGachaWishRsp(
            int gachaType, int scheduleId, int itemId, int progress, int maxProgress) {
        super(PacketOpcodes.GachaWishRsp);

        GachaWishRsp proto =
                GachaWishRsp.newBuilder()
                        .setGachaType(gachaType)
                        .setGachaScheduleId(scheduleId)
                        .setWishItemId(itemId)
                        .setWishProgress(progress)
                        .setWishMaxProgress(maxProgress)
                        .build();

        this.setData(proto);
    }
}
