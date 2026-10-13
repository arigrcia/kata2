# Kata 2 - Ingeniería del Software 2

Microproyecto en Java con IntelliJ para practicar la entrada y salida de datos
con streams.

El programa lee un dataset de empleados en formato TSV desde una URL usando un
`InputStream`, convierte cada línea en un `Employee` (un record con nombre y
género) y los muestra por consola. El género es un enum `Gender`.

La rama `master` tiene la versión final y `develop` es la rama de trabajo.
Hice la kata tres veces en días distintos: la primera en `develop` (11/10), la
segunda en `develop-2` (12/10) y la tercera en `develop-3` (13/10), que es la
versión final. En la tercera introduje una variación pequeña: cuando el género
viene vacío, `Gender.from` devuelve `Unknown` en vez de `null`.

Vídeo explicativo: [enlace al vídeo]