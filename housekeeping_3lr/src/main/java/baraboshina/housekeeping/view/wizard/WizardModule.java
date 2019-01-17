package baraboshina.housekeeping.view.wizard;

import baraboshina.housekeeping.model.Operation;
import com.google.inject.AbstractModule;

public class WizardModule extends AbstractModule {
    @Override
    protected void configure() {
        Operation model = new Operation();
        bind(Operation.class).toInstance(model);
    }
}
