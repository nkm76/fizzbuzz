# FizzBuzz

This project has 3 apps
*  FizzBuzzApp
*  FizzBuzzWithDigitCheckApp
*  FizzBuzzAdvancedApp

## FizzBuzzApp (_fun.fb.FizzBuzzApp_) 

The _fun.fb.FizzBuzzApp_ prints the numbers 1 to 100. But for multiples of three prints "Fizz" instead of the number and for
the multiples of five prints "Buzz". For numbers which are multiples of both three and five it prints "FizzBuzz".  

Sample output:
```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
```
### Implementation

The class with the main logic is _fun.fb.algo.FizzBuzzSimple_
The thought behind this implementation was to keep it arithmetic free, as they are expensive operations, 
The way to avoid that was to identify the data pattern, the pattern of Fizz, Buzz repeats itself after every 15 numbers. 
Hence the implementation stores a **_byte[] fbPattern_**. It is binary encoded for easier combination, which will be clearer 
when we combine results of this with the Advanced implementation.   

* 0 - Neither Fizz nor Buzz
* 1 - Fizz
* 2 - Buzz
* 3 - FizzBuzz


## FizzBuzzWithDigitCheckApp (_fun.fb.FizzBuzzWithDigitCheckApp_) 

The _fun.fb.FizzBuzzWithDigitCheckApp_ prints the numbers 1 to 100. A number is "Fizz" if it has 3 in it.
A number is "Buzz" if it has 5 in it. A number is "FizzBuzz" is it satisfies both the criteria.  

Sample output:
```
1
2
Fizz
4
Buzz
6
7
8
9
10
11
12
Fizz
14
Buzz
```
### Implementation

The class with the main logic is _fun.fb.algo.FizzBuzzWithDigitCheck_.
Again the thought behind this implementation was to keep it simple using basic operations like addition/subtraction, 
as the problem states that the numbers are incremented from 1 sequentially.
I have created a **DecimalCounter** (_fun.fb.DecimalCounter_) to keep track of the current number.

DecimalCounter uses a byte[] to store decimal number. The max number of digits is only limited by the max size of array on java which 
is 2³¹ - 1. There is also an optimisation which it to avoid checking all digits when we increment the decimal number, 
the _next()_ method returns the location of the most significant number change.
```
. If current decimal number is 1, next() will return 0 (Units place)
. If current decimal number is 299, next() will return 2 (Hundreds place)
. If current decimal number is 22, next() will return 0 (Units place)
```
#### e.g.
If we are on _30,001_, the next() method returns 0 (units place has changed) as _30,001_ has become _30,002_ however 
we have a previous max location for 3 as '4' (Ten thousands place) hence we can disregard any changes in the 
units, tens, hundreds or thousands locations.




## FizzBuzzAdvancedApp (_fun.fb.FizzBuzzAdvancedApp_) 

The _fun.fb.FizzBuzzAdvancedApp_ combines the implementations of _fun.fb.algo.FizzBuzzSimple_ and _fun.fb.algo.FizzBuzzWithDigitCheck_. 
It prints the numbers 1 to 100. 
* A number is "Fizz" if it is divisible by 3 or if it has 3 in it.
* A number is "Buzz" if it is divisible by 5 or if it has 5 in it. 
* A number is "FizzBuzz" is it satisfies both the above criteria.  

Sample output:
```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
Fizz
14
FizzBuzz
```

## Running the tests

Provided JUnit tests for the Algo and Decimal counter classes.

