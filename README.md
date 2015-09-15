# SpringMVC
Project for learning Spring MVC following not strictly Spring MVC Tutorials  on youtube by 'gontuseries' (www.youtube.com/watch?v=iCQspqBpOB0) 

## Commits / Tutorial Outline

### Step-9 
- [video part 9][mvc-video-9] 
- add method put2 to UserController controller with @PathVariable using map 

### Step-10 
- [video part 10][mvc-video-10] 
- create from for creating user CreateUserFrom.jsp
- Create success page for succesfull creation of new user CreateUserSuccess.jsp
- Add method UserController#getCreateForm returning CreateUserFrom
- Add method UserController#put3 accepting params using @RequestParam 
- Add method UserController#put4 accepting params using @RequestParam map for all parameters

### Step-11 - Spring MVC Tutorials 11 - Understanding @ModelAttribute Annotation 01 (using on a method argument)
- [video part 11][mvc-video-11] 
- show usage of passing an object to the form with and withot @ModelAttribute
- Add new entity for working car and related files: CarController.java, CreateCarForm.jsp, CreateCarSuccess.jsp, Car.java
- Add method CarController#create showing manual binding request params to object and than to form
- Add method CarController#create2 showing equivalent of CarController#create with using of @ModelAttribute that leads to drastically reduce of code writing and provide automatic binding ( if property names match )

[mvc-video-9]: https://www.youtube.com/watch?v=dDWNTR0-rns
[mvc-video-10]:https://www.youtube.com/watch?v=jCsbrk01V_4
[mvc-video-11]:https://www.youtube.com/watch?v=stGq8lnEFlM
