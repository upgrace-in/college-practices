class BFS{

    /**
     * Return the length of the shortest path between root and target node.
     */
    int BFS(Node root, Node target) {
        Queue<Node> queue;  // store all nodes which are waiting to be processed
        int step = 0;       // number of steps needed from root to current node
        // initialize
        queue.offer(root);
        // BFS
        while (queue.size() != 0) {
            // iterate the nodes which are already in the queue
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                Node cur = queue.peek();
                if(cur.data == target.data) return step;
                for (cur.next != null) {
                    add next to queue;
                }
                queue.poll()
            }
            step = step + 1;
        }
        return -1;          // there is no path from root to target
    }

    public static void main(String[] args){
        
    }

}