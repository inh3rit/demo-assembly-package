一、assembly package plugin
---

- 1.必须(request)

file:///src/main/resources/assembly/distribution.xml

file:///src/main/bin/run.sh

- 2.修改(modify)

file:///pom.xml

    <descriptors>
        <descriptor>src/main/resources/assembly/distribution.xml</descriptor>
    </descriptors>
    
    <mainClass>org.inh3rit.demo.Main</mainClass><!-- jar启动入口类,根据实际启动类修改-->
    
二、logback configuration
----

- 1.修改(modify)

file:///src/main/resources/logback.xml

    <property name="log_dir" value="logs/demo/"/><!-- 根据项目名称修改 -->
    
    <!-- 根据实际情况修改包名 -->
    <logger name="org.inh3rit.demo.debug" level="DEBUG"/>
    <logger name="org.inh3rit.demo.info" level="INFO"/>
    <logger name="org.inh3rit.demo.warn" level="WARN"/>
    <logger name="org.inh3rit.demo.error" level="ERROR"/>
    
    
