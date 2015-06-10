# -*- coding: utf-8 -*-

# Controller da aplicação
# Trabalho para avaliação EDA2
import random


def index():
    '''
    Formulario de entrada
    :return:
    '''
    templete = random.randint(1, 5)
    response.flash = "Layout " + str(templete)

    form = SQLFORM.factory(
        Field('select', label="Algoritmo", requires=IS_IN_SET(["MDC NAO RECURSIVO",
                                                               "MDC RECURSIVO",
                                                               "MAIOR NUMERO",
                                                               "QUICKSORT",
                                                               "BOLHA (lista Encadeada)"]))
    )
    submit = form.element('input', _type='submit')
    submit['_style'] = 'display:none;'

    if form.process().accepted:
        print form.vars

    return dict(form=form, templete=templete)


def teste():
    response.flash ="Parte Extra, ainda estou implementando (:"
    return dict()


def rec_mdc(a, b): return b if (a % b == 0) else rec_mdc(b, a % b)


def mdc(a, b):
    while True:
        if a % b == 0: return b
        a, b = b, a % b


def max_array(array):
    if len(array) == 1: return array[0]
    array[1] = array[0] if array[0] > array[1] else array[1]
    return max_array(array[1:])


def max_no_recursive():
    form = SQLFORM.factory(
        Field('a', label="Entrada A", requires=IS_INT_IN_RANGE(1, 100000)),
        Field('b', label="Entrada B", requires=IS_INT_IN_RANGE(1, 100000)),
        submit_button="Processar"


    )
    if form.process().accepted:
        valor = mdc(int(form.vars.a), int(form.vars.b))
        response.flash = valor
        return dict(form=form, valor=valor)
    return dict(form=form)


def max_recursive():
    form = SQLFORM.factory(
        Field('a', label="Entrada A", requires=IS_INT_IN_RANGE(1, 100000)),
        Field('b', label="Entrada B", requires=IS_INT_IN_RANGE(1, 100000)),
        submit_button="Processar"
    )
    if form.process().accepted:
        valor = mdc(int(form.vars.a), int(form.vars.b))
        response.flash = valor
        return dict(form=form, valor=valor)

    return dict(form=form)


def get_max():
    form = SQLFORM.factory(
        Field('lista', label="lista", requires=IS_NOT_EMPTY()),
        submit_button="Processar"
    )
    if form.process().accepted:
        try:
            Str = str(form.vars.lista).split(",")
            vetor = [int(n) for n in Str]
            valor = max_array(vetor)
            response.flash = valor
        except:
            response.flash = "ERRO, formato invalido, tente '1,2,3'"
            return dict(form=form)

        return dict(form=form, valor=valor)
    return dict(form=form)



def bolha():
    form = SQLFORM.factory(
        Field('lista', label="lista", requires=IS_NOT_EMPTY()),
        submit_button="Processar"
    )
    if form.process().accepted:
        try:
            Str = str(form.vars.lista).split(",")
            vetor = [int(n) for n in Str]
            lista = ListaPersonalizada()
            for i in vetor:
                lista.add(i)
            bubbleSort(lista)

            valor = []
            for i in lista:
                valor.append(i.valor)
            response.flash = valor
        except:
            response.flash = "ERRO, formato invalido, tente '1,2,3'"
            return dict(form=form)

        return dict(form=form, valor=valor)
    return dict(form=form)


def quicksort():
    form = SQLFORM.factory(
        Field('lista', label="lista", requires=IS_NOT_EMPTY()),
        submit_button="Processar"
    )
    if form.process().accepted:
        try:
            Str = str(form.vars.lista).split(",")
            vetor = [int(n) for n in Str]
            valor = ksort(vetor)
            response.flash = valor
        except:
            response.flash = "ERRO, formato invalido, tente '1,2,3'"
            return dict(form=form)

        return dict(form=form, valor=valor)
    return dict(form=form)


class ItensPersonalizados():
    def __init__(self, valor):
        """
        Objeto que contem o mapeamento direita e esquerda
        de cada item
        :param valor: Valor do item
        :return:
        """
        self.esquerda = 0
        self.direita = 0
        self.valor = valor


