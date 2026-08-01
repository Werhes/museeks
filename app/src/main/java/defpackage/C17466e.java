package defpackage;

import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؐۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17466e implements CharSequence, Appendable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f34207e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public char[] f34208e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public ArrayList f34209e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public String f34210e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC1570e f34211e = AbstractC3805e.ad;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f34212e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f34213e;

    public final char[] ad(int i) {
        ArrayList arrayList = this.f34209e;
        if (arrayList != null) {
            return (char[]) arrayList.get(i / this.f34208e.length);
        }
        if (i >= 2048) {
            appmetrica(i);
            throw null;
        }
        char[] cArr = this.f34208e;
        if (cArr != null) {
            return cArr;
        }
        appmetrica(i);
        throw null;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        char[] metrica = metrica();
        int length = this.f34208e.length;
        int i = this.f34213e;
        metrica[length - i] = c;
        this.f34210e = null;
        this.f34213e = i - 1;
        this.f34212e++;
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            return this;
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            return this;
        }
        int i3 = i;
        while (i3 < i2) {
            char[] metrica = metrica();
            int length = metrica.length;
            int i4 = this.f34213e;
            int i5 = length - i4;
            int min = Math.min(i2 - i3, i4);
            for (int i6 = 0; i6 < min; i6++) {
                metrica[i5 + i6] = charSequence.charAt(i3 + i6);
            }
            i3 += min;
            this.f34213e -= min;
        }
        this.f34210e = null;
        this.f34212e = (i2 - i) + this.f34212e;
        return this;
    }

    public final void appmetrica(int i) {
        if (this.f34207e) {
            throw new IllegalStateException("Buffer is already released");
        }
        throw new IndexOutOfBoundsException(i + " is not in range [0; " + (this.f34208e.length - this.f34213e) + ')');
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "index is negative: ").toString());
        }
        if (i < this.f34212e) {
            return ad(i)[i % this.f34208e.length];
        }
        throw new IllegalArgumentException(AbstractC1786e.pro(AbstractC4653e.premium("index ", i, " is not in range [0, "), this.f34212e, ')').toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (this.f34212e == charSequence.length()) {
                int i = this.f34212e;
                for (int i2 = 0; i2 < i; i2++) {
                    if (ad(i2)[i2 % this.f34208e.length] != charSequence.charAt(i2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f34210e;
        if (str != null) {
            return str.hashCode();
        }
        int i = this.f34212e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + ad(i3)[i3 % this.f34208e.length];
        }
        return i2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f34212e;
    }

    public final void license() {
        ArrayList arrayList = this.f34209e;
        InterfaceC1570e interfaceC1570e = this.f34211e;
        if (arrayList != null) {
            this.f34208e = null;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                interfaceC1570e.mo360e(arrayList.get(i));
            }
        } else {
            char[] cArr = this.f34208e;
            if (cArr != null) {
                interfaceC1570e.mo360e(cArr);
            }
            this.f34208e = null;
        }
        this.f34207e = true;
        this.f34209e = null;
        this.f34210e = null;
        this.f34212e = 0;
        this.f34213e = 0;
    }

    public final char[] metrica() {
        if (this.f34213e != 0) {
            return this.f34208e;
        }
        char[] cArr = (char[]) this.f34211e.firebase();
        char[] cArr2 = this.f34208e;
        this.f34208e = cArr;
        this.f34213e = cArr.length;
        this.f34207e = false;
        if (cArr2 != null) {
            ArrayList arrayList = this.f34209e;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f34209e = arrayList;
                arrayList.add(cArr2);
            }
            arrayList.add(cArr);
        }
        return cArr;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i <= i2) {
            if (i < 0) {
                throw new IllegalArgumentException(AbstractC1786e.admob(i, "startIndex is negative: ").toString());
            }
            if (i2 <= this.f34212e) {
                return new C4860e(this, i, i2);
            }
            throw new IllegalArgumentException(AbstractC1786e.pro(AbstractC4653e.premium("endIndex (", i2, ") is greater than length ("), this.f34212e, ')').toString());
        }
        throw new IllegalArgumentException(("startIndex (" + i + ") should be less or equal to endIndex (" + i2 + ')').toString());
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.f34210e;
        if (str != null) {
            return str;
        }
        String obj = vip(0, this.f34212e).toString();
        this.f34210e = obj;
        return obj;
    }

    public final CharSequence vip(int i, int i2) {
        if (i == i2) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder(i2 - i);
        for (int i3 = i - (i % 2048); i3 < i2; i3 += 2048) {
            char[] ad = ad(i3);
            int min = Math.min(i2 - i3, 2048);
            for (int max = Math.max(0, i - i3); max < min; max++) {
                sb.append(ad[max]);
            }
        }
        return sb;
    }
}
