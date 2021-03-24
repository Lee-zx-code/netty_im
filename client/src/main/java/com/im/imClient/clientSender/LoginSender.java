package com.im.imClient.clientSender;

import com.im.imClient.clientBuilder.LoginMsgBuilder;
import com.im.proto.ProtoMsg;
import com.im.util.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service("LonginSender")
public class LoginSender extends BaseSender{

    public void sendLoginMsg() {
        if (!isConnected()) {
            log.info("还没有建立连接！");
            return;
        }
        Logger.tcfo("发送登录消息");
        ProtoMsg.Message message = LoginMsgBuilder.buildLoginMsg(getUser(), getSession());
        super.sendMsg(message);
    }
}
