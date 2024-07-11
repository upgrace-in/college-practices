public class BinaryTree{
    int value;
    BinaryTree left, right;

    public BinaryTree(int val){
        this.value = val;
    }

    public void insert(int val){
        if(val <= value){
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
        System.out.print(value+" ");
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
        System.out.print(value+" ");
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
        System.out.print(value+" ");
    }

    public boolean contains(int val){
        boolean status = false;
        if(value == val){
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
}

class base {

    public static void main(String[] args){
        BinaryTree bt = new BinaryTree(3);
        bt.insert(2);
        bt.insert(7);
        bt.insert(1);
        bt.insert(5);
        // bt.DFS_DISPLAY();
        // System.out.println();
        // bt.inOrderTransversal();
        // System.out.println();
        // bt.postOrderTransversal();
        // bt.BFS_DISPLAY(bt);
        System.out.println(bt.contains(10));
    }
}