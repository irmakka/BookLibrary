 public class User{

private final  String userName;
private   final String userSurname;
private  final int cardNumber;


public User(String userName,String userSurname,int cardNumber){
 
     this.userName=userName;
     this.userSurname=userSurname;
     this.cardNumber=cardNumber;

}

public String getName(){
    return  userName;
}

public  String getSurname(){
    return  userSurname;
}

public  int getcardNumber(){
    return  cardNumber;
}
 }