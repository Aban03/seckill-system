package com.suixingpay.seckill.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class Distribution {
    int distributionId;
    int distributionUserId;
    int distributionActivityId;
    int distributionSourceId;
}
