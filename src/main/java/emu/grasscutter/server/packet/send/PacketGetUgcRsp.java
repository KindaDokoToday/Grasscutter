package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.ugc.GetUgcReq;
import io.grasscutter.net.proto.ugc.GetUgcRsp;
import io.grasscutter.net.proto.retcode.Retcode;
import io.grasscutter.net.proto.ugc.UgcMusicBriefInfo;
import io.grasscutter.net.proto.ugc.UgcMusicRecord;

public class PacketGetUgcRsp extends BasePacket {

    public PacketGetUgcRsp(UgcMusicBriefInfo briefInfo, UgcMusicRecord musicRecord, GetUgcReq req) {
        super(PacketOpcodes.GetUgcRsp);

        var proto = GetUgcRsp.newBuilder();

        proto
                .setUgcGuid(briefInfo.getUgcGuid())
                .setUgcType(req.getUgcType())
                .setUgcRecordUsageValue(req.getUgcRecordUsageValue())
                .setMusicRecord(musicRecord)
                .setMusicBriefInfo(briefInfo);

        this.setData(proto);
    }

    public PacketGetUgcRsp(Retcode errorCode, GetUgcReq req) {
        super(PacketOpcodes.GetUgcRsp);

        var proto = GetUgcRsp.newBuilder();

        proto
                .setUgcGuid(req.getUgcGuid())
                .setUgcType(req.getUgcType())
                .setUgcRecordUsageValue(req.getUgcRecordUsageValue())
                .setRetcode(errorCode.getNumber());

        this.setData(proto);
    }
}
