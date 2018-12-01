import os
import strutils
import sequtils

when isMainModule:
  let inputs = readFile(paramStr(1)).splitLines.map(parseInt)
  
  var n = 0
  for i in inputs:
    n += i
  echo n