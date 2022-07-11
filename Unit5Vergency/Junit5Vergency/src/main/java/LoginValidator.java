public class LoginValidator {
    public boolean Logincheck (String EmailAddress,String password) {
        String loginemail = "thienphuc@gmail.com";
        String loginpassword = "123456";
        // Email co khoang trang
        if ( EmailAddress.indexOf(" ") > 0 )
            return false;
        // Email khong co ky tu @
        if ( EmailAddress.indexOf("@") < 0 )
            return false;
        // Email khong co duoi .com
        if ( EmailAddress.indexOf(".com") < 0 )
            return false;
        // Email chua duoc dang ky hoac nhap sai email da duoc dang ky
        if ( EmailAddress != loginemail )
            return false;
        // Nhap sai mat khau
        if ( password != loginpassword )
            return false;
        return true;
    }
}
