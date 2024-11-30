package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.inventory.GameItem;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.item.StoreItemChangeNotify;
import io.grasscutter.net.proto.define.StoreType;
import java.util.Collection;

public class PacketStoreItemChangeNotify extends BasePacket {

    private PacketStoreItemChangeNotify() {
        super(PacketOpcodes.StoreItemChangeNotify);
    }

    public PacketStoreItemChangeNotify(GameItem item) {
        this();

        StoreItemChangeNotify.Builder proto =
                StoreItemChangeNotify.newBuilder()
                        .setStoreType(StoreType.STORE_TYPE_PACK)
                        .addItemList(item.toProto());

        this.setData(proto);
    }

    public PacketStoreItemChangeNotify(Collection<GameItem> items) {
        this();

        StoreItemChangeNotify.Builder proto =
                StoreItemChangeNotify.newBuilder().setStoreType(StoreType.STORE_TYPE_PACK);

        items.forEach(item -> proto.addItemList(item.toProto()));

        this.setData(proto);
    }
}
