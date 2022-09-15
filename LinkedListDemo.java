import java.util.LinkedList;

class LinkedListDemo {
  public static void main(String[] args){

    // create linkedlist
    LinkedList<String> animals = new LinkedList<String>();

    // Add elements to LinkedList
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Cow");
    System.out.println("LinkedList: " + animals);
  }
}