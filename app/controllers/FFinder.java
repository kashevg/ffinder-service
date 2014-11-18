package controllers;

import play.mvc.Controller;

/**
 * Created by eugene on 18.11.2014.
 */
public class FFinder extends Controller{
    public static void find(String strToFind) {

        renderJSON(strToFind);
    }
}
