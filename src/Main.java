import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Library library = new Library();

        library.books.add(new Book(0, "ola", "João", true));
        library.books.add(new Book(1, "adeus", "Manuel", true));
        library.books.add(new Book(2, "teste", "Filipe", true));

        System.out.println(" " +
                "1: Listar livros \n " +
                "2: Pesquisar livro por título \n " +
                "3: Emprestar livro \n " +
                "4: Devolver livro \n " +
                "5: Sair");

        int option = input.nextInt();

        do{

            switch (option){
                case 1:

                    library.listBooks();
                    break;

                case 2:

                    System.out.println("Título do livro que quer pesquisar: ");
                    String title = input.next();
                    library.searchByTitle(title);
                    break;

                case 3:

                    System.out.println("Id do livro que quer emprestar ");
                    int id = input.nextInt();
                    library.borrowBook(id);
                    break;

                case 4:

                    System.out.println("Id do livro que quer devolver ");
                    int id2 = input.nextInt();
                    library.returnBook(id2);
                    break;

                case 5:

                    return;

            }

            System.out.println(" " +
                    "1: Listar livros \n " +
                    "2: Pesquisar livro por título \n " +
                    "3: Emprestar livro \n " +
                    "4: Devolver livro \n " +
                    "5: Sair");

            option = input.nextInt();

        }while(option != 5);


    }
}