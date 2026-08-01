package defpackage;

import j$.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؑٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17475e extends AbstractC0281e implements List, RandomAccess, j$.util.List {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C2171e f34223e = new C2171e(C1410e.f4222e, 0);

    /* JADX WARN: Type inference failed for: r0v0, types: [eّۗؐ, eْٗۤ] */
    public static C13304e Signature() {
        return new AbstractC12670e(4);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eّۗؐ, eْٗۤ] */
    public static C13304e admob(int i) {
        AbstractC17595e.metrica(i, "expectedSize");
        return new AbstractC12670e(i);
    }

    public static C1410e ads(Object obj) {
        Object[] objArr = {obj};
        AbstractC8306e.ad(1, objArr);
        return loadAd(1, objArr);
    }

    public static C1410e firebase(Comparator comparator, List list) {
        comparator.getClass();
        if (!AbstractC0869e.premium(list)) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list = arrayList;
        }
        Object[] array = list.toArray();
        AbstractC8306e.ad(array.length, array);
        Arrays.sort(array, comparator);
        return loadAd(array.length, array);
    }

    public static C1410e inmobi(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        AbstractC8306e.ad(5, objArr);
        return loadAd(5, objArr);
    }

    public static C1410e loadAd(int i, Object[] objArr) {
        return i == 0 ? C1410e.f4222e : new C1410e(i, objArr);
    }

    public static C1410e premium(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC8306e.ad(2, objArr);
        return loadAd(2, objArr);
    }

    public static AbstractC17475e remoteconfig(Collection collection) {
        if (!(collection instanceof AbstractC0281e)) {
            Object[] array = collection.toArray();
            AbstractC8306e.ad(array.length, array);
            return loadAd(array.length, array);
        }
        AbstractC17475e appmetrica = ((AbstractC0281e) collection).appmetrica();
        if (!appmetrica.advert()) {
            return appmetrica;
        }
        Object[] array2 = appmetrica.toArray(AbstractC0281e.f2283e);
        return loadAd(array2.length, array2);
    }

    public static C1410e subs(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        AbstractC2301e.yandex(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        AbstractC8306e.ad(length, objArr2);
        return loadAd(length, objArr2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eّۗؐ, eْٗۤ] */
    public static AbstractC17475e subscription(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return remoteconfig((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return C1410e.f4222e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return ads(next);
        }
        ?? abstractC12670e = new AbstractC12670e(4);
        abstractC12670e.metrica(next);
        while (it.hasNext()) {
            abstractC12670e.metrica(it.next());
        }
        return abstractC12670e.billing();
    }

    public static C1410e tapsense(Object[] objArr) {
        if (objArr.length == 0) {
            return C1410e.f4222e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        AbstractC8306e.ad(objArr2.length, objArr2);
        return loadAd(objArr2.length, objArr2);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.AbstractC0281e
    public final AbstractC17475e appmetrica() {
        return this;
    }

    @Override // defpackage.AbstractC0281e
    public int billing(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    /* renamed from: class, reason: merged with bridge method [inline-methods] */
    public AbstractC17475e subList(int i, int i2) {
        AbstractC2301e.Signature(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? C1410e.f4222e : new C11641e(this, i, i3);
    }

    @Override // defpackage.AbstractC0281e, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public AbstractC17475e crashlytics() {
        return size() <= 1 ? this : new C17326e(this);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && AbstractC13328e.metrica(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (AbstractC13328e.metrica(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    /* renamed from: isVip, reason: merged with bridge method [inline-methods] */
    public final C2171e listIterator(int i) {
        AbstractC2301e.loadAd(i, size());
        return isEmpty() ? f34223e : new C2171e(this, i);
    }

    @Override // defpackage.AbstractC0281e, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.AbstractC0281e
    /* renamed from: smaato */
    public final AbstractC7014e iterator() {
        return listIterator(0);
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }
}
