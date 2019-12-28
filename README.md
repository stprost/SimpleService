
## Сборка и Запуск
    git clone https://github.com/stprost/SimpleService.git
    gradle startService

## Пример работы

    request: curl http://localhost:8080?year=2016
    response: {"errorCode":200,"year":"12/09/2016"}
    
    request: curl http://localhost:8080?year=2015
    response: {"errorCode":200,"year":"13/09/2015"}
    
    request: curl http://localhost:8080?year=200
    response: {"errorCode":1,"year":"WRONG_FORMAT"}
        
    request: curl http://localhost:8080?year=2014A
    response: {"errorCode":1,"year":"WRONG_FORMAT"}
