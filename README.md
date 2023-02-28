# Exercise 4.2 - 🚏 Queue Default

## 🎯 Objectives

- **Implement** extend the features of the basic Queue with the ability to dequeue an element regardless of whether the queue is empty of not.

## 🔨 Setup

1. Clone the repo (or download the zip) for this exercise, which you can find [here](https://github.com/JAC-CS-Programming-4-W23/E7.2-Queue-Default).
2. Start IntelliJ, go to `File -> Open...`, and select the cloned/downloaded folder.
3. If at the top it says "Project JDK is not defined", click "Setup JDK" on the top right, and select the JDK version you have installed on your machine.

   ![Setup JDK](./images/Setup-JDK.png)

4. To get the unit tests to work, open `QueueTest.java` and add JUnit to the classpath:

   ![Setup Tests](./images/Setup-Tests.png)

   - Just click "OK" on the resulting dialogue window and all the test-related red squigglies should disappear.

## 🔍 Context

### Extending the Queue

Create a class called `QueueDefault` that supports the original queue operations with and updated `dequeue()`:

<!-- tabs:start -->

#### **dequeue**

| Signature    | `T dequeue()`                                                                                |
|--------------|----------------------------------------------------------------------------------------------|
| Description  | Remove and return an element from the queue in FIFO order, or a default value if it's empty. |
| Precondition | None.                                                                                        |
| Mutator      | Yes.                                                                                         |
| Returns      | The removed element of the default value.                                                    |

<!-- tabs:end -->

## 🚦 Let's Go

Let's set this up:

1. Create a class called `QueueDefault`.
3. Create two constructors: one where the queue `capacity` is provided and one where it is not, relying on a default `QUEUE_CAPACITY`. Both constructors should accept a default value.
4. Implement the methods of the `Queue` API: `dequeue()` and any other methods.
5. Throw exception `QueueOverflowException` and `QueueUnderflowException` when the caller has not met the operation preconditions.
6. Pass the unit tests in the class `TestQueue`.

## 🔬 Observations

- The methods `dequeue()` is an override of the one in the super-class, but the original functionality is still required! This is very common in inheritance.
- The `isEmpty()` method doesn't seem relevant in the `QueueDefault`. Because it's in the super-class, we need to handle the behaviour in the sub-class.





