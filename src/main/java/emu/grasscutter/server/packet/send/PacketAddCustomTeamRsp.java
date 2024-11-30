// package emu.grasscutter.server.packet.send;
//
// import emu.grasscutter.net.packet.BasePacket;
// import emu.grasscutter.net.packet.PacketOpcodes;
// import emu.grasscutter.net.proto.AddCustomTeamRspOuterClass.AddCustomTeamRsp;
// import io.grasscutter.net.proto.retcode.Retcode;
//
// public class PacketAddCustomTeamRsp extends BasePacket {
//    public PacketAddCustomTeamRsp(Retcode retcode) {
//        super(PacketOpcodes.AddCustomTeamRsp);
//
//        AddCustomTeamRsp proto =
// AddCustomTeamRsp.newBuilder().setRetcode(retcode.getNumber()).build();
//
//        this.setData(proto);
//    }
//
//    public PacketAddCustomTeamRsp() {
//        this(Retcode.RET_SUCC);
//    }
// }
