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
/*

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
/*
        //////////////////////// search //////////////////////////////////////////////////////////////////////

        // sequential search: from the start of the list to the end of the list.
        // we have an index and key which is the value.
        // it will take two parameters which is the collection(list) and the key which is the value we are searching for.
        // we use get method to access the value for the element.
        // we compare the key and the value for the elements in the list.
        // we keep comparing till we return true in the (if condition), we return false if the element is not found in the list.
        /*
        ArrayList<Double> w1 = new ArrayList<>();
            w1.add(1.3);
            w1.add(2.3);
            w1.add(3.3);
            w1.add(4.3);
            w1.add(5.3);
        System.out.println();
        System.out.println(linSearch(w1,w1.size(),5.3));
        */
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
     **Selection Sort** is a simple comparison-based sorting algorithm.
     It works by repeatedly selecting the smallest (or largest, depending on the sort order) element from the unsorted part of the array and swapping it with the first unsorted element.
     This process divides the array into two parts: the sorted part and the unsorted part, and gradually grows the sorted portion.

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

    ///////////////////////////////// Stack and Queue ///////////////////////////////////////////////////
        // array and array list are linear DS,and and the access on them is direct through out the index.
        // now we'll talk about stack and queue, the access for them is sequential access.
        // Stack is LIFO(Last-In First-Out).
        // Queue
        // any application that is about reversing could be done using stack.
        // what are the operations on stack:
        // for adding elements: use push method
        // for accessing elements: use peak(which is the top elements in the stack and the only element that could be accessed).
        // for deleting elements from the stack: use pop method. note that pop method will return the deleted element from the stack.
        // so for example: stack.push(2), stack.push(3), int x= stack.pop(), the deleted value will be returned in the x which is 3.
        // stack has only "single point of access " as i mentioned before.
        // what will change the value of the stack(active methods) is push and pop, methods won't change the value of the stack peak(used only to access).
        // you can't pop an empty stack(EmptyStackException)


        /*
        ### **What is a Stack?**

A **stack** is a linear data structure that follows the **Last In, First Out (LIFO)** principle.
This means that the last element added to the stack will be the first one to be removed. A stack can be visualized as a vertical collection of elements where insertion and deletion happen at the **same end**,
 called the **top** of the stack.

### **Basic Operations on a Stack**:
1. **push(element)**: Adds an element to the top of the stack.
2. **pop()**: Removes and returns the top element of the stack. Throws an error if the stack is empty.
3. **peek() or top()**: Returns the top element without removing it.
4. **isEmpty()**: Returns `true` if the stack is empty, `false` otherwise.
5. **size()**: Returns the number of elements in the stack.

### **How a Stack Works**:

- **Push Operation**: When you push an element onto the stack, it is added to the top. The previous top element moves down, and the newly pushed element becomes the top.

  Example:
  ```
  Stack: [ ]
  push(5)
  Stack: [5]
  push(10)
  Stack: [5, 10]
  ```

- **Pop Operation**: When you pop an element from the stack, the top element is removed, and the next element in line becomes the new top.

  Example:
  ```
  Stack: [5, 10]
  pop() -> returns 10
  Stack: [5]
  ```

- **Peek Operation**: When you peek at the stack, you just check the top element without removing it.

  Example:
  ```
  Stack: [5, 10]
  peek() -> returns 10
  Stack: [5, 10]  // no change

### **Applications of Stack**:
Stacks are widely used due to their LIFO property. Here are some real-world and computer science applications:

1. **Function Call Management (Recursion)**: When a function is called, its local variables and return address are pushed onto the call stack. Once the function completes,
the call stack is popped to return control to the previous function.

   Example: A recursive function call structure.

2. **Expression Evaluation**: Stacks are used to evaluate expressions in postfix notation (also known as Reverse Polish Notation). They are also used in converting infix expressions to postfix or prefix.

   Example:
   - Infix: `(A + B) * (C - D)`
   - Postfix: `AB+CD-*`

3. **Undo/Redo Operations**: Most text editors or applications use stacks to implement the "undo" and "redo" features.

4. **Browser History**: Browsers use stacks to track history. When you press the back button, the last visited URL is popped from the stack.

5. **Balanced Parentheses and Syntax Checking**: Stacks are useful to check if a string of parentheses, brackets, or braces is balanced.

   Example: Checking if `((a + b) * (c + d))` has properly matched parentheses.

6. **Depth-First Search (DFS) in Graphs and Trees**: DFS is implemented using stacks, either explicitly in code or implicitly via recursion.

7. **Stack-Based Algorithms**: Several algorithms, such as those for finding the nearest smaller element, use stacks for efficient computation.

### **Common Questions on Stacks**:

1. **Evaluate a postfix expression**: Given a postfix expression like `52+83-*`, evaluate the result using a stack.

2. **Check if parentheses are balanced**: Write a program that checks if the parentheses in a given string are balanced.

   Example:
   - Input: `({[]})`
   - Output: `true`

3. **Implement a stack using two queues**: Implement a stack data structure using two queues and ensure it operates with push and pop.

4. **Find the next greater element**: Given an array, for each element, find the next greater element (on the right). If there is no greater element, return `-1`.

   Example:
   - Input: `[4, 5, 2, 25]`
   - Output: `[5, 25, 25, -1]`

5. **Reverse a stack**: Given a stack, reverse the elements using recursion or another stack.

6. **Implement two stacks in an array**: Implement two stacks in a single array to maximize space utilization.

### **How It Works**:
1. **push()**: Adds an element to the end of the list (which represents the top of the stack).
2. **pop()**: Removes and returns the last element in the list (the top element).
3. **peek()**: Returns the last element without removing it.
4. **isEmpty()**: Checks if the stack is empty by checking if the list is empty.
5. **size()**: Returns the number of elements in the stack.

### **Advanced Stack Questions**:
1. **Implement a Min Stack**: Create a stack that, in addition to `push` and `pop`, also provides a `getMin()` method that returns the minimum element in constant time.

2. **Sort a Stack**: Write a function that takes a stack and sorts it in ascending order using only stacks (you may use additional stacks or recursion).

3. **Reverse a Linked List using Stack**: Given a singly linked list, reverse it using a stack.

---

### **Stack Time Complexity**:
- **Push**: O(1) (constant time) because you only add an element to the top.
- **Pop**: O(1) because you remove the top element.
- **Peek**: O(1) because you are just checking the top element.

### **Conclusion**:
A stack is a fundamental data structure that has a wide range of applications, from parsing expressions to managing function calls.
Its simple LIFO property makes it easy to implement but powerful in solving various algorithmic problems.
 Mastering stack operations and their applications is essential for solving many common data structure and algorithm questions.

 */


