package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.inventory.GameItem;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.gadget.GadgetAutoPickDropInfoNotify;
import java.util.Collection;

public class PacketGadgetAutoPickDropInfoNotify extends BasePacket {

    public PacketGadgetAutoPickDropInfoNotify(Collection<GameItem> items) {
        super(PacketOpcodes.GadgetAutoPickDropInfoNotify);

        GadgetAutoPickDropInfoNotify.Builder proto = GadgetAutoPickDropInfoNotify.newBuilder();

        items.forEach(item -> proto.addItemList(item.toProto()));

        this.setData(proto);
    }
}
