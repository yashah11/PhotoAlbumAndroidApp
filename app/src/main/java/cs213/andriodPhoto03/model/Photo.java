package cs213.andriodPhoto03.model;

import android.graphics.Bitmap;

import java.io.Serializable;
import java.util.ArrayList;


public class Photo implements Serializable {


    private static final long serialVersionUID = 6955723612371190680L;
    private ArrayList<Tag> tags;
    private String caption, name;
    private SerializableBitmap bitmap;

    public Photo(String caption, Bitmap bitmap) {
        this.caption = caption;
        this.tags = new ArrayList<Tag>();
        this.bitmap = new SerializableBitmap(bitmap);
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getName(){
        return name;
    }

    public Bitmap getBitmap() {
        return bitmap.getBitmap();
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public boolean equals(Photo other) {
        return this.caption.equals(other.caption);
    }
}
