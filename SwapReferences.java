public  class SwapReferences {
    int num1 ;
    int num2;
    public static void main(String[] args) {

        SwapReferences obj1 = new SwapReferences();
        SwapReferences obj2 = new SwapReferences();
        obj1.num1 = 10;
        obj2.num2 = 20;

        System.out.println("The value of num1 is: " + obj1.num1 + " and the value if num2 is: " + obj2.num2 + " ~ before swapping");

        swapNumbers(obj1, obj2);

        System.out.println("The value of num1 is: " + obj1.num1 + " and the value if num2 is: " + obj2.num2 + " ~ after swapping");

    }

    public static void swapNumbers (SwapReferences obj1, SwapReferences obj2){
        int temp = obj1.num1;
        obj1.num1 = obj2.num2;
        obj2.num2 = temp;
    }
}