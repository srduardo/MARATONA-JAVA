package academy.devdojo.maratonajava.javacore.Zgenerics.project.domain;

import java.util.*;

public class Library<T extends Readable>{
    private Set<T> avalibleObjects;
    private Queue<T> rentedObjects;
    private List<User> registeredUsers;

    public Library() {
        this.avalibleObjects = new TreeSet<>();
        this.rentedObjects = new PriorityQueue<>();
        this.registeredUsers = new ArrayList<>();
    }

    public T searchObjectByName(String name) {
        T searchedObject = avalibleObjects.stream()
                .filter(object -> object.getName().equals(name))
                .findFirst().orElse(null);

        System.out.println(searchedObject);

        return searchedObject;
    }

    public void rentObject(User renteringUser, T objectForRent) {
        Iterator<T> iterator = avalibleObjects.iterator();

        while(iterator.hasNext()) {
            T currentObject = iterator.next();

            if (currentObject.equals(objectForRent)) {
                currentObject.setAmount(currentObject.getAmount() - 1);
                if (currentObject.getAmount() <= 0) {
                    iterator.remove();
                }
                rentedObjects.add(currentObject);

                User userWhoRented = registeredUsers.stream().filter(user -> user.getId().equals(renteringUser.getId())).findFirst().orElse(null);
                if(userWhoRented != null) {
                    userWhoRented.getRentedObjects().add(currentObject);
                    System.out.println("Object rented!");
                } else {
                    System.out.println("This user wasn't registered!");
                }
            }
        }
    }

    public void refoundObject(User userWhoRented, T objectForRent) {
        Iterator<T> iterator = rentedObjects.iterator();

        while (iterator.hasNext()) {
            T currentObject = iterator.next();

            if (currentObject.equals(objectForRent)) {
                rentedObjects.remove(currentObject);
                userWhoRented.getRentedObjects().remove(currentObject);
                avalibleObjects.add(currentObject);

                System.out.println("Object refounded!");
            }
        }
    }

    public void objectsListing() {
        for (T avalibleObject : avalibleObjects) {
            System.out.println(avalibleObject.getName());
        }
    }

    public void registerNewObject(T object) {
        if (object != null) {
            avalibleObjects.add(object);
            System.out.println("This object was registered");
        } else {
            System.out.println("Invalid Object!");
        }
    }

    public void registerNewUser(User user) {
        if (user != null) {
            registeredUsers.add(user);
        } else {
            System.out.println("Invalid User!");
        }
    }
}
