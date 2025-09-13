
import java.util.Arrays;

// package LeetCode_Problems_Sorting;

public class Assigncookies {

    static int findContentChildren(int[] g,int[] s){
        // Sort the greed factors and cookie sizes
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0;  // Index for children
        int cookie = 0; // Index for cookies

        // Try to satisfy as many children as possible
        while(child < g.length && cookie < s.length){

            if(s[cookie] >= g[child]){  // Cookie can satisfy the child
                child++;    // Move to next child
            }
                // Whether it satisfied a child or not, move to next cookie
            cookie++;
        }
        // Number of content children
        return child;
    }

    public static void main(String[] args) {
        int[] child = {1,2};
        int[] cookies = {1,2,3};
        int ans = findContentChildren(child,cookies);
        System.out.println(ans);
    }
}

