package org.mybatis.needdesign.builderpeople;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 邱润泽 bullock
 *
 * 红包
 */
public class RedPacket {

    private String publisherName;

    private String acceptName ;

    private BigDecimal pactetAmount ;

    private int packetType ;

    private Date pulishPacketTime;

    private Date openPacketTime ;

    public RedPacket(String publisherName, String acceptName, BigDecimal pactetAmount, int packetType, Date pulishPacketTime, Date openPacketTime) {
        this.publisherName = publisherName;
        this.acceptName = acceptName;
        this.pactetAmount = pactetAmount;
        this.packetType = packetType;
        this.pulishPacketTime = pulishPacketTime;
        this.openPacketTime = openPacketTime;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getAcceptName() {
        return acceptName;
    }

    public void setAcceptName(String acceptName) {
        this.acceptName = acceptName;
    }

    public BigDecimal getPactetAmount() {
        return pactetAmount;
    }

    public void setPactetAmount(BigDecimal pactetAmount) {
        this.pactetAmount = pactetAmount;
    }

    public int getPacketType() {
        return packetType;
    }

    public void setPacketType(int packetType) {
        this.packetType = packetType;
    }

    public Date getPulishPacketTime() {
        return pulishPacketTime;
    }

    public void setPulishPacketTime(Date pulishPacketTime) {
        this.pulishPacketTime = pulishPacketTime;
    }

    public Date getOpenPacketTime() {
        return openPacketTime;
    }

    public void setOpenPacketTime(Date openPacketTime) {
        this.openPacketTime = openPacketTime;
    }
}
