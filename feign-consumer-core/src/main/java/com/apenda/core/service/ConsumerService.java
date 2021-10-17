package com.apenda.core.service;

import com.apenda.share.dto.ConsumerDTO;

/**
 * @author rui.zhou
 * @date 2021/10/16 15:06
 **/
public interface ConsumerService {

    /**
     * get something
     *
     * @param consumerDTO 入参
     * @return object
     */
    Object getSomeThing(ConsumerDTO consumerDTO);
}
