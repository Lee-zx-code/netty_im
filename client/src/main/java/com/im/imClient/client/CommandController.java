package com.im.imClient.client;

import com.im.imClient.clientCommand.*;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoop;
import io.netty.util.concurrent.GenericFutureListener;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;
import java.util.concurrent.TimeUnit;

@Slf4j
@Data
@Controller("CommandController")
public class CommandController {

    //聊天命令收集类
    @Autowired
    ChatConsoleCommand chatConsoleCommand;
    //登录命令收集类
    @Autowired
    LoginConsoleCommand loginConsoleCommand;
    //登出命令收集类
    @Autowired
    LogoutConsoleCommand logoutConsoleCommand;
    //菜单命令收集类
    @Autowired
    ClientCommandMenu clientCommandMenu;

    private Map<String, BaseCommand> commandMap;
    private String menuString;
    private ClientSession session;

    @Autowired
    private NettyClient nettyClient;



    GenericFutureListener<ChannelFuture> connectedListener = (ChannelFuture f) -> {
        final EventLoop eventLoop = f.channel().eventLoop();
        if (!f.isSuccess()) {
            log.info("连接失败!在10s之后准备尝试重连!");
            eventLoop.schedule(() -> nettyClient.doConnect(), 10, TimeUnit.SECONDS);
            connectFlag = false;
        } else {
            connectFlag = true;

            log.info("疯狂创客圈 IM 服务器 连接成功!");
            channel = f.channel();

            // 创建会话
            session = new ClientSession(channel);
            session.setConnected(true);
            channel.closeFuture().addListener(closeListener);

            //唤醒用户线程
            notifyCommandThread();
        }

    };

}
