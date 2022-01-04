--
-- File generated with SQLiteStudio v3.3.3 on Mon Dec 20 10:32:09 2021
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: Bike
CREATE TABLE Bike (
    BikeId      INTEGER       PRIMARY KEY AUTOINCREMENT,
    Type        NVARCHAR (50) NOT NULL,
    Producer    NVARCHAR (50) NOT NULL,
    Deposit     INTEGER       NOT NULL,
    Image       TEXT          NOT NULL,
    ParkingID   INTEGER       NOT NULL,
    IsAvailable BOOLEAN       NOT NULL,
    CONSTRAINT fk_parkingID FOREIGN KEY (
        ParkingID
    )
    REFERENCES Parking (ID) 
);


-- Table: Card
CREATE TABLE Card (
    ID          INTEGER      PRIMARY KEY AUTOINCREMENT,
    CardCode    VARCHAR (15) NOT NULL,
    Owner       VARCHAR (50) NOT NULL,
    Cvvcode     VARCHAR (12) NOT NULL,
    DateExpired VARCHAR (12) NOT NULL
);


-- Table: EBike
CREATE TABLE EBike (
    BikeId           INTEGER      PRIMARY KEY,
    MaxSpeed         INTEGER      NOT NULL,
    RemainingBattery INTEGER      NOT NULL,
    LicensePlate     VARCHAR (15),
    CONSTRAINT fk_bikeID FOREIGN KEY (
        BikeId
    )
    REFERENCES Bike (BikeId) 
);


-- Table: Parking
CREATE TABLE Parking (
    ID      INTEGER        PRIMARY KEY AUTOINCREMENT,
    Address NVARCHAR (300) NOT NULL,
    Name    NVARCHAR (100) NOT NULL
);


-- Table: PaymentTransaction
CREATE TABLE PaymentTransaction (
    ID        VARCHAR (50) PRIMARY KEY,
    CardCode  VARCHAR (15) NOT NULL,
    Content   TEXT         NOT NULL,
    Amount    INTEGER      NOT NULL,
    CreateAt  DATE         NOT NULL,
    Command   VARCHAR (20) NOT NULL,
    IDinvoice INTEGER      NOT NULL,
    CONSTRAINT fk_invoice FOREIGN KEY (
        IDinvoice
    )
    REFERENCES RentalInvoice (IDinvoice),
    CONSTRAINT fk_cardcode FOREIGN KEY (
        CardCode
    )
    REFERENCES Card (Cardcode) ON UPDATE CASCADE
);


-- Table: RentalInvoice
CREATE TABLE RentalInvoice (
    IDinvoice   INTEGER   PRIMARY KEY AUTOINCREMENT,
    PhoneNumber CHAR (10) NOT NULL,
    IDbike      INTEGER   NOT NULL,
    Start       DATETIME  NOT NULL,
    State       INTEGER   NOT NULL,
    Finish      DATETIME,
    TotalAmount INTEGER,
    CONSTRAINT fk_BikeID FOREIGN KEY (
        IDbike
    )
    REFERENCES Bike (BikeId),
    CONSTRAINT fk_phonenumber FOREIGN KEY (
        PhoneNumber
    )
    REFERENCES User (PhoneNumber) 
);


-- Table: User
CREATE TABLE User (
    PhoneNumber CHAR (10)     PRIMARY KEY,
    Password    VARCHAR (16)  NOT NULL,
    Name        NVARCHAR (30) NOT NULL
);


COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
