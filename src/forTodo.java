public class forTodo {
    public static void main(String[] args) {
        int arr[] = new int[50];
        int j = 0;
        for (int i = 0; i <= 50; i++) {
            if(i % 2 == 0){
                arr[j] = i;
                j++;
            }
        }
        for (int i = 1; i < j; i++){
            System.out.println(arr[i] + "");
        }
    }
}
