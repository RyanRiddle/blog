(ns blog.core-test
  (:require [clojure.test :refer :all]
            [blog.core :refer :all]))

(deftest as-test
  (testing "as inlines the tag and its contents"
    (is
		(= "<h1>Super Cool Header</h1>"
			(as h1 "Super Cool Header")))))

(deftest inside-test
	(testing "inside puts tags and contents on new lines"
		(is 
			(= "\n<p>\nThis is a paragraph.\n</p>\n"
				(inside p "This is a paragraph.")))))
