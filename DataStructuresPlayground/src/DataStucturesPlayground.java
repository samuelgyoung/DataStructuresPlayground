import org.apache.log4j.Logger;

import com.l33tindustries.tools.datastructure.ArrayDS;
import com.l33tindustries.tools.datastructure.LinkedListDS;
import com.l33tindustries.tools.datastructure.QueueDS;
import com.l33tindustries.tools.datastructure.QueueDS.Queue;
import com.l33tindustries.tools.datastructure.Recursion;
import com.l33tindustries.tools.datastructure.StackDS;
import com.l33tindustries.tools.datastructure.StackDS.Stack;

public class DataStucturesPlayground 
{
	final static Logger logger = Logger.getLogger(DataStucturesPlayground.class);
	
	/*---------------------------------------------------------------------
    |  Method main
    |
    |  Author: sgyoung
    |  
    |  Purpose:  Used to test various data structures.
    |
    |  Pre-condition: None.
    |
    |  Post-condition: None.
    |
    |  Parameters: None.
    |
    |  Returns:  void
    | 	
    *-------------------------------------------------------------------*/
	public static void main(String[] args) 
	{
		logger.trace(getCurrentMethodName() + " Entering ");
		//testArray();
		//testLinkedList();
		//testStack();
		//testQueue();
		//testRecursion();
		
		logger.trace(getCurrentMethodName() + " Exiting ");
	}
	
	public static void testRecursion()
	{
		Recursion Recursion_001 = new Recursion();
		System.out.println(Recursion_001.iterativeFactorial(5));
	}
	
	public static void testQueue()
	{
		QueueDS QueueDS_001 = new QueueDS();
		Queue queue_001 = QueueDS_001.createQueue();
		QueueDS_001.enqueue("Test1", queue_001);
		QueueDS_001.enqueue("Test2", queue_001);
		QueueDS_001.enqueue("Test3", queue_001);
		QueueDS_001.enqueue("Test4", queue_001);
		QueueDS_001.enqueue("Test5", queue_001);
		QueueDS_001.printQueue(queue_001);
		QueueDS_001.dequeue(queue_001);
		QueueDS_001.printQueue(queue_001);
		System.out.println(QueueDS_001.queueFront(queue_001));

	}
	
	
	public static void testStack()
	{
		StackDS Stack_001 = new StackDS();
		Stack stack_001 = Stack_001.createStack();
		
		Stack_001.printStack(stack_001);
		Stack_001.pushStack("test1", stack_001);
		System.out.println("Data in stack: " + Stack_001.stackTop(stack_001));
		Stack_001.pushStack("test2", stack_001);
		System.out.println("Data in stack: " + Stack_001.stackTop(stack_001));
		Stack_001.printStack(stack_001);
		Stack_001.printStack(stack_001);
		Stack_001.popStack(stack_001);
		System.out.println("Data in stack: " + Stack_001.stackTop(stack_001));
		Stack_001.printStack(stack_001);
		Stack_001.pushStack("test2", stack_001);
		Stack_001.pushStack("test3", stack_001);
		Stack_001.printStack(stack_001);
		
		Stack stack_002 = Stack_001.reverseStack(stack_001);
		Stack_001.printStack(stack_002);
		
	}
	
