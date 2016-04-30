package CustomHashTable;

/**
 * Created by Dillon on 4/25/2016.
 */
public class CustomHashTable {

    Student[] map = new Student[100];

    public void buildMap(Student[] students){
        for (Student s : students) {
            int id = hash(s.getName(), map.length);
            map[id] = s;
        }

    }



    public int hash(String key, int tableSize){
        int hashValue = 0;

        for (int i = 0; i < key.length(); i++){
            hashValue = (hashValue * 37) + key.charAt(i);
        }
        hashValue %= tableSize;

        if (hashValue < 0){
            hashValue += tableSize;
        }

        return hashValue;
    }


    //Getters
    public int getTableSize(){
        return map.length;
    }
    public Student[] getMap(){
        return map;
    }


}
