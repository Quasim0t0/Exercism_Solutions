class Badge {
    public String print(Integer id, String name, String department) {
        //department = department.toUpperCase();
        if (id == null){
            if(department == null){
            return name + " - " + "OWNER";
            }
            else{
                department = department.toUpperCase();
                return name + " - " + department;
            }
        }
        else if(department == null){
            return "[" + id + "]" + " - " + name + " - " + "OWNER";
        }
        else{
            department = department.toUpperCase();

            return "[" + id + "]" + " - " + name + " - " + department;
        }
        
    }
}
