import java.util.*;

class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxarea=0;
        
        int l=0;
        int r=height.length-1;
        
        while(l < r)
        {
            int shortline = Math.min(height[l],height[r]);
            
            maxarea = Math.max(maxarea,shortline*(r-l));
            
            if(height[l]<height[r]){
                l++;
            }
            
            else{
                r--;
            }
            
        }
        
        return maxarea;
    }
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int[] height = new int[n];
        
        for(int i=0;i<n;i++){
            
            height[i] = sc.nextInt();
        
        }
        
        maxArea(height);
    
        sc.close();
        
    }
}