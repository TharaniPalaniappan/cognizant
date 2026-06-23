DSA Exercise 2 — E-Commerce Platform Search Function

Java FSE Deep Skilling (Digital Nurture 5.0)

Cognizant Digital Nurture 5.0 Program


Program Details

FieldDetailsProgramDigital Nurture 5.0 — Deep SkillingTrackJava Full Stack Engineer (Java FSE)ModuleModule 2 — Data Structures and AlgorithmsExerciseExercise 2 — E-Commerce Platform Search FunctionWeekWeek 1Compiler UsedProgramiz Online Java Compiler


Problem Statement

Implement a search functionality for an e-commerce platform that can
search through a product catalog using two different searching algorithms:


Linear Search
Binary Search


Compare both algorithms and demonstrate their differences in approach.


Concepts Covered

1. Linear Search


Goes through every element one by one from start to end
Works on both sorted and unsorted arrays
Time Complexity: O(n) — worst case checks every element
Best for: Small datasets or unsorted data


2. Binary Search


Divides the search space in half each time
Only works on SORTED arrays
Time Complexity: O(log n) — much faster than linear
Best for: Large sorted datasets


Algorithm Comparison

FeatureLinear SearchBinary SearchWorks on unsorted data✅ Yes❌ NoTime ComplexityO(n)O(log n)Checks for 1000 items (worst case)1000 checks~10 checksImplementation complexitySimpleModerateBest use caseSmall/unsorted dataLarge sorted data


Code Structure

Exercise2_EcommerceSearch/
├── ProductSearch.java    # Contains Product class, SearchAlgorithms class and Main
└── README.md             # This file

Classes Explained

Product class:


Stores product details: productId, productName, category, price
Represents each item in the e-commerce catalog


SearchAlgorithms class:


linearSearch() — searches product by ID using linear approach
binarySearch() — searches product by ID using binary approach


Main class:


Creates sample product catalog with 8 products
Tests both search algorithms
Shows not-found scenario
Prints algorithm comparison summary



Execution Output

=== E-Commerce Platform Search Function ===
Total products in catalog: 8

--- Linear Search ---
Product found at index: 4
Product Name : Backpack
Category     : Bags
Price        : Rs.1500.0

--- Binary Search ---
Product found at index: 6
Product Name : Desk Lamp
Category     : Furniture
Price        : Rs.1200.0

--- Searching for non-existing product ---
Product with ID 999 not found in catalog.

--- Algorithm Comparison ---
Linear Search : Checks each element one by one — O(n)
Binary Search : Divides search in half each time  — O(log n)
Binary Search is faster but needs SORTED data.

Status: ✅ Executed Successfully on Programiz Online Java Compiler


Key Learnings


Binary Search is significantly faster than Linear Search for large datasets
Binary Search requires data to be sorted first
Linear Search is simpler but inefficient for large data
Returning -1 is standard convention for "element not found"
Time complexity O(log n) means 1000 items needs only ~10 comparisons



Learning References


Searching Algorithms: https://www.geeksforgeeks.org/searching-algorithms/
Binary Search: https://www.geeksforgeeks.org/binary-search/
Linear Search: https://www.geeksforgeeks.org/linear-search/
