package controller;

import feignClient.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class Consumer {
    @Autowired
    private FeignClientService feignClientService;

    @GetMapping
    public String consumer() {
        System.out.println(feignClientService.producer());
        return feignClientService.producer();
    }
}
