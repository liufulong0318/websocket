package com.forlong.controller;

import com.forlong.websocket.ForlongMessage;
import com.forlong.websocket.ForlongResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by Administrator on 2018/11/25.
 */
@Controller
public class TestWebSocket {
    @MessageMapping(value = "/welcome")
    @SendTo("/topic/getResponse")
    public ForlongResponse say(ForlongMessage message) throws InterruptedException {
        Thread.sleep(2000);
        return new ForlongResponse("welcome,"+message.getName()+"!");
    }
}
