package OOPS.Advanced.relations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Room has no meaning outside a House
class Room {
    private String type; // e.g. "Bedroom", "Kitchen"
    private double areaSqFt;

    // Package-private or private constructor — prevents external creation
    Room(String type, double areaSqFt) {
        this.type = type;
        this.areaSqFt = areaSqFt;
    }

    public String getType() {
        return type;
    }

    public double getAreaSqFt() {
        return areaSqFt;
    }
}

// House OWNS Room — composition
class House {
    private String address;
    private List<Room> rooms; // owns these — created internally

    public House(String address) {
        this.address = address;
        this.rooms = new ArrayList<>();

        // Rooms created INSIDE House — not passed from outside
        rooms.add(new Room("Living Room", 400));
        rooms.add(new Room("Bedroom", 300));
        rooms.add(new Room("Kitchen", 200));
    }

    public void addRoom(String type, double area) {
        rooms.add(new Room(type, area)); // always created internally
    }

    public List<Room> getRooms() {
        return Collections.unmodifiableList(rooms);
    }
}

public class PartOfComposition {
    public static void main(String[] args) {
        // Usage — Room only exists as part of House
        House myHouse = new House("123 Main St");
        // Room cannot be created externally: new Room(...) — won't compile if private

        myHouse = null; // House destroyed — all its Rooms are destroyed with it ✅
        // No Room reference exists anywhere — GC collects everything

    }
}
