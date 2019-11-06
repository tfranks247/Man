import java.util.ArrayList;

public class Man {

    private String name;
    private ArrayList<Children> children;

    public Man() {
    }

    public Man(String name, ArrayList<Children> children) {
        this.name = name;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Children> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Children> children) {
        this.children = children;
    }
}
