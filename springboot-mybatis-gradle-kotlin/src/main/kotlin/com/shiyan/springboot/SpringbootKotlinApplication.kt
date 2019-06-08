package com.shiyan.springboot

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@MapperScan("com.shiyan.springboot.dao")
class SpringbootMybatisGradleKotlinApplication

fun main(args: Array<String>) {
    runApplication<SpringbootMybatisGradleKotlinApplication>(*args)
}
