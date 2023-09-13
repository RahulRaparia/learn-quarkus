# learn-quarkus
Learn Quarkus Development - Past, Present and Development

## Some Terms and Concepts For Quarkus

### What is Quarkus and How does it Compareto Spring ?

Quarkus is a Kubernetes-native Java framework tailored for GraalVM and HotSpot, crafted from best-of-breed Java libraries and standards¹. It was created to enable Java developers to create applications for a modern, cloud-native world¹. The goal of Quarkus is to make Java the leading platform in Kubernetes and serverless environments while offering developers a framework to address a wider range of distributed application architectures¹.

Quarkus provides a frictionless development experience through a combination of tools, libraries, extensions, and more¹. It allows developers to automatically generate Kubernetes resources including building and deploying container images without having to manually create YAML files¹. Quarkus is designed to seamlessly combine the familiar imperative style code and the non-blocking, reactive style when developing applications¹.

Comparing Quarkus with Spring Boot:
- **Performance**: Quarkus uses an Ahead-of-Time (AOT) compiler to pre-compile Java bytecode into native code, resulting in faster startup times and lower memory usage⁵. On the other hand, Spring Boot uses the Java Virtual Machine (JVM) to run applications⁵.
- **Framework size**: Spring Boot is a well-established and feature-rich framework, but it comes with a lot of dependencies that can increase the size of your application⁵. Quarkus has a much smaller runtime footprint compared to Spring Boot⁵.
- **Startup time**: Spring Boot applications typically have longer startup times⁵. Quarkus is optimized for fast startup time⁵.
- **Development mode**: Both Spring Boot and Quarkus have built-in development modes that allow for fast iteration and hot reloading of code changes⁵.
- **Community Support**: Spring Boot is mature, well-known and stable with a larger community and extensive ecosystem of plugins and libraries⁷. Quarkus is newer but more innovative with fast application boot times, live coding features and an overall excellent developer experience. However, it has less community support and lacks beginner-friendly resources⁷.

In conclusion, both Quarkus and Spring Boot are excellent frameworks for building microservices and cloud-native applications. The choice between the two would depend on your specific requirements and constraints.

Sources:
(1) What is Quarkus? - Quarkus. https://quarkus.io/about/.
(2) Quarkus vs. Spring Boot: A head-to-head comparison - Medium. https://medium.com/@samuelcatalano/quarkus-vs-spring-boot-a-head-to-head-comparison-3b9502c0a345.
(3) Quarkus vs Spring Boot: Which Framework is Right for You - Rollbar. https://rollbar.com/blog/quarkus-vs-spring-boot/.
(4) What is Quarkus? - Red Hat. https://www.redhat.com/en/topics/cloud-native-apps/what-is-quarkus.
(5) Quarkus - Wikipedia. https://en.wikipedia.org/wiki/Quarkus.
(6) Spring Boot vs Quarkus | Baeldung. https://www.baeldung.com/spring-boot-vs-quarkus.
(7) Quarkus vs Spring Boot: Features and GraalVM native support. https://simply-how.com/quarkus-vs-spring-boot.

### what is Thorntail
Thorntail, formerly known as WildFly Swarm, is a framework that can be used to create microservices-like Java Enterprise Applications⁵. It offers an innovative approach to packaging and running Java EE applications by packaging them with just enough of the server runtime to "java -jar" your application³. It's MicroProfile compatible, too³.

However, it's important to note that Thorntail has announced its end of life³. The developers recommend using Quarkus or WildFly instead³. Despite this, the Thorntail user guide and documentation are still available for reference².

Sources:
(1) Introduction to Thorntail - Mastertheboss. https://www.mastertheboss.com/jbossas/wildfly-swarm/introduction-to-thorntail/.
(2) Rightsize your Java EE Applications | Thorntail. https://thorntail.io/.
(3) Documentation | Thorntail. https://thorntail.io/documentation/.
(4) . https://bing.com/search?q=What+is+Thorntail.
(5) Thorntail Definition & Meaning - Merriam-Webster. https://www.merriam-webster.com/dictionary/thorntail.
(6) undefined. http://www.oxforddictionaries.com/.

### What is WildFly ?
WildFly, formerly known as JBoss AS, is a Java Enterprise Edition fully featured application server that provides all the necessary features to run a Java web application¹. It is designed and maintained by Red Hat¹. WildFly is popular among Java developers who want a lightweight, enterprise-extensible application server¹.

