package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C16299e {
    public static final C13604e appmetrica;
    public static final C16792e license;
    public final C16298e ad;
    public volatile C16299e metrica;
    public final Character vip;

    static {
        new C16792e("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        license = new C16792e("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new C16299e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new C16299e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        appmetrica = new C13604e(new C16298e("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public C16299e(C16298e c16298e, Character ch) {
        boolean z;
        this.ad = c16298e;
        if (ch != null) {
            char charValue = ch.charValue();
            byte[] bArr = c16298e.billing;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z = false;
                AbstractC2301e.startapp(z, "Padding character %s was already in alphabet", ch);
                this.vip = ch;
            }
        }
        z = true;
        AbstractC2301e.startapp(z, "Padding character %s was already in alphabet", ch);
        this.vip = ch;
    }

    public C16299e(String str, String str2) {
        this(new C16298e(str, str2.toCharArray()), (Character) '=');
    }

    public final String ad(byte[] bArr) {
        int length = bArr.length;
        AbstractC2301e.Signature(0, length, bArr.length);
        C16298e c16298e = this.ad;
        int i = c16298e.appmetrica;
        int i2 = c16298e.purchase;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(AbstractC17673e.purchase(length, i2) * i);
        try {
            metrica(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16299e) {
            C16299e c16299e = (C16299e) obj;
            if (this.ad.equals(c16299e.ad) && Objects.equals(this.vip, c16299e.vip)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode() ^ Objects.hashCode(this.vip);
    }

    public void metrica(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        AbstractC2301e.Signature(0, i, bArr.length);
        while (i2 < i) {
            C16298e c16298e = this.ad;
            vip(sb, bArr, i2, Math.min(c16298e.purchase, i - i2));
            i2 += c16298e.purchase;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        C16298e c16298e = this.ad;
        sb.append(c16298e);
        if (8 % c16298e.license != 0) {
            Character ch = this.vip;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public final void vip(StringBuilder sb, byte[] bArr, int i, int i2) {
        AbstractC2301e.Signature(i, i + i2, bArr.length);
        C16298e c16298e = this.ad;
        int i3 = c16298e.purchase;
        int i4 = c16298e.license;
        int i5 = 0;
        AbstractC2301e.billing(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | (bArr[i + i6] & 255)) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(c16298e.vip[((int) (j >>> (i7 - i5))) & c16298e.metrica]);
            i5 += i4;
        }
        Character ch = this.vip;
        if (ch != null) {
            while (i5 < c16298e.purchase * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }
}
