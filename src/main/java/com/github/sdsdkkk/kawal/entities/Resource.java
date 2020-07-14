package com.github.sdsdkkk.kawal.entities;

import com.github.sdsdkkk.kawal.exceptions.InvalidResourceException;

public class Resource {
    public String identification;

    public Resource(String identificationStr) {
        if (!validateIdentification(identificationStr)) {
            return;
        }

        identification = identificationStr;
    }

    public boolean validateIdentification(String identificationStr) {
        if (identificationStr.split(":").length != 2) {
            return false;
        }

        return true;
    }

    public String identificationMethod() {
        return identification.split(":")[0];
    }

    public String identificationReference() {
        return identification.split(":")[1];
    }

    public String identification() {
        return identification;
    }
}