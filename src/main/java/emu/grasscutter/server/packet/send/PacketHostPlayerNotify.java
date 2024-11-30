package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.world.World;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.fight.HostPlayerNotify;

public class PacketHostPlayerNotify extends BasePacket {

    public PacketHostPlayerNotify(World world) {
        super(PacketOpcodes.HostPlayerNotify);

        HostPlayerNotify proto =
                HostPlayerNotify.newBuilder()
                        .setHostUid(world.getHost().getUid())
                        .setHostPeerId(world.getHost().getPeerId())
                        .build();

        this.setData(proto);
    }
}
