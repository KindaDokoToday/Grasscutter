package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.PlayerApplyEnterMpResultNotifyOuterClass;
import io.grasscutter.net.proto.mp.PlayerApplyEnterMpResultNotify;

public class PacketPlayerApplyEnterMpResultNotify extends BasePacket {

    public PacketPlayerApplyEnterMpResultNotify(
            Player target,
            boolean isAgreed,
            PlayerApplyEnterMpResultNotifyOuterClass.PlayerApplyEnterMpResultNotify.Reason reason) {
        super(PacketOpcodes.PlayerApplyEnterMpResultNotify);

        PlayerApplyEnterMpResultNotify proto =
                PlayerApplyEnterMpResultNotify.newBuilder()
                        .setTargetUid(target.getUid())
                        .setTargetNickname(target.getNickname())
                        .setIsAgreed(isAgreed)
                        .setReason(reason)
                        .build();

        this.setData(proto);
    }

    public PacketPlayerApplyEnterMpResultNotify(
            int targetId,
            String targetName,
            boolean isAgreed,
            PlayerApplyEnterMpResultNotify.Reason reason) {
        super(PacketOpcodes.PlayerApplyEnterMpResultNotify);

        PlayerApplyEnterMpResultNotify proto =
                PlayerApplyEnterMpResultNotify.newBuilder()
                        .setTargetUid(targetId)
                        .setTargetNickname(targetName)
                        .setIsAgreed(isAgreed)
                        .setReason(reason)
                        .build();

        this.setData(proto);
    }
}
