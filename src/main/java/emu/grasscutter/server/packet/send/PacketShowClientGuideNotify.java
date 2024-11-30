package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.scene.ShowClientGuideNotify;

public class PacketShowClientGuideNotify extends BasePacket {

    public PacketShowClientGuideNotify(String guideName) {
        super(PacketOpcodes.ShowClientGuideNotify, true);

        ShowClientGuideNotify proto =
                ShowClientGuideNotify.newBuilder().setGuideName(guideName).build();
        this.setData(proto);
    }
}
