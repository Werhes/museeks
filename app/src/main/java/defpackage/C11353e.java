package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۢۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11353e implements Iterable, InterfaceC16555e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C11353e f22848e = new C11353e(0, 0, 0, null);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f22849e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f22850e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long[] f22851e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f22852e;

    public C11353e(long j, long j2, long j3, long[] jArr) {
        this.f22852e = j;
        this.f22850e = j2;
        this.f22849e = j3;
        this.f22851e = jArr;
    }

    public final C11353e adcel(long j) {
        long[] jArr;
        long j2;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long j3 = this.f22849e;
        long j4 = j - j3;
        long j5 = 0;
        int startapp = AbstractC7890e.startapp(j4, j5);
        long j6 = this.f22850e;
        int i = 64;
        long j7 = 0;
        if (startapp < 0 || AbstractC7890e.startapp(j4, 64) >= 0) {
            long j8 = 64;
            int startapp2 = AbstractC7890e.startapp(j4, j8);
            long j9 = this.f22852e;
            if (startapp2 < 0 || AbstractC7890e.startapp(j4, 128) >= 0) {
                long j10 = 128;
                int startapp3 = AbstractC7890e.startapp(j4, j10);
                long[] jArr5 = this.f22851e;
                if (startapp3 < 0) {
                    if (jArr5 == null) {
                        return new C11353e(this.f22852e, this.f22850e, this.f22849e, new long[]{j});
                    }
                    int ad = AbstractC15389e.ad(j, jArr5);
                    if (ad < 0) {
                        int i2 = -(ad + 1);
                        int length = jArr5.length;
                        long[] jArr6 = new long[length + 1];
                        AbstractC1660e.adcel(0, 0, i2, jArr5, jArr6);
                        AbstractC1660e.adcel(i2 + 1, i2, length, jArr5, jArr6);
                        jArr6[i2] = j;
                        return new C11353e(this.f22852e, this.f22850e, this.f22849e, jArr6);
                    }
                } else if (!yandex(j)) {
                    long j11 = 1;
                    long j12 = ((j + j11) / j8) * j8;
                    if (AbstractC7890e.startapp(j12, j5) < 0) {
                        j12 = (Long.MAX_VALUE - j10) + j11;
                    }
                    long j13 = j3;
                    long j14 = j9;
                    C12916e c12916e = null;
                    while (true) {
                        if (AbstractC7890e.startapp(j13, j12) >= 0) {
                            jArr = jArr5;
                            j2 = j13;
                            j7 = j6;
                            break;
                        }
                        if (j6 != 0) {
                            if (c12916e == null) {
                                c12916e = new C12916e(jArr5);
                            }
                            int i3 = 0;
                            while (i3 < i) {
                                if ((j6 & (1 << i3)) != 0) {
                                    jArr4 = jArr5;
                                    ((C2805e) c12916e.f25784e).ad(i3 + j13);
                                } else {
                                    jArr4 = jArr5;
                                }
                                i3++;
                                jArr5 = jArr4;
                                i = 64;
                            }
                        }
                        long[] jArr7 = jArr5;
                        if (j14 == 0) {
                            j2 = j12;
                            jArr = jArr7;
                            break;
                        }
                        j13 += j8;
                        jArr5 = jArr7;
                        j6 = j14;
                        i = 64;
                        j14 = 0;
                    }
                    if (c12916e != null) {
                        C2805e c2805e = (C2805e) c12916e.f25784e;
                        int i4 = c2805e.vip;
                        if (i4 == 0) {
                            jArr3 = null;
                        } else {
                            long[] jArr8 = new long[i4];
                            long[] jArr9 = c2805e.ad;
                            for (int i5 = 0; i5 < i4; i5++) {
                                jArr8[i5] = jArr9[i5];
                            }
                            jArr3 = jArr8;
                        }
                        if (jArr3 != null) {
                            jArr2 = jArr3;
                            return new C11353e(j14, j7, j2, jArr2).adcel(j);
                        }
                    }
                    jArr2 = jArr;
                    return new C11353e(j14, j7, j2, jArr2).adcel(j);
                }
            } else {
                long j15 = 1 << (((int) j4) - 64);
                if ((j9 & j15) == 0) {
                    return new C11353e(j9 | j15, this.f22850e, this.f22849e, this.f22851e);
                }
            }
        } else {
            long j16 = 1 << ((int) j4);
            if ((j6 & j16) == 0) {
                return new C11353e(this.f22852e, j6 | j16, this.f22849e, this.f22851e);
            }
        }
        return this;
    }

    public final C11353e appmetrica(C11353e c11353e) {
        C11353e c11353e2;
        long j;
        long[] jArr;
        C11353e c11353e3 = f22848e;
        if (c11353e == c11353e3) {
            return this;
        }
        if (this == c11353e3) {
            return c11353e3;
        }
        long j2 = c11353e.f22849e;
        long j3 = c11353e.f22849e;
        long[] jArr2 = c11353e.f22851e;
        long j4 = c11353e.f22850e;
        long j5 = c11353e.f22852e;
        long j6 = this.f22849e;
        if (j2 == j6 && jArr2 == (jArr = this.f22851e)) {
            return new C11353e(this.f22852e & (~j5), this.f22850e & (~j4), j6, jArr);
        }
        if (jArr2 != null) {
            c11353e2 = this;
            for (long j7 : jArr2) {
                c11353e2 = c11353e2.billing(j7);
            }
        } else {
            c11353e2 = this;
        }
        long j8 = 0;
        if (j4 != 0) {
            int i = 0;
            while (i < 64) {
                if (((1 << i) & j4) != j8) {
                    j = j8;
                    c11353e2 = c11353e2.billing(i + j3);
                } else {
                    j = j8;
                }
                i++;
                j8 = j;
            }
        }
        long j9 = j8;
        if (j5 != j9) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j5) != j9) {
                    c11353e2 = c11353e2.billing(i2 + j3 + 64);
                }
            }
        }
        return c11353e2;
    }

    public final C11353e billing(long j) {
        long[] jArr;
        int ad;
        long[] jArr2;
        long j2 = j - this.f22849e;
        long j3 = 0;
        if (AbstractC7890e.startapp(j2, j3) >= 0 && AbstractC7890e.startapp(j2, 64) < 0) {
            long j4 = 1 << ((int) j2);
            long j5 = this.f22850e;
            if ((j5 & j4) != 0) {
                return new C11353e(this.f22852e, j5 & (~j4), this.f22849e, this.f22851e);
            }
        } else if (AbstractC7890e.startapp(j2, 64) >= 0 && AbstractC7890e.startapp(j2, 128) < 0) {
            long j6 = 1 << (((int) j2) - 64);
            long j7 = this.f22852e;
            if ((j7 & j6) != 0) {
                return new C11353e(j7 & (~j6), this.f22850e, this.f22849e, this.f22851e);
            }
        } else if (AbstractC7890e.startapp(j2, j3) < 0 && (jArr = this.f22851e) != null && (ad = AbstractC15389e.ad(j, jArr)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (ad > 0) {
                    AbstractC1660e.adcel(0, 0, ad, jArr, jArr3);
                }
                if (ad < i) {
                    AbstractC1660e.adcel(ad, ad + 1, length, jArr, jArr3);
                }
                jArr2 = jArr3;
            }
            return new C11353e(this.f22852e, this.f22850e, this.f22849e, jArr2);
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC16342e.license(new C16842e(this, null));
    }

    public final C11353e startapp(C11353e c11353e) {
        C11353e c11353e2;
        C11353e c11353e3;
        long[] jArr;
        C11353e c11353e4 = f22848e;
        if (c11353e == c11353e4) {
            return this;
        }
        if (this == c11353e4) {
            return c11353e;
        }
        long j = c11353e.f22849e;
        long j2 = c11353e.f22849e;
        long[] jArr2 = c11353e.f22851e;
        long j3 = c11353e.f22850e;
        long j4 = c11353e.f22852e;
        long j5 = this.f22849e;
        long j6 = this.f22850e;
        long j7 = this.f22852e;
        if (j == j5 && jArr2 == (jArr = this.f22851e)) {
            return new C11353e(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = this.f22851e;
        if (jArr3 != null) {
            if (jArr2 != null) {
                c11353e2 = this;
                for (long j8 : jArr2) {
                    c11353e2 = c11353e2.adcel(j8);
                }
            } else {
                c11353e2 = this;
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        c11353e2 = c11353e2.adcel(i2 + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        c11353e2 = c11353e2.adcel(i + j2 + 64);
                    }
                    i++;
                }
            }
            return c11353e2;
        }
        if (jArr3 != null) {
            c11353e3 = c11353e;
            for (long j9 : jArr3) {
                c11353e3 = c11353e3.adcel(j9);
            }
        } else {
            c11353e3 = c11353e;
        }
        long j10 = this.f22849e;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    c11353e3 = c11353e3.adcel(i3 + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    c11353e3 = c11353e3.adcel(i + j10 + 64);
                }
                i++;
            }
        }
        return c11353e3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) BuildConfig.FLAVOR);
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) BuildConfig.FLAVOR);
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }

    public final boolean yandex(long j) {
        long[] jArr;
        long j2 = j - this.f22849e;
        long j3 = 0;
        return (AbstractC7890e.startapp(j2, j3) < 0 || AbstractC7890e.startapp(j2, (long) 64) >= 0) ? (AbstractC7890e.startapp(j2, (long) 64) < 0 || AbstractC7890e.startapp(j2, (long) 128) >= 0) ? AbstractC7890e.startapp(j2, j3) <= 0 && (jArr = this.f22851e) != null && AbstractC15389e.ad(j, jArr) >= 0 : ((1 << (((int) j2) - 64)) & this.f22852e) != 0 : ((1 << ((int) j2)) & this.f22850e) != 0;
    }
}
