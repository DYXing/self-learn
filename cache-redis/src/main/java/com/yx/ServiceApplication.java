package com.yx;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description:TODO
 *
 * @author dulj
 * @date 2022/7/1 17:40
 * @since V1.0
 * Copyright www.enbrands.com
 */
@SpringBootApplication
@Slf4j
public class ServiceApplication {
    public static void main(String[] args) {
        log.info("================service start================");
        SpringApplication.run(ServiceApplication.class, args);
        log.info("================service start end================");
        


    }
}
