package constructors;

public class Students4 {
	int id;  
    String name;  
    //creating a parameterized constructor  
    Students4(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    Students4 s1 = new Students4(111,"Karan");  
    Students4 s2 = new Students4(222,"Aryan");  
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  

}
