package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.scene.ExecuteGadgetLuaRsp;

public class PacketExecuteGadgetLuaRsp extends BasePacket {

    public PacketExecuteGadgetLuaRsp(int result) {
        super(PacketOpcodes.ExecuteGadgetLuaRsp, true);

        ExecuteGadgetLuaRsp proto = ExecuteGadgetLuaRsp.newBuilder().setRetcode(result).build();

        this.setData(proto);
    }
}
