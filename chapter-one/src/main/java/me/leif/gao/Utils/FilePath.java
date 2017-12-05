package me.leif.gao.Utils;

import me.leif.gao.p109.ThreeSum;

/**
 * Created by leif on 2017/12/5
 */
public class FilePath {

    public static String getFilePath(String path) {
        return FilePath.class.getClassLoader().getResource(path).getPath();
    }

}
