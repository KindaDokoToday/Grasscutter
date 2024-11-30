package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.social.UnlockNameCardNotify;

public class PacketUnlockNameCardNotify extends BasePacket {

    public PacketUnlockNameCardNotify(int nameCard) {
        super(PacketOpcodes.UnlockNameCardNotify);

        UnlockNameCardNotify proto = UnlockNameCardNotify.newBuilder().setNameCardId(nameCard).build();

        this.setData(proto);
    }
}
