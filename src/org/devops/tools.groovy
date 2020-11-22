package org.devops

//格式化输出
def PrintMes(value,color){
    BLACK='\e[1;30m'
    RED='\e[1;31m'
    GREEN='\e[1;32m'
    YELLOW='\e[1;33m'
    BLUE='\e[1;34m'
    PURPLE='\e[1;35m'
    PINK='\e[1;36m'
    WHITE='\e[1;37m'
    END='\e[0m'

    colors = ['red'   : "${BLACK}${value}${END}",
              'blue'  : "${BLUE}${value}${END}",
              'green' : "${GREEN}${value}${END}",
              'yellow': "${YELLOW}${value}${END}",
              'purple': "${PURPLE}${value}${END}",
              'PINK'  : "${PINK}${value}${END}"
             ]
    ansiColor('xterm') {
        println(colors[color])
    }
}
