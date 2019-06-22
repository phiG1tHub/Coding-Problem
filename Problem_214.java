
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
        number = (number & (number << 1));
        count++;
    }
    return count;
}
public static void main(String[] args){
   System.out.println(find_length(5));
}
}