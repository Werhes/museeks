package defpackage;

import androidx.car.app.model.Alert;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؒۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1239e implements Map, Serializable, InterfaceC6770e {

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C1239e f3907e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f3908e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public boolean f3909e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public C13653e f3910e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int[] f3911e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C13653e f3912e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object[] f3913e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f3914e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C15240e f3915e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int[] f3916e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f3917e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object[] f3918e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f3919e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f3920e;

    static {
        C1239e c1239e = new C1239e(0);
        c1239e.f3909e = true;
        f3907e = c1239e;
    }

    public C1239e() {
        this(8);
    }

    public C1239e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f3918e = objArr;
        this.f3913e = null;
        this.f3911e = iArr;
        this.f3916e = new int[highestOneBit];
        this.f3908e = 2;
        this.f3920e = 0;
        this.f3919e = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int ad(Object obj) {
        metrica();
        while (true) {
            int yandex = yandex(obj);
            int i = this.f3908e * 2;
            int length = this.f3916e.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f3916e;
                int i3 = iArr[yandex];
                if (i3 <= 0) {
                    int i4 = this.f3920e;
                    Object[] objArr = this.f3918e;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.f3920e = i5;
                        objArr[i4] = obj;
                        this.f3911e[i4] = yandex;
                        iArr[yandex] = i5;
                        this.f3917e++;
                        this.f3914e++;
                        if (i2 > this.f3908e) {
                            this.f3908e = i2;
                        }
                        return i4;
                    }
                    purchase(1);
                } else {
                    if (AbstractC7890e.billing(this.f3918e[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        startapp(this.f3916e.length * 2);
                        break;
                    }
                    yandex = yandex == 0 ? this.f3916e.length - 1 : yandex - 1;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x001f->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void adcel(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f3918e
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f3913e
            if (r0 == 0) goto Lb
            r0[r12] = r1
        Lb:
            int[] r0 = r11.f3911e
            r0 = r0[r12]
            int r1 = r11.f3908e
            int r1 = r1 * 2
            int[] r2 = r11.f3916e
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L1b
            r1 = r2
        L1b:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L1f:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L29
            int[] r0 = r11.f3916e
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2a
        L29:
            r0 = r5
        L2a:
            int r4 = r4 + 1
            int r5 = r11.f3908e
            r6 = -1
            if (r4 <= r5) goto L36
            int[] r0 = r11.f3916e
            r0[r1] = r2
            goto L67
        L36:
            int[] r5 = r11.f3916e
            r7 = r5[r0]
            if (r7 != 0) goto L3f
            r5[r1] = r2
            goto L67
        L3f:
            if (r7 >= 0) goto L46
            r5[r1] = r6
        L43:
            r1 = r0
            r4 = r2
            goto L60
        L46:
            java.lang.Object[] r5 = r11.f3918e
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.yandex(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f3916e
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L60
            r9[r1] = r7
            int[] r4 = r11.f3911e
            r4[r8] = r1
            goto L43
        L60:
            int r3 = r3 + r6
            if (r3 >= 0) goto L1f
            int[] r0 = r11.f3916e
            r0[r1] = r6
        L67:
            int[] r0 = r11.f3911e
            r0[r12] = r6
            int r12 = r11.f3917e
            int r12 = r12 + r6
            r11.f3917e = r12
            int r12 = r11.f3914e
            int r12 = r12 + 1
            r11.f3914e = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1239e.adcel(int):void");
    }

    public final void appmetrica(boolean z) {
        int i;
        Object[] objArr = this.f3913e;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f3920e;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f3911e;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f3918e;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f3916e[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        AbstractC5797e.metrica(i3, i, this.f3918e);
        if (objArr != null) {
            AbstractC5797e.metrica(i3, this.f3920e, objArr);
        }
        this.f3920e = i3;
    }

    public final int billing(Object obj) {
        int yandex = yandex(obj);
        int i = this.f3908e;
        while (true) {
            int i2 = this.f3916e[yandex];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (AbstractC7890e.billing(this.f3918e[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            yandex = yandex == 0 ? this.f3916e.length - 1 : yandex - 1;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        metrica();
        int i = this.f3920e - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f3911e;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f3916e[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        AbstractC5797e.metrica(0, this.f3920e, this.f3918e);
        Object[] objArr = this.f3913e;
        if (objArr != null) {
            AbstractC5797e.metrica(0, this.f3920e, objArr);
        }
        this.f3917e = 0;
        this.f3920e = 0;
        this.f3914e++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return billing(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i;
        int i2 = this.f3920e;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (this.f3911e[i2] >= 0 && AbstractC7890e.billing(this.f3913e[i2], obj)) {
                    i = i2;
                    break;
                }
            } else {
                break;
            }
        }
        return i >= 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C13653e c13653e = this.f3910e;
        if (c13653e != null) {
            return c13653e;
        }
        C13653e c13653e2 = new C13653e(this, 0);
        this.f3910e = c13653e2;
        return c13653e2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f3917e == map.size()) {
                    for (Object obj2 : map.entrySet()) {
                        if (obj2 != null) {
                            try {
                                Map.Entry entry = (Map.Entry) obj2;
                                int billing = billing(entry.getKey());
                                if (!(billing < 0 ? false : AbstractC7890e.billing(this.f3913e[billing], entry.getValue()))) {
                                }
                            } catch (ClassCastException unused) {
                            }
                        }
                        z = false;
                    }
                    z = true;
                    if (z) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int billing = billing(obj);
        if (billing < 0) {
            return null;
        }
        return this.f3913e[billing];
    }

    @Override // java.util.Map
    public final int hashCode() {
        C11697e c11697e = new C11697e(this, 0);
        int i = 0;
        while (c11697e.hasNext()) {
            int i2 = c11697e.f8353e;
            C1239e c1239e = (C1239e) c11697e.f8352e;
            if (i2 >= c1239e.f3920e) {
                throw new NoSuchElementException();
            }
            c11697e.f8353e = i2 + 1;
            c11697e.f8351e = i2;
            Object obj = c1239e.f3918e[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object obj2 = c1239e.f3913e[c11697e.f8351e];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c11697e.purchase();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f3917e == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C13653e c13653e = this.f3912e;
        if (c13653e != null) {
            return c13653e;
        }
        C13653e c13653e2 = new C13653e(this, 1);
        this.f3912e = c13653e2;
        return c13653e2;
    }

    public final void metrica() {
        if (this.f3909e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void purchase(int i) {
        Object[] objArr = this.f3918e;
        int length = objArr.length;
        int i2 = this.f3920e;
        int i3 = length - i2;
        int i4 = i2 - this.f3917e;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            appmetrica(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Alert.DURATION_SHOW_INDEFINITELY : 2147483639;
            }
            this.f3918e = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.f3913e;
            this.f3913e = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.f3911e = Arrays.copyOf(this.f3911e, i6);
            int highestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (highestOneBit > this.f3916e.length) {
                startapp(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        metrica();
        int ad = ad(obj);
        Object[] objArr = this.f3913e;
        if (objArr == null) {
            int length = this.f3918e.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f3913e = objArr;
        }
        if (ad >= 0) {
            objArr[ad] = obj2;
            return null;
        }
        int i = (-ad) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        metrica();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        purchase(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int ad = ad(entry.getKey());
            Object[] objArr = this.f3913e;
            if (objArr == null) {
                int length = this.f3918e.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f3913e = objArr;
            }
            if (ad >= 0) {
                objArr[ad] = entry.getValue();
            } else {
                int i = (-ad) - 1;
                if (!AbstractC7890e.billing(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        metrica();
        int billing = billing(obj);
        if (billing < 0) {
            return null;
        }
        Object obj2 = this.f3913e[billing];
        adcel(billing);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f3917e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f3911e[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startapp(int r6) {
        /*
            r5 = this;
            int r0 = r5.f3914e
            int r0 = r0 + 1
            r5.f3914e = r0
            int r0 = r5.f3920e
            int r1 = r5.f3917e
            r2 = 0
            if (r0 <= r1) goto L10
            r5.appmetrica(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f3916e = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f3919e = r6
        L1c:
            int r6 = r5.f3920e
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f3918e
            r0 = r0[r2]
            int r0 = r5.yandex(r0)
            int r1 = r5.f3908e
        L2c:
            int[] r3 = r5.f3916e
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f3911e
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1239e.startapp(int):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f3917e * 3) + 2);
        sb.append("{");
        int i = 0;
        C11697e c11697e = new C11697e(this, 0);
        while (c11697e.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = c11697e.f8353e;
            C1239e c1239e = (C1239e) c11697e.f8352e;
            if (i2 >= c1239e.f3920e) {
                throw new NoSuchElementException();
            }
            c11697e.f8353e = i2 + 1;
            c11697e.f8351e = i2;
            Object obj = c1239e.f3918e[i2];
            if (obj == c1239e) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object obj2 = c1239e.f3913e[c11697e.f8351e];
            if (obj2 == c1239e) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c11697e.purchase();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C15240e c15240e = this.f3915e;
        if (c15240e != null) {
            return c15240e;
        }
        C15240e c15240e2 = new C15240e(1, this);
        this.f3915e = c15240e2;
        return c15240e2;
    }

    public final C1239e vip() {
        metrica();
        this.f3909e = true;
        return this.f3917e > 0 ? this : f3907e;
    }

    public final int yandex(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f3919e;
    }
}
