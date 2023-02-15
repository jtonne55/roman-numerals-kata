package src.main.java.convert;

public class Convert {
    public static String convert(int number) {

        if(number >= 1000){
            int reste_division = number-1000;
            return "M".concat(convert(reste_division));
        }
        if (number >= 500) {
            int reste_division = number-500;
            return "D".concat(convert(reste_division));
        }
        if (number >= 100) {
            int reste_division = number-100;
            return "C".concat(convert(reste_division));
        }
        if (number >= 50) {
            int reste_division = number-50;
            return "L".concat(convert(reste_division));
        }
        if (number >= 10) {
            int reste_division = number-10;
            return "X".concat(convert(reste_division));
        }
        if (number >= 5) {
            int reste_division = number-5;
            return "V".concat(convert(reste_division));
        }
        if (number >= 1) {
            int reste_division = number-1;
            return "I".concat(convert(reste_division));
        }
        return "";
    }
}
