package array.task;

public class Frequency {

    public static void main(String [] args){

       int nums [] ={2,2,3,4,4,2};
       boolean visited [] = new boolean[nums.length];
       int len = nums.length;
       for(int i=0;i<len;i++){
        if(visited[i]==false){
            int count = 1;
            for(int j=i+1;j<len;j++){
                if(nums[i]==nums[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(nums[i]+" -> " +count);

        }
       }

    }
    
}
