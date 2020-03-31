# springbootbackend

## Minikube
Problems:
  * hostPath des PersistentVolume muss angelegt sein, vor allem im Prallels Host!!!
  * Selektoren müssen gleich sein und nicht nur ähnlich
  * kubectl apply heilt nicht unbedingt eine falsche Config, Löschen der Objekte und Neuanlage nötig 
  
Offene Punkte:
  * hostPath des PersistentVolume muss **manuell** in MiniKube angelegt werden -> Wie automatisieren?? 
  * Best practice für Anwendung der Config-Änderung??
