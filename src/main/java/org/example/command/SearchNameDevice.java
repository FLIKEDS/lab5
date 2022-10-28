package org.example.command;

import org.example.executiveClasses.Search;
import org.example.interfaces.MainMenu;

public class SearchNameDevice implements MainMenu {
    private Search theSearch;
    public  SearchNameDevice(Search search){
        this.theSearch=search;
    }
    /*public void search(){
        theSearch.searchToName();
    }*/
    public void execute(){
        theSearch.searchToName();
    }
}
