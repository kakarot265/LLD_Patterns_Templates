package FactoryDesignPattern;

import FactoryDesignPattern.Service.FileReaderService;
import FactoryDesignPattern.ServiceImpl.CSVReaderService;
import FactoryDesignPattern.ServiceImpl.JSONReaderService;

public class FileReaderFactory {

    public static FileReaderService getFileReaderInstance(String type){
        if(type=="JSON"){
            return new JSONReaderService();
        }
        if(type=="CSV"){
            return new CSVReaderService();
        }

        return null;
    }
}
