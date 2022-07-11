/*
 1. Vào trang https://www.vergency.vn/
 2. Vào trang sản phẩm
 3. Sắp xếp sản phẩm theo Sản phẩm nổi bật
 4. Sắp xếp sản phẩm theo Giá: tăng dần
 5. Sắp xếp sản phẩm theo Giá: giảm dần
 6. Sắp xếp sản phẩm theo Tên: A - Z
 7. Sắp xếp sản phẩm theo Tên: Z - A
 8. Sắp xếp sản phẩm theo Cũ nhất
 9. Sắp xếp sản phẩm theo Mới nhất
 10. Sắp xếp sản phẩm theo Bán chạy nhất
 11. Kiểm tra các sản phẩm đã sắp xếp theo ý muốn
*/
package test;

import driver.driverFactory;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

@Test
public class SAPXEPSANPHAM {
  public static void testsapxepsanpham() {
    WebDriver driver = driverFactory.getChromeDriver();
    try {
      //  1. Vào trang https://www.vergency.vn/
      driver.get("https://www.vergency.vn/");
      //  2. Vào trang sản phẩm
      driver.findElement(By.xpath("/html/body/div[1]/nav/div/div/div[2]/div/div/ul/li[2]/a")).click();
      Thread.sleep(2000);
      //  3. Sắp xếp sản phẩm theo Sản phẩm nổi bật
      driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[2]/div[1]/div/div/div/div/span[2]/select/option[1]")).click();
      Thread.sleep(1000);
      //  4. Sắp xếp sản phẩm theo Giá: tăng dần
      driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[2]/div[1]/div/div/div/div/span[2]/select/option[2]")).click();
      Thread.sleep(1000);
      //  5. Sắp xếp sản phẩm theo Giá: giảm dần
      driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[2]/div[1]/div/div/div/div/span[2]/select/option[3]")).click();
      Thread.sleep(1000);
      //  6. Sắp xếp sản phẩm theo Tên: A - Z
      driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[2]/div[1]/div/div/div/div/span[2]/select/option[4]")).click();
      Thread.sleep(1000);
      //  7. Sắp xếp sản phẩm theo Tên: Z - A
      driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[2]/div[1]/div/div/div/div/span[2]/select/option[5]")).click();
      Thread.sleep(1000);
      //  8. Sắp xếp sản phẩm theo Cũ nhất
      driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[2]/div[1]/div/div/div/div/span[2]/select/option[6]")).click();
      Thread.sleep(1000);
      //  9. Sắp xếp sản phẩm theo Mới nhất
      driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[2]/div[1]/div/div/div/div/span[2]/select/option[7]")).click();
      Thread.sleep(1000);
      //  10. Sắp xếp sản phẩm theo Bán chạy nhất
      driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div/div[2]/div[1]/div/div/div/div/span[2]/select/option[8]")).click();
      Thread.sleep(1000);

    } catch (Exception e) {
      e.printStackTrace();
    }

    driver.quit();
  }
}
