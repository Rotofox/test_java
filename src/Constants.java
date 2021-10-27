public enum Constants {
    CREATE_TABLE {
        public String toString() {
            return "CREATE TABLE employees (id INT, first_name VARCHAR(50), last_name VARCHAR(20));";
        }
    },
    FILL_TABLE {
        public String toString() {
            return "INSERT INTO employees SELECT * FROM CSVREAD('somecsv.csv');";
        }
    },
    SELECT_EMPLOYEE_547 {
        public String toString() {
            return "SELECT * FROM employees WHERE id='547';";
        }
    },
    SELECT_EMPLOYEE_WITH_ID {
        public String toString() {
            return "SELECT * FROM employees WHERE id IS NOT NULL;";
        }
    },
    CHANGE_LAST_NAME {
        public String toString() {
            return "UPDATE employees SET last_name Where id='548';";
        }
    },
    ADD_EMPLOYEE {
        public String toString() {
            return "INSERT INTO employees VALUES (9999, 'firstname', 'lastname');";
        }
    }
}
