
# PROJET FSGBD

Dans le cadre d'un projet universitaire, nous devons effectuer des recherches sur un SGBD choisi et implémenter un algorithme d'indéxation de recherche pour pouvoir comparer la recherche séquentielle et la recherche à l'aide d'un arbre B+ simulant le fonctionnement des index dans une base de données.

## PARTIE I - EVALUTATION D'UN SGBD RELATIONNEL DU MARCHE

Le SGBD choisi est MySQL. La première partie consistait à répondre aux différentes parties demandées.
Les parties sont :
  
        * Identification du SGBD
        * Architecture fonctionnelles du SGBD
        * Le dictionnaire de données du moteur
        * Organisation physique du SGBD
        * Organisation logique des données
        * Gestion de la concurrence d’accès
        * Gestion des transactions distribuées
        * Gestion de la reprise sur panne
        * Techniques d’indexation
        * Optimisation de requêtes


## PARTIE II - PROJET SUR LES THEMATIQUES LIEES A L'INDEXATION ET LA RECHERCHE

Dans cette partie, l'objectif est de comparer le temps d'exécution d'un algorithme qui utilise une recherche séquentielle à un algorithme qui utilise une recherche grâce au index en utilisant un arbre B+.

On devait créer un fichier de 10 000 lignes qui simule les données d'une table en base de données.
Ce fichier a été créé grâce au site https://www.onlinedatagenerator.com/  

La ligne du fichier contient en premier temps l'id puis un nombre généré aléatoirement et enfin le prénom et nom de la personne.
Chaque ligne correspond donc à un tuple.  

Nous avons donc développé un algorithme de recherche séquentielle qui utilise le fichier pour trouver la valeur correspondante et un algorithme de recherche simulant la recherche par indexation en base de données.  

Après avoir fait ça nous avons fait 100 recherches différentes pour comparer deux types de recherches.

Nos résultats sont que la recherche séquentielle a une moyenne de **9.14 ms** pour trouver la valeur correspondante tandis que la recherche par indexation
a une moyenne de 1.07. Nous voyons donc que la recherche par indexation est beaucoup plus performante que la recherche séquentielle.

Le temps maximum dans la recherche séquentielle est de **38 ms**, nous supposons que la valeur recherchée e trouve vers la fin du fichier tandis que le maximum de temps pour la recherche d'indexation ne fait que **16 ms**. 

Le temps minimum dans les deux cas est de **0 ms**, les deux recherches peuvent être très rapide et qu'il faudrait donc être plus précis dans l'unité.

