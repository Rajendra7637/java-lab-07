# Java Lab Sheets Repository - MCA III Semester

**Student:** Rajendra Singh Bisht  
**Institution:** COER University  
**Course:** Object Oriented Programming Using Java (MCA203P)

This repository contains Java lab programs for MCA III Semester, covering:
- **Lab Sheet 07**: Exception Handling, Custom Exceptions, Packages & Access Specifiers, Multithreading & Synchronization (located in the root directory).
- **Lab Sheet 08**: JavaBeans (Properties, Introspector, PropertyChangeSupport) & Java Networking (InetAddress, TCP Socket, UDP Datagram, URL/URLConnection, Multithreaded TCP Server) in [`java lab sheet 08/`](./java%20lab%20sheet%2008/).
- **Lab Sheet 09**: Java Collections Framework (`ArrayList`, `LinkedList`, `HashSet`, `LinkedHashSet`, `TreeSet`, `PriorityQueue`, `Queue`, Custom Objects, Iterators, Comparators) in [`java lab sheet 09/`](./java%20lab%20sheet%2009/).
- **Lab Sheet 10**: Advanced Object-Oriented Programming with Collections, Inheritance, Encapsulation, Stack, Queue FIFO, and Hierarchical Data Models in [`java lab sheet 10/`](./java%20lab%20sheet%2010/).

---

## Directory Structure

```text
├── Q01_DivideByZero.java to Q30_MultithreadingExample.java (Lab Sheet 07)
├── java lab sheet 08/
│   ├── README.md
│   ├── Q01_StudentBean.java & StudentBean.java
│   ├── Q02_RectangleBean.java & RectangleBean.java
│   ├── Q03_EmployeeBean.java & EmployeeBean.java (Serialization)
│   ├── Q04_DateBean.java & DateBean.java (Read-only property)
│   ├── Q05_UserBean.java & UserBean.java (Write-only property)
│   ├── Q06_AccountBeanListener.java & AccountBean.java (PropertyChangeListener)
│   ├── Q07_AccountBeanEventDemo.java (PropertyChangeEvent firing)
│   ├── Q08_BeanIntrospector.java (Introspector & BeanInfo)
│   ├── Q09_CarBean.java & CarBean.java
│   ├── Q10_CircleBean.java & CircleBean.java
│   ├── Q11_InetAddressDemo.java (IP & Hostname)
│   ├── Q12_HelloServer.java (TCP Server)
│   ├── Q13_HelloClient.java (TCP Client)
│   ├── Q14_HelloServerReadMessage.java (TCP Server Read)
│   ├── Q15_EchoServer.java (TCP Echo Server)
│   ├── Q16_MessageSender.java (UDP Client)
│   ├── Q17_MessageReceiver.java (UDP Server)
│   ├── Q18_WebReader.java (URL Content Reader)
│   ├── Q19_FileDownloader.java (URLConnection Downloader)
│   └── Q20_MultiClientServer.java (Multithreaded TCP Server)
│
├── java lab sheet 09/
│   ├── README.md
│   ├── Q01_ArrayListInteger.java to Q09_ArrayListReverse.java (ArrayList operations)
│   ├── Q10_LinkedListStrings.java to Q13_LinkedListGetFirstLast.java (LinkedList operations)
│   ├── Q14_HashSetDuplicates.java to Q16_HashSetIterator.java (HashSet operations)
│   ├── Q17_TreeSetSorted.java & Q18_TreeSetContains.java (TreeSet operations)
│   ├── Q19_LinkedHashSetOrder.java (LinkedHashSet insertion order)
│   ├── Q20_CompareSets.java (HashSet vs LinkedHashSet vs TreeSet)
│   ├── Q21_PriorityQueueInteger.java to Q23_PriorityQueuePeek.java (PriorityQueue)
│   ├── Q24_QueueLinkedList.java & Q25_QueueOperations.java (Queue interface)
│   ├── Q26_ArrayListCustomObjectIterator.java & Q27_SortCustomObjectComparator.java (Custom Objects & Comparator)
│   ├── Q28_ListToSetDuplicates.java & Q29_SetToListIteration.java (Collection Conversions)
│   └── Q30_ClearCollections.java (Clearing Collections)
│
└── java lab sheet 10/
    ├── README.md
    ├── Q01_ArrayListStudent.java (Student management via ArrayList)
    ├── Q02_LinkedListInheritanceEmployee.java (Person -> Employee in LinkedList)
    ├── Q03_HashSetAvoidDuplicatesBook.java (Book hashCode/equals duplicate rejection)
    ├── Q04_TreeSetComparableProduct.java (Comparable<Product> sorted by price)
    ├── Q05_HashMapStudentRollNumber.java (Roll Number -> Student HashMap)
    ├── Q06_ArrayListInheritanceShapeCircle.java (Shape -> Circle polymorphic area)
    ├── Q07_VectorEncapsulationCustomer.java (Customer encapsulation with Vector)
    ├── Q08_StackCustomTaskManagement.java (Task management Stack LIFO)
    ├── Q09_QueueLinkedListPatientFIFO.java (Patient consultation Queue FIFO)
    └── Q10_MultiCollectionInheritanceDeptTeacher.java (Department & Teacher multi-collection hierarchy)
```

---

## How to Compile & Run

To compile and run any of the lab sheets:
```bash
# For Lab Sheet 08:
cd "java lab sheet 08"
javac *.java
java Q01_StudentBean

# For Lab Sheet 09:
cd "../java lab sheet 09"
javac *.java
java Q08_ArrayListSort

# For Lab Sheet 10:
cd "../java lab sheet 10"
javac *.java
java Q10_MultiCollectionInheritanceDeptTeacher
```
