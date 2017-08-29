package com.anuj;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	PersonQueue personQueue= new PersonQueue();

//	Person person= new Person("Alpha","1");
//	Person person1= new Person("Beta","2");
//	personQueue.enqueue(person);
//	personQueue.enqueue(person1);
//	there is also another way of doing the same
//	so here we go
	personQueue.enqueue(new Person("alpha","1"));
	personQueue.enqueue(new Person("beta","2"));

	personQueue.showAll();








        /*    IntQueue intQueue= new IntQueue();
	    intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);
        intQueue.enqueue(4);
        intQueue.showAll();
*/
    }
}
