package ComparatorComparable;

import java.util.*;
//Comparator program
public class Mainclass
{
    public static void main(String[] args)
    {
        Comparator<Integer> com = new Comparator<Integer>()
        {
            public int compare(Integer o1, Integer o2)        //compare method
            {
                if(o1%10 < o2%10)
                return 1;
            else
                return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(85);
        nums.add(19);
        nums.add(63);
        nums.add(44);

        Collections.sort(nums,com);
        System.out.println(nums);
    }
}
