#Realice un programa donde permita crear una lista de 10 numeros aleatorios entre 1 y 50(enteros)
#Despues cree tres funciones donde se reciba la lista como parametro para:
#mayor()- funcion que imprima el numero mayor de la lista(no usar max)
#minimo() - funcion que imprima el numero menor de la lista (no usar min)
#primos() - funcion que imprima los numeros de la lista que son primos
import random as r

def lista():
    print('Bienvenido','\n'
          'Lista de tamaño 1*10')
    Lista=[]
    for i in range(10):
        Lista.append(r.randint(1,50))
    #print(Lista)
    return Lista

def mayor(x):
    x.sort(reverse=False)
    numero_mayor=x.pop(9)
    return numero_mayor

def menor(x):
    x.sort(reverse=False)
    numero_menor=x.pop(0)
    return numero_menor

def primos(lista,n,nm):
    primos=[]
    while True:
        x=2
        num=lista[0]
        primo=num%x
        if (primo==0):
            lista.remove(num)
        elif (primo!=0):
            j=3
            while primo!=0:
                primo=num%j
                if primo==0:
                    lista.remove(num)
                if primo!=0:
                    j=j+1
                elif primo==0 and num==j:
                    primos.append(num)
                    if primo==0:
                        lista.remove(num)
                        if 1==nm:
                            primos.append(1)
                        if nm%2==0 and n%2==0 and len(lista)==0:
                            print('Numeros primos:', primos)
                            break
                        elif len(lista)==0 and (nm%2==0 or n%2==0):
                            if nm%2!=0:
                                primo=nm%2
                                j=3
                                while primo!=0:
                                    primo=nm%j
                                    if primo!=0:
                                        j=j+1
                                    elif primo==0 and nm==j:
                                        primos.append(nm)
                                        print('Numeros primos', primos)
                                        break
                            elif n%2!=0:
                                primo=n%2
                                j=3
                                while primo!=0:
                                    primo=n%j
                                    if primo!=0:
                                        j=j+1
                                    elif primo==0 and n==j:
                                        primos.append(n)
                                        print('Numeros primos', primos)
                                        break
def imprimir(nota):
    print(nota)

def main():
    listado=lista()
    imprimir(listado)
    nmayor=mayor(listado)
    imprimir(f'El numero mayor es: {nmayor}')
    nmenor=menor(listado)
    imprimir(f'El numero menor es: {nmenor}')
    primos(listado,nmayor,nmenor)
    

if __name__=="__main__":
    main()
