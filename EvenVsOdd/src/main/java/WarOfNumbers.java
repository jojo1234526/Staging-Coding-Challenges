public class WarOfNumbers {

    public int warOfnums(int[] arr) {
        int even = 0;
        int odd = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] % 2 == 0) {
                even+=arr[i];
            }else{
                odd+=arr[i];
            }
        }
        System.out.println("This is the value of even " + even);
        System.out.println("This is the value of odd " + odd);
        return Math.abs(even-odd);
    }

    public static void main(String[] args){
        WarOfNumbers EvenOrOdd = new WarOfNumbers();
        int [] arr = {9,0,2,5,3,2,1,};
        System.out.println( "This is the difference between the even and odd numbers " + EvenOrOdd.warOfnums(arr));
    }


}
