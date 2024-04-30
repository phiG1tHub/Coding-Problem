/*This is your coding interview problem for today.

This problem was asked by Amazon.

Huffman coding is a method of encoding characters based on their frequency.
Each letter is assigned a variable-length binary string, such as 0101 or 111110, 
where shorter lengths correspond to more common letters. To accomplish this, 
a binary tree is built such that the path from the root to any leaf uniquely maps to a character. 
When traversing the path, descending to a left child corresponds to a 0 in the prefix, 
while descending right corresponds to 1.

Here is an example tree (note that only the leaf nodes have letters):

        *
      /   \
    *       *
   / \     / \
  *   a   t   *
 /             \
c               s

With this encoding, cats would be represented as 0000110111.

Given a dictionary of character frequencies, build a Huffman tree,
and use it to determine a mapping between characters and their encoded binary strings.

We will be sending the solution tomorrow, along with tomorrow's question. As always, feel free to shoot us an email if there's anything we can help with.

Have a great day!*/
class Problem_261{
  
  public static void main(String[] args)
    {
        Runtime runtime = Runtime.getRuntime();     //getting Runtime object
 
        try
        {
            runtime.exec("notepad.exe");        //opens new notepad instance
 
            //OR runtime.exec("notepad");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}