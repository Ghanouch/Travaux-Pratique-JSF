/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Listener;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *
 * @author l.IsSaM.l
 */
public class MyPhaseListener implements PhaseListener {

    @Override
    public void beforePhase(PhaseEvent pe) {
        System.out.println(" avant la phase "+pe.getPhaseId());
    }

    @Override
    public void afterPhase(PhaseEvent pe) {
        System.out.println("After Phase "+pe.getPhaseId());
    }

    @Override
    public PhaseId getPhaseId() {
    return PhaseId.ANY_PHASE;
    }
    

    
    
}
