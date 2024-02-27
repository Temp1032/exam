
# TP DevOps

Vous allez faire un TP DevOps

# I- Sujet

## GIT 

Créer un repo GIT
Ajouter les branches "prod" et "dev"
Charger sur la branche "dev" les fichiers du projet demo

## Compilation

Créer un job jenkins qui récupère le projet sur le repo GIT et démarre une compilation via maven.

Ce job doit:
- Vérifier que le projet compile
- Ne lance pas de tests
- Publie la javadoc
- Se lance toute les 3 min si changement du SCM

## Tests Maven

Ajouter JUnit pour faire des tests dans le projet.
Créer plusieurs tests quelques méthodes simples de calcul.
- Integer add(integer a, integer b)
- Integer multi(integer a, integer b)
- Integer div(integer a, integer b)
Dans un nouveau job Jenkins :
- Vérifier que la compilation et les tests sont passants.
- Modifier un test de manière à la faire échouer.
- Vérifier que la compilation fonctionne et que le test remonte en KO.
- Ignorer le test via Maven de façon à obtenir un build correct.
- Publier le rapport de tests


## SONAR

Installer SonarQube (docker compose) ou utiliser la version en ligne.

Lancer un SonarScanner sur le projet via jenkins en créant un nouveau job.

Parcourir le tableau de bord

Modifier le projet de façon à faire varier les indicateurs et relancer une analyse:
- Tests
- Duplication
- Violations


# Fonctionnement

Le projet est a faire seul.

# Rendu

Le rendu se fera le 27 février à 23h59 maxi.
Toute absence de rendu entrainera un 0 (ZERO) pour le membre.

Le rendu s'effectu via un repos GIT ou SVN. L'adresse du rendu est envoyé par mail.
Le mail de rendu est vincent.leclerc@ynov.com
Les fichiers rendus doivent contenir
  - Les fichiers et documents techniques du TP.
  - Le document récap de chaque étape du TP avec les résultats en screenshot.
Le sujet du mail doit contenir votre section ainsi que le nom du projet.
Les fichiers rendus peuvent aussi comprendre: 
  - Des documents de recherche créés pour le projet et fournissant plus de détails pour l'enseignant.
Pour tout autre type de fichier, veuillez demander à l'enseignant si son inclusion est appropriée.