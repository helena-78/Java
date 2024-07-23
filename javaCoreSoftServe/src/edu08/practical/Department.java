package edu08.practical;

public class Department implements Cloneable {
    private String name;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public Department clone() {
        try {
            Department clone = (Department) super.clone();
            if (this.address != null) {
                clone.address = (Address) this.address.clone();
            }
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


    public class Address implements Cloneable {
        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public int getBuilding() {
            return building;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }

        @Override
        public Address clone() {
            try {
                return (Address) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }

    public static void main(String[] args) {
        Department department = new Department();
        Department.Address address = department.new Address("Stockholm", "Raatuse", 96);
        department.setName("Marketing");
        department.setAddress(address);

        Department department1 = (Department) department.clone();
        System.out.println("Original: " + department.getAddress().getCity() + " "
                + department.getAddress().getStreet() + " "
                + department.getAddress().getBuilding() + ", " + department.getName());
        System.out.println("Clone: " + department1.getAddress().getCity() + " "
                + department1.getAddress().getStreet() + " "
                + department1.getAddress().getBuilding() + ", " + department1.getName());

        department1.getAddress().setCity("Krakow");

        System.out.println("*".repeat(10));
        System.out.println("Original: " + department.getAddress().getCity() + " "
                + department.getAddress().getStreet() + " "
                + department.getAddress().getBuilding() + ", " + department.getName());
        System.out.println("Clone: " + department1.getAddress().getCity() + " "
                + department1.getAddress().getStreet() + " "
                + department1.getAddress().getBuilding() + ", " + department1.getName());

    }
}

