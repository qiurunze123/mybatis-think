package org.mybatis.needdesign.builderpeople;

import java.util.Date;

/**
 * @author 邱润泽 bullock
 *
 * mybatis 的初始化流程 使用建造者模式
 */
public class Director {

    public static void main(String[] args) {
        RedPacket redPacket = RedPacketBuilderImpl.getBuilder().setOpenPacketTime(new Date()).build();


        System.out.println(redPacket);


        StatusAcctVo statusAcctVo = new StatusAcctVo.Builder().accountId(111).build();

        System.out.println(statusAcctVo);
    }
}