/*
//        Scanner scan = new Scanner(System.in);
//        System.out.print("enter value1:");
//        Object value1 = scan.nextLine();
//        System.out.print("enter value2:");
//        Object value2 = scan.nextLine();
//        try{
//            value1 = Double.parseDouble(value1.toString());
//            value2 = Double.parseDouble(value2.toString());
//        }
//        catch (NumberFormatException ignored) {
//             }
//        sum(value1, value2);
//
//
//
//
//
//        // using generics Object creation
//        MC<?,?> m = new MC<>("da", "dad");
//        MC<String,Double> m1 = new MC<>("da", 21.21);
//        MC<Integer,String> m2 = new MC<>(1, "ew");
//        System.out.println(m.d());
//        System.out.println(m1.d());
//        System.out.println(m2.d());
//

 */
        // stack example
        MyStack<String> myStack = new MyStack<>();
        myStack.push("hamzah");
        myStack.push("rema");
        myStack.push("ruba");
        myStack.push("rami");
        myStack.push("sami");
        myStack.push("fadi");
        myStack.push("fuad");
        myStack.push("saleh");
        System.out.println(myStack.peek());
        System.out.println(myStack.size());
        String popValue = myStack.canPop();
        System.out.println(popValue);
        System.out.println(myStack.peek());
        System.out.println(myStack.size());
        System.out.println(myStack);

        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        System.out.println();
