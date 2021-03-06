import java.time.chrono.ThaiBuddhistChronology;

public class Something extends Object {

    // some fields.
    private Object[] objects;
    private int numObjects = 0;

    // some constructor
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

    /**
     * A method to replace an Object at a specified index with another Object.
     * @param objectIndex the index of the Object to be replaced.
     * @param o the Object to replace the previous Object.
     * @return the Object that was replaced.
     */
    public Object replaceObject(int objectIndex, Object o) {
        if(objectIndex > numObjects - 1) throw NullPointerException;
        Object save = objects[objectIndex];
        objects[objectIndex] = o;
        return save;
    }
}