package essential_homework4.dop_task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SupportService {
    int profilesId;
    int ticketsId;
    List<Customer> listOfCustomers;
    List<SupportSpecialist> listOfSpecialists;
    List<Profile> listOfProfiles;
    List<Service> listOfServices;
    List<Ticket> listOfTickets;

    SupportService() {
        listOfCustomers = new ArrayList<>();
        listOfSpecialists = new ArrayList<>();
        listOfProfiles = new ArrayList<>();
        listOfServices = new ArrayList<>();
        listOfTickets = new ArrayList<>();
    }

    public static void main(String[] args) {
        SupportService suppService = new SupportService();
        Random random = new Random();
        /*
        Создать мейн класс SupportService, где создать десять Customer - Profile, пять Service, у каждого Customer - минимум один тикет
        три SupportSpecialist - Profile.
        */

        // создать десять Customer
        for (int i = 0; i < 10; i++) {
            suppService.addNewCustomer(i, "customerUserName" + i, "password" + i,
                    suppService.profilesId, "Customer" + i + " Name" + i, "Customer" + i + " Surname" + i,
                    "customer" + i + "email@bla.com", "+3809325418" + i, "address" + i,
                    "postalCode" + i);

            suppService.profilesId++;
        }

        // создать три SupportSpecialist
        for (int i = 0; i < 3; i++) {
            suppService.addNewSpecialist(i, "specialistUserName" + i, "password" + i,
                    suppService.profilesId, "Specialist" + i + " Name" + i, "Specialist" + i + " Surname" + i,
                    "specialist" + i + "email@bla.com", "+3809325418" + i, "address" + i,
                    "postalCode" + i);

            suppService.profilesId++;
        }

        // создать пять Service
        for (int i = 0; i < 5; i++) {
            suppService.addNewService(i, "serviceName" + i, true, 100 + i);
        }

        // распределить сервисы по клиентам
        // Customer имеет отношение к Service многие ко многим
        // (каждый Customer - может пользоваться несколькими услугами(Service) и Service может иметь айдишники многих клиентов)
        int numberOfServices;
        int serviceId;
        Service service;
        List<Integer> listOfInts = new ArrayList<>();
        for (Customer customer : suppService.listOfCustomers) {

            numberOfServices = random.nextInt(3) + 1; // количество сервисов у клиента(от 1 до 3)

            for (int i = 0; i < numberOfServices; i++) {
                serviceId = random.nextInt(suppService.listOfServices.size()); // id сервисов которые будут у клиента(от 0 до размера массива(не включительно))

                while (listOfInts.contains(serviceId)) { // проверка на то, имеет ли текущий клиент данный сервис
                    serviceId = random.nextInt(suppService.listOfServices.size());
                }

                listOfInts.add(serviceId); // лист следит за сервисами которые были добавлены

                customer.getServices().add(serviceId); // добавляем айдишник сервиса в лист сервисов у текущего клиента

                service = suppService.listOfServices.get(serviceId); // достаем текущий сервис из списка сервисов

                service.getCustomers().add(customer.getId()); // добавляем айдишник пользователя в лист пользывателей текущего сервиса
            }

            listOfInts.clear(); // очищаем лист следящий за тем, какие сервисы мы добавили клиенту
        }

        // у каждого Customer - минимум один тикет
        // один клиент может иметь несколько неотвеченых Tiket(тикетов - проблем)
        // один SupportSpecialist может иметь несколько неотвеченых Tiket(тикетов - проблем)
        int numberOfTicket;
        Ticket ticket;
        SupportSpecialist specialist;
        for (Customer customer : suppService.listOfCustomers) {

            numberOfTicket = random.nextInt(2) + 1; // количество тикетов у клиента(от 1 до 2)

            for (int i = 0; i < numberOfTicket; i++) {
                /* достаем сервис у которого возникла проблема(от 0 до размера массива(не включительно)) */
                service = suppService.listOfServices.get(random.nextInt(suppService.listOfServices.size()));


                /* достаю из списка специалиста за которым закрепиться данный тикет(от 0 до размера массива(не включительно))  */
                specialist = suppService.listOfSpecialists.get(random.nextInt(suppService.listOfSpecialists.size()));

                /* addNewTicket - создает новый тикет, добавляет его в список тикетов, возвращает его */
                ticket = suppService.addNewTicket(suppService.ticketsId, service.getServiceName(),
                        "problem" + numberOfTicket + "." + i, true,
                        customer.getId(), specialist.getId());

                customer.getTickets().add(ticket.getId()); // добавляю айди данного тикета соответствующему клиенту

                specialist.getTickets().add(ticket.getId()); // добавляю айди данного тикета соответствующему клиенту

                suppService.ticketsId++;
            }
        }

        /*
        Создать с помощью класса Scanner ответы приложения через консоль.
        Разработать ответы на следующие запросы через консоль (проверка связей созданной сети):
        #fetch_all_customers - выводит список всех клиентов с соответственными профилями
        #fetch_all_tickets - выводит список всех тикетов с клиентами без профилей
        #fetch_all_specialists - выводит список всех тех сотрудников с профилями и тикетами
        #fetch_all_services - выводит все сервисы с соответственными клиентами
        */
        Scanner scan = new Scanner(System.in);
        String request;
        while(true) {
            System.out.println("Please enter your request:");
            request = scan.nextLine();

            switch (request) {
                case "#fetch_all_customers": {
                    suppService.fetchAllCustomers();
                    break;
                }
                case "#fetch_all_tickets": {
                    suppService.fetchAllTickets();
                    break;
                }
                case "#fetch_all_specialists": {
                    suppService.fetchAllSpecialists();
                    break;
                }
                case "#fetch_all_services": {
                    suppService.fetchAllServices();
                    break;
                }
                case "#exit": {
                    return;
                }
                default: {
                    System.out.println("Wrong request, please try again!");
                }
            }

        }
    }


    /* ============================================================================================================== */


    void addNewCustomer(int id, String username, String password,
                        int profileID, String firstName, String lastName, String email,
                        String phoneNumber, String address, String postalCode) {
        listOfCustomers.add(new Customer(id, username, password, profileID));
        listOfProfiles.add(new Profile(profileID, firstName, lastName, email, phoneNumber, address, postalCode, id));
    }

    void addNewSpecialist(int id, String username, String password, int profileId,
                          String firstName, String lastName, String email, String phoneNumber,
                          String address, String postalCode) {
        listOfSpecialists.add(new SupportSpecialist(id, username, password, profileId));
        listOfProfiles.add(new Profile(profileId, firstName, lastName, email, phoneNumber, address, postalCode, id));
    }

    void addNewService(int id, String serviceName, boolean isActive, int serviceMonthPrice) {
        listOfServices.add(new Service(id, serviceName, isActive, serviceMonthPrice));
    }

    Ticket addNewTicket(int id, String serviceName, String problemDescription, boolean isActive, int customerId, int supportSpecialistId) {
        Ticket ticket = new Ticket(id, serviceName, problemDescription, isActive, customerId, supportSpecialistId);
        listOfTickets.add(ticket);

        return ticket;
    }

    void fetchAllCustomers() {
        for (Customer customer : listOfCustomers) {
            System.out.println(customer);
            System.out.println(listOfProfiles.get(customer.getProfileID()));
            System.out.println("------------------------------------------------");
        }
        System.out.println("=======================================================");
    }

    void fetchAllTickets() {
        for (Ticket ticket : listOfTickets) {
            System.out.println(ticket);
            System.out.println(listOfCustomers.get(ticket.getCustomerId()));
            System.out.println("------------------------------------------------");
        }
        System.out.println("=======================================================");
    }

    void fetchAllSpecialists() {
        List<Integer> tickets;
        for (SupportSpecialist specialist : listOfSpecialists) {
            System.out.println(specialist);
            System.out.println();
            System.out.println(listOfProfiles.get(specialist.getProfileId()));
            System.out.println();
            tickets = specialist.getTickets();
            for (int ticketId : tickets) {
                System.out.println(listOfTickets.get(ticketId));
            }
            System.out.println("------------------------------------------------");
        }
        System.out.println("=======================================================");
    }

    void fetchAllServices() {
        List<Integer> customers;
        for (Service service : listOfServices) {
            System.out.println(service);
            System.out.println();
            customers = service.getCustomers();
            for (int customerId : customers) {
                System.out.println(listOfCustomers.get(customerId));
            }
            System.out.println("------------------------------------------------");
        }
        System.out.println("=======================================================");
    }
}
