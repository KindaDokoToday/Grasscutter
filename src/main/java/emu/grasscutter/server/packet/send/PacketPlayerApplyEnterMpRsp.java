package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.mp.PlayerApplyEnterMpRsp;

public class PacketPlayerApplyEnterMpRsp extends BasePacket {

    public PacketPlayerApplyEnterMpRsp(int targetUid) {
        super(PacketOpcodes.PlayerApplyEnterMpRsp);

        PlayerApplyEnterMpRsp proto =
                PlayerApplyEnterMpRsp.newBuilder().setTargetUid(targetUid).build();

        this.setData(proto);
    }
}
