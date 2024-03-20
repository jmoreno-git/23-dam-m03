package supermarket;

import java.util.Arrays;

/**
 *
 * @author jmorenp
 */
public class Supermarket {
    private String name;
    private Article[] articles;
    private int maxArticles;
    private int numArticles;

    public Supermarket(String name, int maxArticles) {
        this.name = name;
        this.maxArticles = maxArticles;
        this.numArticles = 0;
        this.articles = new Article[this.maxArticles];
        //populate array with fake data
        generateData();
    }

    public int getMaxArticles() {
        return maxArticles;
    }

    public int getNumArticles() {
        return numArticles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Article[] getArticles() {
        return Arrays.copyOf(articles, numArticles);
    }

    public void setArticles(Article[] articles) {
        this.articles = articles;
        this.numArticles = articles.length;
        this.maxArticles = articles.length;
    }
    
    
    /**
     * Adds article to the array of articles.
     * It prevents EAN code duplicates and null articles.
     * @param article the article to add
     * @return true if successfully added, false otherwise
     */
    public boolean addArticle(Article article) {
        boolean b = false;
        if (article != null) {
            if (numArticles < maxArticles) {  //there is room in array
                Article a = searchArticle(article.getEanCode());
                if (a == null) {  // ean code not exists
                    articles[numArticles] = article;
                    numArticles++;
                    b = true;
                }
            }          
        }
        return b;
    }
    
    /**
     * searches an article with the given EAN code
     * @param eanCode the EAN code to search
     * @return the article found or null if not found
     */
    public Article searchArticle(String eanCode) {
        Article found = null;
//        for (int i=0; i<numArticles; i++) {
//            if (articles[i].getEanCode().equals(eanCode)) {
//                found = articles[i];
//                break;
//            }
//        }
        Article[] list = (Article[]) Arrays.asList(getArticles())
                .stream()
                .filter((t) -> t.getEanCode().equals(eanCode))
                .toArray((value) -> {
                    return null;
                });
        if (list.length > 0) found = list[0];
        return found;
    }
    
    private void generateData() {
        articles[numArticles++] = new Article("art01", "maker01", 101.0, "EAN01");
        articles[numArticles++] = new Article("art02", "maker02", 102.0, "EAN02");
        articles[numArticles++] = new Article("art03", "maker03", 103.0, "EAN03");
        articles[numArticles++] = new Article("art04", "maker04", 104.0, "EAN04");
        articles[numArticles++] = new Article("art05", "maker05", 105.0, "EAN05");
    }
    
}
