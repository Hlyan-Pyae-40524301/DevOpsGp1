---
name: Bug 2 report
about: Incorrect Total Population Output in Each Continent from GitHub Query
title: BUG2
labels: bug
assignees: ''

---

**Describe the bug**
When running a query to retrieve the total population in each continent using GitHub Actions, the output is not as expected. The query attempts to access the total population directly from the "country" table without using a variable in the "country.jav" file. As a result, the output might not be accurate, leading to incorrect calculations and inconsistent data.

**To Reproduce**

1. Access the GitHub repository containing the codebase and GitHub Actions workflows.
2. Review the SQL query used in the GitHub Actions workflow to obtain the total population in each continent.
3. Observe the query execution results and check if the output is consistent and matches the actual population data.

**Expected behavior**
The query should provide accurate total population values for each continent, considering the correct data from the "country.jav" file. The use of a variable in the "country.jav" file will ensure the query accesses the accurate population values and calculates the total population correctly.

**Screenshots**
Before solve error
After solve error

**Desktop (please complete the following information):**
 - OS: [Windows 10]
 - Browser [Firefox]
 - Version [MSI]
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
**Additional context**
.    The incorrect total population output affects the reliability of the data and analysis based on the query results.
.    The absence of a variable in the "country.jav" file might be the root cause of the discrepancy in population data.
.    The bug is not caused by GitHub Actions itself but rather by the query and data source used within the workflow.
.    The workflow might require modification to introduce the correct variable from the "country.jav" file to fetch accurate population data.
