package com.im.imClient.client;

import com.im.imClient.clientHandler.ChatMsgHandler;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@Data
public class NettyClient {

    // 服务器ip地址
    private String host;
    // 服务器端口
    private int port;

    @Autowired
    private ChatMsgHandler chatMsgHandler;

    @Autowired
    private loginre



}
