package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.avatar.ChooseCurAvatarTeamRsp;

public class PacketChooseCurAvatarTeamRsp extends BasePacket {

    public PacketChooseCurAvatarTeamRsp(int teamId) {
        super(PacketOpcodes.ChooseCurAvatarTeamRsp);

        ChooseCurAvatarTeamRsp proto = ChooseCurAvatarTeamRsp.newBuilder().setCurTeamId(teamId).build();

        this.setData(proto);
    }
}
