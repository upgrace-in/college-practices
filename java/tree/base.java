public class BinaryTree{
    int data;
    BinaryTree left, right;

    public BinaryTree(int val){
        this.data = val;
    }

    public void insert(int val){
        if(val <= data){
            if(left == null){
                left = new BinaryTree(val);
            }else{
                left.insert(val);
            }
        }else{
            if(right == null){
                right = new BinaryTree(val);
            }else{
                right.insert(val);
            }
        }
    }

    // Pre Order transversal
    public void DFS_DISPLAY(){
        System.out.print(data+" ");
        if(left != null){
            left.DFS_DISPLAY();
        }
        if(right != null){
            right.DFS_DISPLAY();
        }
    }

    public void inOrderTransversal(){
        if(left != null){
            left.inOrderTransversal();
        }
        System.out.print(data+" ");
        if(right != null){
            right.inOrderTransversal();
        }
    }

    public void postOrderTransversal(){
        if(left != null){
            left.inOrderTransversal();
        }
        if(right != null){
            right.inOrderTransversal();
        }
        System.out.print(data+" ");
    }

    public boolean contains(int val){
        boolean status = false;
        if(data == val){
            return true;
        } 
        if(left != null){
            status = left.contains(val);
        }
        if (right != null){
            status = right.contains(val);
        }
        return status;
    }

    public BinaryTree delete(BinaryTree root, int key){
        if(root == null){
            return root;
        }

        if(key < root.data){
            root.left = delete(root.left, key);
        }else if(key > root.data){
            root.right = delete(root.right, key);
        }

        else{
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            // deleting the item
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }

        return root;
    }

    static int minValue(BinaryTree root){
        int minv = root.data;
        while(root.left != null){
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

}

class base {

    public static void main(String[] args){
        BinaryTree bt = new BinaryTree(4);
        bt.insert(2);
        bt.insert(3);
        bt.insert(1);
        bt.insert(6);
        bt.insert(5);
        bt.insert(7);
        bt.DFS_DISPLAY();
        // System.out.println();
        // bt.inOrderTransversal();
        System.out.println();
        bt.delete(bt, 4);
        bt.DFS_DISPLAY();
        // System.out.println();
        // bt.postOrderTransversal();
        // bt.BFS_DISPLAY(bt);
        // System.out.println(bt.contains(10));
    }
}