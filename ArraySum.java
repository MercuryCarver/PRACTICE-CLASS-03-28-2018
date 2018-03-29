
public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array [] = { 30, 26, 2, 1 };
int add = array[0];
int sum= 0;
for(int i = 1; i<= array.length-1;i++) {
	add = add + array[i];
}
System.out.println(add);
	}

}
