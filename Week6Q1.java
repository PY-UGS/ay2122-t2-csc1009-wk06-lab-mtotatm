package Week6;

import java.util.HashMap;

public class Week6Q1
{
    public static void main(String[] args)
    {
        IntegerList w = new IntegerList();
        HashList h = new HashList();
        HashMap<String, Integer> tempHash = new HashMap<String, Integer>();
        int[] array = w.getSortedList();
        array = w.addAndSort(10,array);
        w.swap(1,5,array);
        int[] newarray = w.generateList(1000,9999,500);
        w.checkListForInteger(w.randomNumber(1000,9999),newarray);
        h.start();
        tempHash = h.addAndSort(10,h.getSortedIntList());
        tempHash = h.swap(1,3,array);
    }
}
