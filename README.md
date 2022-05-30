[![header][header-url]][header-link]

# Calculadora Java App
[![Project Version][version-image]][version-url]
[![Frontend][Frontend-image]][Frontend-url]
[![Backend][Backend-image]][Backend-url]

> Projeto de estudo

Calculadora simples com as quatro operações básicas da matemática.

---
## Author

**Roger de Azevedo** 

* *Meu perfil profissional no* [LinkedIn][linkedin-url]

## Showcase

Esse projeto foi desenvolvimedo para demonstrar:

* App em Adroid nativo
* Programado na linguagem Java
* Lib para calcular expressoes matemáticas [net.objecthunter:exp4j:0.4.8]

## Built With

* [Gradle](https://gradle.org/) - Dependency Management

## Release History

* 0.0.1
    * Initial work

## Expressão númerica

**1º Sinais de associação**

* 1º - () Parênteses;
* 2º - [] Colchetes;
* 3º - {} Chaves;

**2º Operações**

* 1º - Potência e/ou raiz;
* 2º - X e/ou / na ordem que aparece (da esquerda para direita)
* 3º - + e/ou - na ordem que aparece (da esquerda para direita)

Exemplo

```
8 / 2 (2 + 2) = ?
8 / 2 * 4                    * Resolve primeiro o Sinail de associação de () Parênteses
4 * 4                        * Resolve operador de Divisão / pq aparece primeiro
16
```


---

## Contributing

1. Fork it (<https://github.com/yourname/yourproject/fork>)
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request

<!-- Markdown link & img dfn's -->

[header-url]: github-template.png
[header-link]: https://github.com/alexandrerosseto

[repository-url]: https://github.com/alexandrerosseto/wbshopping

[cloud-provider-url]: https://wbshopping.herokuapp.com

[linkedin-url]: https://www.linkedin.com/in/alexandrerosseto

[wiki]: https://github.com/yourname/yourproject/wiki

[version-image]: https://img.shields.io/badge/Version-1.0.0-brightgreen?style=for-the-badge&logo=appveyor
[version-url]: https://img.shields.io/badge/version-1.0.0-green
[Frontend-image]: https://img.shields.io/badge/Frontend-Android-blue?style=for-the-badge
[Frontend-url]: https://img.shields.io/badge/Frontend-Android-blue?style=for-the-badge
[Backend-image]: https://img.shields.io/badge/Backend-Java-important?style=for-the-badge
[Backend-url]: https://img.shields.io/badge/Backend-Java-important?style=for-the-badge