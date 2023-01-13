class pr{
    public static void main(String[] args) 
    {
        Book z= new Book();
        Book z1= new Book(123,"ramanujan lost Notebook","Ramanujan");
         z1.print();
    }
}

class Book
{
    int book_id;
    String title;
    String author;
    Book()
    {
        System.out.println("Book informetion:- ");
    }
    Book(int bid,String btitle , String bauthor)
    {
        book_id=bid;
        title = btitle;
        author= bauthor;
    }
    void print(){
        System.out.println("Book id= "+book_id);
        System.out.println("Book Title= "+title);
        System.out.println("Book Author= "+author);
        }
}