WildFly provides a complete runtime environment that creates the connection of a database on one end to the web client on the other¹. It can easily be tooled to support enterprise applications if needed¹. The WildFly application server provides fast deployments for your development while also providing features like managed domain mode that allows the user to deploy several WildFly instances¹.

WildFly, as an open-source software, still shares the advantages of proprietary software¹. One advantage of WildFly is that it receives product support from Red Hat, a large enterprise that provides many features to the product¹. Second, Red Hat offers fully paid support packages¹.

It's important to note that WildFly is completely open source and free for both development and production level deployments¹.

Sources:
(1) What Is Wildfly | JRebel by Perforce. https://www.jrebel.com/blog/wildfly.
(2) WildFly. https://www.wildfly.org/.
(3) WildFly - Wikipedia. https://en.wikipedia.org/wiki/WildFly.

### What is MicroProfile ?
MicroProfile is an open-source specification that provides a collection of specifications designed to help developers build Enterprise Java cloud-native microservices³. It was initially released in September 2016³. The first version of MicroProfile was formed on JAX-RS, JSON-P, and CDI³. While the first two are specifications that provide API, CDI puts everything together³.

MicroProfile aims to optimize Enterprise Java for a microservices architecture¹. It's based on a subset of Jakarta EE WebProfile APIs, so we can build MicroProfile applications like we build Jakarta EE ones². The goal of MicroProfile is to define standard APIs for building microservices and deliver portable applications across multiple MicroProfile runtimes².

MicroProfile 6.0, the latest version as of now, is based on Jakarta EE 10 Core Profile, which also enables MicroProfile APIs to be used together with the full set of Jakarta EE 10 specifications¹. It includes updated versions of Open Telemetry, Open API, Rest Client, Config, Fault Tolerance, Metrics, JWT Authentication, Health and more¹.

MicroProfile Starter helps developers kickstart their microservices development journey, choosing the runtime they’re most comfortable with from the list of available implementations for the MicroProfile version selected¹.

Sources: 
(1) What is MicroProfile? | JRebel by Perforce. https://www.jrebel.com/blog/eclipse-microprofile.
(2) Home - MicroProfile. https://microprofile.io/.
(3) Building Microservices with Eclipse MicroProfile | Baeldung. https://www.baeldung.com/eclipse-microprofile.
(4) MicroProfile: What You Need to Know - DZone. https://dzone.com/articles/microprofile-what-you-need-to-know.
(5) MicroProfile: 5 Things You Need to Know - DZone. https://dzone.com/articles/microprofile-5-things-you-need-to-know.

### what is Jakarta EE ?
Jakarta EE, formerly known as Java Platform, Enterprise Edition (Java EE) and Java 2 Platform, Enterprise Edition (J2EE), is a set of specifications that extend Java SE with specifications for enterprise features such as distributed computing and web services¹. Jakarta EE applications are run on reference runtimes, which can be microservices or application servers, that handle transactions, security, scalability, concurrency, and management of the components they are deploying¹.

The platform was known as Java 2 Platform, Enterprise Edition or J2EE from version 1.2, until the name was changed to Java Platform, Enterprise Edition or Java EE in version 1.5¹. On September 12, 2017, Oracle Corporation announced that it would submit Java EE to the Eclipse Foundation¹. The Eclipse top-level project has been named Eclipse Enterprise for Java (EE4J)¹. The Eclipse Foundation could not agree with Oracle over the use of javax and Java trademarks¹. Oracle owns the trademark for the name "Java" and the platform was renamed from Java EE to Jakarta EE¹.

Jakarta EE is defined by its specification. The specification defines APIs (application programming interface) and their interactions¹. As with other Java Community Process specifications, providers must meet certain conformance requirements in order to declare their products as Jakarta EE compliant¹.

Sources: 
(1) Jakarta EE - Wikipedia. https://en.wikipedia.org/wiki/Jakarta_EE.
(2) Java EE vs J2EE vs Jakarta EE | Baeldung. https://www.baeldung.com/java-enterprise-evolution.
(3) What is Jakarta EE? - Educative. https://www.educative.io/answers/what-is-jakarta-ee.
(4) What is Jakarta EE? - blog.payara.fish. https://blog.payara.fish/jakarta-ee-java-ee-guide.