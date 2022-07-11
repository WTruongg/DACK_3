/*
1. Vào trang https://www.vergency.vn/
2. Vào trang đăng nhập
3. Nhập thông tin đăng nhập đã đăng ký trước đó
4. Nhấn nút đăng nhập
5. Thoát đăng nhập
*/
package test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class DANGNHAP {
    public static void testdangnhap() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            // 1. Vào trang https://www.vergency.vn/
            driver.get("https://www.vergency.vn/");
            // 2. Vào trang đăng nhập
            driver.findElement(By.xpath("//*[@id=\"box-wrapper\"]/header/div/div/div/div[3]/ul/li[2]/a")).click();
            Thread.sleep(2000);
            // 3. Nhập thông tin đăng nhập đã đăng ký trước đó
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div/div[1]/form/div[1]/input")).sendKeys("nhocvipprovipno3@gmail.com");
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div/div[1]/form/div[2]/input")).sendKeys("vantruongtrau123");
            // 4. Nhấn nút đăng nhập
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div/div[1]/form/div[3]/input")).click();
            Thread.sleep(2000);
            // 5. Thoát đăng nhập
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[1]/h1/a")).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
