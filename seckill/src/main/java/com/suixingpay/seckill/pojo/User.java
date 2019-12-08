package com.suixingpay.seckill.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class User {
    int userId;
    String userPhone;
    String userPassword;
    String userName;
    int userSex;
    String userProvince;
}
