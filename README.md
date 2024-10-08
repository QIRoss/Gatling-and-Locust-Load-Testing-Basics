# Gatling and Locust Basics

Studies based in day 39-40 of 100 Days System Design for DevOps and Cloud Engineers.

https://deoshankar.medium.com/100-days-system-design-for-devops-and-cloud-engineers-18af7a80bc6f

Days 31–40: Scalability and Performance Optimization

Day 39–40: Conduct advanced performance tuning and load testing using tools like Gatling or Locust.

## Project Overview

This project provides practical insights into how DevOps and Cloud Engineers can use these tools to monitor application performance and improve system scalability in real-world environments.

* Gatling: Known for its ability to handle large-scale testing with high concurrency and low memory usage, Gatling is used to simulate multiple virtual users interacting with the FastAPI service.

* Locust: A flexible and Python-friendly load testing tool, Locust is used to define user behavior, simulate concurrent users, and gather performance metrics, all from a simple Python-based setup.

## Usage:

```
docker-compose up --build
```

If you want to test Locust:
```
cd locust
pip install locust
locust -f locustfile.py --host=http://localhost:8000
```
Browse to http://localhost:8089

## Author
This project was implemented by [Lucas de Queiroz dos Reis][2]. It is based on the Day 23–24: Automate multi-environment setups using Terraform and Ansible dynamic inventories from the [100 Days System Design for DevOps and Cloud Engineers][1].

[1]: https://deoshankar.medium.com/100-days-system-design-for-devops-and-cloud-engineers-18af7a80bc6f "Medium - Deo Shankar 100 Days"
[2]: https://www.linkedin.com/in/lucas-de-queiroz/ "LinkedIn - Lucas de Queiroz"