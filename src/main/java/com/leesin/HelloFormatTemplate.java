package com.leesin;

import com.leesin.autoconfiguration.HelloProperties;
import com.leesin.format.FormatProcessor;

/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/4/10 22:31
 * @version: ${VERSION}
 * @modified By:
 */
public class HelloFormatTemplate {
    private FormatProcessor formatProcessor;
    private HelloProperties helloProperties;

    public HelloFormatTemplate(HelloProperties helloProperties,FormatProcessor formatProcessor) {
        this.helloProperties = helloProperties;
        this.formatProcessor = formatProcessor;
    }

    public <T> String doFormat(T obj) {
        StringBuffer sb = new StringBuffer();
        sb.append("format result is : " + formatProcessor.format(obj)+"</br>");
        sb.append("info:" + formatProcessor.format(helloProperties.getInfo()));
        return sb.toString();
    }
}
