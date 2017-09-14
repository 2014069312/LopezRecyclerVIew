package com.example.myrecycleviewdemo;

/**
 * Created by jessi on 9/14/2017.
 */

public class AndroidVersion {

    int logo;
    String codename, version, api, release;

    public AndroidVersion(int logo, String codename, String version, String api, String release) {
        this.logo = logo;
        this.codename = codename;
        this.version = version;
        this.api = api;
        this.release = release;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }
}
