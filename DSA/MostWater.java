public class MostWater {
    
    public static int maxArea(int height[]){

        int left = 0;
        int right = height.length-1;
        int maxWater = 0;

        while(left < right){

            int width = right - left;

            int waterHeight;

            if(height[left] < height[right]){
                waterHeight = height[left];
            }
            else{
                waterHeight = height[right];
            }

            int currentWater = width * waterHeight;

            if(currentWater > maxWater){
                maxWater = currentWater;
            }

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }

        }
      
        return maxWater;

    }

    public static void main(String[] args) {

        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
        
    }
}
