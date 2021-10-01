package b19.thuchang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailRegex {
        private static Pattern pattern;
        private Matcher matcher;
        private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

        public EmailRegex() {
            pattern = Pattern.compile(EMAIL_REGEX);
        }

        public boolean validate(String regex) {
            matcher = pattern.matcher(regex);
            return matcher.matches();
        }

    public static void main(String[] args) {
        String a="a@gmail.com";
        EmailRegex emailRegex=new EmailRegex();
        System.out.println(emailRegex.validate(a))

        ;
    }
    }
