
public class ClassExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human andrew=new Human();
		andrew.setName("Andrew");
		andrew.setAge(17);
		andrew.setGender(Gender.Male);
		
		Human zheng=new Human();
		zheng.setName("Zheng Huang");
		zheng.setAge(55);
		zheng.setGender(Gender.Male);
		
		Mammal mammal1=new Mammal();
		mammal1.setAge(5);
		mammal1.setGender(Gender.Female);
		Mammal mammal2=new Mammal();
		mammal2.setAge(4);
		mammal2.setGender(Gender.Male);
		
		
		System.out.println("andrew:"+andrew);
		System.out.println("zheng:"+zheng);
		System.out.println("mammal1:"+mammal1);
		System.out.println("mammal2:"+mammal2);
		
		mammal1.move();
		mammal2.move();
		mammal1.makeSound();
		mammal2.makeSound();
		
		andrew.move();
		andrew.makeSound();
		zheng.makeSound();
		zheng.move();

	}

}

class Mammal {
	int age;
	Gender gender;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public void move() {
		System.out.println(this+" is moving");
	}
	
	public void makeSound() {
		System.out.println(this+" is making sound");
	}
	
	
}

class Human extends Mammal {
	String name;
	/*int age;
	Gender gender;*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}*/
	
	@Override
	public void move() {
		System.out.println(this+" is walking");
	}
	
	@Override
	public void makeSound() {
		System.out.println(this+" is talking");
	}
	
	@Override
	public String toString() {
		return "["+this.name+","+this.age+","+this.gender+"]";
	}
}

enum Gender {
	Male,
	Female
}