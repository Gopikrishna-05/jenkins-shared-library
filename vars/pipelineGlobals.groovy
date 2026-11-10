def getAccountID(String environment){
    switch(environment) { 
        case 'dev': 
            return "945488516062"
        case 'qa':
            return "945488516062"
        case 'uat':
            return "945488516062"
        case 'pre-prod':
            return "945488516062"
        case 'prod':
            return "945488516062"
        default:
            return "nothing"
    } 
}