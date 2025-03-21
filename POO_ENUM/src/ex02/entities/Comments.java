package ex02.entities;

public class Comments {
    private String text;

    public Comments() {
    }

    public Comments(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
