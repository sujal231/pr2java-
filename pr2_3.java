import java.util.ArrayList;

class pr{

    public static void main(String[] args) 
    {
        int max=0;
        int min=1334567;
        ArrayList<Integer>z =new ArrayList<>();
        z.add(124);
        z.add(1244);
        z.add(12);
        for(int n : z)
        {
            System.out.println(n);
        }
        for(int n : z)
        {
            if(n > max)
            {
                max=n;
            }
        }
        for(int n : z)
        {
            if(n <= min)
            {
                min=n;
            }
        }
        System.out.println(max);  
        System.out.println(min);  
        
    }
}




