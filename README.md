## News-API

Application takes incoming requests for news articles. It will take the given parameters and query the Mail API Org 
(https://newsapi.org/) for the relevant news.  There are two types of searches.  The first is a search through every 
article published by over 5,000 news sources and blogs in the last 5 years. The second is a search of the current news 
headlines.  

### Everything
The searches for relevant topics relies on a set of pre-defined query parameters.  These are used to query the News API
organisation's API.  The set of possible parameters are list on their Everything web page 
(https://newsapi.org/docs/endpoints/everything).  Here is a summary:

#### apiKey: An existing key is being used in the background so one is not needed for any query.

#### q: Keywords or phrases to search for in the article title and body.

#### searchIn: The fields to restrict your q search to.

#### sources: A comma-seperated string of identifiers for the news sources or blogs you want headlines from. 

#### domains: A comma-seperated string of domains.

#### excludeDomains: A comma-seperated string of domains to remove from the results.

#### from: A date and optional time for the oldest article allowed. 

#### to: A date and optional time for the newest article allowed. 

#### language: The  code of the language you want to get headlines for. 

#### sortBy: The order to sort the articles in. 

#### pageSize: The number of results to return per page.

#### page: Use this to page through the results.


### Topic Headlines

A search of headline news of seven categories over fifty countries and over a hundred top publications and blogs.  The 
query parameters are used to selectively define the selection of the relevant articles.  See the Topic Headline page 
for the details on the query parameters that can be used (https://newsapi.org/docs/endpoints/top-headlines).  Here is a 
brief summary: 

#### apiKey: An existing key is being used in the background so one is not needed for any query.

#### country: The country you want to get headlines for. 

#### category: The category you want to get headlines for. 

#### source: Identifiers for the news sources or blogs you want headlines from. 

#### q: Keywords or a phrase to search for.

#### pageSize: The number of results to return per page.


#### page: Use this to page through the results.

### Response object

The response from the Everthing and Topic Headlines query each produce a response in the same format.  The key element 
is the set of articles each of which is a summary of each of the news articles that a match to the search criterion.  
The details for the response can be found in both the Everything and Topic Headlines pages.  Here is a summary of the 
components:  

#### status: If the request was successful or not. 

#### totalResults: The total number of results available for your request.

#### articles: The set of news articles.

Where each articles may contain the following components

#### source: The identifier id and a display name name for the source this article came from.

#### author: The author of the article

#### title: The headline or title of the article.

#### description: A description or snippet from the article.

#### url: The direct URL to the article.

#### urlToImage: The URL to a relevant image for the article.

#### publishedAt: The date and time that the article was published.

#### content: The unformatted content of the article.

### MongoDB

### Docker
To use Docker the jar file will need to be created and is expected to be named NewsAPI-0.0.1-SNAPSHOT.jar. To create 
the image use the command "docker build -t newsapi_image:latest ." at the root of the project folder.
To run the container the MongoDB needs to first be started. Use the command "docker run newsapi_image:latest 
-p 8080:8080 --name newsapi". 

### Docker Compose 


### Kubernetes

### Notes - Summary of progress on project

| Date     | Summary                                                                                                                                                 |
|:---------|:--------------------------------------------------------------------------------------------------------------------------------------------------------|
| 23/01/25 | Review/study of topics: Abstraction; Generics; Lambda Expression; and Spring Boot.                                                                      |
| 24/01/25 | Setting-up of environment including: IDE (IntelliJ); Builder (Maven); Testing (Postman); Mail API Org access key .  Created a basic version of the app. |
| 27/01/25 | Creation of the project repository.  Started on the creation of <br/>the data types.                                                                    |
| 28/01/25 | Continued with work on Controller, Service and data type, README file,                                                                                  |
| 29/01/25 | Review of Streams, & Regex. More on README and refining existing code.                                                                                  |
| 30/01/25 | Mongodb Udemy course                                                                                                                                    |
| 31/01/25 | Mongodb Udemy course                                                                                                                                    |
| 03/02/25 | Mongodb Udemy course                                                                                                                                    |
| 04/02/25 | fix query bug, refactor, prep for db                                                                                                                    |
| 05/02/25 | integrate mongodb into app                                                                                                                              |
| 06/02/25 | Docker/K8s Udemy Course                                                                                                                                 |
| 10/02/25 | Docker/K8s Udemy Course                                                                                                                                 |
| 11/02/25 | Docker/K8s Udemy Course                                                                                                                                 |
| 12/02/25 | Dockerfile for app                                                                                                                                      |
| 13/02/25 | Install K8s locally, K8s files                                                                                                                          |
| 14/02/25 | K8s files                                                                                                                                               |
| 17/02/25 | K8s mongo connection bug, read-up on Docker Swarm                                                                                                       |
| 17/02/25 | Continue with read-up on Docker Swarm & Ansible                                                                                                         |
| 18/02/25 | Refactor in version numbers into Maven                                                                                                                  |
| 19/02/25 | Go Udemy course                                                                                                                                         |
| 20/02/25 | Go Udemy course                                                                                                                                         |
| 21/02/25 | Go Udemy course                                                                                                                                         |
| 24/02/25 | Go Udemy course                                                                                                                                         |
| 25/02/25 | Go Udemy course                                                                                                                                         |
| 26/02/25 | Go Udemy course                                                                                                                                         |
| 27/02/25 | Go Udemy course                                                                                                                                         |
| 28/02/25 | Go Udemy course/VS Code/Jenkins                                                                                                                         |
| 03/03/25 | Study Jenkins/Office Admin   
| 04/03/25 | Study Jenkins/ 
| 05/03/25 | Study Jenkins/ Maven
| 06/03/25 | Study Maven/Git/Spring
| 07/03/25 | Implement SSH, GPG, Study Spring 
test


### Work TODO List: 
* Lombok is not reliably providing getters and setters.  
Temporarily will create the getter and setters in the related classes.    
fix: search for News API client no working <br/>     
* Exceptions for News API queries & Mongo  <br/>     
* Error handling <br/>     
* Unit tests <br/>     
* e2e tests <br/>
* Incorporate use of environment variables <br/>
* Dockerfile <br/>
&emsp; * multistage build <br/>
&emsp; * mongodb for  <br/>
Docker * Compose <br/>
&emsp; * version for development <br/>
&emsp; * version of production <br/>

* VSCode  <br/>

* Docker Swarm <br/>
* GoLang <br/>
* Jenkins Pipeline <br/>
&emsp; * study documnetation<br/>
&emsp; * Jenkinsfile for build stage <br/>
* Java/Spring <br/>
* Bitbucket <br/>
* Ansible <br/>
* Maven <br/>
&emsp; * refactor to have version numbers in properties block
* App
    * Frontend
&emsp; * web page to request newsfeed
&emsp; * react frontend
    * 
    