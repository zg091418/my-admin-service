package com.alienlab.my.entity;

import javax.persistence.*;

@Entity
@Table(name = "saveinfo")
public class SaveInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ReaderID")
    private String readerID;

    @Column(name = "LibraryID")
    private String libraryID;

    public String getReaderID() {
        return readerID;
    }

    public void setReaderID(String readerID) {
        readerID = readerID;
    }

    public String getLibraryID() {
        return libraryID;
    }

    public void setLibraryID(String libraryID) {
        libraryID = libraryID;
    }
}
