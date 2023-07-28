package oscar.student;

/**
 * Hello world!
 *
 */
public class bubbleSort<E> 
{
    public static int[] sort(int[] multiset)
    {   
        int elements = multiset.length;
        
        
        for (int i = 0; i < (elements - 1); i++)
        {   
            for (int j = 0; j < (elements - i - 1); j++)
            {
                if (multiset[j] > multiset[j+1])
                {
                    int temp = multiset[j];
                    multiset[j] = multiset[j + 1];
                    multiset[j + 1] = temp;
                }
            }
        }
        
        return multiset;
    }
}
