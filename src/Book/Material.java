package Book;

public class Material {
    private String name;
    private String quality;

    public Material(String name, String quality) {
        this.name = name;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
