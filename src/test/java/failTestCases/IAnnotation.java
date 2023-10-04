package failTestCases;

import org.testng.IAnnotationTransformer;

public class IAnnotation implements IAnnotationTransformer {
    public void transform(org.testng.annotations.ITestAnnotation annotation, java.lang.Class testClass, java.lang.reflect.Constructor testConstructor, java.lang.reflect.Method testMethod) { /* compiled code */
        annotation.setRetryAnalyzer(ReRunFailTestCase.class);
    }
}
