package com.lukasz;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Łukasz on 02.06.2017.
 */
public class SaveData {
    public static void save(MatchList matchList) {
        try(ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("data.dat")))) {
            output.writeObject(matchList.getDate());
            output.writeObject(matchList);
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
