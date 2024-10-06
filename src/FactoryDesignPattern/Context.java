package FactoryDesignPattern;

import FactoryDesignPattern.Service.FileReaderService;

public class Context {

    public void initiateFileReadProcess(String type){
        FileReaderService fileReaderService = FileReaderFactory.getFileReaderInstance(type);
        fileReaderService.fileReadProcess();
    }
}
