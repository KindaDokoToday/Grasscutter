package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.entity.GameEntity;
import emu.grasscutter.game.props.FightProperty;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.property.ChangeEnergyReason;
import emu.grasscutter.net.proto.ChangeHpReasonOuterClass.ChangeHpReason;
import io.grasscutter.net.proto.property.EntityFightPropChangeReasonNotify;
import io.grasscutter.net.proto.property.PropChangeReason;
import java.util.List;

public class PacketEntityFightPropChangeReasonNotify extends BasePacket {

    public PacketEntityFightPropChangeReasonNotify(
            GameEntity entity,
            FightProperty prop,
            Float value,
            List<Integer> param,
            PropChangeReason reason,
            ChangeHpReason changeHpReason) {
        super(PacketOpcodes.EntityFightPropChangeReasonNotify);

        EntityFightPropChangeReasonNotify.Builder proto =
                EntityFightPropChangeReasonNotify.newBuilder()
                        .setEntityId(entity.getId())
                        .setPropType(prop.getId())
                        .setPropDelta(value)
                        .setReason(reason)
                        .setChangeHpReason(changeHpReason);

        for (int p : param) {
            proto.addParamList(p);
        }

        this.setData(proto);
    }

    public PacketEntityFightPropChangeReasonNotify(
            GameEntity entity,
            FightProperty prop,
            Float value,
            PropChangeReason reason,
            ChangeHpReason changeHpReason) {
        super(PacketOpcodes.EntityFightPropChangeReasonNotify);

        EntityFightPropChangeReasonNotify proto =
                EntityFightPropChangeReasonNotify.newBuilder()
                        .setEntityId(entity.getId())
                        .setPropType(prop.getId())
                        .setPropDelta(value)
                        .setReason(reason)
                        .setChangeHpReason(changeHpReason)
                        .build();

        this.setData(proto);
    }

    public PacketEntityFightPropChangeReasonNotify(
            GameEntity entity, FightProperty prop, Float value, PropChangeReason reason) {
        super(PacketOpcodes.EntityFightPropChangeReasonNotify);

        EntityFightPropChangeReasonNotify proto =
                EntityFightPropChangeReasonNotify.newBuilder()
                        .setEntityId(entity.getId())
                        .setPropType(prop.getId())
                        .setPropDelta(value)
                        .setReason(reason)
                        .build();

        this.setData(proto);
    }

    public PacketEntityFightPropChangeReasonNotify(
            GameEntity entity, FightProperty prop, Float value, ChangeEnergyReason reason) {
        super(PacketOpcodes.EntityFightPropChangeReasonNotify);

        EntityFightPropChangeReasonNotify proto =
                EntityFightPropChangeReasonNotify.newBuilder()
                        .setEntityId(entity.getId())
                        .setPropType(prop.getId())
                        .setPropDelta(value)
                        .setChangeEnergyReason(reason)
                        .build();

        this.setData(proto);
    }
}
