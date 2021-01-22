mvn versions:use-latest-versions:
[INFO] Scanning for projects...
[INFO]
[INFO] --------------------< org.example:SauceDemoComTest >--------------------
[INFO] Building SauceDemoComTest 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- versions-maven-plugin:2.8.1:display-dependency-updates (default-cli) @ SauceDemoComTest ---
[INFO] No dependencies in Dependencies have newer versions.
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.714 s
[INFO] Finished at: 2021-01-16T13:47:13+03:00
[INFO] ------------------------------------------------------------------------



mvn clean test:
[INFO] Results:
[INFO]
[INFO] Tests run: 11, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  01:45 min
[INFO] Finished at: 2021-01-16T14:02:06+03:00
[INFO] ------------------------------------------------------------------------




$ mvn clean test -Dtest=LoginTest
[INFO] Scanning for projects...
[INFO]
[INFO] --------------------< org.example:SauceDemoComTest >--------------------
[INFO] Building SauceDemoComTest 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ SauceDemoComTest ---
[INFO] Deleting C:\Users\dkwr2\IdeaProjects\SauceDemoComTest\target
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ SauceDemoComTest ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\dkwr2\IdeaProjects\SauceDemoComTest\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ SauceDemoComTest ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 6 source files to C:\Users\dkwr2\IdeaProjects\SauceDemoComTest\target\classes
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ SauceDemoComTest ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ SauceDemoComTest ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 8 source files to C:\Users\dkwr2\IdeaProjects\SauceDemoComTest\target\test-classes
[INFO]
[INFO] --- maven-surefire-plugin:3.0.0-M5:test (default-test) @ SauceDemoComTest ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running tests.LoginTest
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
Starting ChromeDriver 87.0.4280.88 (89e2380a3e36c3464b5dd1302349b1382549290d-refs/branch-heads/4280@{#1761}) on port 5199
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
янв. 16, 2021 2:09:01 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
======================================== STARTING TEST loginTest ========================================
======================================== FINISHED TEST loginTest Duration: 2s ========================================
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 10.659 s - in tests.LoginTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  14.913 s
[INFO] Finished at: 2021-01-16T14:09:07+03:00
[INFO] ------------------------------------------------------------------------


mvn -Dtest=ProductsTest#sideBarCheckingAllItems+sideBarCheckingAbout test:
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 21.269 s - in tests.ProductsTest




