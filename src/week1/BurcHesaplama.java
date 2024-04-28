package week1;

import java.util.Scanner;

public class BurcHesaplama {
    public static void main(String[] args) {


        int month, day;

        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz :");
        month = input.nextInt();

        System.out.print("doğduğunuz günü giriniz : ");
        day = input.nextInt();

        if (month > 0 && month <= 12) {

            if (day >= 1 && day <= 31) {
                if (month == 1) {
                    if (day < 22) {
                        System.out.print("oğlak burcu");
                    } else {
                        System.out.print("kova burcu");
                    }
                }

            } else {
                isError = true;
            }

            if (day >= 1 && day <= 29) {
                if (month == 2) {
                    if (day < 20) {
                        System.out.print("kova burcu");
                    } else {
                        System.out.print("balık burcu");
                    }
                }

            } else {
                isError = true;
            }

            if (day >= 1 && day <= 31) {
                if (month == 3) {
                    if (day < 21) {
                        System.out.print("balık burcu");
                    } else {
                        System.out.print("koç burcu");
                    }
                }

            } else {
                isError = true;
            }

            if (day >= 1 && day <= 30) {
                if (month == 4) {
                    if (day < 21) {
                        System.out.print("koç burcu");
                    } else {
                        System.out.print("boğa burcu");
                    }
                }

            } else {
                isError = true;
            }

            if (day >= 1 && day <= 31) {
                if (month == 5) {
                    if (day < 21) {
                        System.out.print("boğa burcu");
                    } else {
                        System.out.print("ikizler burcu");
                    }
                }

            } else {
                isError = true;
            }

            if (day >= 1 && day <= 30) {
                if (month == 6) {
                    if (day < 23) {
                        System.out.print("ikizler burcu");
                    } else {
                        System.out.print("yengeç burcu");
                    }
                }

            } else {
                isError = true;

            }
            if (day >= 1 && day <= 31) {
                if (month == 7) {
                    if (day < 24) {
                        System.out.print("yengeç burcu");
                    } else {
                        System.out.print("aslan burcu");
                    }
                }

            } else {
                isError = true;
            }

            if (day >= 1 && day <= 31) {
                if (month == 8) {
                    if (day < 23) {
                        System.out.print("aslan burcu");
                    } else {
                        System.out.print("başak burcu");
                    }
                }

            } else {
                isError = true;
            }

            if (day >= 1 && day <= 30) {
                if (month == 9) {
                    if (day < 23) {
                        System.out.print("başak burcu");
                    } else {
                        System.out.print("terazi burcu");
                    }
                }

            } else {
                isError = true;
            }

            if (day >= 1 && day <= 31) {
                if (month == 10) {
                    if (day < 23) {
                        System.out.print("terazi burcu");
                    } else {
                        System.out.print("akrep burcu");
                    }
                }

            } else {
                isError = true;
            }

            if (day >= 1 && day <= 30) {
                if (month == 11) {
                    if (day < 23) {
                        System.out.print("akrep burcu");
                    } else {
                        System.out.print("yay burcu");
                    }
                }

            } else {
                isError = true;
            }

            if (day >= 1 && day <= 31) {
                if (month == 12) {
                    if (day < 22) {
                        System.out.print("yay burcu");
                    } else {
                        System.out.print("oğlak burcu");
                    }
                }

            } else {
                isError = true;

            }
            if (isError == true) {
                System.out.print("hatalı değer girdiniz. ");
            }

        } else {
            System.out.println("Hatalı değer girdiniz !");
        }
    }
}
