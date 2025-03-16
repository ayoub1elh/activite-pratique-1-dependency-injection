# Activité Pratique N°1 - Injection des dépendances

Ce projet démontre différentes approches d'injection de dépendances, implémentées en Java.

## Structure du Projet

Le projet est divisé en deux parties principales :

### Partie 1 : Implémentation Basique d'Injection de Dépendances

- Interface `IDao` avec méthode getData
- Implémentation de `IDao`
- Interface `IMetier` avec méthode calcul
- Implémentation de `IMetier` avec couplage faible

Différentes méthodes d'injection :
1. Instanciation statique
2. Instanciation dynamique
3. Framework Spring
    - Configuration XML
    - Configuration par annotations

### Partie 2 : Mini Framework d'Injection de Dépendances

Développement d'un framework personnalisé supportant :

- Configuration via fichier XML (utilisant JAX Binding)
- Configuration via annotations
- Méthodes d'injection :
  - Par constructeur
  - Par setter
  - Par accès direct aux attributs (Field)

## Technologies Utilisées

- Java
- Spring Framework
- Maven
