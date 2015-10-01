(def lst (list 7 8 9))

; double
(map  #(reduce + [% %] ) lst)

;different ways of writing double
#(reduce + [% %])
#(+ % %)
#(* 2 %)
#(partial * 2)