class ListaPersonalizada():
    """
    Gerenciador de itens, faz as operações basicas de lista
    e simula o funcionamento de uma lista em python usando objetos
    """

    def __init__(self):
        #Inicia objeto, inicia uma lista representativa
        self.emulaLista = list()

    def add(self, item):
        """
        Adiciona um item ao pacote especial
        apos adicionar ao pacote, todos os indices
        são atualizados
        :param item:
        :return:
        """
        item = ItensPersonalizados(item)
        self.emulaLista.append(item)
        esquerda =0
        direita = 1
        for e in self.emulaLista:
            e.esquerda = esquerda
            e.direita = direita
            esquerda = esquerda + 1
            direita = direita + 1
        self.emulaLista[-1].direita = 0

    def get(self, indice):
        """
        Get, retorna o item naquela posição
        isso é virtualizado utilizando uma "proporcao arbitraria"
        :param indice:
        :return:
        """
        esquerda = indice
        direita = indice + 1 if len(self.emulaLista) != indice+1 else 0
        for e in self.emulaLista:
            if e.esquerda == esquerda and e.direita == direita:
                return e.valor
        raise Exception("indice não encontrado")

    def remove(self, indice):
        """
        Não vamos usar mais fiz uma função para tornar objeto lixo
        :param indice:
        :return:
        """
        esquerda = indice
        direita = indice + 1 if len(self.emulaLista) != indice+1 else 0
        for e in self.emulaLista:
            if e.esquerda == esquerda and e.direita == direita:
                e.esquerda = None
                e.direita = None
                e.valor = None
                self.coletorDelixo()
                return True
        raise Exception("indice não encontrado")

    def coletorDelixo(self):
        """
        Todo lixo precisa ser coletado (:
        fiz essa classe para coletar elementos nulos e reorganizar
        a lista por completo
        :return:
        """
        for index in range(0, len(self.emulaLista)-1):
            if self.emulaLista[index].esquerda is None and self.emulaLista[index].direita is None:
                self.emulaLista.remove(index)
        esquerda = 0
        direita = 1
        for e in self.emulaLista:
            e.esquerda = esquerda
            e.direita = direita
            esquerda = esquerda + 1
            direita = direita + 1
        self.emulaLista[-1].direita = 0

    def set(self, indice, valor):
        """
        Seta um valor dentro do vetor, mantendo a ordem da estrutura
        :param indice:
        :param valor:
        :return:
        """
        esquerda = indice
        direita = indice + 1 if len(self.emulaLista) != indice+1 else 0
        for e in self.emulaLista:
            if e.esquerda == esquerda and e.direita == direita:
                e.valor = valor
                return True
        raise Exception("indice não encontrado")

    def len(self):
        """
        Retorna a quantidade de elementos da lista virtual
        :return:
        """
        return len(self.emulaLista)

    def __iter__(self):
        """
        Para simular o interador, preciso recriar
        :return:
        """
        for i in self.emulaLista:
            yield i

    def __add__(self, other):
        """
        e preciso simular a soma também ):
        :param other:
        :return:
        """
        self.emulaLista = self.emulaLista + other.emulaLista
        return self

    def sum(self, lista):
        newLista = ListaPersonalizada()
        for i in lista:
            for e in i:
                newLista.add(e)
        return newLista

    def next(self):
        for i in self.emulaLista:
            yield i


def bubbleSort(ListaEspecial):
    # do fim para começo, voltando um a um
    for passnum in range(ListaEspecial.len()-1, 0, -1):
        # pega posição atual, intera 0-posição ordenando
        for i in range(passnum):
            #utilizando a lista especial,  ordena os valores
            if ListaEspecial.get(i) > ListaEspecial.get(i+1):
                temp = ListaEspecial.get(i)
                ListaEspecial.set(i, ListaEspecial.get(i+1))
                ListaEspecial.set(i+1, temp)


def ksort(vetor):
    if len(vetor) <= 1:
        return vetor # uma lista vazia ou com 1 elemento ja esta ordenada
    menor, igual, maior = [], [], [] # cria as sublistas dos maiores, menores e iguais ao pivo
    pivo = vetor[0] # escolhe o pivo. neste caso, o primeiro elemento do vetor
    for x in vetor:
# adiciona o elemento x a lista correspondeste
        if x < pivo:
            menor.append(x)
        elif x == pivo:
            igual.append(x)
        else:
            maior.append(x)
    return ksort(menor) + igual + ksort(maior) #soma das listas



def user():
    return dict(form=auth())


@cache.action()
def download():
    return response.download(request, db)


def call():
    return service()


