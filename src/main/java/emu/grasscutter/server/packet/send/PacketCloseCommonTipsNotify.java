package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.scene.CloseCommonTipsNotify;

public class PacketCloseCommonTipsNotify extends BasePacket {

    public PacketCloseCommonTipsNotify() {
        super(PacketOpcodes.CloseCommonTipsNotify);
        this.setData(CloseCommonTipsNotify.newBuilder().build());
    }
}
