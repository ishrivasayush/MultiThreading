# MultiThreading

Operating System
- operating system is a system software which runs in the background, and helps user to run other applications 

Mutitasking
Executing mutiple task simultanously.

- Process based Mutlitasking
- Thread based Multitasking

Process Based Multitasking
- Executing several tasks simultaneously where each task is a separate independent process such type of multitasking.


Thread Based Mutlitasking
- Executing several tasks simultaneously where each task is seprate independent part of the same program is called Thread based Multitasking.
- each independent part is called a Thread.

String name=Thread.currentThread().getName();
System.out.println(name);

Priority 1-10
default Thread name -main and priority 5

Thread.currentThread().getPriority();
Thread.currentName().setName();
Thread.currentName().setPriority();

we can change the priority and name of the main thread.

How to create Thread ?
- by extending Thread class
- by implementing runnable interface

Runnable -> void run(); -> Thread class -> orverRide run method 

Always calling start method that is in inside the Thread class and start method call the run method internally.

JVM -> Thread Scheduler who manages the all Threads. (Boss of the Threads) 

if we are executing the run method than it is run as normal methods not like a Thread.

Thread

- A thread is a very light-waited process, or we can say that the smallest part of the process that allows a program to operate more efiiciently by running multiple taks simultaneously.

Thread Scheduler
- if multiple Threads are in waiting to execute, then which thread will execute 1st is decided by Thread Scheduler which is a part of JVM.

- In case of multithreading we can't expect the output of the program.

Run() method
- The run method is present inside the Runable interface which is implement by the Thread class. we can call the sun method multiple times. 

Two ways
- throw start()
- throw run()

Diff start() / run()

start()- when we call the strat method than the sapreate thread will be created and which is resposible for calling the run method

run()-
when we will call the run() directly than there is no saprate Thread will be created and run method is called normal by main method.








