package com.chenxin.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "producer")
public interface FeignClientService {
    @GetMapping("/producer")
    String producer();
}
