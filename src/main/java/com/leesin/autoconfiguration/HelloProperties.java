package com.leesin.autoconfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/4/11 7:33
 * @version: ${VERSION}
 * @modified By:
 */
@ConfigurationProperties(prefix = HelloProperties.prefix)
public class HelloProperties {
    public static final String prefix = "handsome.leesin";
    private Map<String, Object> info;

    public static String getPrefix() {
        return prefix;
    }

    public Map<String, Object> getInfo() {
        return info;
    }

    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }
}
