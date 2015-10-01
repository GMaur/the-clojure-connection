(def lst (list 7 8 9))

; double
(map  #(reduce + [% %] ) lst)

;different ways of writing double
#(reduce + [% %])
#(+ % %)
#(* 2 %)

#(partial * 2)

; applied to the right
boot.user=> ((partial / 1) 2 3)
; 1/6
boot.user=> ((partial / 1) 2 3 4)
; 1/24
boot.user=> ((partial / 1) 2 3 4 5)
; 1/120
boot.user=> ((partial / 1) 2 3 4 5 6)
; 1/720


