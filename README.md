# quotes

`popular book quotes`
 in our app we Implemented a class that uses Gson to parse a Jason file. from that file we showed a random quote and the name of the author when ever we ran the app. 
to do so we had to:
- we used an external library - Gson that enabled us to parse the jason file. 
steps: 
1. you will need the right dependance that goes with java language
it is provided in this link [https://github.com/google/gson]
for gradle use, 

`dependencies {
  implementation 'com.google.code.gson:gson:2.8.6'
}`

2. add the dependencies in the build gradle file.
3. synchronizes the java app to get the Gson dependency to work.
4. create a jason object and import it.


read the file using a filereader and provide the path for that file.

create a class with the properties you want to form the jason file. in this case it would be :
the author and the quote.
use the Gson.fromJason and create an instance from that class 

implement a random number generator to generate a number between zero and the length of the array of object you'll get form parsing  the jason file. 
and print the result. 
you will get a random quote each time you run the app. 


# lab-9 

`getDataFromApi`, a function that takes an API url, reads from that API by setting  a connection, an input stream and uses a buffer reader 

`BufferedReader` a function that takes in an the input stream and converts it to a file stream 

`getContent` a function that reads the file steam line by line and uses a string builder to convert it all to a string 

`getApiInfo` a function that creates an object from the ApiInfo using the data from the json 

`jsonFile`  reads json data from a file and converts it into an array of object from the JsonFileLines class 












