public class WRM {
    Patient dh;

    //The constructor is already created for you
    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        Patient p = new Patient(id,name,age,bloodgroup,null,null);
        dh.next = p;
        p.prev = dh;
        p.next = dh;
        dh.prev = p;
    }

    public void servePatient() {
        //Patient temp = dh;
        Patient store = dh.next.next;
        dh.next = store;
        store.prev = dh;
    }

    public void showAllPatient() {
        Patient temp = dh.next;
        while( temp!=dh){
            System.out.println(temp.id + " " + temp.name + " " + temp.age + " " + temp.bloodGroup);
            temp = temp.next;
        }
    }

    public Boolean canDoctorGoHome() {
        if (dh.next == dh) {
            return true;
        } else {
            return false;
        }
    }

    public void cancelAll() {
         dh.next = dh;
         System.out.println("DR can go home");
    }


    public void reverseTheLine() {
        // To Do
    }

}