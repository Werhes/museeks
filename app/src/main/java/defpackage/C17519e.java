package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17519e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f34352e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object[] f34353e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int[] f34354e;

    public C17519e(int i) {
        this.f34354e = i == 0 ? AbstractC10115e.ad : new int[i];
        this.f34353e = i == 0 ? AbstractC10115e.metrica : new Object[i << 1];
    }

    public final int ad(Object obj) {
        int i = this.f34352e * 2;
        Object[] objArr = this.f34353e;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final int appmetrica() {
        int i = this.f34352e;
        if (i == 0) {
            return -1;
        }
        int metrica = AbstractC10115e.metrica(i, 0, this.f34354e);
        if (metrica < 0 || this.f34353e[metrica << 1] == null) {
            return metrica;
        }
        int i2 = metrica + 1;
        while (i2 < i && this.f34354e[i2] == 0) {
            if (this.f34353e[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = metrica - 1; i3 >= 0 && this.f34354e[i3] == 0; i3--) {
            if (this.f34353e[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final Object billing(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f34352e)) {
            AbstractC14783e.billing("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.f34353e;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.f34354e;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                AbstractC1660e.advert(i, i5, iArr, iArr, i2);
                Object[] objArr2 = this.f34353e;
                AbstractC1660e.mopub(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f34353e;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.f34354e = Arrays.copyOf(iArr, i7);
            this.f34353e = Arrays.copyOf(this.f34353e, i7 << 1);
            if (i2 != this.f34352e) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                AbstractC1660e.advert(0, 0, iArr, this.f34354e, i);
                AbstractC1660e.mopub(0, 0, i3, objArr, this.f34353e);
            }
            if (i < i4) {
                int i8 = i + 1;
                AbstractC1660e.advert(i, i8, iArr, this.f34354e, i2);
                AbstractC1660e.mopub(i3, i8 << 1, i2 << 1, objArr, this.f34353e);
            }
        }
        if (i2 != this.f34352e) {
            throw new ConcurrentModificationException();
        }
        this.f34352e = i4;
        return obj;
    }

    public final void clear() {
        if (this.f34352e > 0) {
            this.f34354e = AbstractC10115e.ad;
            this.f34353e = AbstractC10115e.metrica;
            this.f34352e = 0;
        }
        if (this.f34352e > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return license(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return ad(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C17519e) {
                int i = this.f34352e;
                if (i != ((C17519e) obj).f34352e) {
                    return false;
                }
                C17519e c17519e = (C17519e) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object purchase = purchase(i2);
                    Object startapp = startapp(i2);
                    Object obj2 = c17519e.get(purchase);
                    if (startapp == null) {
                        if (obj2 != null || !c17519e.containsKey(purchase)) {
                            return false;
                        }
                    } else if (!startapp.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f34352e != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f34352e;
            for (int i4 = 0; i4 < i3; i4++) {
                Object purchase2 = purchase(i4);
                Object startapp2 = startapp(i4);
                Object obj3 = ((Map) obj).get(purchase2);
                if (startapp2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(purchase2)) {
                        return false;
                    }
                } else if (!startapp2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int license = license(obj);
        if (license >= 0) {
            return this.f34353e[(license << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int license = license(obj);
        return license >= 0 ? this.f34353e[(license << 1) + 1] : obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f34354e;
        Object[] objArr = this.f34353e;
        int i = this.f34352e;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final boolean isEmpty() {
        return this.f34352e <= 0;
    }

    public final int license(Object obj) {
        return obj == null ? appmetrica() : metrica(obj.hashCode(), obj);
    }

    public final int metrica(int i, Object obj) {
        int i2 = this.f34352e;
        if (i2 == 0) {
            return -1;
        }
        int metrica = AbstractC10115e.metrica(i2, i, this.f34354e);
        if (metrica < 0 || AbstractC7890e.billing(obj, this.f34353e[metrica << 1])) {
            return metrica;
        }
        int i3 = metrica + 1;
        while (i3 < i2 && this.f34354e[i3] == i) {
            if (AbstractC7890e.billing(obj, this.f34353e[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = metrica - 1; i4 >= 0 && this.f34354e[i4] == i; i4--) {
            if (AbstractC7890e.billing(obj, this.f34353e[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final Object purchase(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f34352e) {
            z = true;
        }
        if (z) {
            return this.f34353e[i << 1];
        }
        AbstractC14783e.billing("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.f34352e;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int metrica = obj != null ? metrica(hashCode, obj) : appmetrica();
        if (metrica >= 0) {
            int i2 = (metrica << 1) + 1;
            Object[] objArr = this.f34353e;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~metrica;
        int[] iArr = this.f34354e;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.f34354e = Arrays.copyOf(iArr, i4);
            this.f34353e = Arrays.copyOf(this.f34353e, i4 << 1);
            if (i != this.f34352e) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f34354e;
            int i5 = i3 + 1;
            AbstractC1660e.advert(i5, i3, iArr2, iArr2, i);
            Object[] objArr2 = this.f34353e;
            AbstractC1660e.mopub(i5 << 1, i3 << 1, this.f34352e << 1, objArr2, objArr2);
        }
        int i6 = this.f34352e;
        if (i == i6) {
            int[] iArr3 = this.f34354e;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.f34353e;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f34352e = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int license = license(obj);
        if (license >= 0) {
            return billing(license);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int license = license(obj);
        if (license < 0 || !AbstractC7890e.billing(obj2, startapp(license))) {
            return false;
        }
        billing(license);
        return true;
    }

    public final Object replace(Object obj, Object obj2) {
        int license = license(obj);
        if (license >= 0) {
            return yandex(license, obj2);
        }
        return null;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int license = license(obj);
        if (license < 0 || !AbstractC7890e.billing(obj2, startapp(license))) {
            return false;
        }
        yandex(license, obj3);
        return true;
    }

    public final int size() {
        return this.f34352e;
    }

    public final Object startapp(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f34352e) {
            z = true;
        }
        if (z) {
            return this.f34353e[(i << 1) + 1];
        }
        AbstractC14783e.billing("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f34352e * 28);
        sb.append('{');
        int i = this.f34352e;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object purchase = purchase(i2);
            if (purchase != sb) {
                sb.append(purchase);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object startapp = startapp(i2);
            if (startapp != sb) {
                sb.append(startapp);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final void vip(int i) {
        int i2 = this.f34352e;
        int[] iArr = this.f34354e;
        if (iArr.length < i) {
            this.f34354e = Arrays.copyOf(iArr, i);
            this.f34353e = Arrays.copyOf(this.f34353e, i * 2);
        }
        if (this.f34352e != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final Object yandex(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.f34352e) {
            z = true;
        }
        if (!z) {
            AbstractC14783e.billing("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f34353e;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }
}
