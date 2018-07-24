package com.zks.zksspringboot.example.多线程;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AsyncTest {
    public static void main(String[] args) {//psvm 快速到处main方法
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService=context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {//fori 快速调出
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
        context.close();
    }
}
