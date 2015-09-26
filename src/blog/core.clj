(ns blog.core)

(defmacro as [tag contents]
	"Places the contents between an open and close tag (inline)."
	`(format "<%s>%s</%s>" '~tag ~contents '~tag))

(defmacro inside [tag contents]
	"Places the open tag, the contents, and the close tag on separate lines."
	`(str
			(format "\n<%s>\n" '~tag)
			~contents
			(format "\n</%s>\n" '~tag)))

(defn html-file [name]
	(format "%s.html" name))

(defn entry [filename ti & body]
	(with-open 
		[w (clojure.java.io/writer (html-file filename) :append false)]
		(.write w
			(inside html
				(str
					(inside head 
						(as title ti))
					(inside body
						(apply 
							#'str
							(cons 
								(as h1 ti) body))))))))
