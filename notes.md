
COURS :
http://bit.ly/2TwWkcw

Servlet -> "controller"

JSP (Java Server Pages) -> "vue" : contient des balises et du java
Pour améliorer :
- action tags
- JSTL : librairie de tags --> un peu comme balises telerik (+ on déclare nos propres balises) + possibilité de faire des requêtes SQL
(custom tags diapo 54)

## ajouter glassfish tools
-> help - install new software - prendre lien dans les download de glassfish tools : https://download.eclipse.org/glassfish-tools/1.0.1/repository/
(https://projects.eclipse.org/projects/webtools.glassfish-tools/downloads)
-> IL FAUT AJOUTER SAPPHIRE POUR POUVOIR METTRE GLASSFISH TOOLS

## new server
glassfish : download le fichier (https://projects.eclipse.org/projects/ee4j.glassfish/downloads)
	window - show view - install new software
	chemin : /home/etud/mamanifaci1/annee3/jsp/glassfish-5.1.0/glassfish5/glassfish
# OU
--> Avec java JDK 11 : 
	add Jboss plugin (help - marketplace - Jboss Tools)
	download server : Wildfly (https://wildfly.org/downloads/)
	start server (window - show view - other - server)
	> localhost:8080

	go to wildfly-18.0.1.Final/bin
	>./add-user.sh
		(mael - mdp)

	then go back to localhost:8080 -> administration console


->Pour que servlet fonctionne : importer jakartaEE avec Maven, dans les dépendances (pom.xml)
(https://mvnrepository.com/artifact/jakarta.platform/jakarta.jakartaee-web-api/8.0.0)
-> CREER UN PROJET AVEC .war au lieu de jar
-> ajouter dans pom.xml :

<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-war-plugin</artifactId>
            <version>2.6</version>
            <configuration>
                <failOnMissingWebXml>false</failOnMissingWebXml>
            </configuration>
        </plugin>
    </plugins>
 	</build>
-> permet aussi d'avoir accès au projet dans le serveur

<dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
    <dependency>
	    <groupId>jakarta.platform</groupId>
	    <artifactId>jakarta.jakartaee-web-api</artifactId>
	    <version>8.0.0</version>
	</dependency>
  </dependencies>



 NE FONCTIONNE PAR SUR FIREFOX

pour trouver route : 
dans console administration -> deployment
ajouter le nom de la route
genre http://127.0.0.1:8080/TP1-0.0.1-SNAPSHOT/helloWorld

# requêtes : https://reqbin.com/


(intellij -> ctrl shift alt s)

> quota -v / -s