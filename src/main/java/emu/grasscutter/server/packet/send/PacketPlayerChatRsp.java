package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.scene.PlayerChatRsp;

public class PacketPlayerChatRsp extends BasePacket {

    public PacketPlayerChatRsp() {
        super(PacketOpcodes.PlayerChatRsp);

        PlayerChatRsp proto = PlayerChatRsp.newBuilder().build();

        this.setData(proto);
    }
}
