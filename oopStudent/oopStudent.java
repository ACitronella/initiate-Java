class Student{
    private String name;
    private String surName;
    private int[] birthDay = new Integer[3];
    private String[] oldSchool;
    private String address;
    private String[] favoriteSubject;
    private String[] knowProgrammingLanguage;
    private String ambition;
    

    public Student(String inputedName, String inputedSurName){//constuctor
        this.name = inputedName;
        this.surName = inputedSurName;
    }
    //a lot of getter and setter
    public void setName(String temp){
        this.name = temp;
    }
    
    public void setSurName(String temp){
        this.surName = temp;
    }

    public void setOldSchool(String[] temp){
        this.oldSchool = temp;
    }

    public void setAddress(String[] temp){
        this.address = temp;
    }

    public void setAmbition(String temp){
        this.ambition = temp;
    }

    public String getName(){
        return name;
    }
    
    public String getSurName(){
        return surName;
    }

    public String getOldSchool(){
        return oldSchool;
    }

    public String getAddress(){
        return address;
    }

    public void setBirthDay(int day, int month, int year){
        int[] temp = {day, month, year};
        this.birthDay = temp;
    }
    
    public String[] getProfile(){
        String[] temp = {name, surName, Integer.toString(birthDay[0]), Integer.toString(birthDay[1]), Integer.toString(birthDay[2]), address};
        return temp;
    }




}