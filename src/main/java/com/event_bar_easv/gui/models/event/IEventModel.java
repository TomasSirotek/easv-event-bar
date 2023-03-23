package com.event_bar_easv.gui.models.event;

import com.event_bar_easv.be.Event;
import javafx.collections.ObservableList;

import java.util.List;

public interface IEventModel {
    ObservableList<Event> getAllEvents();

    Event getEventById(int id);

}
