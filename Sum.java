class Sum{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int countEven=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                countEven+=arr[i];
            }
        }
        System.out.println(countEven);
}
}