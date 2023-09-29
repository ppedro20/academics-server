package pt.ipleiria.estg.dei.ei.dae.academics.ejbs;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import pt.ipleiria.estg.dei.ei.dae.academics.entities.StudentBean;

@Startup
@Singleton
public class ConfigBean {
    @EJB
    private StudentBean studentBean;
    @PostConstruct
    public void populateDB() {
        // . . .
        studentBean.create( /* . . . */ );
    }
}
