(ns excel-templates-example.portfolio-test
  (:require [excel-templates-example.portfolio :refer :all]
            [clojure.test :refer :all]
            [me.raynes.fs :as fs]))

(def template-xlsx "portfolio-template.xlsx")
(def result-xlsx "portfolio.xlsx")

(deftest excel-portfolio-report-xlsx-test
  (is (= nil (excel-portfolio-report template-xlsx result-xlsx)))
  #_(is (= (fs/exists? result-xlsx) true))
  #_(clojure.java.shell/sh "xdg-open" (str "resources/" template-xlsx)))

(def template-ods "portfolio-template.ods")
(def result-ods "portfolio.ods")

(deftest excel-portfolio-report-ods-test
  (is (= nil (excel-portfolio-report template-ods result-ods)))
  #_(is (= (fs/exists? result-ods) true))
  #_(clojure.java.shell/sh "xdg-open" (str "resources/" template-ods)))

(def template-calc-xlsx "portfolio-template-calc.xlsx")
(def result-calc-xlsx "portfolio-calc.xlsx")

(deftest excel-portfolio-report-calc-xlsx-test
  (is (= nil (excel-portfolio-report template-calc-xlsx result-calc-xlsx)))
  #_(is (= (fs/exists? result-calc-xlsx) true))
  #_(clojure.java.shell/sh "xdg-open" (str "resources/" template-calc-xlsx)))
