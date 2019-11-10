package MethodsReturn;

public class countAppearances {
    public static void main(String[] args) {
        System.out.println(max(5,0));
        System.out.println("Form TestBranch");

    }

        public static int max (int x,int  max){
            if(max < x)
            {
                return max;
            }else
              return x;

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
