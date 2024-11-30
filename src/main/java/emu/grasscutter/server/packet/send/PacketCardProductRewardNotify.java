package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.recharge.CardProductRewardNotify;

public class PacketCardProductRewardNotify extends BasePacket {

    public PacketCardProductRewardNotify(int remainsDay) {
        super(PacketOpcodes.CardProductRewardNotify);

        CardProductRewardNotify proto =
                CardProductRewardNotify.newBuilder()
                        .setProductId("ys_chn_blessofmoon_tier5")
                        .setHcoin(90)
                        .setRemainDays(remainsDay)
                        .build();

        // Hard code Product id keep cool 😎

        this.setData(proto);
    }
}
