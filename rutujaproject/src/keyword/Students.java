package keyword;
public class Students {
	int rollno;  
	String name;  
	float fee;  
	Students(int rollno,String name,float fee)
	{  
	this.rollno=rollno;  
	this.name=name;  
	this.fee=fee;  
	}  
	void display(){System.out.println(rollno+" "+name+" "+fee);
	}  
	}  
	class TestThis2{  
	public static void main(String args[]){  
	Students s1=new Students(111,"ankit",5000f);  
	Students s2=new Students(112,"sumit",6000f);  
	s1.display();  
	s2.display();  
	}
	}  


