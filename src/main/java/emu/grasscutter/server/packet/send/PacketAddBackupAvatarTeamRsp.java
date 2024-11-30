package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.avatar.AddBackupAvatarTeamRsp;
import io.grasscutter.net.proto.retcode.Retcode;

public class PacketAddBackupAvatarTeamRsp extends BasePacket {
    public PacketAddBackupAvatarTeamRsp(Retcode retcode) {
        super(PacketOpcodes.AddBackupAvatarTeamRsp);

        AddBackupAvatarTeamRsp proto =
                AddBackupAvatarTeamRsp.newBuilder().setRetcode(retcode.getNumber()).build();

        this.setData(proto);
    }

    public PacketAddBackupAvatarTeamRsp() {
        this(Retcode.RET_SUCC);
    }
}
