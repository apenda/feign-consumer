package com.apenda.share.service;

import com.apenda.share.dto.ConsumerDTO;
import feign.Headers;
import feign.RequestLine;

/**
 * @author rui.zhou
 * @date 2021/10/16 15:00
 **/
public interface ConsumerShareService {

    /**
     * 生产者测试
     *
     * @param consumerDTO 入参
     * @return Object
     */
    @RequestLine("POST /consumer/getSomeThing")
    @Headers("Content-Type: text/plain;charset=UTF-8")
    Object getSomeThing(ConsumerDTO consumerDTO);

}
