package Week6;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashList
{
    private static HashMap<String, Integer> sortedList = new HashMap<String, Integer>();
    private static int[] sortedIntList = { 1,3,5,7,9,11 };

    void start()
    {
        sortedList.put("1", 1);
        sortedList.put("3", 3);
        sortedList.put("5", 5);
        sortedList.put("7", 7);
        sortedList.put("9", 9);
        sortedList.put("11", 11);
        sortedIntList[0] = 1;
        sortedIntList[1] = 3;
        sortedIntList[2] = 5;
        sortedIntList[3] = 7;
        sortedIntList[4] = 9;
        sortedIntList[5] = 11;

        System.out.println("Keys: " + sortedList);
        System.out.println("Size: " + sortedList.size());
        System.out.println(" ");
    }

    //region Description addAndSort function
    HashMap addAndSort(int x,int[] array)  // add element x and sort smallest to biggest
    {
        int[] tempArr = new int[array.length + 1];
        HashMap<String, Integer> tempHash = new HashMap<String, Integer>();
        boolean added = false;

        System.out.println("Contents before change: " + sortedList);
        System.out.println("Size before change: " + sortedList.size());

        for (int i = 0; i < array.length;i++)
        {
            System.out.print(" "+array[i]+" ");

            if((i+1) < (array.length)) // check if its the last element in the array
            {
                if((x < array[i]) && !added) // if its not the last element, check if the next element is smaller then the number added
                {
                    tempArr[i] = x;
                    tempArr[i+1] = array[i];
                    added = true;
                }
                else if (added)
                {
                    tempArr[i+1] = array[i];
                }
                else
                {
                    tempArr[i] = array[i];
                }
            }
            else if(added)
            {
                tempArr[i+1] = array[i];
            }
            else
            {
                tempArr[i] = array[i];
            }
        }
        System.out.println(" ");

        if(!added) // if the number added is bigger then all the other number, add it to the last
        {
            tempArr[tempArr.length-1] = x;
        }

        for (int i = 0; i < tempArr.length;i++)
        {
            tempHash.put(Integer.toString(tempArr[i]),tempArr[i]);
        }
        System.out.println("Contents after change: " + tempHash);
        System.out.println("Size after change: " + tempHash.size());

        System.out.println(" ");
        System.out.println("Added and Sort success! Operation Completed");
        System.out.println(" ");
        return tempHash;
    }
    //endregion

    //region Description swap function
    HashMap swap(int x, int y, int[] array) // add element x and sort smallest to biggest
    {
        int[] tempArr = new int[array.length + 1];
        HashMap<String, Integer> tempHash = new HashMap<String, Integer>();

        System.out.println("Contents before swap: " + sortedList);
        System.out.println("Size before swap: " + sortedList.size());

        boolean pos1Swap = false;
        boolean pos2Swap = false;

        for (int i = 0; i < array.length;i++)
        {
            System.out.print(" "+array[i]+" ");
            if(x == array[i])
            {
                System.out.println("Swapping "+ x +" with " + y);
                tempArr[i] = y;
                pos1Swap = true;
            }
            else if(y == array[i])
            {
                System.out.println("Swapping "+ y +" with " + x);
                tempArr[i] = x;
                pos2Swap = true;
            }
            else
            {
                tempArr[i] = array[i];
            }
        }

        System.out.println(" ");

        if(pos1Swap && pos2Swap) // error check
        {
            System.out.println("Swap success! Operation Completed");
        }
        else if(!pos1Swap)
        {
            System.out.println("Error Swap fail! " + y + " Value not swap!");
        }
        else if(!pos2Swap)
        {
            System.out.println("Error Swap fail! " + x + " Value not swap!");
        }
        else
        {
            System.out.println("Error Swap fail! Both Value not swap!");
        }

        System.out.println("After Swap");
        for (int i = 0; i < tempArr.length;i++)
        {
            tempHash.put(Integer.toString(tempArr[i]),tempArr[i]);
        }

        System.out.println("Contents after change: " + tempHash);
        System.out.println("Size after change: " + tempHash.size());

        System.out.println(" ");
        return tempHash;
    }
    //endregion

    //region Description generateList function
    public int[] generateList(int min, int max,int size)
    {
        int[] tempArr = new int[size];

        System.out.println("Begin generating array");
        for(int i=0;i<tempArr.length;i++)
        {
            int random = (int) (Math.random() * max + min);
            System.out.println("Adding " + random + " into generated array");
            tempArr[i] = random;
        }
        System.out.println("array generated success! Added "+size+" random number ranging from " + min + " to " + max +
                ", operation completed!");
        System.out.println(" ");
        return tempArr;
    }
    //endregion

    //region Description checkListForInteger function
    public boolean checkListForInteger(int x, int[] array)
    {
        boolean check = false;

        System.out.println("Begin checking array for " + x);
        for(int i=0;i<array.length;i++)
        {
            if(x == array[i])
            {
                System.out.println(x + " Found in array");
                check=true;
            }
        }

        if(check)
        {
            System.out.println("Integer found in array! operation completed!");
        }
        else
        {
            System.out.println("Integer not found in array! operation completed!");
        }
        System.out.println(" ");
        return check;
    }
    //endregion

    public HashMap getHashMap()
    {
        return sortedList;
    }

    public int[] getSortedIntList()
    {
        return sortedIntList;
    }

    public int randomNumber(int min,int max)
    {
        int random = (int) (Math.random() * max + min);
        return random;
    }
}
