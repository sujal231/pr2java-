class pr{
    public static void main(String[] args) 
    {
        Book z= new Book();
        Book z1= new Book(123,"Ramanujans Notebooks","Ramanujan");
    }
}

class Book
{
    Book()
    {
        System.out.println("Book informetion:- ");
    }
    Book(int book_id,String title,String author)
    {
        System.out.println("Book id= "+book_id);
        System.out.println("Book Title= "+title);
        System.out.println("Book Author= "+author);
    }

}