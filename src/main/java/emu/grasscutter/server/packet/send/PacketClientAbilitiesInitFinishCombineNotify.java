package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.ability.ClientAbilitiesInitFinishCombineNotify;
import io.grasscutter.net.proto.ability.EntityAbilityInvokeEntry;
import java.util.List;

public class PacketClientAbilitiesInitFinishCombineNotify extends BasePacket {

    public PacketClientAbilitiesInitFinishCombineNotify(List<EntityAbilityInvokeEntry> entries) {
        super(PacketOpcodes.ClientAbilitiesInitFinishCombineNotify, true);

        ClientAbilitiesInitFinishCombineNotify proto =
                ClientAbilitiesInitFinishCombineNotify.newBuilder().addAllEntityInvokeList(entries).build();

        this.setData(proto);
    }
}
