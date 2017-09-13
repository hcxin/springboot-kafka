package com.chen.producer;

import com.chen.common.constant.TopicConst;
import com.chen.message.PayMessage;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * 类的功能描述：
 * 消息生产者用于发送消息
 *
 * @ClassName: MessageProducer
 * @Author hcxin
 * @Date 2017-09-13 03:45:02
 */
@Component
public class MessageProducer {
    private static Logger logger = LoggerFactory.getLogger(MessageProducer.class);
    @Autowired
    private KafkaTemplate kafkaTemplate;
    private Gson gson = new GsonBuilder().create();

    public void send(PayMessage payMessage) {
        String msg = gson.toJson(payMessage);
        kafkaTemplate.send(TopicConst.PAY_TOPIC, msg);
        logger.info("MessageProducer: send: message is: [" + msg + "]");

    }

}