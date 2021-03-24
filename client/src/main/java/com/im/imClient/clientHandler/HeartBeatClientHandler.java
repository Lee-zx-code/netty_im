package com.im.imClient.clientHandler;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@ChannelHandler.Sharable
@Service("HeartBeatClientHandler")
public class HeartBeatClientHandler extends ChannelInboundHandlerAdapter {

    // 心跳的时间间隔，单位为s
    private static final int HEARTBEAT_INTERVAL = 50;

    // 在Handler被加入到Pipeline时，开始发送心跳
    @Override
    public void handlerAdded(ChannelHandlerContext ctx){

    }

}
