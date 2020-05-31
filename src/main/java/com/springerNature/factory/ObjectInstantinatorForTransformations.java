package com.springerNature.factory;

import java.io.IOException;
import java.util.Properties;

import static com.springerNature.util.ReadConfig.readConfig;

public class ObjectInstantinatorForTransformations {
    void transformationInstantinate() throws IOException {
        Properties props = readConfig();

        String str = (String)props.get("transformations");
        String[] strArr =null;
        if(str.contains(",")){
            strArr = str.split(",");
        }

        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].equalsIgnoreCase("initcap"))
                new Transformation().setInitCap("initcap");

            if(strArr[i].equalsIgnoreCase("italic"))
                new Transformation().setItalic("italic");
        }

    }
}


