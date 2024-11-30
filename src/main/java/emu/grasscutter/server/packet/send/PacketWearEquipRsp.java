package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.item.WearEquipRsp;

public class PacketWearEquipRsp extends BasePacket {

    public PacketWearEquipRsp(long avatarGuid, long equipGuid) {
        super(PacketOpcodes.WearEquipRsp);

        WearEquipRsp proto =
                WearEquipRsp.newBuilder().setAvatarGuid(avatarGuid).setEquipGuid(equipGuid).build();

        this.setData(proto);
    }
}
