package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int res = year%4;
        switch(res){
            case 0:
                if (year%400 == 0){
                    System.out.println("leap");}
                else if (year%100 != 0){
                    System.out.println("leap");}
                else {
                    System.out.println("not leap");
                }
                break;
            default:
                System.out.println("not leap");
                break;
        }
    }
}