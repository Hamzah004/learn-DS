import java.security.cert.Extension;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int[] m= new int[5];
//        int[] k = {10,12,12,23};
//        // array has fixed size
//        // indexing can be used to access any element // max index = length - 1
//        // array is random access data structure
//
//        System.out.println("second element is: "+k[1]);
//        System.out.println("size of array m: "+m.length); // length is fixed
//
//        m[0] = 50; // setting new value
//        for(int i = 0;i<m.length;i++){
//            if(m[i] !=0)
//                System.out.println(value is: "+m[i]);
//        }
//        // array is like a bus that has max size of seats question
//        for(int i:k)"
//            System.out.println("the value is: "+i);


        ArrayList <Double> a = new ArrayList<>();
        ArrayList <Double> b = new ArrayList<>();
        System.out.println("number of elements is: "+ 0);
        b.add(10.0);
        b.add(20.0);
        a.add(2.5);
        a.add(2.3);
//         String o = (String)a.get(1);
//         System.out.println(o);
//         a.add(10); // can't store value
        a.add(1,10.0);
        a.add(3,10.0); // to the index+1
        a.add(4,20.0); // anything more than the index+1 will cause run-time error
        System.out.println("list a: "+a); // it will print the List
        System.out.println("number of elements in a is: "+a.size());
        System.out.println("list b: "+b);
        System.out.println("number of elements in a is: "+b.size());

        a.addAll(0,b); // added b to a
        System.out.println("list a: "+a); // it will print the List
        System.out.println("number of elements in a is: "+a.size());
        System.out.println("list b: "+b);
        System.out.println("number of elements in a is: "+b.size());

        System.out.println("first element: "+a.get(6)); // to access value
        a.set(0,12.0);
        a.set(0,a.get(2)); // change first value to the value of third element
        System.out.println("list a: "+a);
        a.remove(2);
        System.out.println("list a: "+a);
        System.out.println("number of elements in a is: "+a.size());

        ArrayList <Double> test1 = new ArrayList<>();
        test1.add(12.5);
        test1.add(10.5);
        test1.add(10.5);
        test1.add(10.5);
        test1.add(10.5);
        test1.add(10.5);
        test1.add(12.5);
        test1.add(3.7);
        ArrayList <Double> test2 = new ArrayList<>();
        test2.add(10.5);
        System.out.println("list test: "+test2);
