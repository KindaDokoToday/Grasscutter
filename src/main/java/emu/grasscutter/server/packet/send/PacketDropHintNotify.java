package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.inventory.GameItem;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.item.DropHintNotify;
import io.grasscutter.net.proto.define.Vector;

public class PacketDropHintNotify extends BasePacket {
    public PacketDropHintNotify(int itemId, Vector position) {
        super(PacketOpcodes.DropHintNotify);

        var proto = DropHintNotify.newBuilder().addItemIdList(itemId).setPosition(position);
        this.setData(proto.build());
    }

    public PacketDropHintNotify(Iterable<GameItem> items, Vector position) {
        super(PacketOpcodes.DropHintNotify);

        var proto = DropHintNotify.newBuilder();
        items.forEach(i -> proto.addItemIdList(i.getItemId()));
        proto.setPosition(position);
        this.setData(proto.build());
    }
}
