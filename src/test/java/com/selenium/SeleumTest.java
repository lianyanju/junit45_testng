package com.selenium;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleumTest {

   public static WebDriver wb_driver;

   @BeforeAll
   public static void init(){
       wb_driver = new ChromeDriver();
       wb_driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);//隐士等待
   }


    @Test
    public void testchorme(){

        wb_driver.get("https://home.testing-studio.com/");


        // wb.findElement(By.xpath("//span[contains(text(),登录)]")).click();∂
        wb_driver.findElement(By.xpath("//*[@id=\"ember5\"]/header/div/div/div[2]/span/button[2]/span")).click();

        System.out.println("testchorme");
    }


    @Test
    void testLogin() throws IOException, InterruptedException {

        //打开浏览器
        wb_driver.get("https://work.weixin.qq.com/wework_admin/frame");


        //扫码【sleep 20s】
        Thread.sleep(15000);


        //利用浏览器驱动 读取 cookie 内容, 读取的是本次登录cookie？还是浏览器中所有cookie？
         Set<Cookie> cookie  = wb_driver.manage().getCookies();


         //ObjectMapper 用来序列号cookie内容
        ObjectMapper obm = new ObjectMapper(new YAMLFactory());
        File cookie_file = new File("cookie.yaml");

        //把cookie 写入文件中，比如 yml 文件
        obm.writeValue(cookie_file, cookie);


    }



    @Test
    void testLogined() throws IOException {

        //打开浏览器
        wb_driver.get("https://work.weixin.qq.com/wework_admin/frame");

        File cookie_file = new File("cookie.yaml");

        //读取cookie ObjectMapper 用来反序列号cookie内容
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

        TypeReference typeReference = new TypeReference<List<HashMap<String, Object>>>() {};
        List<HashMap<String, Object>> cookies  = mapper.readValue(cookie_file, typeReference);
        System.out.println(cookies);


        //驱动写入cookie
        cookies.forEach(cookieMap->{
            Cookie c =   new Cookie(cookieMap.get("name").toString(),cookieMap.get("value").toString());
            wb_driver.manage().addCookie(c);
        });

        wb_driver.navigate().refresh();

    }



    @AfterAll
    public static void teardown(){
        wb_driver.quit();
    }

}

