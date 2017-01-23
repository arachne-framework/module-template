(ns arachne.module-template
  (:require [arachne.core.config :as cfg]
            [arachne.module-template.schema :as schema]))

(defn schema
  "Return the schema for this module"
  []
  schema/schema)

(defn configure
  "Configure phase for this module"
  [cfg]
  cfg)
