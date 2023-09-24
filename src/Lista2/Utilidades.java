package Lista2;

import java.util.ArrayList;
import java.util.List;

public class Utilidades {

	public  int somarMeios ( int[] vet) {
		int soma = 0;
		for (int i = 1; i < vet.length - 1; i++) {
			soma += vet[i];
		}
		return soma;
	}
	
	public double somar ( double[] vet) {
		int soma = 0;
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		return soma;
	}
	
	public void imprimirNumerosPares ( int numeroinicial, int numerofinal ) {
		for (int i = numeroinicial; i < numerofinal ; i++) {
			if ( i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	public double media (double[] vetA, double[] vetB) {
		double soma = somar(vetA) + somar(vetB);
		return (soma/( vetB.length + vetA.length ));
	}
	
	public double mediaPonderada (double[] notas, int[] pesos) {
		double somaponderada = 0;
		double somapesos = 0;
		for (int i = 0; i < pesos.length; i++) {
			somaponderada += notas[i] * pesos[i];
			somapesos += pesos[i];
		}
		double mediaponderada = (somaponderada/(somapesos));
		return mediaponderada;
	}
	
	public int contagemElementos ( int[] vetA, int[] vetB, int numero ) {
		int contador = 0;
		for (int i = 0; i < vetA.length; i++) {
				if ( vetA[i] == numero ) {
					contador++;
				}
		}
		for (int j = 0; j < vetB.length; j++) {
			if ( vetB[j] == numero ) {
				contador++;
			}
		}
		return contador;
	}
	
	public int[] copiaVetor ( int[] vet ) {
		int vetorcopia[] = new int[vet.length];
		for (int i = 0; i < vet.length; i++) {
			vetorcopia[i] = vet[i];
		}
		return vetorcopia;
	}
	
	public int[] ordenacaoCrescente ( int[] vet ) {
		int tamanho = vet.length;

        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    int temp = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = temp;
                }
            }
        }
        return vet;
    }
	
	public int[] ordenacaoDecrescente ( int[] vet ) {
		int tamanho = vet.length;
		for (int i = 0; i < tamanho - 1; i++) {
	        for (int j = 0; j < tamanho - i - 1; j++) {
	            if (vet[j] < vet[j + 1]) { 
	            	int temp = vet[j];
	            	vet[j] = vet[j + 1];
	                vet[j + 1] = temp;
	            }
	        }
		}
		return vet;
	}
	
	public boolean verificarOrdenacao ( int[] vet ) {
        for (int i = 0; i < vet.length - 1; i++) {
            if (vet[i] < vet[i + 1]) {
                return false;
            }
        }
        return true;
	}
	
	public int kMaiorValor ( int[] vet, int K ) {
		ordenacaoDecrescente ( vet );
		int kmaior = 0;
		for (int i = 0; i < vet.length ; i++) {
			if ( vet[i] > kmaior && vet[i] == vet[K-1] ) {
				kmaior = vet[i];
			} 
		}
		return kmaior;
	}
	
	public int kMenorValor ( int[] vet, int K ) {
		ordenacaoCrescente( vet );
		int kmenor = 9999999;
		for (int i = 0; i < vet.length ; i++) {
			if ( vet[i] < kmenor && vet[i] == vet[K-1] ) {
				kmenor = vet[i];
			} 
		}
		return kmenor;
	}
	
	public boolean verificarIgualdade ( int[] vetA, int[] vetB ) {
		if ( vetA.length == vetB.length ) {
			for (int i = 0; i < vetA.length;) {
				if ( vetA[i] == vetB[i] ) {
					return true;
				} else {
					return false;
				}
			}
		} else {
			return false;
		}
		return false;
	}
	
	public int potencia ( int base, int expoente ) {
		int result = base;
		if ( expoente == 0 ) {
			return 1;
		}
		for (int i = 0; i < expoente - 1; i++) {
			result *= base;
		}
		return result;
	}
	
