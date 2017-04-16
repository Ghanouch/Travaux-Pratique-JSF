import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.*;
import javax.xml.ws.WebFault;
import java.io.Serializable;

/**
 * Created by zguindouos on 27/02/17.
 */

@ManagedBean
@ApplicationScoped
//@RequestScoped
//@SessionScoped
//@NoneScoped
//@WebFault
public class ApplicationStatus implements Serializable {

    int value = 0;

    public Integer getCounter() {
        return ++value;
    }

    @PostConstruct
    void init() {
        System.err.println("Create " + this);
    }

    @PreDestroy
    void close() {
        System.err.println("Close " + this);
    }

}
