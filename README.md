# Mise-en-oeuvre-d-une-architecture-micro-service
Mise en oeuvre d'une architecture micro-service

1. Créer le micro service Customer-service
![image](https://github.com/oumaimabenaboud/Mise-en-oeuvre-d-une-architecture-micro-service/assets/120368654/4f07eadf-27cf-4747-a3e8-1ac58df304e6)
![image](https://github.com/oumaimabenaboud/Mise-en-oeuvre-d-une-architecture-micro-service/assets/120368654/2233bce9-c111-4a30-95fe-4309a9d03204)
![image](https://github.com/oumaimabenaboud/Mise-en-oeuvre-d-une-architecture-micro-service/assets/120368654/0276aaa2-d150-4483-9fd8-3bcc467025c8)
![image](https://github.com/oumaimabenaboud/Mise-en-oeuvre-d-une-architecture-micro-service/assets/120368654/a037cc77-a8e6-4490-b9e0-cab3465c0137)
2. Créer le micro service Inventory-service
![image](https://github.com/oumaimabenaboud/Mise-en-oeuvre-d-une-architecture-micro-service/assets/120368654/761c9bed-9a05-4399-b1b8-bb03f3f0241f)
3. Créer la Gateway service en utilisant Spring Cloud Gateway
    - Static routes configuration with Spring Cloud Gateway using "application.yml"
![image](https://github.com/oumaimabenaboud/Mise-en-oeuvre-d-une-architecture-micro-service/assets/120368654/6f249f4f-d358-45ab-a0b1-361e76cfdaba)
    - Static routes configuration with Spring Cloud Gateway using Java Config Class
![image](https://github.com/oumaimabenaboud/Mise-en-oeuvre-d-une-architecture-micro-service/assets/120368654/d9ec9377-52cb-4ef2-8a32-09d25334fba3)
4. Créer l’annuaire Registry Service basé sur NetFlix Eureka Server
![image](https://github.com/oumaimabenaboud/Mise-en-oeuvre-d-une-architecture-micro-service/assets/120368654/bacfb8ee-a11c-4c33-893b-b3e2be0718cc)
![image](https://github.com/oumaimabenaboud/Mise-en-oeuvre-d-une-architecture-micro-service/assets/120368654/5b1db123-018e-4757-bce0-43559665a1c0)
    - Static routes configuration with Discovery Service
![image](https://github.com/oumaimabenaboud/Mise-en-oeuvre-d-une-architecture-micro-service/assets/120368654/74bded4b-5f10-43e9-be78-97bdc878ef71)
5. Dynamic routes configuration with Discovery Service
![image](https://github.com/oumaimabenaboud/Mise-en-oeuvre-d-une-architecture-micro-service/assets/120368654/27283207-2ea0-4d23-bd0b-b2d602c5f473)
6. Créer Le service Billing-Service en utilisant Open Feign pour communiquer avec les services Customer-service et Inventory-service
![image](https://github.com/oumaimabenaboud/Mise-en-oeuvre-d-une-architecture-micro-service/assets/120368654/e46611a7-7ff8-467a-8cf0-43fa59c5e30b)
![image](https://github.com/oumaimabenaboud/Mise-en-oeuvre-d-une-architecture-micro-service/assets/120368654/db73cd62-fa92-4ed8-9651-81ead60a76c5)

7. Créer un client Angular qui permet d’afficher une facture

