package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.h5_activity.H5ActivityIdsNotify;

public class PacketH5ActivityIdsNotify extends BasePacket {

    public PacketH5ActivityIdsNotify() {
        super(PacketOpcodes.H5ActivityIdsNotify);

        H5ActivityIdsNotify proto = H5ActivityIdsNotify.newBuilder().build();

        this.setData(proto);
    }
}
