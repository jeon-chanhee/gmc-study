package com.gmc.study.alex;

import com.gmc.study.alex.exchang.upbit.Upbit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class GmcStudyAlex {
    public static void main(String[] args) {
        SpringApplication.run(GmcStudyAlex.class, args);
        Upbit upbitA = new Upbit("UPBIT-A");
        Upbit upbitB = new Upbit("UPBIT-B");
        log.info(upbitA.name);
        log.info(upbitB.name);
    }
}
