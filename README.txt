
#Baseline to V002
gradle flywayBaseline -i -Pflyway.baselineVersion=002 -Pflyway.url=jdbc:postgresql://localhost:5532/polygon31?currentSchema=schema2 -Pflyway.user=admin -Pflyway.password=admin