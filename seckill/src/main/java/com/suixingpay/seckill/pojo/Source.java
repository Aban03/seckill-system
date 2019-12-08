package com.suixingpay.seckill.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Source {
    int sourceId;
    String sourcePhone;
    String sourceName;
    int sourceSex;
    String sourceProvince;
    int sourceStatus;
}
