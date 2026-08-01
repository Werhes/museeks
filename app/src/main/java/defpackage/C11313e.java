package defpackage;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ۠ۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11313e extends AbstractSet implements Serializable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public transient int f22697e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public transient Object[] f22698e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient int[] f22699e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public transient int f22700e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient Object f22701e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eُ۠ۗ, java.util.AbstractSet] */
    public static C11313e appmetrica(int i) {
        ?? abstractSet = new AbstractSet();
        AbstractC2301e.yandex(i >= 0, "Expected size must be >= 0");
        abstractSet.f22700e = AbstractC10509e.yandex(i, 1);
        return abstractSet;
    }

    public final int[] adcel() {
        int[] iArr = this.f22699e;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int min;
        char c = 31;
        if (yandex()) {
            AbstractC2301e.admob("Arrays already allocated", yandex());
            int i = this.f22700e;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (1.0d * highestOneBit)) && (highestOneBit = highestOneBit << 1) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f22701e = AbstractC4520e.metrica(max2);
            this.f22700e = AbstractC4520e.billing(this.f22700e, 32 - Integer.numberOfLeadingZeros(max2 - 1), 31);
            this.f22699e = new int[i];
            this.f22698e = new Object[i];
        }
        Set billing = billing();
        if (billing != null) {
            return billing.add(obj);
        }
        int[] adcel = adcel();
        Object[] startapp = startapp();
        int i2 = this.f22697e;
        int i3 = i2 + 1;
        int appmetrica = AbstractC3192e.appmetrica(obj);
        int i4 = (1 << (this.f22700e & 31)) - 1;
        int i5 = appmetrica & i4;
        Object obj2 = this.f22701e;
        Objects.requireNonNull(obj2);
        int advert = AbstractC4520e.advert(i5, obj2);
        if (advert != 0) {
            int i6 = ~i4;
            int i7 = appmetrica & i6;
            int i8 = 0;
            while (true) {
                int i9 = advert - 1;
                int i10 = adcel[i9];
                char c2 = c;
                if ((i10 & i6) == i7 && AbstractC13328e.metrica(obj, startapp[i9])) {
                    return false;
                }
                int i11 = i10 & i4;
                i8++;
                if (i11 != 0) {
                    advert = i11;
                    c = c2;
                } else {
                    if (i8 >= 9) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(1 << (this.f22700e & 31), 1.0f);
                        int i12 = isEmpty() ? -1 : 0;
                        while (i12 >= 0) {
                            linkedHashSet.add(startapp()[i12]);
                            i12++;
                            if (i12 >= this.f22697e) {
                                i12 = -1;
                            }
                        }
                        this.f22701e = linkedHashSet;
                        this.f22699e = null;
                        this.f22698e = null;
                        this.f22700e += 32;
                        return linkedHashSet.add(obj);
                    }
                    if (i3 > i4) {
                        i4 = advert(i4, AbstractC4520e.yandex(i4), appmetrica, i2);
                    } else {
                        adcel[i9] = AbstractC4520e.billing(i10, i3, i4);
                    }
                }
            }
        } else if (i3 > i4) {
            i4 = advert(i4, AbstractC4520e.yandex(i4), appmetrica, i2);
        } else {
            Object obj3 = this.f22701e;
            Objects.requireNonNull(obj3);
            AbstractC4520e.smaato(i5, i3, obj3);
        }
        int length = adcel().length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f22699e = Arrays.copyOf(adcel(), min);
            this.f22698e = Arrays.copyOf(startapp(), min);
        }
        adcel()[i2] = AbstractC4520e.billing(appmetrica, 0, i4);
        startapp()[i2] = obj;
        this.f22697e = i3;
        this.f22700e += 32;
        return true;
    }

    public final int advert(int i, int i2, int i3, int i4) {
        Object metrica = AbstractC4520e.metrica(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            AbstractC4520e.smaato(i3 & i5, i4 + 1, metrica);
        }
        Object obj = this.f22701e;
        Objects.requireNonNull(obj);
        int[] adcel = adcel();
        for (int i6 = 0; i6 <= i; i6++) {
            int advert = AbstractC4520e.advert(i6, obj);
            while (advert != 0) {
                int i7 = advert - 1;
                int i8 = adcel[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int advert2 = AbstractC4520e.advert(i10, metrica);
                AbstractC4520e.smaato(i10, advert, metrica);
                adcel[i7] = AbstractC4520e.billing(i9, advert2, i5);
                advert = i8 & i;
            }
        }
        this.f22701e = metrica;
        this.f22700e = AbstractC4520e.billing(this.f22700e, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    public final Set billing() {
        Object obj = this.f22701e;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (yandex()) {
            return;
        }
        this.f22700e += 32;
        Set billing = billing();
        if (billing != null) {
            this.f22700e = AbstractC10509e.yandex(size(), 3);
            billing.clear();
            this.f22701e = null;
            this.f22697e = 0;
            return;
        }
        Arrays.fill(startapp(), 0, this.f22697e, (Object) null);
        Object obj = this.f22701e;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(adcel(), 0, this.f22697e, 0);
        this.f22697e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (yandex()) {
            return false;
        }
        Set billing = billing();
        if (billing != null) {
            return billing.contains(obj);
        }
        int appmetrica = AbstractC3192e.appmetrica(obj);
        int i = (1 << (this.f22700e & 31)) - 1;
        Object obj2 = this.f22701e;
        Objects.requireNonNull(obj2);
        int advert = AbstractC4520e.advert(appmetrica & i, obj2);
        if (advert == 0) {
            return false;
        }
        int i2 = ~i;
        int i3 = appmetrica & i2;
        do {
            int i4 = advert - 1;
            int i5 = adcel()[i4];
            if ((i5 & i2) == i3 && AbstractC13328e.metrica(obj, startapp()[i4])) {
                return true;
            }
            advert = i5 & i;
        } while (advert != 0);
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set billing = billing();
        return billing != null ? billing.iterator() : new C17798e(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (!yandex()) {
            Set billing = billing();
            if (billing != null) {
                return billing.remove(obj);
            }
            int i3 = (1 << (this.f22700e & 31)) - 1;
            Object obj2 = this.f22701e;
            Objects.requireNonNull(obj2);
            int startapp = AbstractC4520e.startapp(obj, null, i3, obj2, adcel(), startapp(), null);
            if (startapp != -1) {
                Object obj3 = this.f22701e;
                Objects.requireNonNull(obj3);
                int[] adcel = adcel();
                Object[] startapp2 = startapp();
                int size = size();
                int i4 = size - 1;
                if (startapp < i4) {
                    Object obj4 = startapp2[i4];
                    startapp2[startapp] = obj4;
                    startapp2[i4] = null;
                    adcel[startapp] = adcel[i4];
                    adcel[i4] = 0;
                    int appmetrica = AbstractC3192e.appmetrica(obj4) & i3;
                    int advert = AbstractC4520e.advert(appmetrica, obj3);
                    if (advert == size) {
                        AbstractC4520e.smaato(appmetrica, startapp + 1, obj3);
                    } else {
                        while (true) {
                            i = advert - 1;
                            i2 = adcel[i];
                            int i5 = i2 & i3;
                            if (i5 == size) {
                                break;
                            }
                            advert = i5;
                        }
                        adcel[i] = AbstractC4520e.billing(i2, startapp + 1, i3);
                    }
                } else {
                    startapp2[startapp] = null;
                    adcel[startapp] = 0;
                }
                this.f22697e--;
                this.f22700e += 32;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set billing = billing();
        return billing != null ? billing.size() : this.f22697e;
    }

    public final Object[] startapp() {
        Object[] objArr = this.f22698e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (yandex()) {
            return new Object[0];
        }
        Set billing = billing();
        return billing != null ? billing.toArray() : Arrays.copyOf(startapp(), this.f22697e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (yandex()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set billing = billing();
        if (billing != null) {
            return billing.toArray(objArr);
        }
        Object[] startapp = startapp();
        int i = this.f22697e;
        AbstractC2301e.Signature(0, i, startapp.length);
        if (objArr.length < i) {
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        System.arraycopy(startapp, 0, objArr, 0, i);
        return objArr;
    }

    public final boolean yandex() {
        return this.f22701e == null;
    }
}
