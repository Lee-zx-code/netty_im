/*
package com.lee.common.im.common.proto;

import com.lee.common.im.common.util.Logger;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ProtobufDemo {

    public static MsgProtos.Msg buildMsg() {
        MsgProtos.Msg.Builder personBuilder = MsgProtos.Msg.newBuilder();
        personBuilder.setId(1000);
        personBuilder.setContent("我的proto");
        MsgProtos.Msg msg = personBuilder.build();
        return msg;
    }

    @Test
    public void serAndDesr3() throws IOException {
        MsgProtos.Msg msg = buildMsg();
        // 序列化到二进制码流
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        msg.writeDelimitedTo(outputStream);
        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
        // 从二进制码流反序列化成Protobuf对象
        MsgProtos.Msg inMsg = MsgProtos.Msg.parseDelimitedFrom(inputStream);
        Logger.info("id:=" + inMsg.getId());
        Logger.info("content:=" + inMsg.getContent());
    }

}
*/
