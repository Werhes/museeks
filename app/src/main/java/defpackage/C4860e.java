package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؗۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4860e implements CharSequence {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f10331e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f10332e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f10333e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public CharSequence f10334e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10335e = 1;

    public /* synthetic */ C4860e() {
    }

    public C4860e(C17466e c17466e, int i, int i2) {
        this.f10331e = c17466e;
        this.f10333e = i;
        this.f10332e = i2;
    }

    public void ad(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (i > i2) {
            AbstractC8889e.ad("start=" + i + " > end=" + i2);
        }
        if (i3 > i4) {
            AbstractC8889e.ad("textStart=" + i3 + " > textEnd=" + i4);
        }
        if (i < 0) {
            AbstractC8889e.ad("start must be non-negative, but was " + i);
        }
        if (i3 < 0) {
            AbstractC8889e.ad("textStart must be non-negative, but was " + i3);
        }
        C3712e c3712e = (C3712e) this.f10331e;
        int i5 = i4 - i3;
        if (c3712e == null) {
            int max = Math.max(255, i5 + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(this.f10334e.length() - i2, 64);
            int i6 = i - min;
            AbstractC12110e.appmetrica(this.f10334e, cArr, 0, i6, i);
            int i7 = max - min2;
            int i8 = min2 + i2;
            AbstractC12110e.appmetrica(this.f10334e, cArr, i7, i2, i8);
            AbstractC12110e.appmetrica(charSequence, cArr, min, i3, i4);
            C3712e c3712e2 = new C3712e(1);
            c3712e2.vip = max;
            c3712e2.metrica = cArr;
            c3712e2.license = min + i5;
            c3712e2.appmetrica = i7;
            this.f10331e = c3712e2;
            this.f10333e = i6;
            this.f10332e = i8;
            return;
        }
        int i9 = this.f10333e;
        int i10 = i - i9;
        int i11 = i2 - i9;
        if (i10 < 0 || i11 > c3712e.vip - c3712e.ad()) {
            this.f10334e = toString();
            this.f10331e = null;
            this.f10333e = -1;
            this.f10332e = -1;
            ad(i, i2, charSequence, i3, i4);
            return;
        }
        int i12 = i5 - (i11 - i10);
        if (i12 > c3712e.ad()) {
            int ad = i12 - c3712e.ad();
            int i13 = c3712e.vip;
            do {
                i13 *= 2;
            } while (i13 - c3712e.vip < ad);
            char[] cArr2 = new char[i13];
            AbstractC1660e.amazon(c3712e.metrica, cArr2, 0, 0, c3712e.license);
            int i14 = c3712e.vip;
            int i15 = c3712e.appmetrica;
            int i16 = i14 - i15;
            int i17 = i13 - i16;
            AbstractC1660e.amazon(c3712e.metrica, cArr2, i17, i15, i16 + i15);
            c3712e.metrica = cArr2;
            c3712e.vip = i13;
            c3712e.appmetrica = i17;
        }
        int i18 = c3712e.license;
        if (i10 < i18 && i11 <= i18) {
            int i19 = i18 - i11;
            char[] cArr3 = c3712e.metrica;
            AbstractC1660e.amazon(cArr3, cArr3, c3712e.appmetrica - i19, i11, i18);
            c3712e.license = i10;
            c3712e.appmetrica -= i19;
        } else if (i10 >= i18 || i11 < i18) {
            int ad2 = c3712e.ad() + i10;
            int ad3 = c3712e.ad() + i11;
            int i20 = c3712e.appmetrica;
            char[] cArr4 = c3712e.metrica;
            AbstractC1660e.amazon(cArr4, cArr4, c3712e.license, i20, ad2);
            c3712e.license += ad2 - i20;
            c3712e.appmetrica = ad3;
        } else {
            c3712e.appmetrica = c3712e.ad() + i11;
            c3712e.license = i10;
        }
        AbstractC12110e.appmetrica(charSequence, c3712e.metrica, c3712e.license, i3, i4);
        c3712e.license += i5;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        switch (this.f10335e) {
            case 0:
                int i2 = this.f10333e + i;
                if (i < 0) {
                    throw new IllegalArgumentException(AbstractC1786e.admob(i, "index is negative: ").toString());
                }
                if (i2 < this.f10332e) {
                    C17466e c17466e = (C17466e) this.f10331e;
                    return c17466e.ad(i2)[i2 % c17466e.f34208e.length];
                }
                StringBuilder premium = AbstractC4653e.premium("index (", i, ") should be less than length (");
                premium.append(length());
                premium.append(')');
                throw new IllegalArgumentException(premium.toString().toString());
            default:
                C3712e c3712e = (C3712e) this.f10331e;
                if (c3712e != null && i >= this.f10333e) {
                    int ad = c3712e.vip - c3712e.ad();
                    int i3 = this.f10333e;
                    if (i >= ad + i3) {
                        return this.f10334e.charAt(i - ((ad - this.f10332e) + i3));
                    }
                    int i4 = i - i3;
                    int i5 = c3712e.license;
                    return i4 < i5 ? c3712e.metrica[i4] : c3712e.metrica[(i4 - i5) + c3712e.appmetrica];
                }
                return this.f10334e.charAt(i);
        }
    }

    public boolean equals(Object obj) {
        switch (this.f10335e) {
            case 0:
                if (!(obj instanceof CharSequence)) {
                    return false;
                }
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence.length() != length()) {
                    return false;
                }
                C17466e c17466e = (C17466e) this.f10331e;
                int i = this.f10333e;
                int length = length();
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i + i2;
                    if (c17466e.ad(i3)[i3 % c17466e.f34208e.length] != charSequence.charAt(i2)) {
                        return false;
                    }
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.f10335e) {
            case 0:
                String str = (String) this.f10334e;
                if (str != null) {
                    return str.hashCode();
                }
                C17466e c17466e = (C17466e) this.f10331e;
                int i = this.f10332e;
                int i2 = 0;
                for (int i3 = this.f10333e; i3 < i; i3++) {
                    i2 = (i2 * 31) + c17466e.ad(i3)[i3 % c17466e.f34208e.length];
                }
                return i2;
            default:
                return super.hashCode();
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        switch (this.f10335e) {
            case 0:
                return this.f10332e - this.f10333e;
            default:
                C3712e c3712e = (C3712e) this.f10331e;
                if (c3712e == null) {
                    return this.f10334e.length();
                }
                return (c3712e.vip - c3712e.ad()) + (this.f10334e.length() - (this.f10332e - this.f10333e));
        }
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        switch (this.f10335e) {
            case 0:
                if (i < 0) {
                    throw new IllegalArgumentException(AbstractC1786e.admob(i, "start is negative: ").toString());
                }
                if (i > i2) {
                    throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
                }
                int i3 = this.f10332e;
                int i4 = this.f10333e;
                if (i2 <= i3 - i4) {
                    return i == i2 ? BuildConfig.FLAVOR : new C4860e((C17466e) this.f10331e, i + i4, i4 + i2);
                }
                throw new IllegalArgumentException(("end should be less than length (" + length() + ')').toString());
            default:
                return toString().subSequence(i, i2);
        }
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        switch (this.f10335e) {
            case 0:
                String str = (String) this.f10334e;
                if (str != null) {
                    return str;
                }
                String obj = ((C17466e) this.f10331e).vip(this.f10333e, this.f10332e).toString();
                this.f10334e = obj;
                return obj;
            default:
                C3712e c3712e = (C3712e) this.f10331e;
                if (c3712e == null) {
                    return this.f10334e.toString();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.f10334e, 0, this.f10333e);
                sb.append(c3712e.metrica, 0, c3712e.license);
                char[] cArr = c3712e.metrica;
                int i = c3712e.appmetrica;
                sb.append(cArr, i, c3712e.vip - i);
                CharSequence charSequence = this.f10334e;
                sb.append(charSequence, this.f10332e, charSequence.length());
                return sb.toString();
        }
    }
}
