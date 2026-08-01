package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ٘ۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13324e extends C0193e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final transient byte[][] f26579e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final transient int[] f26580e;

    public C13324e(byte[][] bArr, int[] iArr) {
        super(C0193e.f1409e.f1412e);
        this.f26579e = bArr;
        this.f26580e = iArr;
    }

    @Override // defpackage.C0193e
    public final ByteBuffer ad() {
        return ByteBuffer.wrap(subscription()).asReadOnlyBuffer();
    }

    @Override // defpackage.C0193e
    public final int adcel(int i, byte[] bArr) {
        return signatures().adcel(i, bArr);
    }

    @Override // defpackage.C0193e
    public final C0193e admob() {
        return signatures().admob();
    }

    @Override // defpackage.C0193e
    public final boolean advert(int i, int i2, int i3, byte[] bArr) {
        if (i < 0 || i > license() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int purchase = AbstractC11160e.purchase(this, i);
        while (i < i4) {
            int[] iArr = this.f26580e;
            int i5 = purchase == 0 ? 0 : iArr[purchase - 1];
            int i6 = iArr[purchase] - i5;
            byte[][] bArr2 = this.f26579e;
            int i7 = iArr[bArr2.length + purchase];
            int min = Math.min(i4, i6 + i5) - i;
            if (!AbstractC7844e.yandex(bArr2[purchase], (i - i5) + i7, i2, bArr, min)) {
                return false;
            }
            i2 += min;
            i += min;
            purchase++;
        }
        return true;
    }

    @Override // defpackage.C0193e
    public final String amazon(Charset charset) {
        return signatures().amazon(charset);
    }

    @Override // defpackage.C0193e
    public final String appmetrica() {
        return signatures().appmetrica();
    }

    @Override // defpackage.C0193e
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0193e) {
            C0193e c0193e = (C0193e) obj;
            if (c0193e.license() == license() && smaato(0, license(), c0193e)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.C0193e
    public final int hashCode() {
        int i = this.f1411e;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f26579e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f26580e;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f1411e = i3;
        return i3;
    }

    @Override // defpackage.C0193e
    public final int license() {
        return this.f26580e[this.f26579e.length - 1];
    }

    @Override // defpackage.C0193e
    public final C0193e loadAd(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("beginIndex=", i, " < 0").toString());
        }
        if (i2 > license()) {
            StringBuilder premium = AbstractC4653e.premium("endIndex=", i2, " > length(");
            premium.append(license());
            premium.append(')');
            throw new IllegalArgumentException(premium.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(AbstractC1786e.Signature(i2, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && i2 == license()) {
            return this;
        }
        if (i == i2) {
            return C0193e.f1409e;
        }
        int purchase = AbstractC11160e.purchase(this, i);
        int purchase2 = AbstractC11160e.purchase(this, i2 - 1);
        byte[][] bArr = this.f26579e;
        byte[][] bArr2 = (byte[][]) AbstractC1660e.pro(purchase, purchase2 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f26580e;
        if (purchase <= purchase2) {
            int i4 = purchase;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == purchase2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = purchase != 0 ? iArr2[purchase - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new C13324e(bArr2, iArr);
    }

    @Override // defpackage.C0193e
    public final void metrica(int i, int i2, int i3, byte[] bArr) {
        long j = i3;
        AbstractC7844e.startapp(license(), i, j);
        AbstractC7844e.startapp(bArr.length, i2, j);
        int i4 = i3 + i;
        int purchase = AbstractC11160e.purchase(this, i);
        while (i < i4) {
            int[] iArr = this.f26580e;
            int i5 = purchase == 0 ? 0 : iArr[purchase - 1];
            int i6 = iArr[purchase] - i5;
            byte[][] bArr2 = this.f26579e;
            int i7 = iArr[bArr2.length + purchase];
            int min = Math.min(i4, i6 + i5) - i;
            int i8 = (i - i5) + i7;
            AbstractC1660e.smaato(bArr2[purchase], i2, i8, bArr, i8 + min);
            i2 += min;
            i += min;
            purchase++;
        }
    }

    @Override // defpackage.C0193e
    public final void pro(C16151e c16151e, int i) {
        int purchase = AbstractC11160e.purchase(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f26580e;
            int i3 = purchase == 0 ? 0 : iArr[purchase - 1];
            int i4 = iArr[purchase] - i3;
            byte[][] bArr = this.f26579e;
            int i5 = iArr[bArr.length + purchase];
            int min = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            C16592e c16592e = new C16592e(bArr[purchase], i6, i6 + min, true, false);
            C16592e c16592e2 = c16151e.f31732e;
            if (c16592e2 == null) {
                c16592e.billing = c16592e;
                c16592e.purchase = c16592e;
                c16151e.f31732e = c16592e;
            } else {
                c16592e2.billing.vip(c16592e);
            }
            i2 += min;
            purchase++;
        }
        c16151e.f31731e += i;
    }

    @Override // defpackage.C0193e
    public final int purchase(int i, byte[] bArr) {
        return signatures().purchase(i, bArr);
    }

    public final C0193e signatures() {
        return new C0193e(subscription());
    }

    @Override // defpackage.C0193e
    public final boolean smaato(int i, int i2, C0193e c0193e) {
        if (i >= 0 && i <= license() - i2) {
            int i3 = i2 + i;
            int purchase = AbstractC11160e.purchase(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.f26580e;
                int i5 = purchase == 0 ? 0 : iArr[purchase - 1];
                int i6 = iArr[purchase] - i5;
                byte[][] bArr = this.f26579e;
                int i7 = iArr[bArr.length + purchase];
                int min = Math.min(i3, i6 + i5) - i;
                if (c0193e.advert(i4, (i - i5) + i7, min, bArr[purchase])) {
                    i4 += min;
                    i += min;
                    purchase++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.C0193e
    public final byte startapp(int i) {
        byte[][] bArr = this.f26579e;
        int length = bArr.length - 1;
        int[] iArr = this.f26580e;
        AbstractC7844e.startapp(iArr[length], i, 1L);
        int purchase = AbstractC11160e.purchase(this, i);
        return bArr[purchase][(i - (purchase == 0 ? 0 : iArr[purchase - 1])) + iArr[bArr.length + purchase]];
    }

    @Override // defpackage.C0193e
    public final byte[] subscription() {
        byte[] bArr = new byte[license()];
        byte[][] bArr2 = this.f26579e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f26580e;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            AbstractC1660e.smaato(bArr2[i], i3, i4, bArr, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.C0193e
    public final String toString() {
        return signatures().toString();
    }

    @Override // defpackage.C0193e
    public final byte[] yandex() {
        return subscription();
    }
}
