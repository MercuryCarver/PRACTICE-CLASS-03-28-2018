import java.util.Scanner;
public class DogInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner info = new Scanner(System.in);
System.out.println("Put in three dogs and their breeds");
Dog Dog1 = new Dog(info.nextLine(), info.nextLine());
Dog Dog2 = new Dog(info.nextLine(), info.nextLine());
Dog Dog3 = new Dog(info.nextLine(), info.nextLine());
Dog[] dogsinfo= { Dog1, Dog2, Dog3 };
System.out.println(dogsinfo[1].Name);
	}

}
