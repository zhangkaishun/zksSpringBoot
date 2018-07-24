package com.zks.zksspringboot.example.多线程;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
* @Async 注解表明该方法是个异步方法 如果注解在类级别，则表明该类的所有方法都是异步方法，
 * 而这里的方法自动被注入使用ThreadPoolTaskExecutor作为TaskExecutor
* @author zks
* @date 2018/6/10 23:33
* @return
*/
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务:"+i);//快捷键 sout
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1:"+(i+1));
    }
}
