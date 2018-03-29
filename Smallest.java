
public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array [] = { 3, 21, 64, 1, 7, 6 };
int smallest = array[0];
for(int i = 0; i<=array.length-1;i++) {
	if(array[i]<smallest)
		smallest = array[i];
	}System.out.println(smallest);
}
	}


