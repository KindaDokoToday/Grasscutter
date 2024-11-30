package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.gadget.SelectWorktopOptionRsp;

public class PacketSelectWorktopOptionRsp extends BasePacket {

    public PacketSelectWorktopOptionRsp(int entityId, int optionId) {
        super(PacketOpcodes.SelectWorktopOptionRsp);

        SelectWorktopOptionRsp proto =
                SelectWorktopOptionRsp.newBuilder()
                        .setGadgetEntityId(entityId)
                        .setOptionId(optionId)
                        .build();

        this.setData(proto);
    }
}
