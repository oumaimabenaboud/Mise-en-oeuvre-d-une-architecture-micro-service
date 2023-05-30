# Mise en oeuvre d'une architecture micro-service
1. Créer le micro service Customer-service :

![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/2d0dc2aa-66b9-4b01-94d7-961357e3dee4)

• Créer l’entité Customer<br>
![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/b682cb6b-7d3e-46e7-a95b-2efe51b0d684)

• Créer l’interface CustomerRepository basée sur Spring Data 

![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/256aeff6-e356-47c8-b96c-62ba881cec60)

• Déployer l’API Restful du micro-service en utilisant Spring Data Rest 

![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/ac2639ca-b4fc-4aa2-a5db-1981c593e9a7)

• Tester le Micro service

![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/aa7a26ea-9479-43bc-9e5b-2b60e84cdc4e)
![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/ac1c1b7f-c3a9-4edf-bfa3-ef2cec932e7c)
![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/1c6318c7-195f-44e2-967f-9ae97635b5c0)

2. Créer le micro service Inventory-service 
• Créer l’entité Product 

![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/70154679-1f50-4086-93fa-26d2e5dd12a2)

• Créer l’interface ProductRepository basée sur Spring Data 

![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/8be1578c-e908-463c-9669-8a04e8409053)

• Déployer l’API Restful du micro-service en utilisant Spring Data Rest 

![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/1bb86559-642b-4ce2-8c6c-f65bf353208e)

• Tester le Micro service

![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/59fb2d66-367e-40f6-a136-1728998a6d76)
![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/eb9ab3ad-0712-467a-946b-464010f777d2)
![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/ec9ce931-20ca-4256-8ab8-ee8f5e7d3c95)

3. Créer la Gateway service en utilisant Spring Cloud Gateway
1. Tester la Service proxy en utilisant une configuration Statique basée sur le fichier application.yml

![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/2ed3da7c-f3d5-4b17-b5db-35d26070196a)

2. Tester la Service proxy en utilisant une configuration Statique basée une configuration Java
![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/7323f38d-6b56-46cf-abed-658ec6ff09f6)

Les deux méthodes affichent le résultat suivant :
![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/da280f65-2f14-433d-9c58-6cf353dc6aba)
![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/3cb0fd48-3b4b-4c00-a6db-afe21563edd6)
![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/d15168c2-0d47-4f97-b6dd-7bc8475485fb)
![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/b6335b1b-6af2-45f4-b920-0cc99367ea9f)

4. Créer l’annuaire Registry Service basé sur NetFlix Eureka Server

![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/c04cbbd8-a26f-4254-ac22-e3438ff0c3ea)


5. Tester le proxy en utilisant une configuration dynamique de Gestion des routes vers les micro services enregistrés dans l’annuaire Eureka Server
![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/8c826af5-9804-47e5-8ff5-062015948747)
![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/8db2998f-f5bb-4aca-94f1-44f4dcf6fbc9)
![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/790e63e9-61e1-49b4-b791-a8584bcee9c5)


6. Créer Le service Billing-Service en utilisant Open Feign pour communiquer avec les services Customer-service et Inventory-service

![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/1330edd1-6217-4fe4-b580-bdc8e67b0ba0)
![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/c686bfd6-386e-4c33-8e84-b63c34a5fd38)
![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/488c7dbf-1b2e-468a-a85c-ef878d4b6840)
![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/b33587e3-fb8a-4131-a6bc-67b225e61d7d)
![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/463f1f0a-8024-48b0-b113-7b76eaca1817)
![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/9558c203-39c4-4f5f-9feb-4e94c3b8b9dc)


7. Créer un client Angular qui permet d’afficher une facture

![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/81462361-1dee-403c-b481-60b58d6f33e5)
![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/397b2b84-c928-407b-a729-5c83a180a55c)
![image](https://github.com/KhalidMHASNI/Mise-en-oeuvre-d-une-architecture-micro-service/assets/82038554/4ff5f41b-fac5-4269-9c18-65a966bae298)

