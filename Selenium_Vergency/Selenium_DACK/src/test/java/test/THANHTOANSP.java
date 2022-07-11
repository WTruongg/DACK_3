/*
1. Vào trang https://www.vergency.vn/
2. Vào trang sản phẩm
3. Nhấn chọn 1 sản phẩm
4. Nhấn mua ngay
5. Nhập tất cả thông tin nhưng không hoàn tất đơn hàng
*/
package test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class THANHTOANSP {
    public static void testthanhtoan() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //  1. Vào trang https://www.vergency.vn/
            driver.get("https://www.vergency.vn/");
            //  2. Vào trang sản phẩm
            driver.findElement(By.xpath("/html/body/div[1]/nav/div/div/div[2]/div/div/ul/li[2]/a")).click();
            Thread.sleep(2000);
            //  3. Nhấn chọn 1 sản phẩm
            driver.findElement(By.xpath("//*[@id=\"event-grid\"]/div[1]/div/div/div[2]/a")).click();
            Thread.sleep(1000);
            // 4. Nhấn mua ngay
            driver.findElement(By.className("addnow")).click();
            Thread.sleep(2000);
            // 5. Nhập tất cả thông tin nhưng không hoàn tất đơn hàng
            // Họ và tên
            driver.findElement(By.id("billing_address_full_name")).clear();
            driver.findElement(By.id("billing_address_full_name")).sendKeys("Văn Trường");
            // Email
            driver.findElement(By.id("checkout_user_email")).clear();
            driver.findElement(By.id("checkout_user_email")).sendKeys("nhocvipprovipno1@gmail.com");
            // SĐT
            driver.findElement(By.id("billing_address_phone")).clear();
            driver.findElement(By.id("billing_address_phone")).sendKeys("123456789");
            // Địa chỉ
            driver.findElement(By.id("billing_address_address1")).clear();
            driver.findElement(By.id("billing_address_address1")).sendKeys("TĐT");
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
