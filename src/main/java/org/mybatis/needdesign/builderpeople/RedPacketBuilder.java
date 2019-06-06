package org.mybatis.needdesign.builderpeople;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 邱润泽 bullock
 */
public interface RedPacketBuilder {

    RedPacketBuilder setPublisherName(String publisherName);
    RedPacketBuilder setAcceptName(String acceptName);
    RedPacketBuilder setPactetAmount(BigDecimal pactetAmount);
    RedPacketBuilder setPacketType(int packetType);
    RedPacketBuilder setPulishPacketTime(Date pulishPacketTime);
    RedPacketBuilder setOpenPacketTime(Date openPacketTime);

    RedPacket build();

}
