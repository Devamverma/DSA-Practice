
    
    public static int count = 0;
    public static void main(String[] args) {

        // print();
        // printName(1,3);
        // printNumbers1toN(1,5);
        // printNumbersNto1(5,1);
        //printNumbers1toNBacktracking(5,5);
        // printNumbersNto1Backtracking(1,5);

        //System.out.println(printSum(5));
        // System.out.println(factorial(5));
        // System.out.println("Reverse Array using Recursion");
        // int arr[] = {1,2,3,4,5};
        //reverseArray(0,arr.length-1,arr);
        // reverseArrayUsingSinglePointer(0,arr,arr.length);
        // for(int i=0;i<arr.length;i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // check palindrome
        // String str = "MADASM";
        // System.out.println(checkPalindrome(0,str));

        // Fibonacci number
        // System.out.println(fibonacci(10));
        // System.out.println(powerOfTwo(5));
        
        
    }

    // Infinite Recursion where there is no base case
    public static void infiniteRecursion() {
        System.out.println(count);
        infiniteRecursion();
    }
    

    // Recursion with Base Case
    public static void print() {
        if (count == 3) return; 
        System.out.println(count);
        count++;
        print();
    }

    // print Name N times using recursion
    public static void printName(int i,int n) {
        if(i>n) return;
        System.out.println("Nikhil");
        printName(i+1,n);
    }

    // Print numbers from 1 to N 
    public static void printNumbers1toN(int i,int n) {
        if(i>n) return;
        System.out.println(i);
        printNumbers1toN(i+1,n);
    }

    // Print numbers from N to 1
    public static void printNumbersNto1(int n,int i) {
        if(n<i) return;
        System.out.println(n);
        printNumbersNto1(n-1,i);
    }

    // Print number from 1 to N using Backtracking

    public static void printNumbers1toNBacktracking(int i,int n) {
        if(i<1) return;
        printNumbers1toNBacktracking(i-1,n);
        System.out.println(i);  
    }

    public static void printNumbersNto1Backtracking(int i,int n) {
        if(i>n) return;
        printNumbersNto1Backtracking(i+1,n);
        System.out.println(i);
    }

    public static int printSum(int n) {
        if(n==0) return 0;
        return n + printSum(n-1);
    }

    public static int factorial(int n) {
        if(n==0) return 1;
        return n * factorial(n-1);
    }

    // reverse array using recursion using 2 pointers
    public static void reverseArray(int l,int r,int arr[]) {
        if(l>=r) return;
        swap(l,r,arr);
        reverseArray(l+1,r-1,arr);
    }

    public static void reverseArrayUsingSinglePointer(int i,int arr[],int n ) {
       if(i>=n/2) return;
       swap(i,n-i-1,arr);
       reverseArrayUsingSinglePointer(i+1,arr,n);
    }

    public static void swap(int a,int b,int arr[]) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // check if string is palindrome using recursion

    public static boolean checkPalindrome(int i,String s) {

        if(i>=(s.length()/2)) return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        return checkPalindrome(i+1,s);
    }

    // Fibonacci number

    public static int fibonacci(int n) {

        if(n<=1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    // nth power of 2

    public static int powerOfTwo(int n) {
        if(n==0) return 1;
        return 2 * powerOfTwo(n-1);
    }
    


    