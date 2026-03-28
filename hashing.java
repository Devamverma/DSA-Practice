import java.util.Scanner;

public static void main(String[] args) {
    // findFrequencyOfNumbers();
    // frequencyOfCharacters();

    findFrequencyUsingHashmap();

    
}

public static void findFrequencyUsingHashmap() {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int arr[] = new int[size];
    for (int i = 0; i < size; i++) {
        arr[i] = scanner.nextInt();
    }

    // precompute
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < size; i++) {
        if(hashMap.containsKey(arr[i])) {
            hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
        } else {
            hashMap.put(arr[i], 1);
        }
    }

    int queries = scanner.nextInt();
    for (int i = 0; i < queries; i++) {
        int number = scanner.nextInt();

        // fetch
        System.out.println(hashMap.getOrDefault(number, 0));
    }
    scanner.close();

}

public static void findFrequencyOfNumbers() {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int arr[] = new int[size];
    for (int i = 0; i < size; i++) {
        arr[i] = scanner.nextInt();
    }

    // precompute

    int hash[] = new int[13];
    for (int i = 0; i < size; i++) {  
        hash[arr[i]] +=1;
    }

    int queries = scanner.nextInt();
    for (int i = 0; i < queries; i++) {
        int number = scanner.nextInt();

        // fetch
        System.out.println(hash[number]);
    }
    scanner.close();

}


public static void frequencyOfCharacters() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string:");
    String Str = sc.nextLine();
    int hash[] = new int[256];

    // precompute
    for(int i = 0; i < Str.length(); i++) {
        char ch = Str.charAt(i);
        hash[ch] += 1;
    }

    System.out.println("Enter number of queries:");
    int queries = sc.nextInt();
    for(int i = 0; i < queries; i++) {
        char ch = sc.next().charAt(0);  
        // fetch
        System.out.println("Frequency of " + ch + " is:");
        System.out.println(hash[ch]);
    }
    sc.close();
}