package CollectionsFramwork;

public class CollectionsIntro {
    public static void main(String[] args) {
        //What are Collections
        //In java, Collection is an object that group multiple elements into single entity!
        //Eg: it is like container that hold multiple object at one place

        //Why Collections?
        //Array has fixed size and can not grow and Shrink Dynamically. But Collections can grow and Shrink Dynamically.
        //In Array we can store only similar type of data but in Collections we can store multiple types of Objects
        //Collections core package : java.util

        //Collection VS Collections
        //Collection --> Super Interface for List, Set, Queue
        //Collections --> utility/helper class with static methods

        //Collection Hierarchy!
        //We use List to preserve Insertion order, like in an array, also if i want growable in nature and also allow duplicates
        //And if i want random  access in object as in array which has very good property which was accessing any element out of it with the O(1) complexity --> arr[i]. then i will use list again So --> random access --> preserving order --> growable --> Duplicates -->  then use List!

        //Set
        //Opposite of list, growable though
        //Duplicates are not allowed
        //insertion order not preserved

        //Queue
        //it is a data Structure
        //if we want such properties like whoever comes first will go first

        //ArrayList follows same properties as List. ArrayList is a class which implements List
        //LinkedList also have those same things as List accept Random Access because things are not stored index wise in LinkedList. It has Nodes. Every Node has it's own Address

        //ArrayList VS Vector?
        //Synchronization is the main difference between ArrayList and The Vector. thread safe is the difference.
        //Stack is First in Last out

        //Set
        //HashSet implements Set Interface
        //LinkedHashSet also implements Set --> Duplicates are not allowed and --> Random Access would not be allowed

        //SortedSet
        //It is an Interface and it implements Set.
        //But since it is an interface to it must have some implementation.
        //now you are getting it that yes there is sorting order, one is Ascending and the other one is Descending.
        //But to add more Functionalities we have NavigableSet --> It has to do with the Navigation thing. All these capabilities it adds to the sorting and It is also an Interface of sorting. Now everything is interface so who will implement? -->  TreeSet is the implementation of all this and it has Uniqueness.
        //Now if you want sorting order so you now know which data structure to Follow that is --> TreeSet

        //Now we have Queue
        //It is also an Interface which is implemented by
        //(1)Priority Queue --> Class
        //(2)Blocking Queue --> Interface
        //Blocking Queue has Two implementation, (1)Priority Blocking Queue(Class) (2)Linked Blocking Queue(Class)

        //Vector came into 1.0 --> these are called Legacy Classes




    }
}
