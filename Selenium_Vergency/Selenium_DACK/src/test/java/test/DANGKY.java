/*
1. Vào trang https://www.vergency.vn/
2. Vào trang đăng nhập
3. Nhấn vào link đăng ký
4. Nhập thông tin đăng ký
5. Nhấn nút đăng ký
*/
package test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.sql.Driver;

@Test
public class DANGKY {
    public static void testdangky() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //1. Vao trang https://www.vergency.vn/
            driver.get("https://www.vergency.vn/");
            //2. Vao trang dang nhap
            driver.findElement(By.xpath("//*[@id=\"box-wrapper\"]/header/div/div/div/div[3]/ul/li[2]/a")).click();
            Thread.sleep(2000);
            //3. Nhan vao link dang ky
            driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[4]/a[2]")).click();
            Thread.sleep(2000);
            //4. Nhap thong tin dang ky
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div/div/form/div[1]/input")).sendKeys("Truong");
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div/div/form/div[2]/input")).sendKeys("Van");
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div/div/form/div[3]/input")).sendKeys("nhocvipprovipno4@gmail.com");
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div/div/form/div[4]/input")).sendKeys("vantruongtrau123");
            Thread.sleep(2000);
            //5. Nhan nut dang ky
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div/div/form/div[5]/input")).click();
            Thread.sleep(2000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}