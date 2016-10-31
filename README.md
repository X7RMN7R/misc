# misc

## Number storage optimization
Firsts digits which are common to the numbers should not be duplicated in the memory. Fortunately, the specifications also have this little chart to guide you in the implementation :

```
0_4_1_2_5_7_8_4_4_0 Bill Jobs
  |   |_1_9_9_8_0_3 J.P Ravidole
  |_6_8_8_9_2_0_1_1 R. Robichet
1_1_2 Urgences
|_1_5 S.A.M.U.
```

Your task is to write a method that displays the number of items (which are numbers) required to store a list of telephone numbers with the structure presented above (28 for this example for 5 phone numbers).

INPUT :
The list of phone numbers.
OUTPUT : 
The number of elements (referencing a number) stored in the structure.

EXAMPLES :
Input 
0467123456
Output
10

Input 
0123456789
1123456789
Output 
20

Input
0123456789
0123
Output
10

Input (corresponding to previous example)
0412578440
0412199803
0468892011
112
15
Output
28
