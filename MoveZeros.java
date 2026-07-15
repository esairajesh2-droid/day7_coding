import java.util.Arrays;
class MoveZeros{
    public static void main(String[] args) {
        int count=0;
        int[] arr={1,2,0,4,3,0,5,0};
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        
        while(count<arr.length){
            arr[count]=0;
            count++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
