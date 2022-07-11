/*
 1. Vào trang https://www.vergency.vn/
 2. Vào trang sản phẩm
 3. Nhấn chọn 1 sản phẩm
 4. Nhấn nút Thêm vào giỏ hàng
 5. Tăng số lượng sản phẩm
*/
package test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class THEMSUAXOA{
    public static void testthemsuaxoa() {
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
            // 4. Nhấn nút Thêm vào giỏ hàng
            driver.findElement(By.className("add-to-cart")).click();
            Thread.sleep(2000);
            // 5. Tăng số lượng sản phẩm
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[1]/form/div[1]/table/tbody/tr/td[2]/div/button[2]")).click();
            Thread.sleep(1000);
            // 6. Giảm số lượng sản phẩm
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[1]/form/div[1]/table/tbody/tr/td[2]/div/button[1]")).click();
            Thread.sleep(1000);
            // 7. Xóa sản phẩm
            driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[1]/form/div[1]/table/tbody/tr/td[3]/a")).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}