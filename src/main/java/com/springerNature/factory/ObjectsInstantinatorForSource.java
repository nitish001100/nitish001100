package com.springerNature.factory;

import com.springerNature.sourceExtractor.FileSource;

import java.io.IOException;
import java.util.Properties;

import static com.springerNature.util.ReadConfig.readConfig;


public class ObjectsInstantinatorForSource {
    void objectInstantinator() throws IOException {
        Properties props = readConfig();

        String source = (String)props.get("source");

        String[] srcArr = null;
        String src = source;
        if(source.contains(",")){
            srcArr = source.split(",");
        }

        if(src.equalsIgnoreCase("file")){
            new FileSource();
        } else if(src.equalsIgnoreCase("csv")){
            new FileSource();
        }else if(src.equalsIgnoreCase("oracle")){
            new FileSource();
        }


    }
}
