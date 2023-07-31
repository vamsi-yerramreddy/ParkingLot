package Models;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParseInput {
    private final String delimiter =" ";
    private String commandName;
    private List<String> params;

    public String getCommandName(){
        return commandName;
    }
    public List<String> getParams(){
        return params;
    }

    public ParseInput(String inputLine){
        final List<String>wordsList = Arrays.stream(inputLine.trim().split(delimiter))
                .map(String :: trim)
                .filter(words -> (words.length()>0) ).collect(Collectors.toList());
        if(wordsList.size()==0){
            //exception
        }
        commandName = wordsList.get(0).toLowerCase();
        wordsList.remove(0);
        params= wordsList;


    }

}
