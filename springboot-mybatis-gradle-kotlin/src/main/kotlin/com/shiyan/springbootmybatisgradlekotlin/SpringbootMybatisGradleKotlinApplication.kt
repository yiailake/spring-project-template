package com.shiyan.springbootmybatisgradlekotlin

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@MapperScan("com.shiyan.springbootmybatisgradlekotlin.dao")
class SpringbootMybatisGradleKotlinApplication

fun main(args: Array<String>) {
    runApplication<SpringbootMybatisGradleKotlinApplication>(*args)
}
