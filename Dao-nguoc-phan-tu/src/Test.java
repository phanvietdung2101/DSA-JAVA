public class Test {
    public static void main(String[] args) {
        String string = "dung";
        int[] arr = new int[]{1,2,3,4,5};

        ReverseArrayElement<Integer> reverse = new ReverseArrayElement<>();
        reverse.reverseArray(arr);
        for(int each:arr){
            System.out.println(each);
        }
        string = reverse.reverseString(string);
        System.out.println(string);
    }
}
