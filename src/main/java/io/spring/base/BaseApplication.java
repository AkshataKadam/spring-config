package io.spring.base;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BaseApplication {

  @Value(value = "${spring.application.name}")
  private static String appName;
  @Value(value = "${welcome.msg")
  private static String text;

  public static void main(String[] args) {
    SpringApplication.run(BaseApplication.class, args);
    System.out.println("-----------------APP NAME " + appName);
    System.out.println("-----------------WELCOME TEXT " + text);
  }

}
