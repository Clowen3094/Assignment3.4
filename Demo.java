package session3;
class Demo {
static int a= 10; //a static variable example
public static double convertmilestokilometer(double miles){ // a static method example
return(miles *1.60934);
}

public static void main(String args[]){

System.out.println(a); //static variable called in main method 

System.out.println(convertmilestokilometer(3)+"km"); // a static method called
}
} 