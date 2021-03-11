package Practice;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
//import java.util.list;

class Duplicate {
    private String name;
    private String age;
    private String location;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    
    Duplicate(String name, String age, String location)
    {
        this.name = name;
        this.age = age;
        this.location = location;
        
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if(obj instanceof Duplicate)
        {
            Duplicate temp = (Duplicate) obj;
            if(this.name == temp.name && this.age== temp.age)
                return true;
        }
        return false;

    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub

        return (this.name.hashCode() + this.age.hashCode() + this.location.hashCode() );        
    }


public static void main(String[] args) {
    Duplicate b1 = new Duplicate("Rajesh", "21", "London");
    Duplicate b2 = new Duplicate("Suresh", "28", "California");
    Duplicate b3 = new Duplicate("Sam", "26", "Delhi");
    Duplicate b4 = new Duplicate("Rajesh", "21", "Gurgaon");
    Duplicate b5 = new Duplicate("Manish", "29", "Bengaluru");
    List<Duplicate> list = new ArrayList<Duplicate>();
    list.add(b1);
    list.add(b2);
    list.add(b3);
    list.add(b4);       
    list.add(b5);

   //Removing Duplicates;
    Set<Duplicate> s= new HashSet<Duplicate>();
    s.addAll(list);         
    list = new ArrayList<Duplicate>();
    list.addAll(s);        
    //Now the List has only the identical Elements
    System.out.println(list);
    
    }
}