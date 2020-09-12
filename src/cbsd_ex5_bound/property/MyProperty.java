/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbsd_ex5_bound.property;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author 61050151
 */
public class MyProperty implements Serializable {
    
    public static final String Score_PROPERTY = "ScoreTeam1";
    
    private String Score;
    
  
    
    private PropertyChangeSupport propertySupport;
    
    public MyProperty() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    
    public String getScore() {
        return Score;
    }
    
    public void setScore(String value) {
        String oldValue1 = Score;
        Score = value;
        propertySupport.firePropertyChange(Score_PROPERTY , oldValue1, Score);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
