package reader;

import data.DataModel;

import java.io.FileNotFoundException;
import java.io.FileReader;
import com.google.gson.Gson;

public class ReadDataFromJson
{

    public DataModel readJsonFile() throws FileNotFoundException
    {
        FileReader filereader = new FileReader("data/testData.json");
        DataModel dataModel = new Gson().fromJson(filereader,DataModel.class);
        return dataModel;

    }

}
