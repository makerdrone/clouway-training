package com.clouway.task2;


public class TreeNode {
    private Object data = null;
    private TreeNode parent = null;
    private TreeNode [] children = {null, null};

    /**
     * Constructor setting a parent
     * @param parent
     */
    public TreeNode(TreeNode parent){
        this.parent = parent;
    }

    /**
     * Constructor setting a parent and initial data
     * @param parent
     * @param data
     */
    public TreeNode(TreeNode parent, Object data){
        this.parent = parent;
        this.data = data;
    }

    /**
     * Set the node data object
     * @param data
     */
    public void setData(Object data){
        this.data = data;
    }

    /**
     * Return the node data object
     * @return
     */
    public Object getData(){
        return this.data;
    }

    /**
     * Return the parent node
     * @return
     */
    public TreeNode getParent(){
        return this.parent;
    }

    /**
     * Return an array of all valid(non-null) children
     * @return
     */
    public TreeNode [] getChildren(){
        int validInd = 0;
        TreeNode [] validChildren = new TreeNode[childrenCount()];
        
        for(TreeNode child : this.children){
            if(child != null){
                validChildren[validInd] = child;
                validInd ++;
            }
        }
        return validChildren;
    }

    /**
     * Return the number of valid(non-null) children
     * @return
     */
    public int childrenCount(){
        int count = 0;
        for(TreeNode child : this.children){
            if(child != null){
                count ++;
            }
        }
        return count;
    }

    /**
     * Add a child node. Returns true on success or false if
     * no more children can be added.
     * @param child
     * @return
     */
    public boolean addChild(TreeNode child){
        int childrenCnt = childrenCount();
        if(childrenCnt >= this.children.length){
            return false;
        }
        
        this.children[childrenCnt] = child;
        
        return true;
    }
}
