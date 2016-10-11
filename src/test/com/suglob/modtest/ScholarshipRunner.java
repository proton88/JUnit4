package test.com.suglob.modtest;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class ScholarshipRunner extends BlockJUnit4ClassRunner {
    private ScholarshipRunListener scholarshipRunListener;
    public ScholarshipRunner(Class<ScholarshipRunListener> klass) throws InitializationError {
        super(klass);
        scholarshipRunListener=new ScholarshipRunListener();
    }

    public void run(RunNotifier notifier){
        notifier.addListener(scholarshipRunListener);
        super.run(notifier);
    }
}
