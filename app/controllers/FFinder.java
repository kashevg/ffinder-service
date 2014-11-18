package controllers;

import filefinder.FileSearcher;
import models.WriteToModel;
import play.mvc.Controller;

/**
 * Created by eugene on 18.11.2014.
 */
public class FFinder extends Controller{
    public static void find(String strToFind) {
        if (strToFind.length() == 0)
            renderText("No parameter");
        WriteToModel writeToModel;
        writeToModel = new WriteToModel();
        FileSearcher fileSearcher;
        fileSearcher = new FileSearcher(strToFind, writeToModel);
        fileSearcher.run();
        renderJSON(writeToModel.getFinderAnswerLinkedList());
    }
}
