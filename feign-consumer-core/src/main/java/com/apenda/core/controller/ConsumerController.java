package com.apenda.core.controller;

import com.apenda.core.service.ConsumerService;
import com.apenda.share.dto.ConsumerDTO;
import com.apenda.share.service.ConsumerShareService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * @author rui.zhou
 * @date 2021/10/16 15:03
 **/
@RestController
@RequestMapping("consumer")
public class ConsumerController implements ConsumerShareService {

    @Resource
    private ConsumerService consumerService;

    @Override
    @PostMapping("getSomeThing")
    public Object getSomeThing(@RequestBody @Validated ConsumerDTO consumerDTO) {
        return consumerService.getSomeThing(consumerDTO);
    }

}
