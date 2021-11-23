package cs213.andriodPhoto03;

import android.widget.ArrayAdapter;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import cs213.andriodPhoto03.model.Album;

public class DataSaver {

    public static void saveData(ArrayList<Album> albums, String path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(albums);

            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void saveData(ArrayAdapter<Album> arrayAdapter, String path) {
        ArrayList<Album> albums = new ArrayList<Album>();

        for (int index = 0; index < arrayAdapter.getCount(); index++)
            albums.add(arrayAdapter.getItem(index));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(albums);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
