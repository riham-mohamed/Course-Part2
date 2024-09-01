package test;

import reader.ReadDataFromJson;
import org.testng.annotations.*;

import java.io.FileNotFoundException;

public class Test
{
ReadDataFromJson readDataFromJson;

@org.testng.annotations.Test
    public void t1() throws FileNotFoundException
{
    readDataFromJson = new ReadDataFromJson();
    System.out.println(readDataFromJson.readJsonFile().URL);
}

@org.testng.annotations.Test
public void t2() throws FileNotFoundException {
    readDataFromJson = new ReadDataFromJson();
    System.out.println(readDataFromJson.readJsonFile().Login.ValidCredentials.Email);
    System.out.println(readDataFromJson.readJsonFile().Login.ValidCredentials.Password);
}
}
