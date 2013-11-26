package com.clouway.task2;

import java.util.ArrayList;


public class HeterogenTree {
    protected ArrayList<TreeNode> elements = new ArrayList<TreeNode>();
    protected TreeNode currentElement = null;

    /**
     * Default constructor. Adds a root element with no data.
     */
    public HeterogenTree(){
        TreeNode root = new TreeNode(null);
        this.elements.add(root);
        this.currentElement = root;
    }

    /**
     * Constructor setting a data object to the root element
     * @param data
     */
    public HeterogenTree(Object data){
        TreeNode root = new TreeNode(null, data);
        this.elements.add(root);
        this.currentElement = root;
    }

    /**
     * Swap two elements of the tree.
     * @param a
     * @param b
     */
    protected void swapElements(TreeNode a, TreeNode b){
        Object tempData = a.getData();
        a.setData(b.getData());
        b.setData(tempData);
    }

    /**
     * Add a new element with a unique data object
     * @param data  the data object
     * @return
     */
    public boolean add(Object data){
        if(hasElement(data)){
            return false;
        }
        
        int parentInd = (this.elements.size() - 1) / 2;
        TreeNode parent = this.elements.get(parentInd);
        
        TreeNode elem = new TreeNode(parent, data);
        
        this.elements.add(elem);
        parent.addChild(elem);
        
        this.currentElement = elem;
        
        return true;
    }

    /**
     * Check if a data object is in the tree
     * @param data the data object
     * @return
     */
    public boolean hasElement(Object data){
        for(TreeNode elem : this.elements){
            Object elemData = elem.getData();
            if(elemData != null && elemData.equals(data)){
                return true;
            }
        }
        return false;
    }

    /**
     * Print all the elements of the tree to the console
     */
    public void printElements(){
        for(TreeNode elem : this.elements){
            System.out.printf("%s, ", elem.getData());
        }
    }

    /**
     * Move the currentElement pointer to the root element
     * @return
     */
    public boolean seekRoot(){
        this.currentElement = this.elements.get(0);
        if(this.currentElement != null)
            return true;

        return false;
    }

    /**
     * Move the currentElement pointer to the parent element, if there is a parent
     * @return 
     */
    public boolean seekParent(){
        TreeNode parent = this.currentElement.getParent();
        if(parent == null){
            return false;
        }
        
        this.currentElement = parent;
        return true;
    }

    /**
     * Move the currentElement pointer to a direct child element.
     * @param childInd  index of a child
     * @return
     */
    public boolean seekChild(int childInd){
        try{
            TreeNode child = this.currentElement.getChildren()[childInd];
            if(child == null){
                return false;
            }
            
            this.currentElement = child;
            return true;
        }
        catch (ArrayIndexOutOfBoundsException e){
            return false;
        }
    }

    /**
     * Move the currentElement pointer to a deep child element.
     * @param indices   a list of integer arguments
     * @return
     */
    public boolean seekChildren(int ... indices){
        for(int ind : indices){
            if(!seekChild(ind))
                return false;
        }
        return true;
    }

    /**
     * Return the data object of the current element
     * @return
     */
    public Object getObjectData(){
        return this.currentElement.getData();
    }
}
