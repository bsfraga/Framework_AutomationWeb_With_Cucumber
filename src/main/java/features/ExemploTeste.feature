#language: pt

@BrunoFraga
Funcionalidade: Exemplo de uso do cucumber em portugues em conjunto com Selenium
  Eu quero acessar pagina do Google e então acessar pagina do Youtube

	@First
  Cenário: Acessar pagina do Google
    Dado que acesso a pagina do Google
    Então valido se a pagina do Google foi acessada
    
	@Last
  Cenário: Acessar pagina do Youtube
    Dado que acesso a pagina do Youtube
    Então valido se a pagina do Youtube foi acessada

