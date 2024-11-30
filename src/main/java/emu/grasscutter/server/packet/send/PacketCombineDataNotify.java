package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.item.CombineDataNotify;

public class PacketCombineDataNotify extends BasePacket {

    public PacketCombineDataNotify(Iterable<Integer> unlockedCombines) {
        super(PacketOpcodes.CombineDataNotify);

        CombineDataNotify proto =
                CombineDataNotify.newBuilder().addAllCombineIdList(unlockedCombines).build();

        this.setData(proto);
    }
}
