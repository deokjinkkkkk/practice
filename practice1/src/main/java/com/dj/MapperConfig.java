package com.dj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration
@MapperScan(basePackages = "com.dj.**.mapper")
public class MapperConfig {

}
