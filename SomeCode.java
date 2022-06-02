public class Something extends Object {

    // some fields.
    private Object[] objects;
    private int numObjects;

    // come constructor
    public Something(int maxObjects) {
        objects = new Object[maxObjects];
        numObjects = 0;
    }

    //some getter setters
    protected int getNumObjects() {
        return numObjects;
    }

    protected void setNumObjects(int numObjects) {
        this.numObjects = numObjects;
    }

    protected Object[] getObjects() {
        return objects;
    }

    /**
     * Adds an object to the Something if there is enough space.
     * 
     * @param o the Object to be added.
     * @return true if the Object is added succesfully.
     */
    public boolean addObject(Object o) {
        try {
            objects[numObjects++] = o;
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("There is no more room to add Objects.");
            return false;
        }
    }

    /**
     * Removes an item from the end of the Something.
     * 
     * @return the Object that was removed if it exists.
     */
    public Object removeObject() {
        try {
            return objects[numObject--];
        } catch (NullPointerException e) {
            System.err.println("There is no Object to remove.");
        }
    }

    /**
     * Undoes the most recent removeObject operation performed.
     * 
     * @return true if an Object was successfully added back to the Something.
     */
    public boolean undoRemove() {
        if (numObjects < objects.length - 1) {
            numObjects++;
            return true;
        }
        if (numObjects >= objects.length - 1)
            return false;
    }
}