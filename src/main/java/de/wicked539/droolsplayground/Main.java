package de.wicked539.droolsplayground;

import de.wicked539.droolsplayground.models.MyModel;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieSession;

public class Main {
	public static void main(String[] args) {
		System.out.println("drools playground");

        KieSession kieSession = KieServices.Factory.get().getKieClasspathContainer().newKieSession("DroolsPG");

        MyModel myModel = new MyModel();
        myModel.setPosX(50);
        myModel.setPosY(50);

        kieSession.insert(myModel);

        kieSession.fireAllRules();
	}
}

