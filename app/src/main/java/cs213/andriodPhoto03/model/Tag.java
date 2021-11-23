package cs213.andriodPhoto03.model;

import java.io.Serializable;

public class Tag implements Serializable {

    private static final long serialVersionUID = -2310738753538431907L;
    private String name, value;


    public Tag(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean equals(Tag other) {
        return name.equals(other.name) && value.equals(other.value);
    }

    public String toString() {
        return name + ": " + value;
    }
}
