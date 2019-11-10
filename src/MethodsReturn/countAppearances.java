package MethodsReturn;

public class countAppearances {
    public static void main(String[] args) {
        String [] arr = new String[4];
     arr = new String[]{"first", "second", "first", "fifth"};
        System.out.println(count_appearance(arr, "first"));


    }

    public static int count_appearance (String [] arr, String t){
        int  count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(t)){
                count++;
            }
        }
        return count;
    }
}
