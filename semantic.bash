set -e
cd "$(dirname "$0")"
export CCHK="java -classpath /ulib/java/antlr-4.8-complete.jar:./bin Main semantic"
#cat > code.txt   # save everything in stdin to program.txt
$CCHK