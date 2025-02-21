# Nombre del archivo JAR final
JAR_NAME=MontecarloPi.jar

# Directorios de las fuentes y el destino
SRC_DIR=.
BIN_DIR=bin

# Compilador de Java
JAVAC=javac
JAR=jar

# Archivos fuente y clases
SOURCES=$(shell find $(SRC_DIR) -name "*.java")
CLASSES=$(SOURCES:.java=.class)

# Objetivo por defecto: compilar y crear el JAR
all: compile jar

# Compilar los archivos .java
compile:
	mkdir -p $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) $(SOURCES)

# Crear el archivo JAR ejecutable
jar:
	$(JAR) cfe $(JAR_NAME) aplicacion.MetodoMontecarloP2 -C $(BIN_DIR) .

# Ejecutar el programa con un argumento de ejemplo (puedes cambiar "1000000" por otro valor)
run:
	java -jar $(JAR_NAME) 1500

# Limpiar archivos compilados y el JAR
clean:
	rm -rf $(BIN_DIR)/*.class $(JAR_NAME) $(BIN_DIR)
