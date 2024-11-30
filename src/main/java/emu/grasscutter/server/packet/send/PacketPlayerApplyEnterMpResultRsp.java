package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.mp.PlayerApplyEnterMpResultRsp;

public class PacketPlayerApplyEnterMpResultRsp extends BasePacket {

    public PacketPlayerApplyEnterMpResultRsp(int applyUid, boolean isAgreed) {
        super(PacketOpcodes.PlayerApplyEnterMpResultRsp);

        PlayerApplyEnterMpResultRsp proto =
                PlayerApplyEnterMpResultRsp.newBuilder()
                        .setApplyUid(applyUid)
                        .setIsAgreed(isAgreed)
                        .build();

        this.setData(proto);
    }
}
