we have a project with 6 bundles
1) com.fugro.lab.domain: contains 1 class that should be tested, Translations.java
2) com.fugro.lab.domain.thirdparty.libsbundle_without_junit and com.fugro.lab.domain.thirdparty.libsbundle_with_junit are just containers with 3rd party
   libraries, the only difference being that the 'with_junit' contains junit.jar as an extra compared to 'without_junit'
3) com.fugro.lab.domain.test.libsbundle_without_junit, com.fugro.lab.domain.test.libsbundle_with_junit and com.fugro.lab.domain.test.local_libs all
   contain (a suite with) 2 unit tests: 1 to test Translations.java from the domain, and PowerMockExampleTest to showcase some functionality of Powermock
   
The problem: 
-> the test suites with 2 tests always work from eclipse, but only the one with local libs also works from the command line, with a 'mvn clean install'
-> a 'mvn clean install' in the com.fugro.lab.domain.test.libsbundle_without_junit produces an initializationError(com.fugro.lab.domain.powermockexample.PowerMockExampleTest): Type [unknown] not present 
--> if we look at the surefire output we see more details: Caused by: java.lang.ClassNotFoundException: org.junit.runner.manipulation.Filterable cannot be found by com.fugro.lab.domain.thirdparty.libsbundle_without_junit_1.0.0.201702141106
-> a 'mvn clean install' in the com.fugro.lab.domain.test.libsbundle_with_junit produces a(com.fugro.lab.domain.powermockexample.PowerMockExampleTest): 
   com.fugro.lab.domain.powermockexample.PowerMockExampleTest cannot be found by com.fugro.lab.domain.thirdparty.libsbundle_with_junit_1.0.0.201702141106 