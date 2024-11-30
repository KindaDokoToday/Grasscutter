package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.quest.QuestGlobalVarNotify;
import io.grasscutter.net.proto.quest.QuestGlobalVar;

public final class PacketQuestGlobalVarNotify extends BasePacket {
    public PacketQuestGlobalVarNotify(Player player) {
        super(PacketOpcodes.QuestGlobalVarNotify);

        this.setData(
                QuestGlobalVarNotify.newBuilder()
                        .addAllVarList(
                                player.getQuestGlobalVariables().entrySet().stream()
                                        .map(
                                                entry ->
                                                        QuestGlobalVar.newBuilder()
                                                                .setKey(entry.getKey())
                                                                .setValue(entry.getValue())
                                                                .build())
                                        .toList())
                        .build());
    }
}
