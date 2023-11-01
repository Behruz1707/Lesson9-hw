package hw;

import java.util.regex.Pattern;

public class UserService {
    private UserInfo userInfo;
    public void checkingUserInfo(UserInfo userInfo){
        boolean validate;
        if(Pattern.matches("[A-Z][a-z]*\\ [A-Z][a-z]*",userInfo.getFullName())){
            validate = true;
        }else {
            System.out.println("Fullname is invalid");
            validate=false;
        }

        if(Pattern.matches("[a-z]*[0-9]{2}\\@gmail\\.com",userInfo.getGmail())){

        }else {
            System.out.println("Email is invalid");
            validate=false;
        }

        if(Pattern.matches("\\+998((90)|(99)|(93)|(94)|(97)|(33)|(71))[0-9]{7}", userInfo.getPhoneNumber())){

        }else {
            System.out.println("Phone number is invalid");
            validate=false;
        }

        Pattern p1 = Pattern.compile("[a-z]");
        Pattern p2 = Pattern.compile("[A-Z]");
        Pattern p3 = Pattern.compile("[0-9]");
        if(userInfo.getPassword().length()>=8 &&
                p1.matcher(userInfo.getPassword()).find() &&
                p2.matcher(userInfo.getPassword()).find() &&
                p3.matcher(userInfo.getPassword()).find()){


        }else {
            System.out.println("Password is invalid");
            validate=false;
        }

        if (validate) {
            System.out.println("You've registered!");
        }else {
            System.out.println("Pls check your info");
        }
    }
}
