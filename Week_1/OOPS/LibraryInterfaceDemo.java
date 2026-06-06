interface LibraryUser{
void registerAccount();
void requestBook();
}

class KidUsers implements LibraryUser{
int age;
String bookType;

public void registerAccount(){
    if(age<12){
        System.out.println("You have successfully registered under a Kids Account");
    }
    else{
        System.out.println("Sorry , Age must be less than 12 to register as a kid");
   }
}

public void requestBook(){
    if(bookType.equalsIgnoreCase("Kids")){
        System.out.println("Book Issued successfully, please return the book within 10 days");
    }
    else{
        System.out.println("Oops, you are allowed to take only kids books");
    }
}

}

class AdultUser implements LibraryUser{
int age;
String bookType;

public void registerAccount(){
    if(age>12){
        System.out.println("You have successfully registered under an Adult Account");
    }
    else{
        System.out.println("Sorry, Age must be greater than 12 to register as an adult");
    }
}

public void requestBook(){
    if(bookType.equalsIgnoreCase("Fiction")){
        System.out.println("Book Issued successfully, please return the book within 7 days");
    }
    else{
        System.out.println("Oops, you are allowed to take only adult Fiction books");
    }
}

}

public class LibraryInterfaceDemo{
public static void main(String[] args){
    // Kid User
    KidUsers kUser1=new KidUsers();
    kUser1.age=10;
    kUser1.bookType="Kids";

    kUser1.registerAccount();
    kUser1.requestBook();

    System.out.println();

    KidUsers kUser2=new KidUsers();
    kUser2.age=18;
    kUser2.bookType="Fiction";

    kUser2.registerAccount();
    kUser2.requestBook();

    System.out.println();

    // Adult User
    AdultUser aUser1=new AdultUser();
    aUser1.age=5;
    aUser1.bookType="Kids";

    aUser1.registerAccount();
    aUser1.requestBook();

    System.out.println();

    AdultUser aUser2=new AdultUser();
    aUser2.age=23;
    aUser2.bookType="Fiction";

    aUser2.registerAccount();
    aUser2.requestBook();
}

}
