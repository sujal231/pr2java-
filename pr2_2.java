class pr
{
    public static void main(String[] args)
    {
        fact s= new fact();   
    }
}

class fact{
fact()
{
    int f=1;

    for(int i=1;i<=5;i++)
    {
        f=f*i;
    }
    System.out.println(f);
}
}