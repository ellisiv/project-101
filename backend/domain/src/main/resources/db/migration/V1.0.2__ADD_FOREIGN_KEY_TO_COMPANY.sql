--  Add a foreign key column to employee-table refrencing company-table
ALTER TABLE EMPLOYEE
ADD CONSTRAINT COMPANY_TO_EMPLOYEE
FOREIGN KEY (COMPANY_ID) REFERENCES COMPANY(ID);
