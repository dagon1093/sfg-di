 :: Spring Boot ::                (v2.4.2)

2021-03-30 08:58:55.108  INFO 11608 --- [           main] c.s.sfgdi.SfgDiApplication               : Starting SfgDiApplication using Java 11.0.2 on pk with PID 11608 (D:\spring projects\sfg-di\target\classes started by lol in D:\spring projects\sfg-di)
2021-03-30 08:58:55.108  INFO 11608 --- [           main] c.s.sfgdi.SfgDiApplication               : No active profile set, falling back to default profiles: default
2021-03-30 08:58:56.008  WARN 11608 --- [           main] s.c.a.AnnotationConfigApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'i18nController' defined in file [D:\spring projects\sfg-di\target\classes\com\springdiexample\sfgdi\controllers\I18nController.class]: Unsatisfied dependency expressed through constructor parameter 0; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.springdiexample.sfgdi.services.GreetingService' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Qualifier(value="i18nService")}
2021-03-30 08:58:56.018  INFO 11608 --- [           main] ConditionEvaluationReportLoggingListener : 

Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2021-03-30 08:58:56.068 ERROR 11608 --- [           main] o.s.b.d.LoggingFailureAnalysisReporter   : 

***************************
APPLICATION FAILED TO START
***************************

Description:

Parameter 0 of constructor in com.springdiexample.sfgdi.controllers.I18nController required a bean of type 'com.springdiexample.sfgdi.services.GreetingService' that could not be found.

The injection point has the following annotations:
	- @org.springframework.beans.factory.annotation.Qualifier(value="i18nService")

The following candidates were found but could not be injected:
	- User-defined bean
	- User-defined bean
	- User-defined bean
	- User-defined bean


Action:

Consider revisiting the entries above or defining a bean of type 'com.springdiexample.sfgdi.services.GreetingService' in your configuration.


Process finished with exit code 1
