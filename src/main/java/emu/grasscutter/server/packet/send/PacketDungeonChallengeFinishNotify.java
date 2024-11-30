package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.dungeons.challenge.WorldChallenge;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.dungeon.DungeonChallengeFinishNotify;

public class PacketDungeonChallengeFinishNotify extends BasePacket {

    public PacketDungeonChallengeFinishNotify(WorldChallenge challenge) {
        super(PacketOpcodes.DungeonChallengeFinishNotify, true);

        DungeonChallengeFinishNotify proto =
                DungeonChallengeFinishNotify.newBuilder()
                        .setChallengeIndex(challenge.getChallengeIndex())
                        .setIsSuccess(challenge.isSuccess())
                        .setChallengeRecordType(2)
                        .build();

        this.setData(proto);
    }
}
