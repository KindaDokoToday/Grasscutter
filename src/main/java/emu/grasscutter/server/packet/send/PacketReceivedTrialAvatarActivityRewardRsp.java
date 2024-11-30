package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.activity.ReceivedTrialAvatarActivityRewardRsp;
import io.grasscutter.net.proto.retcode.Retcode;

public class PacketReceivedTrialAvatarActivityRewardRsp extends BasePacket {

    public PacketReceivedTrialAvatarActivityRewardRsp(
            int activityId, int trialAvatarId, boolean success) {
        this(activityId, trialAvatarId, success ? Retcode.RET_SUCC_VALUE : Retcode.RET_FAIL_VALUE);
    }

    public PacketReceivedTrialAvatarActivityRewardRsp(
            int activityId, int trialAvatarId, int retcodeVal) {
        super(PacketOpcodes.ReceivedTrialAvatarActivityRewardRsp);
        this.setData(
                ReceivedTrialAvatarActivityRewardRsp.newBuilder()
                        .setActivityId(activityId)
                        .setTrialAvatarIndexId(trialAvatarId)
                        .setRetcode(retcodeVal)
                        .build());
    }
}
