package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.scene.EnterWorldAreaReq;
import io.grasscutter.net.proto.scene.EnterWorldAreaRsp;

public class PacketEnterWorldAreaRsp extends BasePacket {

    public PacketEnterWorldAreaRsp(int clientSequence, EnterWorldAreaReq enterWorld) {
        super(PacketOpcodes.EnterWorldAreaRsp, clientSequence);

        EnterWorldAreaRsp p =
                EnterWorldAreaRsp.newBuilder()
                        .setAreaType(enterWorld.getAreaType())
                        .setAreaId(enterWorld.getAreaId())
                        .build();

        this.setData(p.toByteArray());
    }
}
