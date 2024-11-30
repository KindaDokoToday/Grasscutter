package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.quest.BargainRecord;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.quest.BargainOfferPriceRsp;
import io.grasscutter.net.proto.quest.BargainResultType;
import io.grasscutter.net.proto.retcode.Retcode;

public final class PacketBargainOfferPriceRsp extends BasePacket {
    public PacketBargainOfferPriceRsp(BargainResultType result, BargainRecord record) {
        super(PacketOpcodes.BargainOfferPriceRsp);

        this.setData(
                BargainOfferPriceRsp.newBuilder()
                        .setRetcode(
                                record.isFinished()
                                        ? Retcode.RET_BARGAIN_FINISHED.getNumber()
                                        : Retcode.RET_BARGAIN_NOT_ACTIVATED.getNumber())
                        .setCurMood(record.getCurrentMood())
                        .setBargainResult(result)
                        .setResultParam(0));
    }
}
