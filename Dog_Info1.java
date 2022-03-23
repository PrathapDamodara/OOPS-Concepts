//Dog information1
import java.util.Scanner;
class Dog
{
    String name;
    String color;
    String bread;
    String eyecolor;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of Dog:");
        name=sc.next();
        System.out.println("Enter Color of Dog:");
        color=sc.next();
        
        System.out.println("enter Dog Bread:");
        bread=sc.next();
        
        System.out.println("Enter Eyecolor:");
        eyecolor=sc.next();
        
    } 
    void display(){
        System.out.println(name+"\n"+color+"\n"+bread+"\n"+eyecolor);
    }
    void bark(){
        System.out.println("Dog is barking");
    }
    void eat(){
        System.out.println("Dog is eating");
    }
}
class Dog_Info1{
    public static void main(String[] args){
        Dog dg1=new Dog();
        dg1.input();
        System.out.println("Dog I Information:");
        dg1.display();
        dg1.bark();
        
       System.out.println("\n---------------------");
         Dog dg2=new Dog();
         System.out.println("Dog II Information:");
         dg2.input();
         dg2.display();
         dg2.eat();

        
    }
}