	public static void testLinkedList()
	{
		LinkedListDS linkedList_001 = new LinkedListDS();
		linkedList_001.printLinkedList();
		
		linkedList_001.insertNode(3, null);
		linkedList_001.printLinkedList();
		
		linkedList_001.insertFirst(2);
		linkedList_001.printLinkedList();
		
		linkedList_001.insertFirst(1);
		linkedList_001.printLinkedList();
		
		linkedList_001.insertLast(4);
		linkedList_001.printLinkedList();
		
		linkedList_001.insertFirst(0);
		linkedList_001.printLinkedList();
		
		linkedList_001.deleteNode(linkedList_001.getNode(1));
		linkedList_001.printLinkedList();
		
		linkedList_001.deleteNode(linkedList_001.getNode(3));
		linkedList_001.printLinkedList();
		
		linkedList_001.deleteNode(linkedList_001.getNode(1));
		linkedList_001.printLinkedList();
		
		
		linkedList_001.insertFirst(0);
		linkedList_001.printLinkedList();
		
		linkedList_001.insertFirst(5);
		linkedList_001.printLinkedList();
		
		linkedList_001.insertFirst(12);
		linkedList_001.printLinkedList();
		
		
		linkedList_001.deleteNode(linkedList_001.getLast());
		
		linkedList_001.printLinkedList();
		
		linkedList_001.deleteNode(linkedList_001.getLast());
		linkedList_001.printLinkedList();
		
		linkedList_001.insertLast(55);
		linkedList_001.printLinkedList();
		
		linkedList_001.deleteLast();
		linkedList_001.printLinkedList();
		
		linkedList_001.deleteLast();
		linkedList_001.printLinkedList();
		
		linkedList_001.insertLast(55);
		linkedList_001.printLinkedList();
				
		System.out.println("Checking for 12 : " + linkedList_001.searchList(12));
		System.out.println("Found in number of checks: " + linkedList_001.getSearchCount());
		
		linkedList_001.deleteLast();
		linkedList_001.deleteLast();
		linkedList_001.deleteLast();
		
		linkedList_001.printLinkedList();
		
		linkedList_001.insertFirst(0);
		linkedList_001.printLinkedList();
		linkedList_001.deleteLast();
		
		linkedList_001.insertLast(1);
		linkedList_001.printLinkedList();
		
		
		for (int i = 2; i < 10; i++)
		{
			linkedList_001.insertLast(i);
		}
		
		linkedList_001.printLinkedList();
		linkedList_001.deleteFirst();
		linkedList_001.printLinkedList();
		
		linkedList_001.addNode(0, null);
		linkedList_001.printLinkedList();
		
		linkedList_001.addNode(0, null);
		linkedList_001.printLinkedList();
		
		linkedList_001.addNode(10,linkedList_001.getLast());
		linkedList_001.printLinkedList();
		
	}
	
	public static void testArray()
	{
		int arraySize = 5;
		
		logger.trace(getCurrentMethodName() + " Entering ");
		logger.debug(getCurrentMethodName() + " Creating empty array. ");
		ArrayDS arrayDS_001 = new ArrayDS();
		
		logger.debug(getCurrentMethodName() + " Creating array size of " + arraySize);
		ArrayDS arrayDS_002 = new ArrayDS(arraySize);
		
		logger.debug(getCurrentMethodName() + " Testing getArraySize()...");
		logger.debug(getCurrentMethodName() + " Array Size : " +  arrayDS_001.getArraySize());
		logger.debug(getCurrentMethodName() + " Array Size : " +  arrayDS_002.getArraySize());	
		
		logger.debug(getCurrentMethodName() + " Testing getArraySize()...");
		arrayDS_001.printArray();
		arrayDS_002.printArray();
		
		arrayDS_001.addToArray(1);
		arrayDS_001.addToArray(2);
		arrayDS_001.addToArray(3);
		arrayDS_001.addToArray(4);
		arrayDS_001.addToArray(5);
		arrayDS_001.addToArray(6);
		arrayDS_001.addToArray(7);
		arrayDS_001.addToArray(8);
		arrayDS_001.addToArray(9);
		arrayDS_001.addToArray(10);
		
		System.out.println("Searching for 2 using binary search... " + arrayDS_001.binarySearch(2, 0));
		
		System.out.println("Searching for 2 using orderedListSearch search... " + arrayDS_001.orderedListSearch(2, 0));
		
		System.out.println("arrayDS_001 is now sequential");	
		arrayDS_001.printArray();
		
		System.out.println("arrayDS_001 : Running sequential search...");
		System.out.println("Searching for for sequential search for 3... " + arrayDS_001.seqSearch(3, 0));
		System.out.println("Number of Searches : " + arrayDS_001.getSearchCount());
		System.out.println("Searching for sequential search for 6... " + arrayDS_001.seqSearch(6, 0));
		System.out.println("Number of Searches : " + arrayDS_001.getSearchCount());
		
		System.out.println("Searching for 4 using probabilitiy search... " + arrayDS_001.probabilitySearch(4, 0));
		System.out.println("Searching for 4 using probabilitiy search... " + arrayDS_001.probabilitySearch(4, 0));
		System.out.println("Searching for 3 using probabilitiy search... " + arrayDS_001.probabilitySearch(3, 0));
		System.out.println("Searching for 4 using probabilitiy search... " + arrayDS_001.probabilitySearch(4, 0));
		System.out.println("Searching for 'test' using probabilitiy search... " + arrayDS_001.probabilitySearch("test", 0));
		
		arrayDS_001.printArray();
		
		logger.trace(getCurrentMethodName() + " Exiting ");
	}
	
	private static String getCurrentMethodName() 
 	{ 
 		StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace(); 
 		
 		return 	stackTraceElements[1].toString().replaceFirst(stackTraceElements[1].toString().split("\\.")[0]+"\\.", "");
 	}
}
