package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int cIntegers;
    int cSize;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        cIntegers = size;
        cSize = size;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
        cIntegers = cSize;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public void increaseSize() {
        cSize *= 2;
        int[] newList = new int[cSize];
        System.arraycopy(list, 0, newList, 0, cIntegers);
        list = newList; }

    void addElement(int newVal){
        if (cIntegers==cSize)
        {
            increaseSize();
        }
        list[cIntegers++] = newVal;
    }

    public void removeFirst(int newVal){
        for(int i=0; i<cIntegers; i++)
        {
            if(list[i] == newVal)
            {
                for (int j=i;j<cIntegers-1;j++) { list[j] = list[j+1]; } //we shift and erase the L[i]
            cIntegers--;
            }
        }
    }

    public void removeALL(int newVal){
        int index=0;
        for(int i=0; i<list.length; i++)
        {
            if(list[i]==newVal)
            {
                index=i;
                cIntegers--;
                for(int j=index; j<cIntegers; j++){ list[j] = list[j+1]; } //shifting
            }
        }
    }
}
