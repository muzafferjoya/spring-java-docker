package com.pxp.studentdetails.model;

import java.util.ArrayList;
import java.util.List;

public class MarksArray {
    private List<Marks> marksList;

    public MarksArray() {
    }

    public MarksArray(List<Marks> marksList) {
        this.marksList = marksList;
    }

    public List<Marks> getMarksList() {
        return marksList;
    }

    public void setMarksList(List<Marks> marksList) {
        this.marksList = marksList;
    }
}
