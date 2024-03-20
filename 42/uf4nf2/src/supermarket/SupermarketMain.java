package supermarket;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jmorenp
 */
public class SupermarketMain {

    private Scanner scan = new Scanner(System.in);
    private Supermarket mySupermarket;

    public static void main(String[] args) {// TODO code application logic here
        SupermarketMain sm = new SupermarketMain();
        sm.run();
    }

    private void run() {
        //instantiate supermarket
        mySupermarket = new Supermarket("My beautiful laundrette", 10);
        //System.out.println(Arrays.toString(mySupermarket.getArticles()));
        boolean exit = false;
        //instantiate menu
        SupermarketMenu menu = new SupermarketMenu();
        //start interacting with user
        do {
            //display menu and get user's choice
            int option = menu.displayMenu();
            switch (option) {
                case 0: //exit application
                    exit = true;
                    break;
                case 1: //search article
                    doSearchArticle();
                    break;
                case 2: //add a new article
                    doAddANewArticle();
                    break;
                case 3: //list all articles
                    doListAllArticles();
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (!exit);
    }

    /**
     * asks the user to input an EAN code, searches an article with that EAN, if
     * found, it displays to user, if not found it reports an error message
     */
    private void doSearchArticle() {
        //input ean code
        System.out.print("Input EAN code to search: ");
        String eanToSearch = scan.next();
        //search article
        Article articleFound = mySupermarket.searchArticle(eanToSearch);
        if (articleFound != null) {  //found
            System.out.println("Article found: "+articleFound);
        } else {  //not found
            System.out.format("There is no article with EAN code '%s'%n", 
                    eanToSearch);
        }
    }

    /**
     * asks the type of article to add,
     * inputs data for a new article of the proper type,
     * if successfully read, it tries to add the article
     * to the data store and reports result to user.
     */
    private void doAddANewArticle() {
        //read type of article
        System.out.print("Input type: ");
        String type = scan.next();
        //
        Article articleToAdd = ArticleFactory.readArticle(type);
        if (articleToAdd != null) {
            boolean success = mySupermarket.addArticle(articleToAdd);
            if (success) {
                System.out.println("Article successfully added");
            } else {
                System.out.println("Article not added");
            }            
        } else {
            System.out.println("Error reading article data");
        }

    }

    private void doListAllArticles() {
        Article[] artList = mySupermarket.getArticles();
        for (Article article : artList) {
            System.out.println(article);
        }
        
    }

}
