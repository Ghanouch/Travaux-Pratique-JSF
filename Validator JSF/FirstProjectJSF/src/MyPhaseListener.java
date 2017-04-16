import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 * Created by zguindouos on 27/02/17.
 */

public class MyPhaseListener implements PhaseListener {

    //private static final long serialVersionUID = 354454545454545L;

    @Override
    public void beforePhase(PhaseEvent phaseEvent) {
        System.out.println("Avant la phase " + phaseEvent.getPhaseId());
    }

    @Override
    public void afterPhase(PhaseEvent phaseEvent) {
        System.out.println("APres la phase " + phaseEvent.getPhaseId());
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}
