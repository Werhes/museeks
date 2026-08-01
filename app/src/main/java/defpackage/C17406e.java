package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17406e extends AbstractMap implements Serializable {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C11797e f34117e = new C11797e(1);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C14600e f34121e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C14600e f34124e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f34122e = 0;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f34118e = 0;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Comparator f34123e = f34117e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C3311e f34119e = new C3311e();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C3311e[] f34120e = new C3311e[16];

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f34125e = 12;

    public final C3311e ad(Object obj, boolean z) {
        int i;
        C3311e c3311e;
        boolean z2;
        C3311e c3311e2;
        C3311e c3311e3;
        C3311e c3311e4;
        C3311e c3311e5;
        C3311e c3311e6;
        C3311e[] c3311eArr = this.f34120e;
        int hashCode = obj.hashCode();
        int i2 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i3 = ((i2 >>> 7) ^ i2) ^ (i2 >>> 4);
        boolean z3 = true;
        int length = i3 & (c3311eArr.length - 1);
        C3311e c3311e7 = c3311eArr[length];
        C11797e c11797e = f34117e;
        C3311e c3311e8 = null;
        Comparator comparator = this.f34123e;
        if (c3311e7 != null) {
            Comparable comparable = comparator == c11797e ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c3311e7.f7478e;
                i = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i == 0) {
                    return c3311e7;
                }
                C3311e c3311e9 = i < 0 ? c3311e7.f7472e : c3311e7.f7471e;
                if (c3311e9 == null) {
                    break;
                }
                c3311e7 = c3311e9;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C3311e c3311e10 = this.f34119e;
        if (c3311e7 != null) {
            C3311e c3311e11 = c3311e7;
            c3311e = new C3311e(c3311e11, obj, i3, c3311e10, c3311e10.f7470e);
            if (i < 0) {
                c3311e11.f7472e = c3311e;
            } else {
                c3311e11.f7471e = c3311e;
            }
            vip(c3311e11, true);
        } else {
            if (comparator == c11797e && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c3311e = new C3311e(c3311e7, obj, i3, c3311e10, c3311e10.f7470e);
            c3311eArr[length] = c3311e;
        }
        int i4 = this.f34122e;
        this.f34122e = i4 + 1;
        if (i4 > this.f34125e) {
            C3311e[] c3311eArr2 = this.f34120e;
            int length2 = c3311eArr2.length;
            int i5 = length2 * 2;
            C3311e[] c3311eArr3 = new C3311e[i5];
            C11226e c11226e = new C11226e((byte) 0, 5);
            C11226e c11226e2 = new C11226e((byte) 0, 5);
            int i6 = 0;
            while (i6 < length2) {
                C3311e c3311e12 = c3311eArr2[i6];
                if (c3311e12 == null) {
                    z2 = z3;
                    c3311e3 = c3311e8;
                } else {
                    C3311e c3311e13 = c3311e8;
                    for (C3311e c3311e14 = c3311e12; c3311e14 != null; c3311e14 = c3311e14.f7472e) {
                        c3311e14.f7476e = c3311e13;
                        c3311e13 = c3311e14;
                    }
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        if (c3311e13 != null) {
                            z2 = z3;
                            C3311e c3311e15 = c3311e13.f7476e;
                            c3311e13.f7476e = c3311e8;
                            C3311e c3311e16 = c3311e13.f7471e;
                            while (true) {
                                C3311e c3311e17 = c3311e16;
                                c3311e2 = c3311e15;
                                c3311e15 = c3311e17;
                                if (c3311e15 == null) {
                                    break;
                                }
                                c3311e15.f7476e = c3311e2;
                                c3311e16 = c3311e15.f7472e;
                            }
                        } else {
                            C3311e c3311e18 = c3311e13;
                            c3311e13 = c3311e8;
                            c3311e2 = c3311e18;
                            z2 = z3;
                        }
                        if (c3311e13 == null) {
                            break;
                        }
                        if ((c3311e13.f7477e & length2) == 0) {
                            i7++;
                        } else {
                            i8++;
                        }
                        c3311e13 = c3311e2;
                        z3 = z2;
                        c3311e8 = null;
                    }
                    c11226e.vip = ((Integer.highestOneBit(i7) * 2) - 1) - i7;
                    c11226e.license = 0;
                    c11226e.metrica = 0;
                    c3311e3 = null;
                    c11226e.appmetrica = null;
                    c11226e2.vip = ((Integer.highestOneBit(i8) * 2) - 1) - i8;
                    c11226e2.license = 0;
                    c11226e2.metrica = 0;
                    c11226e2.appmetrica = null;
                    C3311e c3311e19 = null;
                    while (c3311e12 != null) {
                        c3311e12.f7476e = c3311e19;
                        C3311e c3311e20 = c3311e12;
                        c3311e12 = c3311e12.f7472e;
                        c3311e19 = c3311e20;
                    }
                    while (true) {
                        if (c3311e19 != null) {
                            C3311e c3311e21 = c3311e19.f7476e;
                            c3311e19.f7476e = null;
                            C3311e c3311e22 = c3311e19.f7471e;
                            while (true) {
                                C3311e c3311e23 = c3311e22;
                                c3311e4 = c3311e21;
                                c3311e21 = c3311e23;
                                if (c3311e21 == null) {
                                    break;
                                }
                                c3311e21.f7476e = c3311e4;
                                c3311e22 = c3311e21.f7472e;
                            }
                        } else {
                            c3311e4 = c3311e19;
                            c3311e19 = null;
                        }
                        if (c3311e19 == null) {
                            break;
                        }
                        if ((c3311e19.f7477e & length2) == 0) {
                            c11226e.ad(c3311e19);
                        } else {
                            c11226e2.ad(c3311e19);
                        }
                        c3311e19 = c3311e4;
                    }
                    if (i7 > 0) {
                        c3311e5 = (C3311e) c11226e.appmetrica;
                        if (c3311e5.f7476e != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        c3311e5 = null;
                    }
                    c3311eArr3[i6] = c3311e5;
                    int i9 = i6 + length2;
                    if (i8 > 0) {
                        c3311e6 = (C3311e) c11226e2.appmetrica;
                        if (c3311e6.f7476e != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        c3311e6 = null;
                    }
                    c3311eArr3[i9] = c3311e6;
                }
                i6++;
                c3311e8 = c3311e3;
                z3 = z2;
            }
            this.f34120e = c3311eArr3;
            this.f34125e = (i5 / 4) + (i5 / 2);
        }
        this.f34118e++;
        return c3311e;
    }

    public final void appmetrica(C3311e c3311e) {
        C3311e c3311e2 = c3311e.f7472e;
        C3311e c3311e3 = c3311e.f7471e;
        C3311e c3311e4 = c3311e3.f7472e;
        C3311e c3311e5 = c3311e3.f7471e;
        c3311e.f7471e = c3311e4;
        if (c3311e4 != null) {
            c3311e4.f7476e = c3311e;
        }
        license(c3311e, c3311e3);
        c3311e3.f7472e = c3311e;
        c3311e.f7476e = c3311e3;
        int max = Math.max(c3311e2 != null ? c3311e2.f7475e : 0, c3311e4 != null ? c3311e4.f7475e : 0) + 1;
        c3311e.f7475e = max;
        c3311e3.f7475e = Math.max(max, c3311e5 != null ? c3311e5.f7475e : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f34120e, (Object) null);
        this.f34122e = 0;
        this.f34118e++;
        C3311e c3311e = this.f34119e;
        C3311e c3311e2 = c3311e.f7474e;
        while (c3311e2 != c3311e) {
            C3311e c3311e3 = c3311e2.f7474e;
            c3311e2.f7470e = null;
            c3311e2.f7474e = null;
            c3311e2 = c3311e3;
        }
        c3311e.f7470e = c3311e;
        c3311e.f7474e = c3311e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C3311e c3311e = null;
        if (obj != null) {
            try {
                c3311e = ad(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c3311e != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C14600e c14600e = this.f34124e;
        if (c14600e != null) {
            return c14600e;
        }
        C14600e c14600e2 = new C14600e(this, 0);
        this.f34124e = c14600e2;
        return c14600e2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            eِؕ۟ r3 = r2.ad(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Lf
            java.lang.Object r3 = r3.f7473e
            return r3
        Lf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17406e.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C14600e c14600e = this.f34121e;
        if (c14600e != null) {
            return c14600e;
        }
        C14600e c14600e2 = new C14600e(this, 1);
        this.f34121e = c14600e2;
        return c14600e2;
    }

    public final void license(C3311e c3311e, C3311e c3311e2) {
        C3311e c3311e3 = c3311e.f7476e;
        c3311e.f7476e = null;
        if (c3311e2 != null) {
            c3311e2.f7476e = c3311e3;
        }
        if (c3311e3 == null) {
            int i = c3311e.f7477e;
            this.f34120e[i & (r0.length - 1)] = c3311e2;
        } else if (c3311e3.f7472e == c3311e) {
            c3311e3.f7472e = c3311e2;
        } else {
            c3311e3.f7471e = c3311e2;
        }
    }

    public final void metrica(C3311e c3311e, boolean z) {
        C3311e c3311e2;
        C3311e c3311e3;
        int i;
        if (z) {
            C3311e c3311e4 = c3311e.f7470e;
            c3311e4.f7474e = c3311e.f7474e;
            c3311e.f7474e.f7470e = c3311e4;
            c3311e.f7470e = null;
            c3311e.f7474e = null;
        }
        C3311e c3311e5 = c3311e.f7472e;
        C3311e c3311e6 = c3311e.f7471e;
        C3311e c3311e7 = c3311e.f7476e;
        int i2 = 0;
        if (c3311e5 == null || c3311e6 == null) {
            if (c3311e5 != null) {
                license(c3311e, c3311e5);
                c3311e.f7472e = null;
            } else if (c3311e6 != null) {
                license(c3311e, c3311e6);
                c3311e.f7471e = null;
            } else {
                license(c3311e, null);
            }
            vip(c3311e7, false);
            this.f34122e--;
            this.f34118e++;
            return;
        }
        if (c3311e5.f7475e > c3311e6.f7475e) {
            C3311e c3311e8 = c3311e5.f7471e;
            while (true) {
                C3311e c3311e9 = c3311e8;
                c3311e3 = c3311e5;
                c3311e5 = c3311e9;
                if (c3311e5 == null) {
                    break;
                } else {
                    c3311e8 = c3311e5.f7471e;
                }
            }
        } else {
            C3311e c3311e10 = c3311e6.f7472e;
            while (true) {
                c3311e2 = c3311e6;
                c3311e6 = c3311e10;
                if (c3311e6 == null) {
                    break;
                } else {
                    c3311e10 = c3311e6.f7472e;
                }
            }
            c3311e3 = c3311e2;
        }
        metrica(c3311e3, false);
        C3311e c3311e11 = c3311e.f7472e;
        if (c3311e11 != null) {
            i = c3311e11.f7475e;
            c3311e3.f7472e = c3311e11;
            c3311e11.f7476e = c3311e3;
            c3311e.f7472e = null;
        } else {
            i = 0;
        }
        C3311e c3311e12 = c3311e.f7471e;
        if (c3311e12 != null) {
            i2 = c3311e12.f7475e;
            c3311e3.f7471e = c3311e12;
            c3311e12.f7476e = c3311e3;
            c3311e.f7471e = null;
        }
        c3311e3.f7475e = Math.max(i, i2) + 1;
        license(c3311e, c3311e3);
    }

    public final void purchase(C3311e c3311e) {
        C3311e c3311e2 = c3311e.f7472e;
        C3311e c3311e3 = c3311e.f7471e;
        C3311e c3311e4 = c3311e2.f7472e;
        C3311e c3311e5 = c3311e2.f7471e;
        c3311e.f7472e = c3311e5;
        if (c3311e5 != null) {
            c3311e5.f7476e = c3311e;
        }
        license(c3311e, c3311e2);
        c3311e2.f7471e = c3311e;
        c3311e.f7476e = c3311e2;
        int max = Math.max(c3311e3 != null ? c3311e3.f7475e : 0, c3311e5 != null ? c3311e5.f7475e : 0) + 1;
        c3311e.f7475e = max;
        c3311e2.f7475e = Math.max(max, c3311e4 != null ? c3311e4.f7475e : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        C3311e ad = ad(obj, true);
        Object obj3 = ad.f7473e;
        ad.f7473e = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            eِؕ۟ r3 = r2.ad(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.metrica(r3, r1)
        L10:
            if (r3 == 0) goto L15
            java.lang.Object r3 = r3.f7473e
            return r3
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17406e.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f34122e;
    }

    public final void vip(C3311e c3311e, boolean z) {
        while (c3311e != null) {
            C3311e c3311e2 = c3311e.f7472e;
            C3311e c3311e3 = c3311e.f7471e;
            int i = c3311e2 != null ? c3311e2.f7475e : 0;
            int i2 = c3311e3 != null ? c3311e3.f7475e : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C3311e c3311e4 = c3311e3.f7472e;
                C3311e c3311e5 = c3311e3.f7471e;
                int i4 = (c3311e4 != null ? c3311e4.f7475e : 0) - (c3311e5 != null ? c3311e5.f7475e : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    purchase(c3311e3);
                }
                appmetrica(c3311e);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C3311e c3311e6 = c3311e2.f7472e;
                C3311e c3311e7 = c3311e2.f7471e;
                int i5 = (c3311e6 != null ? c3311e6.f7475e : 0) - (c3311e7 != null ? c3311e7.f7475e : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    appmetrica(c3311e2);
                }
                purchase(c3311e);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c3311e.f7475e = i + 1;
                if (z) {
                    return;
                }
            } else {
                c3311e.f7475e = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c3311e = c3311e.f7476e;
        }
    }
}
