package com.im.imClient.clientHandler;

import com.im.imClient.clientSender.LoginSender;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.springframework.stereotype.Service;

@ChannelHandler.Sharable
@Service("ChatMsgHandler")
public class ChatMsgHandler extends ChannelInboundHandlerAdapter{

    private LoginSender sender;
}
