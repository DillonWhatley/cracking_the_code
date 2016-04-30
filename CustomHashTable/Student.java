package CustomHashTable;

/**
 * Created by Dillon on 4/25/2016.
 */
public class Student {
    private Integer id;
    private String name;

    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public Integer getId(){
        return id;
    }
    // hashing function
    public void setId(Integer id){
        this.id = id;
    }
}
