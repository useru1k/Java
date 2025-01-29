// Question text

// A mathematics question paper has certain number of questions and each question is assigned some random maximum marks. Mr.Myers wants to edit the marks assigned to the questions such that:

//     All questions in the paper should have distinct maximum marks.
//     The total marks of all the questions should be low as possible.

// Mr.Myers wants to achieve this by making minimal changes in the original format, assigning the question at least as much marks as it originally had. Find the minimum total marks that he can set the paper for.

// Example 1:

// input 1 : 5

// input 2 : {1,2,3,4,5}

// Output : 15

// Explanation :

// As all the questions already have distinct marks, he can set the paper as it is with minimum marks as 1+2+3+4+5 = 15

// Example-2:

// input 1: 5

// input 2: {1,4,5,4,5}

// ﻿output: 23

// Explanation:

// Here, the question 1 would have at least 1 mark, question 2 would have at least 4 marks, question 3 would have at least 5 marks, so the new set of marks will have to be {1,4,5,6,7}, such that all the conditions are satisfied.


import java.util.Scanner;
import java.util.ArrayList;
public class MinimunMarkTeacherDistribution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int as = sc.nextInt();
            if(!a.contains(as))
                a.add(as);
        }
        int sum = 0;
        if(a.size() == n)
        {
            for(int i=0;i<n;i++)
            sum = sum + a.get(i);
            System.out.println(sum);
        }
        else
        {
            int sum1 = 0;
            int sp = n - a.size();
            for(int i=1;i<=sp;i++)
            a.add(a.get(a.size()-1)+1);
            for(int i=0;i<n;i++)
            sum1 = sum1 + a.get(i);
            System.out.println(sum1);
        }
            // System.out.println(a);
        
    }
}
