package com.example.SpringScope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringScopeApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringScopeApplication.class, args);

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
        System.out.println("-------helloWorldSingleton-------");
        HelloWorldSingleton helloWorldSingleton01 = (HelloWorldSingleton) context.getBean("helloWorldSingleton");
        helloWorldSingleton01.setMessage("Singleton A");
        helloWorldSingleton01.getMessage();
        HelloWorldSingleton helloWorldSingleton02 = (HelloWorldSingleton) context.getBean("helloWorldSingleton");
        helloWorldSingleton02.getMessage();

        System.out.println("\n-------helloWorldPrototype-------");

        HelloWorldPrototype helloWorldPrototype01 = (HelloWorldPrototype) context.getBean("helloWorldPrototype");
        helloWorldPrototype01.setMessage("Prototype01");
        helloWorldPrototype01.getMessage();
        HelloWorldPrototype helloWorldPrototype02 = (HelloWorldPrototype) context.getBean("helloWorldPrototype");
        helloWorldPrototype02.setMessage("Prototype02");
        helloWorldPrototype02.getMessage();
    }

}
