
class pr{

    public static void main(String[] args) 
    {
        int z[]={12,312,42,1,34,231,143};
        int max;
        int min;
        max=z[0];
        min=z[0];
        for (int i : z) {
            System.out.println(i);       
        }
        for(int i : z)
        {
            if(i > max)
            {
                max=i;
            }
        }
        for(int i : z)
        {
            if(i <= min)
            {
                min=i;
            }
        }
        System.out.println("MAX= "+max);  
        System.out.println("MIN= "+min);  
        
    }
}




