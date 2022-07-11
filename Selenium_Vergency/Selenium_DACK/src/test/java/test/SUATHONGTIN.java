/*
1. Vào trang https://www.vergency.vn/
2. Vào trang đăng nhập
3. Nhập thông tin đăng nhập đã đăng ký trước đó
4. Nhấn nút đăng nhập
5. Nhấn vào xem địa chỉ
6. Nhấn vào nút sửa
7. Sửa hết tất cả thông tin
8. Nhấn nút cập nhập
*/
package test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class SUATHONGTIN {
    public static void testsuathongtin() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            // 1. Vào trang https://www.vergency.vn/
            driver.get("https://www.vergency.vn/");
            // 2. Vào trang đăng nhập
            driver.findElement(By.xpath("//*[@id=\"box-wrapper\"]/header/div/div/div/div[3]/ul/li[2]/a")).click();
            Thread.sleep(1000);
            // 3. Nhập thông tin đăng nhập đã đăng ký trước đó
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div/div[1]/form/div[1]/input")).sendKeys("nhocvipprovipno3@gmail.com");
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div/div[1]/form/div[2]/input")).sendKeys("vantruongtrau123");
            // 4. Nhấn nút đăng nhập
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div/div[1]/form/div[3]/input")).click();
            Thread.sleep(1000);
            // 5. Nhấn vào xem địa chỉ
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[3]/div/div[2]/a")).click();
            Thread.sleep(1000);
            // 6. Nhấn vào nút sửa
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[2]/div/div/div[1]/p/span[1]/a")).click();
            Thread.sleep(1000);
            // 7. Sửa hết tất cả thông tin
            // Họ
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[2]/div/div/div[2]/form/div[1]/input")).clear();
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[2]/div/div/div[2]/form/div[1]/input")).sendKeys("Thiên");
            // Tên
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[2]/div/div/div[2]/form/div[2]/input")).clear();
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[2]/div/div/div[2]/form/div[2]/input")).sendKeys("Phúc");
            // Địa chỉ
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[2]/div/div/div[2]/form/div[3]/input")).clear();
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[2]/div/div/div[2]/form/div[3]/input")).sendKeys("Trịnh Đình Thảo");
            // Nước
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[2]/div/div/div[2]/form/div[5]/select/option[3]")).click();
            // Thành phố
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[2]/div/div/div[2]/form/div[6]/select/option[9]")).click();
            // SĐT
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[2]/div/div/div[2]/form/div[8]/input")).clear();
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[2]/div/div/div[2]/form/div[8]/input")).sendKeys("123456789");
            // 8. Nhấn nút cập nhập
            driver.findElement(By.cssSelector("#address_form_1105727895 > div.action_bottom > input")).click();
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