//        a.removeAll(b);
//        b.removeAll(a);
//        test1.removeAll(test2);
        System.out.println(test1.contains(10.5));
        System.out.println("list test1: "+test1);
          a.retainAll(b); // will take only the elements that have the same value in b, other than that it will delete them
        System.out.println("list a: "+a);
        while (test1.contains(12.5)){
            test1.remove(12.5);
        }
        System.out.println("list test1: "+test1);

        System.out.println("the min is: "+Collections.min(test1));
        Collections.sort(a);
        System.out.println(a);
        double max = Collections.max(a);
        System.out.println(a);
        System.out.println("max is: "+max);
        System.out.println("number of elements in a is: "+a.size());

        int[] w = {12,3,4,5,6};
        Arrays.sort(w);
        for(int k:w)
            System.out.print("value: "+k+" ");
        // sort and search are mostly used in linear data structures

        //// search //////

        // sequential search: from the start of the list to the end of the list.
        // we have an index and key which is the value.
        // it will take two parameters which is the collection(list) and the key which is the value we are searching for.
        // we use get method to access the value for the element.
        // we compare the key and the value for the elements in the list.
        // we keep comparing till we return true in the (if condition), we return false if the element is not found in the list.
        ArrayList<Double> w1 = new ArrayList<>();
            w1.add(1.3);
            w1.add(2.3);
            w1.add(3.3);
            w1.add(4.3);
            w1.add(5.3);
        System.out.println();
        System.out.println(linSearch(w1,w1.size(),5.3));
        // binary search
        // it has less time complexity than sequential search
        // it's used when the list is sorted
        // but when it's not sorted(random) you better use sequential search
        // the sorting for the elements will be O(n^2) so if not sorted it's better to use linear search.
        // it can only be used with random access data structures, but can't be used with ordered data structures
        // it's a divide and conquer algorithm. compares data and based on it divide the list.
        // how binary search is used
        /*
        //at first it will check the Mid-element
        // to calculate the mid you need first index and last index
        // mid = (first index + last index)/2
        // note that first index will be zero in first time and last will be length-1
        // if key == list[mid] // then this is the best case and end the algo
        // if key > list[mid] // then the key is greater than the mid so we what we do?
        // delete e the left part from the mid in the list, and make the first = mid+1
        // if key < list[mid] // then the key is less than the mid so we what we do?
        // delete the right part from the mid in the list, and make the last = mid-1
        // number of comparisons = number of time you calculated the Mid.
        // if first > last end the method, that means all the elements has been compared and the element(key) is not found
         */
        /*
        Searching example

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter list elements: ");
        ArrayList<String> words = new ArrayList<>(6);
        for (int i = 0; i < 5; i++) {
            words.add(scan.next());
        }
        System.out.println(words);
        System.out.println("Enter word your searching for: ");
        int x = binSearch(words,scan.next());
        System.out.println("index for element if existed: "+x);
        printNotSorted(x);
*/
    // Sorting
    // what is sorting? you take a list of elements and you sorted them 🌚
    // you will have the same elements but in different ordering
    // we have two ways to order
    // Ascending order, when List[i] <= List[i+1], or by other meaning when every element is less than or equal to the element next after it.
    // Descending order, when List[i] >= List[i+1], or by other meaning when every element is greater than or equal to the element next after it.
    // always remember to check that the number of elements didn't change.
    // always what comes in mind when trying to sort is selection sort
    // there is also other types like bubble sort and insertion sort.
    // all these three time complexity is O(n^2) which is not the best thing
    // there is others like merge sort and quick sort. which has time complexity of O(log n).

    // Bubble Sort//////////////////////////////////////////////////////
      //  how it works:
    // simple we start by knowing if want the order to be Asc or Desc
    // we compare the element and the element next to it. (List[i] <= List[i+1])
    // you need to know two things number of comparisons and number of swaps.
    // number of comparisons = number of elements - 1
    // swaps depending on the numbers.
    // you need to iterate till you get all the list sorted
    // number of phases will be needed is N-1

    // Selection Sort//////////////////////////////////////////////////////
    // how it works:
    // the phases for this type of sort is also N-1.
    // it finds the min element in the list (using loop)
    // it then swaps the min to put it in it's proper location.
    // number of swaps will be





























    }

    // linear search(sequential search) algorithm
    public static <T extends Comparable<T>> int linSearch(ArrayList<T> list, int length, T key){
        int loc;
        for (loc = 0; loc < length; loc++) { // n
            if(list.get(loc).compareTo(key) == 0){ // 1
               return loc;
            }
        }
        return -1;
    }
    // best case: O(1)
    // worst case: n + 1 --> time complexity: O(n)
    // average case: n(n+1)/2 --> O(n)
    // worst case and average case are the same in this algo

    // binary search (for sorted lists)
    public static <T extends Comparable<T>> int binSearch(ArrayList<T> list, T key){
        int first = 0;
        int last = list.size() - 1;
        if(!isSorted(list)){
            return -2;
        }
        while(first <= last){ // O(log n)
            int mid = (first + last)/2;
            int comparison = list.get(mid).compareTo(key);
            if(comparison == 0){
                return mid;
            }
            else if(comparison < 0){
                first = mid + 1;
            }
            else{
                last = mid -1;
            }
        }
        return -1;
    }
    // best case: when the key is equal to the mid.
    // worst case: when the comparison is the last mid, or if the key is not found.
    // how to know number of comparisons: num
    // Number of comparisons = [log2(n)]+1
    // time complexity: O(log n to the base 2)
    public static <T extends Comparable<T>> boolean isSorted(ArrayList<T> list){
        for (int i = 0; i < list.size()-1; i++) { // (0,1),(1,2),(2,3),(3,4),(4,5)
            if(list.get(i).compareTo(list.get(i+1)) > 0){
                return false;
            }
        }
        return true;
        }
        public static void printNotSorted(int x){
            if(x == -2){
                System.out.println("This list is not sorted");
            }
        }
}


