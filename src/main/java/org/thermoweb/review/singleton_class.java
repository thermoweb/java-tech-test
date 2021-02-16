package org.thermoweb.review;

public class singleton_class {

    private singleton_class singleton;

    public singleton_class() {

    }

    public singleton_class get_Singleton() {
        if (singleton == null)  {
           singleton = new singleton_class();
           return singleton;
        } else if (singleton != null) {
            return singleton;
        }

        return null;
    }
}
