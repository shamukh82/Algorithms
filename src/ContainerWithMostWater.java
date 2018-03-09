import java.lang.Math.*;
/**
 * Created by smukherjee5 on 3/4/18.
 */
public class ContainerWithMostWater {
    public static void main(String[] args){
        System.out.println(maxArea(new int[]{1,5,4,3}));
        System.out.println(maxArea(new int[]{3, 1, 2, 4, 5}));
    }

    public static int maxArea(int[] height) {

        int l=0;
        int r=height.length-1;

        //base = f[0,n-1]
        int maxArea = 0;

        while (l < r){
            maxArea=Math.max(Math.min(height[l],height[r])*(r-l),maxArea);
            if (height[l]<height[r]){
                l++;
            }
            else {
                r--;
            }
        }





        return maxArea;
    }
}
