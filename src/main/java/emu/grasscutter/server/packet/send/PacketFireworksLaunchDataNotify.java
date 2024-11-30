package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.widget.FireworksLaunchDataNotify;
import io.grasscutter.net.proto.widget.FireworksLaunchSchemeData;

public class PacketFireworksLaunchDataNotify extends BasePacket {
    public PacketFireworksLaunchDataNotify(FireworksLaunchSchemeData data) {
        super(PacketOpcodes.FireworksLaunchDataNotify);

        this.setData(FireworksLaunchDataNotify.newBuilder().addSchemeDataList(data));
    }
}
