/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djtu.yg.dsj.ch10;

import java.util.Comparator;

/**
 *
 * @author Yang.G
 * @param <T>
 */
public interface ISort<T> {
    void sort(T[] records, Comparator<T> comparator);
}
