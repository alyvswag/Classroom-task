package Book;

public class Book {
    private String name;
    private int pageCount;
    private Author author;
    private Material material;



    public Book(String name, int pageCount, Author author, Material material) {
        this.name = name;
        this.pageCount = pageCount;
        this.author = author;
        this.material = this.material;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    public void setMaterial(Material material){
        this.material = material;
    }
    public Material getMaterial(){
        return material;
    }
}
