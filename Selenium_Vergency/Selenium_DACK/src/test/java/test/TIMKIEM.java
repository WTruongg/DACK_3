/*
    1. Vào trang https://www.vergency.vn/
    2. Nhấn vào icon tìm kiếm
    3. Tìm kiếm theo tên sản phẩm (LONG LIVE SWEATER/BEGEI)
    4. Tìm kiếm theo tên sản phẩm không tồn tại trong shop (BAG)
    5. Tìm kiếm theo 1 từ có trong tên sản phẩm (BASIC)
*/
package test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class TIMKIEM {
    public static void testtimkiem() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            // 1. Vào trang https://www.vergency.vn/
            driver.get("https://www.vergency.vn/");
            // 2. Nhấn vào icon tìm kiếm
            driver.findElement(By.xpath("//*[@id=\"box-wrapper\"]/header/div/div/div/div[3]/ul/li[1]/div/a")).click();
            Thread.sleep(1000);
            // 3. Tìm kiếm theo tên sản phẩm (LONG LIVE SWEATER/BEGEI)
            driver.findElement(By.xpath("//*[@id=\"box-wrapper\"]/header/div/div/div/div[3]/ul/li[1]/div/div/form/input[2]")).sendKeys("LONG LIVE SWEATER/BEGEI");
            driver.findElement(By.xpath("//*[@id=\"box-wrapper\"]/header/div/div/div/div[3]/ul/li[1]/div/div/form/input[2]")).submit();
            Thread.sleep(1000);
            // 4. Tìm kiếm theo tên sản phẩm không tồn tại trong shop (BAG)
            driver.findElement(By.xpath("//*[@id=\"box-wrapper\"]/header/div/div/div/div[3]/ul/li[1]/div/a")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"box-wrapper\"]/header/div/div/div/div[3]/ul/li[1]/div/div/form/input[2]")).sendKeys("BAG");
            driver.findElement(By.xpath("//*[@id=\"box-wrapper\"]/header/div/div/div/div[3]/ul/li[1]/div/div/form/input[2]")).submit();
            Thread.sleep(1000);
            // 5. Tìm kiếm theo 1 từ có trong tên sản phẩm (BASIC)
            driver.findElement(By.xpath("//*[@id=\"box-wrapper\"]/header/div/div/div/div[3]/ul/li[1]/div/a")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"box-wrapper\"]/header/div/div/div/div[3]/ul/li[1]/div/div/form/input[2]")).sendKeys("BASIC");
            driver.findElement(By.xpath("//*[@id=\"box-wrapper\"]/header/div/div/div/div[3]/ul/li[1]/div/div/form/input[2]")).submit();
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
