package Books;

public class Book1 {
    final private int publicationYear;
    final private String title;
    final private String authorName;

    private boolean is_available;
    //constructor
    public Book1(int pub, String title, String auth, boolean availability){
        this.publicationYear = pub;
        this.title = title;
        this.authorName = auth;
        this.is_available = availability;
    }

    public Book1(String title, String auth, boolean availability){
        this.publicationYear = 2020; // default value if the year parameter isn't passed
        this.title = title;
        this.authorName = auth;
        this.is_available = availability;
    }

    public void toBorrow(String title){
        // if a person attempts to borrow a book then is_available will be false
        if(is_available && this.title.equals(title)){
            is_available = false;
            System.out.println("Book has been borrowed");
        }
        else{
            System.out.println("Book CANNOT be borrowed");
        }
    }

    public void displayInfo(){
        System.out.println("Book 1\nName: " + title + "\nAuthor: " + authorName + "\nPublicatonYear: " + publicationYear + "\n");
        if(is_available){
            System.out.println("Book is Available");
        }
        else{
            System.out.println("Book is not available");
        }
    }

    public void toRetrieve(String title){
        if(!is_available && this.title.equals(title)){
            is_available = true;
            System.out.println("Book has been returned");
        }
        else{
            System.out.println("Book wasn't borrowed in the first place or the title isn't correct, cant return it.");
        }
    }

}