/////////////////////////////////////////

    // Stack Applications: Delimiter Matching
        /*
        how that works:
        **Delimiter Matching** is a common application of stacks, used to check whether opening and closing delimiters (like parentheses, brackets, braces)
        are correctly matched in a string or expression. This ensures that symbols like `()`, `{}`, and `[]` are used in the correct order.

### Step-by-Step Explanation of Delimiter Matching

#### Problem:
We are given a string that contains delimiters (parentheses, braces, and brackets) mixed with other characters. We need to ensure that:
- Every opening delimiter (like `(`, `{`, `[`) has a corresponding and correctly placed closing delimiter (like `)`, `}`, `]`).
- The delimiters are correctly nested (e.g., `({[]})` is valid, but `([)]` is invalid).

#### Example:
Consider the string:
`"{[()]}"`
This string is correctly matched, while
`"{[(])}"` is not.

### Approach Using a Stack

1. **Initialize an Empty Stack:**
     - We will use a stack to keep track of the opening delimiters.

2. **Iterate Through Each Character of the String:**
     - If the character is an **opening delimiter** (`(`, `{`, `[`), push it onto the stack.
     - If the character is a **closing delimiter** (`)`, `}`, `]`), check if it matches the **top** of the stack:
     - If the top of the stack has the corresponding opening delimiter, pop the stack (i.e., remove the matched opening delimiter).
     - If the stack is empty or the top of the stack does not match the closing delimiter, the string is **not balanced**.

3. **At the End of the String:**
   - If the stack is **empty**, it means all delimiters were matched correctly.
   - If the stack still contains any opening delimiters, the string is **not balanced**.

### Step-by-Step Example

Let's take an example string:
`"{[()]}"`
- Initialize an empty stack: `[]`.

#### Iteration 1: `{`
- Encounter `{`, which is an opening delimiter.
- Push it onto the stack:
  Stack: `[{]`

#### Iteration 2: `[`
- Encounter `[`, another opening delimiter.
- Push it onto the stack:
  Stack: `[{, []`

#### Iteration 3: `(`
- Encounter `(`, another opening delimiter.
- Push it onto the stack:
  Stack: `[{, [, (]`

#### Iteration 4: `)`
- Encounter `)`, which is a closing delimiter.
- Check the top of the stack (which is `(`), and it matches the closing `)`.
- Pop the stack:
  Stack: `[{, []`

#### Iteration 5: `]`
- Encounter `]`, which is a closing delimiter.
- Check the top of the stack (which is `[`), and it matches the closing `]`.
- Pop the stack:
  Stack: `[{]`

#### Iteration 6: `}`
- Encounter `}`, which is a closing delimiter.
- Check the top of the stack (which is `{`), and it matches the closing `}`.
- Pop the stack:
  Stack: `[]`

At the end, the stack is empty, meaning all delimiters were matched correctly.

### Incorrect Example: `"{[(])}"`

Let's take an incorrect string:
`"{[(])}"`

#### Iteration 1: `{`
- Push `{` onto the stack:
  Stack: `[{]`

#### Iteration 2: `[`
- Push `[` onto the stack:
  Stack: `[{, []`

#### Iteration 3: `(`
- Push `(` onto the stack:
  Stack: `[{, [, (]`

#### Iteration 4: `]`
- Encounter `]`, a closing delimiter.
- Check the top of the stack (which is `(`), and it **does not match** the closing `]`.
- **Mismatch detected**: The string is **not balanced**.
         */

        // MatchingDelimiter method example:
        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter expression: ");
