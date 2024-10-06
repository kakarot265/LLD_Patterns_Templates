package FactoryDesignPattern.ServiceImpl;

import FactoryDesignPattern.Service.FileReaderService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JSONReaderService implements FileReaderService {
    @Override
    public void fileReadProcess() {

        try  {
            BufferedReader br = new BufferedReader(new FileReader("filePath"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Reading JSON line: " + line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
