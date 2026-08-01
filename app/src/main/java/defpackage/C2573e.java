package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٔؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2573e implements Appendable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long f6428e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C4860e f6429e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C2025e f6430e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C6571e f6431e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C16911e f6432e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C17013e f6433e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C12431e f6434e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C12347e f6435e;

    public C2573e(C17013e c17013e, C16911e c16911e, C17013e c17013e2, C2025e c2025e, int i) {
        C12431e c12431e = null;
        c16911e = (i & 2) != 0 ? null : c16911e;
        c17013e2 = (i & 4) != 0 ? c17013e : c17013e2;
        c2025e = (i & 8) != 0 ? null : c2025e;
        this.f6433e = c17013e2;
        this.f6430e = c2025e;
        C4860e c4860e = new C4860e();
        c4860e.f10334e = c17013e;
        c4860e.f10333e = -1;
        c4860e.f10332e = -1;
        this.f6429e = c4860e;
        this.f6432e = c16911e != null ? new C16911e(c16911e) : null;
        long j = c17013e.f33324e;
        List list = c17013e.f33325e;
        this.f6428e = j;
        this.f6435e = c17013e.f33321e;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            C9363e[] c9363eArr = new C9363e[size];
            for (int i2 = 0; i2 < size; i2++) {
                c9363eArr[i2] = (C9363e) list.get(i2);
            }
            c12431e = new C12431e(size, c9363eArr);
        }
        this.f6434e = c12431e;
    }

    public static C17013e yandex(C2573e c2573e, long j, C12347e c12347e, int i) {
        List list;
        if ((i & 1) != 0) {
            j = c2573e.f6428e;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            c12347e = c2573e.f6435e;
        }
        C12347e c12347e2 = c12347e;
        C12431e c12431e = c2573e.f6434e;
        if (c12431e != null) {
            List yandex = c12431e.yandex();
            if (!((C8794e) yandex).isEmpty()) {
                list = yandex;
                return new C17013e(c2573e.f6429e.toString(), j2, c12347e2, null, list, null, 8);
            }
        }
        list = null;
        return new C17013e(c2573e.f6429e.toString(), j2, c12347e2, null, list, null, 8);
    }

    public final C16911e ad() {
        C16911e c16911e = this.f6432e;
        if (c16911e != null) {
            return c16911e;
        }
        C16911e c16911e2 = new C16911e((C16911e) null);
        this.f6432e = c16911e2;
        return c16911e2;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        C4860e c4860e = this.f6429e;
        vip(c4860e.length(), c4860e.length(), 1);
        c4860e.ad(c4860e.length(), c4860e.length(), r5, 0, String.valueOf(c).length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            C4860e c4860e = this.f6429e;
            vip(c4860e.length(), c4860e.length(), charSequence.length());
            c4860e.ad(c4860e.length(), c4860e.length(), charSequence, 0, charSequence.length());
        }
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence != null) {
            C4860e c4860e = this.f6429e;
            vip(c4860e.length(), c4860e.length(), i2 - i);
            c4860e.ad(c4860e.length(), c4860e.length(), r5, 0, charSequence.subSequence(i, i2).length());
        }
        return this;
    }

    public final void appmetrica(int i, int i2, List list) {
        C4860e c4860e = this.f6429e;
        if (i < 0 || i > c4860e.length()) {
            StringBuilder premium = AbstractC4653e.premium("start (", i, ") offset is outside of text region ");
            premium.append(c4860e.length());
            throw new IndexOutOfBoundsException(premium.toString());
        }
        if (i2 < 0 || i2 > c4860e.length()) {
            StringBuilder premium2 = AbstractC4653e.premium("end (", i2, ") offset is outside of text region ");
            premium2.append(c4860e.length());
            throw new IndexOutOfBoundsException(premium2.toString());
        }
        if (i >= i2) {
            throw new IllegalArgumentException(AbstractC1786e.Signature(i, i2, "Do not set reversed or empty range: ", " > "));
        }
        purchase(new C12347e(AbstractC9262e.metrica(i, i2)));
        C12431e c12431e = this.f6434e;
        if (c12431e != null) {
            c12431e.startapp();
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.f6434e == null) {
            this.f6434e = new C12431e(0, new C9363e[16]);
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C9363e c9363e = (C9363e) list.get(i3);
            C12431e c12431e2 = this.f6434e;
            if (c12431e2 != null) {
                c12431e2.license(C9363e.ad(c9363e, null, c9363e.vip + i, c9363e.metrica + i, 9));
            }
        }
    }

    public final void billing(long j) {
        long metrica = AbstractC9262e.metrica(0, this.f6429e.length());
        if (!C12347e.ad(metrica, j)) {
            AbstractC8889e.ad("Expected " + ((Object) C12347e.adcel(j)) + " to be in " + ((Object) C12347e.adcel(metrica)));
        }
        this.f6428e = j;
        this.f6431e = null;
    }

    public final void license(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (!(i <= i2)) {
            AbstractC8889e.ad("Expected start=" + i + " <= end=" + i2);
        }
        if (!(i3 <= i4)) {
            AbstractC8889e.ad("Expected textStart=" + i3 + " <= textEnd=" + i4);
        }
        vip(i, i2, i4 - i3);
        this.f6429e.ad(i, i2, charSequence, i3, i4);
        purchase(null);
        this.f6431e = null;
    }

    public final void metrica(int i, int i2, CharSequence charSequence) {
        license(i, i2, charSequence, 0, charSequence.length());
    }

    public final void purchase(C12347e c12347e) {
        if (c12347e != null && !C12347e.license(c12347e.ad)) {
            this.f6435e = c12347e;
            return;
        }
        this.f6435e = null;
        C12431e c12431e = this.f6434e;
        if (c12431e != null) {
            c12431e.startapp();
        }
    }

    public final String toString() {
        return this.f6429e.toString();
    }

    public final void vip(int i, int i2, int i3) {
        int i4;
        C16911e ad = ad();
        if (i != i2 || i3 != 0) {
            int min = Math.min(i, i2);
            int max = Math.max(i, i2);
            int i5 = i3 - (max - min);
            int i6 = 0;
            C4085e c4085e = null;
            boolean z = false;
            while (true) {
                C12431e c12431e = (C12431e) ad.f33137e;
                if (i6 >= c12431e.f24868e) {
                    break;
                }
                C4085e c4085e2 = (C4085e) c12431e.f24870e[i6];
                int i7 = c4085e2.ad;
                if ((min > i7 || i7 > max) && ((min > (i4 = c4085e2.vip) || i4 > max) && ((min > i4 || i7 > min) && (max > i4 || i7 > max)))) {
                    if (i7 > max && !z) {
                        ad.advert(c4085e, min, max, i5);
                        z = true;
                    }
                    if (z) {
                        c4085e2.ad += i5;
                        c4085e2.vip += i5;
                    }
                    ((C12431e) ad.f33136e).license(c4085e2);
                } else if (c4085e == null) {
                    c4085e = c4085e2;
                } else {
                    c4085e.vip = c4085e2.vip;
                    c4085e.license = c4085e2.license;
                }
                i6++;
            }
            if (!z) {
                ad.advert(c4085e, min, max, i5);
            }
            C12431e c12431e2 = (C12431e) ad.f33137e;
            ad.f33137e = (C12431e) ad.f33136e;
            ad.f33136e = c12431e2;
            c12431e2.startapp();
        }
        C2025e c2025e = this.f6430e;
        if (c2025e != null) {
            c2025e.mopub(i, i2, i3);
        }
        this.f6428e = AbstractC16377e.vip(i, i2, i3, this.f6428e);
    }
}
