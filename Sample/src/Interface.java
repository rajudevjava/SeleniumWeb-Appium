
public class Interface {
	interface IntExample{
	
	
	class JavaInterfaceExample implements IntExample{
		 
		  public void sayHello(){
		    System.out.println("Hello Visitor !");
		  }
		 
		  public void main(String args[]){
		    //create object of the class
		    JavaInterfaceExample javaInterfaceExample = new JavaInterfaceExample();
		    //invoke sayHello(), declared in IntExample interface.
		    javaInterfaceExample.sayHello();
		  }

	}
}
}