	public boolean verificarPrimo ( int numero ) {
		if (numero <= 1) {
            return false; 
        }
        if (numero <= 3) {
            return true; 
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true; 
    }
	
	public int[] buscaOcorrencia ( int[] vetA, int[] vetB ) {
		int[] vetC = new int[vetA.length];
		int indexC = 0;
		
		for (int i = 0; i < vetA.length; i++) {
			for (int j = 0; j < vetB.length; j++) {
				if ( vetA[i] == vetB[j] ) {
					vetC[indexC] = vetA[i];
					indexC++;
				}
			}
		}
		int result[] = new int[indexC];
		for (int i = 0; i < indexC; i++) {
		    result[i] = vetC[i];
		}
		return result;
	}
	
	public int[] removerElemento(int[] vetor, int elemento) {
        int novoTamanho = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != elemento) {
                novoTamanho++;
            }
        }

        int[] novoVetor = new int[novoTamanho];

        int j = 0; 
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != elemento) {
                novoVetor[j] = vetor[i];
                j++;
            }
        }

        return novoVetor;
	}

	public boolean verificarPalindromo ( String str ) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        String invertida = new StringBuilder(str).reverse().toString();
        return str.equals(invertida);
	}
	
	public String inverterString ( String str ) {
		char[] caracteresInversos = new char[str.length()];
		for (int i = str.length() - 1; i >= 0; i--) {
			caracteresInversos[str.length() - 1 - i] = str.charAt(i);
		}
		return new String(caracteresInversos);
	}
	
	public double jurosCompostos ( double valor, double taxa, int periodo ) {
		double montante = valor * (Math.pow(1 + taxa, periodo));
		return montante;
	}
	
	public  boolean verificarNumeroPerfeito(int numero) {
	    if (numero <= 0) {
	        return false;
	    }

	    int somaDivisores = 0;
	    
	    for (int i = 1; i < numero; i++) {
	        if (numero % i == 0) {
	            somaDivisores += i;
	        }
	    }
	    return somaDivisores == numero;
	}

	public void reduzirVetor(int tamanho) {
        List<Integer> vet = new ArrayList<>();
        for (int i = 0 ; i <= tamanho - 1; i++) {
            vet.add(i);
        }
        
        System.out.print("O vetor inicial eh: ");
        System.out.println(vet);
        
        System.out.println("Vetor reduzindo:");
		while (vet.size() > 1) {
            vet.remove(vet.size() - 1);
            System.out.println(vet);
        }
    }

	public void imrpimirElementos1 ( int linhas, int colunas ) {
		
		for (int i = 0; i < linhas; i++) {
            for (int j = 0; j <= i && j < colunas; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
		}
	}
	
	 public void imprimirElementos2 ( int linhas, int colunas ) {
	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                if ((i + j) % 2 == 0) {
	                    System.out.print("@ ");
	                } else {
	                    System.out.print("* ");
	                	}
	            }
	            System.out.println();
	        }
	 }
	 
	 public void imprimirElementos3 ( int linhas, int colunas ) {
		 for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                if (i == linhas / 2 || j == colunas / 2) {
	                    System.out.print("@ ");
	                } else {
	                    System.out.print("0 ");
	                }
	            }
	            System.out.println();
	        }
	    }
	 public void imprimirElementos4 ( int linhas, int colunas ) {
		 for (int i = 1; i <= linhas; i++) {
	            for (int j = 1; j <= colunas; j++) {
	                if (i >= 2 && i <= 4 && j >= 2 && j <= 4) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print(i - 1 + " ");
	                }
	            }
	            System.out.println();
	        }
	    }
	 
	 public void imprimirElementos5 ( int linhas, int colunas ) {
		 char[][] padrao = new char[linhas][colunas];
	        char[] elemento = { '|', '|', '!', '!', };

	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                int elementoIndex = (i / 2 + j / 2) % elemento.length;
	                padrao[i][j] = elemento[elementoIndex];
	            }
	        }

	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                System.out.print(padrao[i][j] + " ");
	            }
	            System.out.println("");
	        }
	    }
	 
	 public void imprimirElementos6 ( int linhas, int colunas ) {
		 for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                if (i == j) {
	                    System.out.print(i + " ");
	                } else if (j == colunas - 1 - i) {
	                    System.out.print(colunas - 1 - i + " ");
	                } else {
	                    System.out.print("* ");
	                }
	            }
	            System.out.println();
	        }
	    }
}
	   

	    

	
	
