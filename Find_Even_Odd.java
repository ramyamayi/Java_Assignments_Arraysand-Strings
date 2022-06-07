package Arrays_Strings;

public class Find_Even_Odd {

	public static void main(String[] args) {
int[] even = {2,4,6,8,10,3,40};
int[] odd = {3,5,7,9,11,20,13};
for(int i :even)
if(i %2!=0) {
	System.out.println("Odd number in even list is : " +i);
}

for(int i: odd) {
if(i%2==0) {
	System.out.println("Even number in odd list is : " + i);
}
	}

	}
}
