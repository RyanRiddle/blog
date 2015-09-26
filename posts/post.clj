(ns posts
	(require [blog.core :as blog]))

(blog/entry "first_post"
	"Welcome to my blog!"

	(blog/inside p "Hello! I am Ryan Riddle.  And this is my blog :)")

	(blog/inside p "I generated this post by using a clojure program I wrote.  I tried using Ghost, Jekyll, and some others.  But I had to resolve too many dependencies and learn too many ways of doing things to use them.")

	(blog/inside p "My clojure program has little overhead.  I write my post in the form of a clojure program and it generates html.  I will post the source soon.  Use it if you like :)  I probably won't add features to accomodate you though.  I want it to stay simple."))
