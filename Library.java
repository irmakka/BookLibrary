import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {

  HashMap<String, String> hashMapBook= new HashMap<>();  
  HashMap<String, List<String>> hashMapAuthor= new  HashMap<>();

  public void addBook(String bookName,String authorName){ 
    bookName=bookName.toLowerCase();
    authorName=authorName.toLowerCase();
       hashMapBook.put(bookName, authorName);
       hashMapAuthor.putIfAbsent(authorName, new ArrayList<>());
       hashMapAuthor.get(authorName).add(bookName);
          
  }
  public String search(String input) {
    StringBuilder result = new StringBuilder();  
        input =input.toLowerCase(); 
    if (hashMapBook.containsKey(input)) {
        result.append(input).append("  ").append(hashMapBook.get(input)).append("\n");
    } else if (hashMapAuthor.containsKey(input)) {
        result.append("The books of the ").append(input).append(":\n");
        for (String kitap : hashMapAuthor.get(input)) {
            result.append("- ").append(kitap).append("\n");
        }
    } else {
        result.append("We do not have a book of this author\n");
    }

    return result.toString();  // Sonuçları String olarak döndürüyoruz
}

  }


