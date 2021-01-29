package studentlist;

public class PartTimeStudent extends Student {
    
    private int numCourses;

    public PartTimeStudent(String name) {
        super(name);
    }

    public PartTimeStudent(int numCourses, String name) {
        super(name);
        this.numCourses = numCourses;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
    
    
}
