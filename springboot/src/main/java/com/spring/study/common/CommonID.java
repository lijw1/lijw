package com.spring.study.common;

import java.util.UUID;

public class CommonID {
    public static String getUUID() {
        UUID uuid = UUID.randomUUID();
        String uuidStr = uuid.toString();
        return uuidStr;
    }
}
