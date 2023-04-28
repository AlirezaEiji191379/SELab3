package Utils;

import Utils.Abstractions.IResourceUtils;

public class ResourceUtils implements IResourceUtils {

    public String GetResourcePath(String fileName){
        return getClass().getClassLoader().getResource(fileName).getPath();
    }
}
