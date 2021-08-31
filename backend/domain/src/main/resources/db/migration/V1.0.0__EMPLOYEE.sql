--  Create a table for Employee containing an ID, firstname, lastname and date of birth
CREATE TABLE EMPLOYEE
(
    ID                NUMBER(19) GENERATED BY DEFAULT AS IDENTITY,
    FIRST_NAME        VARCHAR2(50 CHAR) NOT NULL,
    LAST_NAME         VARCHAR2(50 CHAR) NOT NULL,
    DATE_OF_BIRTH     DATE NOT NULL,
    COMPANY_ID        NUMBER(19),
    CONSTRAINT EMPLOYEE_PK PRIMARY KEY (ID)
);