# ReadMe
### Workflow

[![workflow](https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/actions/workflows/main.yml/badge.svg)](https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/actions/workflows/main.yml)


### Master 

![GitHub Workflow Status (branch)](https://img.shields.io/github/actions/workflow/status/Hlyan-Pyae-40524301/DevOpsGp1/main.yml?banch=master)

[![Build Status](https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/actions/workflows/main.yml/badge.svg?branch=master)](https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/actions?query=branch%3Amaster)


### Develop

![GitHub Workflow Status (branch)](https://img.shields.io/github/actions/workflow/status/Hlyan-Pyae-40524301/DevOpsGp1/main.yml?banch=develop)

[![Build Status](https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/actions/workflows/main.yml/badge.svg?branch=develop)](https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/actions?query=branch%3Adevelop)


### License

[![LICENSE](https://img.shields.io/github/license/Hlyan-Pyae-40524301/DevOpsGp1.svg?style=flat-square)](https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/LICENSE)


### Releases
[![Releases](https://img.shields.io/github/release/Hlyan-Pyae-40524301/DevOpsGp1/all.svg?style=flat-square)](https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/releases)


### Code coverage of test for master
[![codecov](https://codecov.io/gh/Hlyan-Pyae-40524301/DevOpsGp1/branch/master/graph/badge.svg?token=9AKL48BO18)](https://codecov.io/gh/Hlyan-Pyae-40524301/DevOpsGp1)

Setting up our development environment for the module is the goal of this lab. The majority of the tools we will put up today are among the many that we will use in the module. The systems we'll employ are:

Java

IntelliJ,

GitHub,

Maven, and

Docker

These offer a cutting-edge environment for the creation and distribution of software. Having everything set up properly is essential since these tools will support the module's evaluation.

# Introduction

The role of our team members are –

Ye Thiha Oo (Project Owner) – create repo and issues , Unit Test, Integration test, Query and Zube

Hlyan Pyae (Scrum Master) – Github set up , Query, Unit Testing and Integration test , Deploying , fixed PMD violation, Update GitHub action

Kaung Khant (Team Member) – README and Used Case, Query, Unit Test and Integration test, Bug Report

Zaw Ye Myat (Team Member) – Code of Conduct, Used Case, Query, Unit Test, Integration test and Bug Report


Kanban Board

https://zube.io/devops-cw/group-1/w/devops-coursework/kanban

| Name        | Role          | Code Review 1 | Code Review 2 | Code Review 3 | Code Review 4 | Code Review 5 |
|-------------|---------------|---------------|---------------|---------------|---------------|---------------|
| Ye Thiha Oo | Product Owner | 24            | 26            | 24            | 25            | 24            |
| Hlyan Pyae  | SCRUM Master  | 28            | 26            | 29            | 25            | 26            |
| Zaw Ye Myat | Team Member   | 24            | 24            | 24            | 25            | 26            |
| Kaung Khant | Team Member   | 24            | 24            | 23            | 25            | 24            |

> All Requirements are met

Requirement Check

| ID | Name                                                                                                                                                                                               | Met   | Image                                                                                                                        |
|----|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:------|------------------------------------------------------------------------------------------------------------------------------|
| 1  | All the countries in the world organised by largest population to smallest.                                                                                                                        | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/1.PNG" alt="Image Description" width="1000"/>  |
| 2  | All the countries in a continent organised by largest population to smallest.                                                                                                                      | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/2.PNG" alt="Image Description" width="1000"/>  |
| 3  | All the countries in a region organised by largest population to smallest.                                                                                                                         | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/3.PNG" alt="Image Description" width="1000"/>  |
| 4  | The top N populated countries in the world where N is provided by the user.                                                                                                                        | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/4.PNG" alt="Image Description" width="1000"/>  |
| 5  | The top N populated countries in a continent where N is provided by the user.                                                                                                                      | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/5.PNG" alt="Image Description" width="1000"/>  |
| 6  | The top N populated countries in a region where N is provided by the user.                                                                                                                         | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/6.PNG" alt="Image Description" width="1000"/>  |
| 7  | All the cities in the world organised by largest population to smallest.                                                                                                                           | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/7.PNG" alt="Image Description" width="1000"/>  |
| 8  | All the cities in a continent organised by largest population to smallest.                                                                                                                         | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/8.PNG" alt="Image Description" width="1000"/>  |
| 9  | All the cities in a region organised by largest population to smallest.                                                                                                                            | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/9.PNG" alt="Image Description" width="1000"/>  |
| 10 | All the cities in a country organised by largest population to smallest.                                                                                                                           | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/10.PNG" alt="Image Description" width="1000"/> |
| 11 | All the cities in a district organised by largest population to smallest.                                                                                                                          | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/11.PNG" alt="Image Description" width="1000"/> |
| 12 | The top N populated cities in the world where N is provided by the user.                                                                                                                           | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/12.PNG" alt="Image Description" width="1000"/> |
| 13 | The top N populated cities in a continent where N is provided by the user.                                                                                                                         | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/13.PNG" alt="Image Description" width="1000"/> |
| 14 | The top N populated cities in a region where N is provided by the user.                                                                                                                            | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/14.PNG" alt="Image Description" width="1000"/> |
| 15 | The top N populated cities in a country where N is provided by the user.                                                                                                                           | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/16.PNG" alt="Image Description" width="1000"/> |
| 16 | The top N populated cities in a district where N is provided by the user.                                                                                                                          | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/15.PNG" alt="Image Description" width="1000"/> |
| 17 | All the capital cities in the world organised by largest population to smallest.                                                                                                                   | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/17.PNG" alt="Image Description" width="1000"/> |
| 18 | All the capital cities in a continent organised by largest population to smallest.                                                                                                                 | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/18.PNG" alt="Image Description" width="1000"/> |
| 19 | All the capital cities in a region organised by largest to smallest.                                                                                                                               | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/19.PNG" alt="Image Description" width="1000"/> |
| 20 | The top N populated capital cities in the world where N is provided by the user                                                                                                                    | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/20.PNG" alt="Image Description" width="1000"/> |
| 21 | The top N populated capital cities in a continent where N is provided by the user.                                                                                                                 | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/21.PNG" alt="Image Description" width="1000"/> |
| 22 | The top N populated capital cities in a region where N is provided by the user.                                                                                                                    | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/22.PNG" alt="Image Description" width="1000"/> |
| 23 | The population of people, people living in cities, and people not living in cities in each continent.                                                                                              | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/23.PNG" alt="Image Description" width="1000"/> |
| 24 | The population of people, people living in cities, and people not living in cities in each region.                                                                                                 | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/24.PNG" alt="Image Description" width="1000"/> |
| 25 | The population of people, people living in cities, and people not living in cities in each country.                                                                                                | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/25.PNG" alt="Image Description" width="1000"/> |
| 26 | The population of the world.                                                                                                                                                                       | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/26.PNG" alt="Image Description" width="1000"/> |
| 27 | The population of a continent.                                                                                                                                                                     | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/27.PNG" alt="Image Description" width="1000"/> |
| 28 | The population of a region.                                                                                                                                                                        | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/28.PNG" alt="Image Description" width="1000"/> |
| 29 | The population of a country.                                                                                                                                                                       | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/29.PNG" alt="Image Description" width="1000"/> |
| 30 | The population of a district.                                                                                                                                                                      | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/30.PNG" alt="Image Description" width="1000"/> |
| 31 | The population of a city.                                                                                                                                                                          | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/31.PNG" alt="Image Description" width="1000"/> |
| 32 | the number of people who speak the following the following languages from greatest number to smallest, including the percentage of the world population Chinese, English, Hindi, Spanish, Arabic.  | Yes   | <img src="https://github.com/Hlyan-Pyae-40524301/DevOpsGp1/blob/master/images/32.PNG" alt="Image Description" width="1000"/> |



# Aim

The aim of DevOps with group is to bring individuals together to collaborate towards a common goal. It encourages teamwork, idea sharing, division of labor, skill development, time management, conflict resolution, and presentation skills. The goal is to leverage collective abilities for success and personal growth.

# Conclusion

At the end of this, we made these steps that are...

GitHub project for coursework set-up.

Product Backlog created.

Project builds to self-contained JAR with Maven.

Dockerfile for project set-up and works.

GitHub Actions for project set-up and build is working using JAR, and Docker

Correct branches for GitFlow workflow created - includes master, develop, and release branches.

First release created on GitHub.

Code of Conduct defined.


