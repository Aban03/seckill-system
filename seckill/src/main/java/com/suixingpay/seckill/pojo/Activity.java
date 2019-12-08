package com.suixingpay.seckill.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Getter
@Setter
@Component
public class Activity {
    int activityId;
    String activityName;
    String activityProvince;
    Date activityBegin;
    Date activityEnd;
}
