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
    
三、run jar file
---

- 1.打包后的文件(packaged file)

位置:project/target/demo-assembly-package-1.0.tar.gz

- 2.解压后的结构(structure)

启动前:
demo-assembly-package
├── bin
│   ├── demo-assembly-package.jar
│   └── run.sh
├── conf
│   └── logback.xml
└── lib
    ├── demo-assembly-package-1.0.jar
    ├── logback-classic-1.2.3.jar
    ├── logback-core-1.2.3.jar
    └── slf4j-api-1.7.25.jar
    
启动后:
├── bin
│   ├── demo-assembly-package.jar
│   ├── run.pid
│   └── run.sh
├── conf
│   └── logback.xml
├── lib
│   ├── demo-assembly-package-1.0.jar
│   ├── logback-classic-1.2.3.jar
│   ├── logback-core-1.2.3.jar
│   └── slf4j-api-1.7.25.jar
└── logs
    └── demo
        └── 2018-02-06
            ├── debug.log
            ├── error.log
            ├── info.log
            └── warn.log

    
bin:启动脚本(jvm opts可在此文件修改),项目的jar包,程序的pid(用于检查是否重复启动和关闭)
conf:resources中配置文件(在distribution.xml中设置的)
lib:依赖jar包
logs:日志


- 3.命令(command)

启动:./bin/run.sh start
停止:./bin/run.sh stop
重启:./bin/run.sh restart


    
    
