#!/bin/bash
#
JAVA=java
JAVA_OPTS="-Xms512m -Xmx1536m -XX:PermSize=64M -XX:MaxPermSize=256m -agentlib:jdwp=transport=dt_socket,server=y,suspend=n -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false"
JARFILE=demo-assembly-package.jar
# resovle links - $0 may be a softlink
PRG="$0"
while [ -h "$PRG" ]; do
    ls=`ls -ld "$PRG"`
    link=`expr "$ls" : '.*-> \(.*\)$'`
    if expr "$link" : '/.*' > /dev/null; then
        PRG="$link"
    else
        PRG=`dirname "$PRG"`/"$link"
    fi
done

# Get standard enviroment variables
PRGDIR=`dirname "$PRG"`
[ -z "$PRG_HOME" ] && PRG_HOME=`cd "$PRGDIR/.." >/dev/null; pwd`
# Ensure that any user defined CLASSPATH variables are not used onstartup,
# but allow them to be specified in setenv.sh, in rare case when it is neede.

JARFILE=$PRGDIR/$JARFILE

if [ -z $WORKERPIDFILE ]
then WORKERPIDFILE=$PRGDIR/run.pid
fi

WORKER_JAR_DIR=$PRGDIR

echo '-----------------------'
echo $PRGDIR