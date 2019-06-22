
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
class Problem_214{
    static int  find_length(int number){
        int max_length=0;
        while(number){  
        max_length += 1;
        number = number & (n << 1);
        }
    return max_length;
}
}


