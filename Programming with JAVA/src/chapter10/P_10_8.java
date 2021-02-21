package chapter10;

public class P_10_8 {

	static int [] prime = {2, 3, 5, 7, 11, 13, 17, 23, 29, 31, 
            37, 41, 43, 47, 53, 59, 61, 67, 71, 73};
int [] factors;

private static boolean divisible(int n, int d) {
if ((n/d) * d == n) return true;
else return false;
};
private static int findTheLastDivisible(int n, int[] p) {
int ndx = 0;
int ndx1 = prime.length - 1;
while (ndx1 > 0) {
 if (divisible(n, prime[ndx1])) break;
 ndx1--;
}
int lastDivisible = ndx1;
return lastDivisible;
}

private static int countTheFactor(int n, int f){
int count = 0;
while (divisible(n, f)) {
 n = n / f;
 count++;
}
return count;
}
private static int[] factor(int n, int[] p) {
    int lastDivisible = findTheLastDivisible(n, prime);
    int [] result = new int[lastDivisible+1];
    while (lastDivisible >= 0) {
        result[lastDivisible] = 
                     countTheFactor(n, prime[lastDivisible]);
        lastDivisible--;
    }
    return result;
}

public static void main(String[] args) {
    int factorThis = 75;
    if (factorThis <= 1) {System.out.println(
        "Does not have a prime factorization"); 
        System.exit(0);}
    int [] answer = factor(factorThis, prime);
    int last = answer.length - 1;
    for (int ndx = answer.length - 1; ndx <= 0; ndx--)
        if (answer[ndx] > 0 ) {last = ndx; break;}
    System.out.print( factorThis + " = ");
    for (int ndx = 0; ndx < answer.length; ndx++) {
        if (answer[ndx]>0) {
            System.out.print(prime[ndx] + "↑" + answer[ndx]);
            if (ndx < last) System.out.print(" + ");
        }
    }
    System.out.println();
}



}
