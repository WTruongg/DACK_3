/*
1. Vào trang https://www.vergency.vn/
2. Ấn vào shop
3. Ấn vào T-shirts
4. Ấn vào Shirts
5. Ấn vào Sweaters
6. Ấn vào Hoodies
7. Ấn vào Shorts
8. Ấn vào Bag
9. Ấn vào Perfumes
10. Ấn vào Jacket
11. Ấn vào Accessories
*/
package test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class DANHMUCSANPHAM {
    public static void testdanhmuc() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            // 1. Vào trang https://www.vergency.vn/
            driver.get("https://www.vergency.vn/");
            // 2. Ấn vào shop
            driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/ul/li[2]/a")).click();
            Thread.sleep(1000);
            // 3. Ấn vào T-shirts
            driver.findElement(By.xpath("//*[@id=\"menusidebarleft\"]/li[1]/a")).click();
            Thread.sleep(1000);
            // 4. Ấn vào Shirts
            driver.findElement(By.xpath("//*[@id=\"menusidebarleft\"]/li[2]/a")).click();
            Thread.sleep(1000);
            // 5. Ấn vào Sweaters
            driver.findElement(By.xpath("//*[@id=\"menusidebarleft\"]/li[3]/a")).click();
            Thread.sleep(1000);
            // 6. Ấn vào Hoodies
            driver.findElement(By.xpath("//*[@id=\"menusidebarleft\"]/li[4]/a")).click();
            Thread.sleep(1000);
            // 7. Ấn vào Shorts
            driver.findElement(By.xpath("//*[@id=\"menusidebarleft\"]/li[5]/a")).click();
            Thread.sleep(1000);
            // 8. Ấn vào Bag
            driver.findElement(By.xpath("//*[@id=\"menusidebarleft\"]/li[6]/a")).click();
            Thread.sleep(1000);
            // 9. Ấn vào Perfumes
            driver.findElement(By.xpath("//*[@id=\"menusidebarleft\"]/li[7]/a")).click();
            Thread.sleep(1000);
            // 10. Ấn vào Jacket
            driver.findElement(By.xpath("//*[@id=\"menusidebarleft\"]/li[8]/a")).click();
            Thread.sleep(1000);
            // 11. Ấn vào Accessories
            driver.findElement(By.xpath("//*[@id=\"menusidebarleft\"]/li[9]/a")).click();
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
