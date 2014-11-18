package models;

import filefinder.WriteResult;

import java.util.LinkedList;

/**
 * Created by eugene on 18.11.2014.
 */
public class WriteToModel implements WriteResult{
    private LinkedList<FinderAnswer> finderAnswerLinkedList;

    public WriteToModel(){
        finderAnswerLinkedList = new LinkedList<>();
    }

    @Override
    public void write(String fileName, int pos) {
        FinderAnswer finderAnswer = new FinderAnswer();
        finderAnswer.fileName = fileName;
        finderAnswer.pos = pos;
        finderAnswerLinkedList.add(finderAnswer);
    }

    public LinkedList<FinderAnswer> getFinderAnswerLinkedList(){
        return finderAnswerLinkedList;
    }
}
