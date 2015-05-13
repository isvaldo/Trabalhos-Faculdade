# -*- coding: utf-8 -*-
# this file is released under public domain and you can use without limitations

# ########################################################################
## This is a sample controller
## - index is the default action of any application
## - user is required for authentication and authorization
## - download is for downloading files uploaded in the db (does streaming)
#########################################################################
#from applications.examples.controllers.form_examples import form
from cups import require
import random


def index():
    '''
    Formulario de entrada
    :return:
    '''
    templete = random.randint(1, 5)
    response.flash = "Layout " + str(templete)

    form = SQLFORM.factory(
        Field('select', label="Algoritmo", requires=IS_IN_SET(["MDC", "MDC RECURSIVO", "MAX"]))
    )
    submit = form.element('input', _type='submit')
    submit['_style'] = 'display:none;'

    if form.process().accepted:
        print form.vars

    return dict(form=form, templete=templete)


def teste():
    response.flash ="Ainda não fiz !!!"
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
        Field('a', label="Entrada A"),
        Field('b', label="Entrada B")
    )
    if form.process().accepted:
        valor = mdc(int(form.vars.a), int(form.vars.b))
        return dict(form=form, valor=valor)
    return dict(form=form)


def max_recursive():
    form = SQLFORM.factory(
        Field('a', label="Entrada A"),
        Field('b', label="Entrada B")
    )
    if form.process().accepted:
        valor = mdc(int(form.vars.a), int(form.vars.b))
        return dict(form=form, valor=valor)

    return dict(form=form)


def get_max():
    form = SQLFORM.factory(
        Field('lista', label="lista")
    )
    if form.process().accepted:
        try:
            valor = max_array(str(form.vars.lista).split(","))
        except:
            response.flash = "ERRO, valor formato de forma invalida"
            return dict(form=form)

        return dict(form=form, valor=valor)
    return dict(form=form)


def user():
    """
    exposes:
    http://..../[app]/default/user/login
    http://..../[app]/default/user/logout
    http://..../[app]/default/user/register
    http://..../[app]/default/user/profile
    http://..../[app]/default/user/retrieve_password
    http://..../[app]/default/user/change_password
    http://..../[app]/default/user/manage_users (requires membership in
    use @auth.requires_login()
        @auth.requires_membership('group name')
        @auth.requires_permission('read','table name',record_id)
    to decorate functions that need access control
    """
    return dict(form=auth())


@cache.action()
def download():
    """
    allows downloading of uploaded files
    http://..../[app]/default/download/[filename]
    """
    return response.download(request, db)


def call():
    """
    exposes services. for example:
    http://..../[app]/default/call/jsonrpc
    decorate with @services.jsonrpc the functions to expose
    supports xml, json, xmlrpc, jsonrpc, amfrpc, rss, csv
    """
    return service()


