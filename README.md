# Smallest Subset Sum Problem - O(2^n)

Write a program called Smallest in Java that reads a text file, in.txt, that contains a list of positive and negative integers (duplicate are possible) separated by spaces and/or line breaks. Zero is not included. After reading the integers, the program saves them in a singly linked list in the same order in which they appear in the input file. Then, without changing the linked list, the program prints out the smallest by absolute value subset sum. Assume that in.txt is in the same folder as your java files and that it contains at least one integer.

Examples:
* If in.txt contains -2 3 4, the program must print out 1. The set with the smallest subset sum by absolute value is {-2, 3}.
* If in.txt contains -1 7 6 –5, the program must print out 0. The set with the smallest subset sum by absolute value is {-1, 6, -5}.
* If in.txt contains -1 -7 5, the program must print out 1. The set with the smallest subset sum by absolute value is {-1}.
* If in.txt contains -7 21 -4 25 24 -5 25 2, the program must print out 4. The set with the smallest subset sum by absolute value is {-7, 21 -4, -5}.

Your program has to:
1. Implement a linked list.
2. Read the integers from the file in.txt and store them into the linked list in the same order in which they appear in the input file. No calculations are allowed at this step; the program must only read the input numbers and store them into the linked list.
3. Work on the linked list in order to find the smallest by absolute value subset sum. All computations must be done in place on the original linked list.
4. Print the smallest by absolute value subset sum.
5. The linked list is immutable and your program should not modify it, i.e., it should remain in its original form as it was read from the input file in.txt.

The problem must be solved by working on the linked list. For example, bypassing the homework restrictions by saving the numbers in a string, array, or any other date structure (with the exception of the linked list) is not allowed and will be penalized. There must be only one instance of the list and it must not be changed, i.e., after you have read the numbers from in.txt and have stored them in the list (in their original order) no further changes of the list are allowed.
