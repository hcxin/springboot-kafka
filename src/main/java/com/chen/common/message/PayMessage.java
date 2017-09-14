package com.chen.common.message;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class PayMessage {
    private String orderCode;
    private Float fee;
    private Long sendTime;
}
