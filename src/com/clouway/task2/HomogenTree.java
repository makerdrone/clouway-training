package com.clouway.task2;


public class HomogenTree extends HeterogenTree {

    /**
     * Default constructor. Sets root data to 0
     */
    public HomogenTree(){
        super(new Integer(0));
    }

    /**
     * Constructor setting the root data
     * @param data  an integer
     */
    public HomogenTree(int data){
        super(new Integer(data));
    }

    /**
     * Move an element up the tree so that it is 'smaller' than its parent
     * and 'greater' than its children
     * @param elem
     */
    private void heapUp(TreeNode elem){
        TreeNode parent = elem.getParent();
        TreeNode current = elem;

        while(parent != null && getElementData(current) > getElementData(parent)){
            swapElements(current, parent);

            current = parent;
            parent = current.getParent();
        }
    }

    /**
     * Return the integer value of an element's data object
     * @param elem
     * @return
     */
    private int getElementData(TreeNode elem){
        if(elem == null){
            return 0;
        }

        Integer data =(Integer) elem.getData();

        return data.intValue();
    }

    /**
     * Disable inherited method
     * @param data  the data object
     * @return
     */
    @Override
    public boolean add(Object data){
        throw new UnsupportedOperationException();
    }

    /**
     * Add a new element with a unique integer data object
     * @param data  an integer
     * @return
     */
    public boolean add(int data){
        boolean result = super.add(new Integer(data));
        
        sort();
        
        return result;
    }

    /**
     * Sort the elements of the tree
     */
    public void sort(){
        int endInd = this.elements.size() - 1;
        
        while(endInd > 0){
            for(int i=1; i<=endInd; i++){
                heapUp(this.elements.get(i));
            }
            swapElements(this.elements.get(0), this.elements.get(endInd));
            endInd --;
        }
    }

    /**
     * Check if an integer data object is in the tree
     * @param data the data object
     * @return
     */
    public boolean hasElement(int data){
        for(TreeNode elem : this.elements){
            int elemData = getElementData(elem);
            if(elemData == data){
                return true;
            }
        }
        return false;
    }

    /**
     * Disable inherited method
     * @return
     */
    @Override
    public Object getObjectData(){
        throw new UnsupportedOperationException();
    }

    /**
     * Return the integer data of the current element
     * @return
     */
    public int getData(){
        return (Integer) this.currentElement.getData();
    }
}
