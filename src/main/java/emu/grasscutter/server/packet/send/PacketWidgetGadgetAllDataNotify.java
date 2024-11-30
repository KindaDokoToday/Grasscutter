package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.widget.WidgetGadgetAllDataNotify;

public class PacketWidgetGadgetAllDataNotify extends BasePacket {

    public PacketWidgetGadgetAllDataNotify() {
        super(PacketOpcodes.AllWidgetDataNotify);

        WidgetGadgetAllDataNotify proto = WidgetGadgetAllDataNotify.newBuilder().build();

        this.setData(proto);
    }
}
