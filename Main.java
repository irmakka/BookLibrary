

public class Main  {
    public static void main(String[] args) {
        User user= new User("Irmak","Kahya",12);
        System.out.println(user.getName()+"\t"+ user.getSurname()+"\t"+user.getcardNumber());
        Library library = new Library();
        library.addBook( "Martin Eden" , "Jack Londan" );
        library.addBook( "Lavinia","Özdemir Asaf");
        library.addBook( "A Tale of Two Cities","Charles Dickens");
        library.addBook("Oliver Twist", "Charles Dickens");
        library.addBook("Hayvan Çiftliği", "George Orwell");
        library.addBook("Hamlet", "William Shakespeare");
        library.addBook("Romeo ve Juliet", "William Shakespeare");
        LibraryFrame libraryFrame=new LibraryFrame(library);
         libraryFrame.setVisible(true);


    }
}
