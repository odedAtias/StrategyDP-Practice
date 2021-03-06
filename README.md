# Strategy Design Pattern - Practice

ð¹This program will implement simple operations on numbers under the Design Strategy pattern.

ð¹The purpose of the program is to learn to work under the Strategy Design pattern and to understand how to implement it.

ð¹In many situations we would like to strive for a complete separation between the data structures in our software systems and the algorithms that operate on them.
  Our goal is:

1ï¸â£ To define a number of different implementations for the data structures and know in which situations it is worthwhile to use each algorithm dynamically.

2ï¸â£ To maintain Encapsulation, i.e. hide the realizations from the user.

## ð¨âð» Technologies

ð Java Programming language

## Implementation Remarks

ð¹ The program is divided into 4 main parts: 

* Strategy interface defining an action 
* Concrete strategy classes implementing the Strategy interface. 
* Context Class which realizes strategy at our discretion.
* Main - our demo class, will use Context and strategy objects to demonstrate change in Context behaviour based on strategy it deploys or uses.

ð¹ There are 3 strategies for our system :

* Addition between two numbers.
* Substraction between two numbers.
* Multiplication between two numbers.

ð¹ More strategies can be added to the system and the way to do this is:

* Create a class that will represent the new action we want to add.
* Implement the Strategy Interface and her doOperation function.


## for any questions

```
if(haveAnyQuestions === true){
    let yourName = ".......", question = ".......";
    sendEmailToMe(yourName, question, odedatias8115@gmail.com);
}
```
