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

    /*
     Sorting
     what is sorting? you take a list of elements, and you sorted them 🌚
     you will have the same elements but in different ordering
     we have two ways to order
     Ascending order, when List[i] <= List[i+1], or by other meaning when every element is less than or equal to the element next after it.
     Descending order, when List[i] >= List[i+1], or by other meaning when every element is greater than or equal to the element next after it.
     always remember to check that the number of elements didn't change.
     always what comes in mind when trying to sort is selection sort
     there is also other types like bubble sort and insertion sort.
     all these three time complexity is O(n^2) which is not the best thing
     there is others like merge sort and quick sort. which has time complexity of O(log n).

     //////////////////////////////////////////////////////////////////////////////////////////////////////
     Bubble Sort:
      how it works:
     simple we start by knowing if we want the order to be Asc or Desc
     we compare the element and the element next to it. (List[i] <= List[i+1])
     you need to know two things number of comparisons and number of swaps.
     number of comparisons = number of elements - 1 --> num of comparisons in all phases: (n(n-1))/2
     swaps depending on the numbers.
     you need to iterate till you get all the list sorted
     number of phases will be needed is N-1

///////////////////////////////////////////////////////////////
     Selection Sort:
     **Selection Sort** is a simple comparison-based sorting algorithm. It works by repeatedly selecting the smallest (or largest, depending on the sort order) element from the unsorted part of the array and swapping it with the first unsorted element. This process divides the array into two parts: the sorted part and the unsorted part, and gradually grows the sorted portion.

### Steps to Perform **Selection Sort**:

1. **Find the minimum (or maximum) element** from the unsorted portion of the array.
2. **Swap** the minimum element with the first unsorted element.
3. **Move the boundary** between the sorted and unsorted portions forward.
4. Repeat the process until the entire array is sorted.

### Step-by-Step Example:
Let’s sort the following array in ascending order using Selection Sort:
```
Array: [64, 25, 12, 22, 11]
```

#### Step 1: First Pass
- **Unsorted portion**: `[64, 25, 12, 22, 11]`
- **Find the smallest element**: `11` (minimum in the unsorted portion).
- **Swap** it with the first element (index 0):
  ```
  [11, 25, 12, 22, 64]
  ```

#### Step 2: Second Pass
- **Unsorted portion**: `[25, 12, 22, 64]`
- **Find the smallest element**: `12` (minimum in the unsorted portion).
- **Swap** it with the first unsorted element (index 1):
  ```
  [11, 12, 25, 22, 64]
  ```

#### Step 3: Third Pass
- **Unsorted portion**: `[25, 22, 64]`
- **Find the smallest element**: `22` (minimum in the unsorted portion).
- **Swap** it with the first unsorted element (index 2):
  ```
  [11, 12, 22, 25, 64]
  ```

#### Step 4: Fourth Pass
- **Unsorted portion**: `[25, 64]`
- **Find the smallest element**: `25` (minimum in the unsorted portion).
- **Swap** it with itself (index 3):
  ```
  [11, 12, 22, 25, 64]
  ```

#### Step 5: Fifth Pass
- **Unsorted portion**: `[64]`
- No need to swap, as only one element remains.

### Final Sorted Array:
```
[11, 12, 22, 25, 64]
```

### Key Points:
- After each pass, the smallest unsorted element is moved to its correct position in the sorted portion.
- The algorithm always performs **(n - 1) passes** to fully sort an array of size **n**.

### Efficiency of Selection Sort:
- **Time Complexity**: The Selection Sort algorithm has a time complexity of **O(n²)**, where **n** is the number of elements. This is because, in each of the **n - 1** passes, we have to scan through the unsorted portion of the array to find the minimum element.

  - For each element, it compares with every other element in the unsorted part.
  - For the first pass, it makes **n-1 comparisons**.
  - For the second pass, it makes **n-2 comparisons**, and so on.
  - Thus, the total number of comparisons is **(n - 1) + (n - 2) + ... + 1 = n(n - 1)/2 **, which results in **O(n²)** time complexity.

- **Space Complexity**: The space complexity of Selection Sort is **O(1)** because it only uses a constant amount of extra memory for variables like indices and the temporary variable used during swapping.

### Advantages:
- Simple and easy to understand.
- It minimizes the number of swaps compared to algorithms like Bubble Sort.

### Disadvantages:
- Selection Sort is inefficient for large arrays because of its **O(n²)** time complexity.
- It does not adapt to the input (e.g., even if the array is already sorted, it still performs the same number of comparisons).

### Visualization:

Consider this visualization of the array `[64, 25, 12, 22, 11]`:

1. **Initial Array**:
   ```
   [64, 25, 12, 22, 11]  // Select the minimum (11) and swap with the first element.
   ```

2. **After First Pass**:
   ```
   [11, 25, 12, 22, 64]  // Now, the first element is sorted.
   ```

3. **After Second Pass**:
   ```
   [11, 12, 25, 22, 64]  // Select the next smallest (12) and swap.
   ```

4. **After Third Pass**:
   ```
   [11, 12, 22, 25, 64]  // Select the next smallest (22) and swap.
   ```

5. **After Fourth Pass**:
   ```
   [11, 12, 22, 25, 64]  // Now the array is sorted!
   ```

That's how **Selection Sort** operates, focusing on finding the minimum element in each pass and moving it to its correct position!
///////////////////////////////////////////////////////////////

    **Insertion Sort** is a simple, intuitive sorting algorithm that builds the sorted array one element at a time by comparing each element to those already sorted and inserting it into its correct position.

    ### How Insertion Sort Works:
            The algorithm divides the array into two parts:
            1. **Sorted portion**: Initially contains just the first element.
            2. **Unsorted portion**: Contains the remaining elements.

            The algorithm picks elements one by one from the unsorted portion and inserts them into their correct position in the sorted portion.

    ### Step-by-Step Explanation:

    #### Consider the array: `[5, 2, 9, 1, 5, 6]`

            1. **Step 1**: Start with the second element, assuming the first element is already "sorted".
                    - Sorted portion: `[5]`
            - Unsorted portion: `[2, 9, 1, 5, 6]`

            2. **Step 2**: Take the first element from the unsorted portion (`2`) and compare it with the sorted portion (`5`).
                    - **Compare**: `2 < 5`
            - **Shift**: Move `5` to the right to make space for `2`.
            - **Insert**: Insert `2` in the correct position.
            - New array: `[2, 5, 9, 1, 5, 6]`
            - Sorted portion: `[2, 5]`
            - Unsorted portion: `[9, 1, 5, 6]`

            3. **Step 3**: Take the next element (`9`).
            - **Compare**: `9` is greater than `5`, so it stays in its position.
            - No shifts are needed.
                    - New array: `[2, 5, 9, 1, 5, 6]`
            - Sorted portion: `[2, 5, 9]`
            - Unsorted portion: `[1, 5, 6]`

            4. **Step 4**: Take the next element (`1`).
            - **Compare**: `1 < 9`, so shift `9` to the right.
                    - **Compare**: `1 < 5`, so shift `5` to the right.
                    - **Compare**: `1 < 2`, so shift `2` to the right.
                    - **Insert**: Insert `1` at the beginning.
                    - New array: `[1, 2, 5, 9, 5, 6]`
            - Sorted portion: `[1, 2, 5, 9]`
            - Unsorted portion: `[5, 6]`

            5. **Step 5**: Take the next element (`5`).
            - **Compare**: `5 < 9`, so shift `9` to the right.
                    - **Compare**: `5 = 5`, so no more shifting is needed.
            - **Insert**: Insert `5` in the correct position.
            - New array: `[1, 2, 5, 5, 9, 6]`
            - Sorted portion: `[1, 2, 5, 5, 9]`
            - Unsorted portion: `[6]`

            6. **Step 6**: Take the last element (`6`).
            - **Compare**: `6 < 9`, so shift `9` to the right.
                    - **Insert**: Insert `6` in the correct position.
            - Final array: `[1, 2, 5, 5, 6, 9]`
            - Sorted portion: `[1, 2, 5, 5, 6, 9]`

    ### How It Works Internally:

            - For each element in the unsorted portion, we scan the sorted portion from right to left to find the correct position.
                    - **Shifting** elements to the right creates space for inserting the element in its proper place.

    ### Complexity:
            - **Best case**: `O(n)` (the array is already sorted).
            - **Worst case**: `O(n^2)` (the array is sorted in reverse order).
            - **Average case**: `O(n^2)` (when the elements are in random order).

            Insertion Sort is efficient for small arrays or nearly sorted arrays, but less efficient for large, randomly ordered arrays due to the `O(n^2)` time complexity.

    ### Visualization of the Example:
            Initial array: `[5, 2, 9, 1, 5, 6]`

    | Step | Array Status           | Sorted Portion      | Unsorted Portion    |
    |------|------------------------|---------------------|---------------------|
    | 1    | `[5] [2, 9, 1, 5, 6]`  | `[5]`               | `[2, 9, 1, 5, 6]`   |
    | 2    | `[2, 5] [9, 1, 5, 6]`  | `[2, 5]`            | `[9, 1, 5, 6]`      |
    | 3    | `[2, 5, 9] [1, 5, 6]`  | `[2, 5, 9]`         | `[1, 5, 6]`         |
    | 4    | `[1, 2, 5, 9] [5, 6]`  | `[1, 2, 5, 9]`      | `[5, 6]`            |
    | 5    | `[1, 2, 5, 5, 9] [6]`  | `[1, 2, 5, 5, 9]`   | `[6]`               |
    | 6    | `[1, 2, 5, 5, 6, 9]`   | `[1, 2, 5, 5, 6, 9]`| `[]`                |

            The array becomes fully sorted after all steps.

    ### Conclusion:
            Insertion Sort is simple, but not very efficient for large datasets. It is particularly useful when you have small arrays or arrays that are mostly sorted.
            ** number of comparisons is not fixed, it depends on the elements in the list.
            ** the best one between these three is even though all of them are O(n^2): insertion, selection, bubble sort (in order).
    */



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

    // binary search (only for sorted lists)
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


