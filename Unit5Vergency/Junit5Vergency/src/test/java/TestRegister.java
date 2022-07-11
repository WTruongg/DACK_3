import org.junit.Test;

import static org.junit.Assert.*;

public class TestRegister {
    @Test
    //Khong nhap Email
    public void TestisEmailBlank(){
        RegisterValidator lg = new RegisterValidator();
        boolean isblank = lg.registercheck("Nguyen","Phuc","123456","");
        assertFalse(isblank);
    }

    //Email khong co ky tu @
    @Test
    public void TestisEmailInvalid1(){
        RegisterValidator lg = new RegisterValidator();
        boolean isInValid = lg.registercheck("Nguyen","Phuc","123456","thienphucgmail.com");
        assertFalse(isInValid);
    }

    //Email khong co duoi .com
    @Test
    public void TestisEmailInvalid2(){
        RegisterValidator lg = new RegisterValidator();
        boolean isInValid = lg.registercheck("Nguyen","Phuc","123456","thienphuc@gmail.yahoo");
        assertFalse(isInValid);
    }

    //Email co khoang trang
    @Test
    public void TestisEmailInvalid3(){
        RegisterValidator lg = new RegisterValidator();
        boolean isInValid = lg.registercheck("Nguyen","Phuc","123456","thien phuc@gmail.com");
        assertFalse(isInValid);
    }

    //Email da duoc dang ky
    @Test
    public void TestisEmailExits(){
        RegisterValidator lg = new RegisterValidator();
        boolean isExits = lg.registercheck("Nguyen","Phuc","123456","thienphuc18072002@gmail.com");
        assertFalse(isExits);
    }

    //Khong nhap Ho
    @Test
    public void TestisFirstNameBlank(){
        RegisterValidator lg = new RegisterValidator();
        boolean isblank = lg.registercheck("","Phuc","123456","thienphuc@gmail.com");
        assertFalse(isblank);
    }

    //Khong nhap Ten
    @Test
    public void TestisLastNameBlank(){
        RegisterValidator lg = new RegisterValidator();
        boolean isblank = lg.registercheck("Nguyen","","123456","thienphuc@gmail.com");
        assertFalse(isblank);
    }

    //Khong nhap Mat khau
    @Test
    public void TestisPasswordBlank(){
        RegisterValidator lg = new RegisterValidator();
        boolean isblank = lg.registercheck("Nguyen","Phuc","","thienphuc@gmail.com");
        assertFalse(isblank);
    }

    //Mat khau phai co hon 5 ky tu
    @Test
    public void TestPasswordLength(){
        RegisterValidator lg = new RegisterValidator();
        boolean passlength = lg.registercheck("Nguyen","Phuc","1234","thienphuc@gmail.com");
        assertFalse(passlength);
    }

    //Dang ky thanh cong
    @Test
    public void TestisRegisterSuccess(){
        RegisterValidator lg = new RegisterValidator();
        boolean Success = lg.registercheck("Nguyen","Phuc","123456","thienphuc@gmail.com");
        assertTrue(Success);
    }
}
