package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؔٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2692e implements Cloneable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public /* synthetic */ Object[] f6572e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public /* synthetic */ long[] f6573e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public /* synthetic */ int f6574e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public /* synthetic */ boolean f6575e;

    public C2692e(int i) {
        if (i == 0) {
            this.f6573e = AbstractC10115e.vip;
            this.f6572e = AbstractC10115e.metrica;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f6573e = new long[i5];
        this.f6572e = new Object[i5];
    }

    public /* synthetic */ C2692e(Object obj) {
        this(10);
    }

    public final void ad(long j, Long l) {
        int i = this.f6574e;
        if (i != 0 && j <= this.f6573e[i - 1]) {
            yandex(j, l);
            return;
        }
        if (this.f6575e) {
            long[] jArr = this.f6573e;
            if (i >= jArr.length) {
                Object[] objArr = this.f6572e;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj = objArr[i3];
                    if (obj != AbstractC15182e.ad) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                this.f6575e = false;
                this.f6574e = i2;
            }
        }
        int i4 = this.f6574e;
        if (i4 >= this.f6573e.length) {
            int i5 = (i4 + 1) * 8;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 8;
            this.f6573e = Arrays.copyOf(this.f6573e, i8);
            this.f6572e = Arrays.copyOf(this.f6572e, i8);
        }
        this.f6573e[i4] = j;
        this.f6572e[i4] = l;
        this.f6574e = i4 + 1;
    }

    public final int adcel() {
        if (this.f6575e) {
            int i = this.f6574e;
            long[] jArr = this.f6573e;
            Object[] objArr = this.f6572e;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC15182e.ad) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f6575e = false;
            this.f6574e = i2;
        }
        return this.f6574e;
    }

    public final Object appmetrica(long j) {
        Object obj;
        int license = AbstractC10115e.license(this.f6574e, j, this.f6573e);
        if (license < 0 || (obj = this.f6572e[license]) == AbstractC15182e.ad) {
            return -1L;
        }
        return obj;
    }

    public final long billing(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f6574e)) {
            AbstractC14783e.billing("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f6575e) {
            long[] jArr = this.f6573e;
            Object[] objArr = this.f6572e;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC15182e.ad) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f6575e = false;
            this.f6574e = i3;
        }
        return this.f6573e[i];
    }

    public final Object license(long j) {
        Object obj;
        int license = AbstractC10115e.license(this.f6574e, j, this.f6573e);
        if (license < 0 || (obj = this.f6572e[license]) == AbstractC15182e.ad) {
            return null;
        }
        return obj;
    }

    /* renamed from: metrica, reason: merged with bridge method [inline-methods] */
    public final C2692e clone() {
        C2692e c2692e = (C2692e) super.clone();
        c2692e.f6573e = (long[]) this.f6573e.clone();
        c2692e.f6572e = (Object[]) this.f6572e.clone();
        return c2692e;
    }

    public final Object mopub(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f6574e)) {
            AbstractC14783e.billing("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f6575e) {
            long[] jArr = this.f6573e;
            Object[] objArr = this.f6572e;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC15182e.ad) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f6575e = false;
            this.f6574e = i3;
        }
        return this.f6572e[i];
    }

    public final int purchase(long j) {
        if (this.f6575e) {
            int i = this.f6574e;
            long[] jArr = this.f6573e;
            Object[] objArr = this.f6572e;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC15182e.ad) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f6575e = false;
            this.f6574e = i2;
        }
        return AbstractC10115e.license(this.f6574e, j, this.f6573e);
    }

    public final void startapp(long j) {
        int license = AbstractC10115e.license(this.f6574e, j, this.f6573e);
        if (license >= 0) {
            Object[] objArr = this.f6572e;
            Object obj = objArr[license];
            Object obj2 = AbstractC15182e.ad;
            if (obj != obj2) {
                objArr[license] = obj2;
                this.f6575e = true;
            }
        }
    }

    public final String toString() {
        if (adcel() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6574e * 28);
        sb.append('{');
        int i = this.f6574e;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(billing(i2));
            sb.append('=');
            Object mopub = mopub(i2);
            if (mopub != sb) {
                sb.append(mopub);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final void vip() {
        int i = this.f6574e;
        Object[] objArr = this.f6572e;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f6574e = 0;
        this.f6575e = false;
    }

    public final void yandex(long j, Object obj) {
        int license = AbstractC10115e.license(this.f6574e, j, this.f6573e);
        if (license >= 0) {
            this.f6572e[license] = obj;
            return;
        }
        int i = ~license;
        int i2 = this.f6574e;
        Object obj2 = AbstractC15182e.ad;
        if (i < i2) {
            Object[] objArr = this.f6572e;
            if (objArr[i] == obj2) {
                this.f6573e[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f6575e) {
            long[] jArr = this.f6573e;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f6572e;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f6575e = false;
                this.f6574e = i3;
                i = ~AbstractC10115e.license(i3, j, this.f6573e);
            }
        }
        int i5 = this.f6574e;
        if (i5 >= this.f6573e.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.f6573e = Arrays.copyOf(this.f6573e, i9);
            this.f6572e = Arrays.copyOf(this.f6572e, i9);
        }
        int i10 = this.f6574e;
        if (i10 - i != 0) {
            long[] jArr2 = this.f6573e;
            int i11 = i + 1;
            AbstractC1660e.adcel(i11, i, i10, jArr2, jArr2);
            Object[] objArr3 = this.f6572e;
            AbstractC1660e.mopub(i11, i, this.f6574e, objArr3, objArr3);
        }
        this.f6573e[i] = j;
        this.f6572e[i] = obj;
        this.f6574e++;
    }
}
