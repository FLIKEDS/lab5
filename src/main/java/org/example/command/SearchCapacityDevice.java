package org.example.command;

import org.example.executiveClasses.Search;
import org.example.interfaces.MainMenu;

public class SearchCapacityDevice implements MainMenu {
    private Search theSearch;
    public  SearchCapacityDevice(Search search){
        this.theSearch=search;
    }
    public void execute(){
        theSearch.searchToCapacity();
    }
}

