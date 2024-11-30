package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.home.HomeModuleUnlockNotify;

public class PacketHomeModuleUnlockNotify extends BasePacket {

    public PacketHomeModuleUnlockNotify(int targetModuleId) {
        super(PacketOpcodes.HomeModuleUnlockNotify);

        HomeModuleUnlockNotify proto =
                HomeModuleUnlockNotify.newBuilder().setModuleId(targetModuleId).build();

        this.setData(proto);
    }
}
