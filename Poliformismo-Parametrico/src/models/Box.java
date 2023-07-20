package models;

public class Box<generic> {

    private generic content;

    public Box(generic content){
        this.content = content;
    }

    public generic getContent() {
        return content;
    }

    public void setContent(generic content) {
        this.content = content;
    }
}
