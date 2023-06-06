public class Solution {

	public static long staircase(int n) {
		//Your code goes here
        /*
        //If we reach n=0, we have found a path
        if (n==0)
            return 1;
        
        //If n<0, the steps we took till then don't work
        else if(n<0)
            return 0;
        
        return staircase(n-1)+staircase(n-2)+staircase(n-3);        
		*/
               
        if(n<=1)
            return 1;
        if(n==2)
            return 2;
        
        long dpCount[] = new long[n+1];
        dpCount[0]=1;
        dpCount[1]=1;
        dpCount[2]=2;

        
        for (int i=3;i<=n;i++)
        {
            dpCount[i]=dpCount[i-1]+dpCount[i-2]+dpCount[i-3];
                
        }
        return dpCount[n];
	}

}
