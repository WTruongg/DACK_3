
public class RegisterValidator {

    public boolean registercheck (String firstname,String lastname,String password,String EmailAddress) {
        //Email da duoc dang ky
        String email="thienphuc18072002@gmail.com";
        // Khong nhap Email
        if ( EmailAddress == "" )
            return false;
        // Email khong co ky tu @
        if ( EmailAddress.indexOf("@") < 0 )
            return false;
        // Email co khoang trang
        if ( EmailAddress.indexOf(" ") > 0 )
            return false;
        // Email khong co duoi .com
        if ( EmailAddress.indexOf(".com") < 0 )
            return false;
        // Email da ton tai
        if ( EmailAddress == email )
            return false;
        // Khong nhap Ho
        if ( firstname == "" )
            return false;
        // Khong nhap Ten
        if ( lastname == "" )
            return false;
        // Khong nhap MatKhau
        if ( password == "" )
            return false;
        // Mat khau phai dai hon 5 ky tu
        if ( password.length() < 5 )
            return false;
        return true;
    }
}