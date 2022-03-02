package Week6;

public class IntegerList
{
    private static int[] sortedList = { 1, 2, 3, 4, 5 };

    //region Description addAndSort function
    int[] addAndSort(int x,int[] array) // add element x and sort smallest to biggest
    {
        int[] tempArr = new int[array.length + 1];
        boolean added = false;

        System.out.println("Before Change");
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

        System.out.println("After Change");
        for (int i = 0; i < tempArr.length;i++)
        {
            System.out.print(" "+tempArr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Added and Sort success! Operation Completed");
        System.out.println(" ");
        return tempArr;
    }
    //endregion

    //region Description swap function
    int[] swap(int x, int y, int[] array) // add element x and sort smallest to biggest
    {
        int[] tempArr = new int[array.length];

        boolean pos1Swap = false;
        boolean pos2Swap = false;

        System.out.println("Before Swap");
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
            System.out.print(" "+tempArr[i]+" ");
        }
        System.out.println(" ");
        return tempArr;
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

    public int[] getSortedList()
    {
        return sortedList;
    }

    public int randomNumber(int min,int max)
    {
        int random = (int) (Math.random() * max + min);
        return random;
    }
}
