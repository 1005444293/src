public class TEST1 {
    public static void main(String[] args) {
        int [] numbers = new int[3];
        numbers[0] = 3;
        numbers[1] = 32;
        numbers[2] = 321;
//        System.out.println(numbers);
//        System.out.println(numbers.toString());
        String str = IntToStr(numbers);
        String[] s = str.split(",");

        System.out.println(s[0]);
    }

    private static String IntToStr(int [] numbers){
        StringBuffer str = new StringBuffer();
        for(int num: numbers){
            str.append(num);
            str.append(",");
        }
        return str.toString();
    }

}
