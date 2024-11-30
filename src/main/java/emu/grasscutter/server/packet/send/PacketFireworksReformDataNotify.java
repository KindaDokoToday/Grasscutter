package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.widget.FireworksReformDataNotify;
import io.grasscutter.net.proto.widget.FireworksReformData;

public class PacketFireworksReformDataNotify extends BasePacket {

    public PacketFireworksReformDataNotify(FireworksReformData data) {
        super(PacketOpcodes.FireworksReformDataNotify);

        this.setData(FireworksReformDataNotify.newBuilder().addFireworksReformDataList(data));
    }
}
