package com.im.imClient.clientHandler;

import com.im.imClient.client.CommandController;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@ChannelHandler.Sharable
public class LoginResponceHandler extends ChannelInboundHandlerAdapter {

    @Autowired
    CommandController commandController;
    @Autowired

}
