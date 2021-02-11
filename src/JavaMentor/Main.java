package JavaMentor;

import java.util.Arrays;

//Напишите статический класс AsciiCharSequence, реализующий компактное хранение последовательности ASCII-символов (их коды влезают в один байт) в массиве байт
//Класс AsciiCharSequence должен:
//реализовывать интерфейс java.lang.CharSequence;
//иметь конструктор, принимающий массив байт;
//определять методы length(), charAt(), subSequence() и toString()
public class Main {

    public static void main(String[] args) {

    }

    public static class AsciiCharSequence implements CharSequence {
        private byte[] massive;

        public AsciiCharSequence(byte[] massive) {
            this.massive = massive;
        }
        @Override
        public int length() {
            return massive.length;
        }
        @Override
        public char charAt(int index) {
            return (char) massive[index];
        }
        @Override
        public CharSequence subSequence(int start, int end) {
            byte[] result = new byte[end - start];
            for (int i = start; i < end; i++) {
                result[i - start] = massive[i];
            }
            return new AsciiCharSequence(result);
        }

        @Override
        public String toString() {
            return new String(massive);
        }
    }
}
