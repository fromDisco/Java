package CodeWars_6Kyu.TenMinuteWalk;

public class App {
    public static void main(String[] args) {
        boolean isIt01 = IsItTenMinutesLong.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}); // true
        System.out.println(isIt01);
        boolean isIt02 = IsItTenMinutesLong.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}); // false
        System.out.println(isIt02);
        boolean isIt03 = IsItTenMinutesLong.isValid(new char[] {'w'}); // false
        System.out.println(isIt03);
        boolean isIt04 = IsItTenMinutesLong.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}); // false
        System.out.println(isIt04);
    }
}
