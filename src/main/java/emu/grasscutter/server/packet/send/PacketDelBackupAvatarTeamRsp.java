package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.avatar.DelBackupAvatarTeamRsp;
import io.grasscutter.net.proto.retcode.Retcode;

public class PacketDelBackupAvatarTeamRsp extends BasePacket {
    public PacketDelBackupAvatarTeamRsp(Retcode retcode, int id) {
        super(PacketOpcodes.DelBackupAvatarTeamRsp);

        DelBackupAvatarTeamRsp proto =
                DelBackupAvatarTeamRsp.newBuilder()
                        .setRetcode(retcode.getNumber())
                        .setBackupAvatarTeamId(id)
                        .build();

        this.setData(proto);
    }

    public PacketDelBackupAvatarTeamRsp(int id) {
        this(Retcode.RET_SUCC, id);
    }
}
