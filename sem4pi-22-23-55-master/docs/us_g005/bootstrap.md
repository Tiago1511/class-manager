# Bootstrap Documentation

## 1. Context

This documentation is for the bootstrap code that was added to the base code given. The bootstrap code consists of three
methods that are used to register new users with different roles.
## 2. Code

### 2.1. registerAdmin
````
private void registerAdmin(final String username, final String password, final String firstName,
final String lastName, final String email) {
final Set<Role> roles = new HashSet<>();
roles.add(BaseRoles.ADMIN);

registerUser(username, password, firstName, lastName, email, roles);
}

````
This method is used to register a new user with the "ADMIN" role. The method takes in the username, password,
first name, last name, and email address of the user to be registered. The method then creates a new set of roles, adds
the "ADMIN" role to the set, and passes the set to the registerUser method along with the user data.

### 2.2. registerStudent

````
private void registerStudent(final String username, final String password, final String firstName,
final String lastName, final String email) {
final Set<Role> roles = new HashSet<>();
roles.add(BaseRoles.STUDENT);

registerUser(username, password, firstName, lastName, email, roles);
}
````

This method is used to register a new user with the "STUDENT" role. The method takes in the username, password, first
name, last name, and email address of the user to be registered. The method then creates a new set of roles, adds the
"STUDENT" role to the set, and passes the set to the registerUser method along with the user data.

### 2.3. registerTeacher
````
private void registerTeacher(final String username, final String password, final String firstName,
final String lastName, final String email) {
final Set<Role> roles = new HashSet<>();
roles.add(BaseRoles.TEACHER);

registerUser(username, password, firstName, lastName, email, roles);
}
````
This method is used to register a new user with the "TEACHER" role. The method takes in the username, password, first
name, last name, and email address of the user to be registered. The method then creates a new set of roles, adds the
"TEACHER" role to the set, and passes the set to the registerUser method along with the user data.