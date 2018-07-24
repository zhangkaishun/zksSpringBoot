package com.zks.zksspringboot.example.多线程;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;


/**
* @EnableAsync  开启对异步任务的支持
 *
 *
 * @Configuration注解的配置类有如下要求：

 @Configuration不可以是final类型；
 @Configuration不可以是匿名类；
 嵌套的configuration必须是静态类。
 一、用@Configuration加载spring
 1.1、@Configuration配置spring并启动spring容器
 1.2、@Configuration启动容器+@Bean注册Bean
 1.3、@Configuration启动容器+@Component注册Bean
 1.4、使用 AnnotationConfigApplicationContext 注册 AppContext 类的两种方法
 1.5、配置Web应用程序(web.xml中配置AnnotationConfigApplicationContext)‘

* @date 2018/6/10 23:23
* @return
*/
@Configuration
@ComponentScan("com.zks.zksspringboot.example.多线程")  //主要就是定义扫描的路径从中找出标识了需要装配的类自动装配到spring的bean容器中
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer{
    @Nullable
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor=new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(25);
        taskExecutor.initialize();
        return taskExecutor;
    }
}
