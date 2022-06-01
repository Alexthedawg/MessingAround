public class Something extends Object {

    private Object[] objects;
    private int numObjects;

    public Something(int maxObjects) {
        objects = new Object[maxObjects];
        numObjects = 0;
    }

    /*
     * protected int getNumObjects() {return numObjects;}
     * protected void setNumObjects(int numObjects) {this.numObjects = numObjects;}
     * protected Object[] getObjects() {return objects;}
     */

    public boolean addObject(Object o) {
        try {
            objects[numObjects++] = o;
            return true;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("There is no more room for objects.");
            return false;
        }
    }
}