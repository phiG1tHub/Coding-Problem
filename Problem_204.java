/* 
 * This problem was asked by Amazon.
 * 
 * Given a complete binary tree, count the number of nodes in faster than O(n)
 * time. Recall that a complete binary tree has every level filled except the
 * last, and the nodes in the last level are filled starting from the left.
 */
class Problem_204 {
    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // A Java program to introduce Binary Tree
    static class BinaryTree {
        // Root of Binary Tree
        Node root;

        // Constructors
        BinaryTree(int key) {
            root = new Node(key);
        }

        BinaryTree() {
            root = null;
        }

        int count(Node root) {
            if (this.root == null) {
                return 0;
            } else {
                return (1 + count(root.left) + count(root.right));
            }
        };

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
       System.out.println(tree.count(tree.root));
    }
}