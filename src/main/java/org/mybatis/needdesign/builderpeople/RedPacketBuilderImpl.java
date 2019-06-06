package org.mybatis.needdesign.builderpeople;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 邱润泽 bullock
 */
public class RedPacketBuilderImpl implements RedPacketBuilder {

    private String publisherName;

    private String acceptName ;

    private BigDecimal pactetAmount ;

    private int packetType ;

    private Date pulishPacketTime;

    private Date openPacketTime ;

    @Override
    public RedPacketBuilder setPublisherName(String publisherName) {
        this.publisherName = publisherName;
        return this;
    }

    @Override
    public RedPacketBuilder setAcceptName(String acceptName) {
        this.acceptName =acceptName;
        return this;
    }

    @Override
    public RedPacketBuilder setPactetAmount(BigDecimal pactetAmount) {
        this.pactetAmount =pactetAmount;
        return this;
    }

    @Override
    public RedPacketBuilder setPacketType(int packetType) {
        this.packetType =packetType;
        return this;
    }

    @Override
    public RedPacketBuilder setPulishPacketTime(Date pulishPacketTime) {
        this.pulishPacketTime =pulishPacketTime;
        return this;
    }

    @Override
    public RedPacketBuilder setOpenPacketTime(Date openPacketTime) {
        this.openPacketTime =openPacketTime;
        return this;
    }

    public static RedPacketBuilderImpl getBuilder(){
       return  new RedPacketBuilderImpl();
    }

    @Override
    public RedPacket build() {
        return new RedPacket(publisherName,acceptName,pactetAmount,packetType,pulishPacketTime,openPacketTime);
    }
}
