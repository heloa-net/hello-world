#!/bin/bash
# Descobrindo se seu provedor de internet entrega o contratado

unset count;

for x in $(grep wlan0 /proc/net/dev); 
  do 
    count = $((count+1)); 
    case "$count" in 2|10)
    echo $x; 
    esac;
  done

#######################
# Método alternativo: #
#######################
#
#while:
#  do
#    awk '/wlan/{print $2" "$10}' /proc/net/dev
#    sleep1
#  done