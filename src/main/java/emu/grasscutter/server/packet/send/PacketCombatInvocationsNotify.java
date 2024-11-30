package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.fight.CombatInvocationsNotify;
import io.grasscutter.net.proto.fight.CombatInvokeEntry;
import java.util.List;

public class PacketCombatInvocationsNotify extends BasePacket {

    public PacketCombatInvocationsNotify(CombatInvokeEntry entry) {
        super(PacketOpcodes.CombatInvocationsNotify, true);

        CombatInvocationsNotify proto =
                CombatInvocationsNotify.newBuilder().addInvokeList(entry).build();

        this.setData(proto);
    }

    public PacketCombatInvocationsNotify(List<CombatInvokeEntry> entries) {
        super(PacketOpcodes.CombatInvocationsNotify, true);

        CombatInvocationsNotify proto =
                CombatInvocationsNotify.newBuilder().addAllInvokeList(entries).build();

        this.setData(proto);
    }
}
