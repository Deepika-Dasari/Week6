package Collection;

public class Solution {

    public static void main(String[] args) 
    {
        DataList<Integer> list = new DataList<>();
        System.out.println("Adding elements:");
        //Add elements
        list.add(5);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println("Removing an element:"); 
        //Remove elements from index
        list.remove(2);
        System.out.println(list);
        System.out.println("Get element at the index:");  
        //Get element with index
        System.out.println( list.get(0) );
        System.out.println( list.get(1) );
 
        //List Size
        System.out.println("The size of list is "+list.size());
    }

}
