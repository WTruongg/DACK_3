import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestLogin {
    @Test
    //Khong nhap email va mat khau dang nhap
    public void TestisEmailandPasswordBlank(){
        LoginValidator lg = new LoginValidator();
        boolean isblank = lg.Logincheck("","");
        assertFalse(isblank);
    }

    //Khong nhap email
    @Test
    public void TestisEmailBlank(){
        LoginValidator lg = new LoginValidator();
        boolean isblank = lg.Logincheck("","123456");
        assertFalse(isblank);
    }

    //Email khong co ky tu @
    @Test
    public void TestisEmailInValid(){
        LoginValidator lg = new LoginValidator();
        boolean isValid = lg.Logincheck("thienphucgmail.com","123456");
        assertFalse(isValid);
    }

    //Email khong co duoi .com
    @Test
    public void TestisEmailInValid2(){
        LoginValidator lg = new LoginValidator();
        boolean isValid = lg.Logincheck("thienphuc@gmail","123456");
        assertFalse(isValid);
    }

    //Email co khoang trang
    @Test
    public void TestisEmailInValid3(){
        LoginValidator lg = new LoginValidator();
        boolean isValid = lg.Logincheck("thien phuc@gmail","123456");
        assertFalse(isValid);
    }

    //Email chua duoc dang ky hoac nhap sai email
    @Test
    public void TestisEmailnotexistOrWrongEmail(){
        LoginValidator lg = new LoginValidator();
        boolean isValid = lg.Logincheck("thienphuc123@gmail.com","123456");
        assertFalse(isValid);
    }

    //Khong nhap mat khau
    @Test
    public void TestisPasswordBlank(){
        LoginValidator lg = new LoginValidator();
        boolean isValid = lg.Logincheck("thienphuc123@gmail.com","");
        assertFalse(isValid);
    }

    //Nhap sai mat khau
    @Test
    public void TestisWrongPassword(){
        LoginValidator lg = new LoginValidator();
        boolean isValid = lg.Logincheck("thienphuc@gmail.com","thienphuc");
        assertFalse(isValid);
    }

    //Dang nhap thanh cong
    @Test
    public void TestisLoginSuccess(){
        LoginValidator lg = new LoginValidator();
        boolean isValid = lg.Logincheck("thienphuc@gmail.com","123456");
        assertTrue(isValid);
    }
}
