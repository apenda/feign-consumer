package com.apenda.core.service.impl;

import com.apenda.core.service.ConsumerService;
import com.apenda.share.dto.ConsumerDTO;
import com.apenda.share.dto.ProductionDTO;
import com.apenda.share.service.ProducerShareService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author rui.zhou
 * @date 2021/10/16 15:08
 **/
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Resource
    private ProducerShareService producerShareService;

    @Override
    public Object getSomeThing(ConsumerDTO consumerDTO) {
        ProductionDTO productionDTO = new ProductionDTO();
        productionDTO.setName(consumerDTO.getName());
        return producerShareService.doSomeThing(productionDTO);
    }

}
