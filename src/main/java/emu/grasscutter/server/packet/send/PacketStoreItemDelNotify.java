package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.inventory.GameItem;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.item.StoreItemDelNotify;
import io.grasscutter.net.proto.define.StoreType;
import java.util.Collection;

public class PacketStoreItemDelNotify extends BasePacket {

    private PacketStoreItemDelNotify() {
        super(PacketOpcodes.StoreItemDelNotify);
    }

    public PacketStoreItemDelNotify(GameItem item) {
        this();

        StoreItemDelNotify.Builder proto =
                StoreItemDelNotify.newBuilder()
                        .setStoreType(StoreType.STORE_TYPE_PACK)
                        .addGuidList(item.getGuid());

        this.setData(proto);
    }

    public PacketStoreItemDelNotify(Collection<GameItem> items) {
        this();

        StoreItemDelNotify.Builder proto =
                StoreItemDelNotify.newBuilder().setStoreType(StoreType.STORE_TYPE_PACK);

        items.stream().forEach(item -> proto.addGuidList(item.getGuid()));

        this.setData(proto);
    }
}
