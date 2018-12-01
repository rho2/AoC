import os
import strutils
import sequtils
import sets

when isMainModule:
  let inputs = readFile(paramStr(1)).splitLines.map(parseInt)
  
  var n = 0
  for i in inputs:
    n += i
  echo n

  var list = initSet[128]()

  n = 0
  var c = 0
  list.incl(0)
  while true:
    n += inputs[c]
    if(list.contains(n)):
      break

    list.incl(n)

    if(c+1 < len(inputs)):
      c+=1
    else:
      c = 0
  
  echo n