//        String expression = scanner.nextLine();
//        System.out.println("is it matched? "+ MatchingDelimiter.isBalanced(expression));

        // second Stack Application is infix to postfix conversion

        // infix (x + y) when the operator is between the expressions
        // postfix xy+ when the operator is after the expressions
        // prefix +xy when the operator is before the expressions
        // how to works:
        // we have operands and operators
        // if we have a operand we send it to the output instantly
        // if we have a operator we push it to the stack, in condition that the stack is empty or the operator in the stack has lower priority.
        // if i have a opening delimiter push it to the stack, and if i have closing delimiter pop the elements in the stack till we get to the opening delimiter.
        // example: 5 + 6
        // stack: +(pushed to the stack and popped in the end)
        // output: 5 6 + (final result)


        ///////////// Queue(FIFO) First-in-First-Out///////////////////
/*
A **queue** is a linear data structure that follows the **FIFO** (First In, First Out) principle. This means that the first element inserted into the queue is the first one to be removed.
The operations typically supported by a queue are **insertion (enqueue)** at the rear and **deletion (dequeue)** from the front.

### **1. How the Queue Works:**
the queue we have is a **circular queue** implemented using an array. In this design:

- **`front`** points to the first element of the queue (the element that will be removed next).
- **`rear`** points to the last element inserted into the queue.
- When inserting an element, it is added at the rear.
- When removing an element, it is removed from the front.
- When the rear reaches the end of the array, it "wraps around" to the beginning using the modulo operation (`%`), making it a **circular queue**.

### **2. Types of Access in a Queue:**
- **Enqueue (Insert):** Adds an element to the rear of the queue.
- **Dequeue (Remove):** Removes an element from the front of the queue.
- **Peek Front:** Allows access to the front element without removing it.
- **Peek Rear:** Allows access to the rear element without removing it.

### **3. Applications of a Queue:**
Queues are widely used in various domains, primarily due to their **FIFO** nature. Some examples include:

- **Job Scheduling**: In operating systems, tasks/jobs are scheduled in a queue to ensure fair processing.
- **Printing Queues**: In a printing system, print jobs are managed in a queue, ensuring that the first document submitted gets printed first.
- **Breadth-First Search (BFS)**: In graph traversal algorithms, BFS uses a queue to explore nodes level by level.
- **Customer Service**: In real-life applications, such as call centers or service centers, customers are served in a queue (first come, first served).
- **Network Buffers**: Packets in a network switch or router are stored in queues before being processed.

### **4. Circular Queue:**
the implementation is an example of a **circular queue**, where:
- **Front** and **Rear** pointers move circularly within a fixed-size array.
- The use of modulo arithmetic ensures that the queue wraps around when the rear or front reaches the end of the array.

### **5. Key Characteristics of a Queue:**
- **FIFO Access**: The first element inserted is the first element removed.
- **Limited Access**: Only the front element is accessible for removal, and only the rear element is accessible for insertion.
- **Fixed Size**: In your case, the queue has a fixed maximum size (`maxSize`), beyond which elements cannot be added without removing existing ones.

### **6. Important Operations in the Code:**

- **Insert (Enqueue)**:
  - `rear = (rear + 1) % maxSize;` ensures the rear wraps around the array when it reaches the end.
  - The element is added at the position of `rear`.
  - The number of elements is incremented.

- **Remove (Dequeue)**:
  - The element at the front is removed.
  - `front = (front + 1) % maxSize;` ensures the front wraps around when it reaches the end of the array.
  - The number of elements is decremented.

### **7. Circular Queue Advantages:**
- **Efficient Space Utilization**: Circular queues make full use of the array’s space by reusing positions once elements are dequeued.
- **No Shifting Elements**: Unlike linear queues implemented with arrays, where shifting elements may be required after each dequeue, circular queues avoid this overhead.

### **Common Questions on Queues**:
1. **How does a queue work internally, and why is it different from a stack?**
   - A queue works based on FIFO, where elements are added at one end and removed from another, unlike a stack that uses LIFO (Last In, First Out).

2. **What happens when you try to enqueue into a full queue?**
   - In your implementation, it prints a message indicating the queue is full, but in some cases, you can implement dynamic resizing.

3. **What are the real-world applications of queues?**
   - Used in various fields such as scheduling tasks, buffering network packets, and in simulations of real-world processes like service systems.
         */

        //// Queue Example:
        Queue queue = new Queue(5);
        // queue.remove();
        System.out.println(queue); // Queue{maxSize=5, front=0, rear=-1, arrayQueue=[0, 0, 0, 0, 0], numberOfElements=0}
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        System.out.println(queue); // Queue{maxSize=5, front=0, rear=4, arrayQueue=[1, 2, 3, 4, 5], numberOfElements=5}
        long removedElement = queue.remove(); // returned value is 1, which is the front of the line(FIFO)
        System.out.println(removedElement); // 1
        queue.remove(); // 2
        System.out.println(queue); // Queue{maxSize=5, front=2, rear=4, arrayQueue=[1, 2, 3, 4, 5], numberOfElements=3}
        System.out.println(queue.peekFront()); // 3
        System.out.println(queue.peekRear()); // 5

        /*
        //LinkedList
         note: each Link has a pointer to the next Link.
         LinkedList Links(nodes or elements) are not stored in the memory next to each-other.
         LinkedList is a linear data structure means the access to it is linear.
         there is an actual deletion and insertion to it Unlike the array.
         it's not fixed sized means you can add as many elements as you want.
         last Link pointer is null. and first link address(pointer) is stored in another place.
         what is a Link?? the Link is the node that has two parts: 1. the data and 2. the pointer to the next Link.
         the arrow between each Link and the other is called "next".
         don't change the first or the next instead use a temp pointer.
        */

        //// how to insert new Link(node) to a LinkedList.
        // at first create a new Link for example Link n.
        // next let the pointer for n point to  the first node in the LinkedList by doing, n.next  = first
        // then you make first pointer point to n.
        // by that you made n point to the first node (which is second now after we inserted n, and mad the first pointer point to n which made it the first Link(node) in the LinkedList).

        //// how to delete first Link in the LinkedList
        // let the first pointer point to the first.next, with making sure the firs.next does not equal to null.

        //// how to search in the LinkedList
        // the search in the LinkedList start form the beginning
        // compare the current.data(the current is the temp we use to access the Nodes, and we use the current.data to access the Link(node) data) with the key.
        // in this case we are using linear search.
        System.out.print("Enter Number: ");
        int number = scanner.nextInt();
        System.out.println("The sum for numbers from 0 to "+number+" is: "+sum(number));
        System.out.println("the factorial for "+number+" is: "+factorial(number));
        System.out.println("fibonacci: "+fibonacci(number));
    }

    // recursion example:
    public static int sum(int n){
        System.out.println("n = "+n);
        if(n == 1){
            return 1;
        }
        else {
            int k = n + sum(n-1);
            System.out.println("the sum is "+k+" now");
            return k;
        }
    }
    // another recursion example(factorial):
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    // time complexity for this method is O(n!) which is a very bad time complexity.
    // another recursion example(fibonacci):
    public static int fibonacci(int n){
        System.out.println(n);
        if(n == 0 || n == 1){
            return 1;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    // fibonacci time complexity is: O(n^2), every time you rise the number of n by 1, the number of cases will rise the double.

    static class MC<T,R>{
        T a;
        R b;

        public MC(T a, R b) {
            this.a = a;
            this.b = b;
        }
        T d(){
            return a;
        }
    }

    static <T>void sum(T a,T b){
        if(a instanceof Number num1 && b instanceof Number num2){
            System.out.println(num1.doubleValue() + num2.doubleValue());
        } else if (a instanceof String str1 && b instanceof String str2) {
            System.out.println(str1 + str2);
        }
    }
    // linear search(sequential search) algorithm
    public static <T extends Comparable<T>> int linSearch(ArrayList<T> list, int length, T key) {
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
        for (int i = 0; i < list.size()-1; i++) { // (0,1),(1,2),(2,3),(3,4),(4,5) // let say length is 4 then we have 4 comparisons // n-1 comparisons
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
        // stack implementation based on ArrayList
 class MyStack<T>{
            private final ArrayList<T> stack;

    public MyStack() {
        this.stack = new ArrayList<>();
    }
    public void push(T value){
        stack.add(value);
    }

    public T canPop(){
        if(!stack.isEmpty())
            return stack.removeLast();
        else
            throw new EmptyStackException();
    }
    public T peek(){
        if(!stack.isEmpty())
            return stack.getLast();
        else
            throw new EmptyStackException();
    }
    public int size(){
        return stack.size();
    }

     @Override
     public String toString() {
         return "stack elements: "+stack;

     }
 }
    // MatchingDelimiters application implementation
 class MatchingDelimiter {
     public static boolean isBalanced(String expression) {
         Stack<Character> stack = new Stack<>();

         for (char element : expression.toCharArray()) {
             if (element == '(' || element == '[' || element == '{') {
                 stack.push(element);
             } else if (element == ')' || element == ']' || element == '}') {
                 if (stack.isEmpty()) {
                     return false;
                 }
                 char top = stack.pop();
                 if (!isMatching(top, element))
                     return false;
             }
         }
         return stack.isEmpty();
     }
     public static boolean isMatching(char openD, char closedD) {
         return (openD == '(' && closedD == ')') || (openD == '{' && closedD == '}') || (openD == '[' && closedD == ']');
     }
 }

    // Circular Queue Implementation
 class Queue{
    private final int maxSize;
    private int front;
    private int rear;
    private final long[] arrayQueue;
    private int numberOfElements;

     public Queue(int size) {
        maxSize = size;
        arrayQueue = new long[maxSize];
        front = 0;
        rear = -1;
        numberOfElements = 0;
     }
     public void insert(long element){
         if(isFull()){
             System.out.println("Queue is full");
             return;
         }
         rear = (rear + 1) % maxSize;
         arrayQueue[rear] = element;
        numberOfElements++;
     }

     public long remove(){
                if(isEmpty()){
                    throw new IllegalStateException("Queue is empty");
                }
                long element = arrayQueue[front];
                front = (front + 1) % maxSize;
                numberOfElements--;

                return element;

     }
     public long peekFront(){
         return arrayQueue[front];
     }
     public long peekRear(){
         return arrayQueue[rear];
     }
     public boolean isEmpty(){
         return numberOfElements == 0;
     }
     public boolean isFull(){
         return numberOfElements == maxSize;
     }
     @Override
     public String toString() {
         return "Queue{" +
                 "maxSize=" + maxSize +
                 ", front=" + front +
                 ", rear=" + rear +
                 ", arrayQueue=" + Arrays.toString(arrayQueue) +
                 ", numberOfElements=" + numberOfElements +
                 '}';
     }
 }

 // insert first is O(1)
// insert last is also O(1) if the last is existed
// if the last is not existed it will be O(n) since it will go through all the elements in the LinkedList.
// delete the key is O(n) because it will require a search method and the search is linear O(n)
// we can't use something like Binary search because we don't have direct access to the elements in the LinkedList like the array and the ArrayList for example.
// displayBackward() is also O(n)
// insertAfter() is a method used to insert a node after some other node, it takes two parameters, (the position for the node we will insert after, the data for the element we are inserting).

// recursion
// if we want to write a recursive program, you need to have these two things
// at first change the data set
// at second have a base case, the base case the case that we stop the recursion on.
////////////////////


// TOH(tower of hanoi)
// we have three towers
// source tower, temporary tower, and distinction tower
// now we have a number of disks in the source tower, and the goal is to move them to the distinction tower
// we have tow rules:
// moving one disk at a time.
// no larger disk in top of smaller disk.
// the base case when having one disk only.
//// this is the algo:
// move n-1 disks to T. // means if we had four disks, move 3 to the Temporary disk, and move the one in the Source to D, then move the n-1 disks to the Source.
// move move disk n  to D.
// move n-1 to D.
// the number of moves for n is (2^n -1)
// the time complexity for tower of hanoi is O(2^n) the same as fibonacci, every time we increase n the number of movements required increases


// merge sort
/*
Sure! **Merge Sort** is a widely used sorting algorithm that follows the **divide and conquer** paradigm. Here's a detailed explanation of how it works, its steps, time complexity, and important points.

### **What is Merge Sort?**

Merge Sort is a comparison-based sorting algorithm that divides an array or list into two halves, sorts each half, and then merges the sorted halves back together. It is efficient for large datasets and guarantees a worst-case time complexity of \(O(n \log n)\).

### **How Merge Sort Works:**

**Steps Involved:**

1. **Divide**:
   - If the array has one or zero elements, it is already sorted. Otherwise, divide the array into two halves.

2. **Conquer**:
   - Recursively apply Merge Sort to both halves of the array.

3. **Combine (Merge)**:
   - Merge the two sorted halves back into a single sorted array.

### **Visual Representation:**
Let's say we have an array `[38, 27, 43, 3, 9, 82, 10]`.

1. **Divide**:
   ```
   [38, 27, 43, 3, 9, 82, 10]
      /              \
   [38, 27, 43]   [3, 9, 82, 10]
     /    \          /       \
   [38]   [27, 43] [3, 9]   [82, 10]
            /  \      /  \
         [27] [43]  [3] [9]
   ```

2. **Conquer**:
   After recursively sorting each half:
   ```
   [27, 38, 43]   [3, 9, 10, 82]
   ```

3. **Combine (Merge)**:
   Merging the two sorted halves:
   ```
   [3, 9, 10, 27, 38, 43, 82]
   ```

### **Merge Function:**
The merging of two sorted arrays is done in linear time. Here’s a brief outline of how the merge function works:

- Compare the first elements of both arrays.
- Place the smaller element in the new array.
- Move to the next element in the array from which the smaller element was taken.
- Repeat until all elements from both arrays are merged.

### **Time Complexity:**
- **Best Case**: \(O(n \log n)\)
- **Average Case**: \(O(n \log n)\)
- **Worst Case**: \(O(n \log n)\)

### **Space Complexity:**
- Merge Sort requires additional space for temporary arrays used during the merge process, leading to a space complexity of \(O(n)\).

### **Advantages of Merge Sort:**
1. **Stable**: Merge Sort maintains the relative order of records with equal keys.
2. **Works Well with Large Datasets**: It is efficient for sorting large amounts of data, especially when dealing with linked lists.
3. **Guaranteed Performance**: It has a predictable time complexity of \(O(n \log n)\).

### **Disadvantages of Merge Sort:**
1. **Space Complexity**: It requires extra space for the temporary arrays, making it less memory efficient compared to in-place algorithms like Quick Sort.
2. **Overhead of Recursion**: Recursive calls can lead to overhead, particularly for large datasets.

### **Implementation in Java:**
Here’s a simple implementation of Merge Sort in Java:
```java
public class MergeSort {

    public void merge(int[] array, int left, int mid, int right) {
        // Calculate sizes of the subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            L[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = array[mid + 1 + j];
        }

        // Merge the temporary arrays
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    public void sort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort first and second halves
            sort(array, left, mid);
            sort(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        ms.sort(array, 0, array.length - 1);

        System.out.println("Sorted array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
```

### **Important Points:**
- **Divide and Conquer**: Understanding this principle is crucial to grasping how Merge Sort operates.
- **Recursive vs. Iterative**: While the standard implementation is recursive, it can also be implemented iteratively, which can save space for large datasets.
- **Real-World Applications**: Merge Sort is often used in applications where stability is a requirement, such as sorting linked lists or large files that don't fit into memory.

Feel free to ask if you have more questions about Merge Sort or any related topics!
 */






//// HashTables
// hash table is an array
// hash function takes a key, and return the index
// hash function should be random
// some of the ways to make a hash
// we add values using the hash function and we search for values using also the hash function
// for example we can you a way called mid squareszM
// this works by taking the square for the key, and then for example taking the middle number of the result
// if we have 12, we say 12^2 = 144, then we have 4 which is the
// other way for hashing is digit folding, it's done by taking the sum for the digits
// for example:  12/2/2000 the sum is: 1+2+2+2+0+0+0 = 9
// let say we deleted a value from it will store -1

// we  have three ways to handle collisions:
// linear probing, quadratic probing, separate chaining

//// at first linear probing
// if you're using open addressing you'll have collisions
// how it works:
// find the closest empty place in the HashTable and save the value in.
// the HashTable is circular.
// when searching in a HashTable, when to know the element is not in the HashTable?, when you reach to an empty palace.
// all HashTable operations start with calculating the hash function.

//// in trees, number of edges = number of nodes - 1
// trees can't have cycles
// it's close to LinkedList
// the root is the starting point for the tree
// binary tree at most(maybe less) have two edges that connect nodes to each other
// if a tree  have a node that hase more than two edges, it's called multiway tree.
// grandParent is when you have



// binary search tree
/*
1. all the node values on the right are greater than the nodes on the left.
2. the root is greater that the left child and less than the right child.

if any value does not apply to this rules, it won't be a binary search tree anymore
 */

// searching
//  start the comparisons form the root
// if equals the key, true, and end the search
// if key greater than the node go to the right
// if less than the node go to the left
// the longest path to the leaf, or the the greatest number of operations needed to find a value is: the "number" of levels.(for example a tree from level 3(0,1,2,3), the max is 4).
// binary tree is mostly beneficial when the tree is balanced.
// time complexity for all operations in binary search tree is: O(log n to the base 2)
// traversing a tree means that you visit all the nodes in a tree and it's done in several ways:
// InOrder(left, root, right), and this will give us ascending order.
// in this way far left is the smallest value in the tree, and the far right is the greatest value in the tree.
// if we make it (right, root, left) it will become in a descending order.
// PreOrder(root, left , right)

// graphs
// tree is a graph but without a cycle
// one of the most important applications: networking, and maps.
// the element in a graph is called vertices, and the relationship between vertices is called Edges.

// adjacency when the edge connect two vertices directly.
// the neighbors for vertices is the one that are connect with direct edge.
// the edge is considered to be two nodes that have direct like between them.
// for example: IJ is an edge.
// now what a path is? it's a number of edges that move me from a place to another.

// you need to know wither your graph is BiDirectional, or UniDirectional, and wither it's connected, or not connected.
// note that if your graph was directed and you want to make some edge Uni, you need to make two edges form the edge and to the edge the edge.
// we use the same arrow if the path is the same between the two vertices(from A to B and from B to A back and forth for example).
// but if it's not the same path(from A to B and from B to A back and forth for example) you use two.

// how can I traversal in graphs??
// we have these two method, DFS and BFS.

// in DFS you choose a starting point, you choose a path, and you walk in this path until you reach a dead point.
// when we reach a dead point, we go back with the nodes, when we reach the starting point one more time we choose another path.
// DFS is like the stack some how in it's process.
// we can have more than one DFS for the same graph.

// now let's go to the BFS, when we are on some node, we need to visit all the neighbors.
// then you go to the neighbors and add their neighbors in the same order they were added to the queue. (check the slides)
// remember that BFS is an Application for Queue.
// it works like levels.











