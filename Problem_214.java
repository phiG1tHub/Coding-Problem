
/*
 * This is your coding interview problem for today.
 * 
 * This problem was asked by Stripe.
 * 
 * Given an integer n, return the length of the longest consecutive run of 1s in
 * its binary representation.
 * 
 * For example, given 156, you should return 3.
 * 
 * We will be sending the solution tomorrow, along with tomorrow's question. As
 * always, feel free to shoot us an email if there's anything we can help with.
 * 
 * Have a great day!
 * 
 * P.S. Looking to commit to a new habit? Check out Daily Habit Mail to help
 * keep yourself accountable!
 */
class Problem_214 {
    static int  find_length(int number){
        int count = 0;

    // Count the number of iterations to
    // reach n = 0.
    while (number!=0)
    {
                        // This operation reduces length
                         // of every sequence of 1s by one.
        number = (number & (number << 1));// Implementing Brain Kernighan's Algorithm  
        count++;                          // "dropping the least segnificant bit"
    }
    return count;
}
public static void main(String[] args){ // 

   System.out.println(find_length(-1));
   System.out.println(find_length(0));
   System.out.println(find_length(-2));
   System.out.println(find_length(5));
   System.out.println(find_length(6));
   System.out.println(find_length(7));
   System.out.println(find_length(8));
   System.out.println(find_length(2147483647));


}
/*Testing -1 -> 32
           0 -> 0 
          -2 -> 31
           5 -> 1
           6 -> 2
           7 -> 3
           8 -> 1
           2,147,483,647-> ERROR: JDWP Unable to get JNI 1.2 environment, jvm->GetEnv() return code = -2
JDWP exit error AGENT_ERROR_NO_JNI_ENV(183):  [util.c:840] lol
           */
}