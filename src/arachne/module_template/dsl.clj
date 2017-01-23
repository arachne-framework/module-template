(ns arachne.module-template.dsl
 (:require [arachne.core.config :as cfg]
           [arachne.core.util :as util]
           [arachne.core.config.script :as script :refer [defdsl]]
           [arachne.core.config.specs :as ccs]
           [clojure.spec :as s]
           [arachne.error :as e :refer [deferror error]]
           [clojure.string :as str]
           [arachne.core.dsl :as core]))


