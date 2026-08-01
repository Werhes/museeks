package defpackage;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؑۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0193e implements Serializable, Comparable {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C0193e f1409e = new C0193e(new byte[0]);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public transient String f1410e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient int f1411e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f1412e;

    public C0193e(byte[] bArr) {
        this.f1412e = bArr;
    }

    public static C0193e Signature(C0193e c0193e, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = c0193e.license();
        }
        return c0193e.loadAd(i, i2);
    }

    public static int billing(C0193e c0193e, C0193e c0193e2) {
        c0193e.getClass();
        return c0193e.purchase(0, c0193e2.yandex());
    }

    public static int mopub(C0193e c0193e, C0193e c0193e2) {
        int license = c0193e.license();
        c0193e.getClass();
        return c0193e.adcel(license, c0193e2.yandex());
    }

    public ByteBuffer ad() {
        return ByteBuffer.wrap(this.f1412e).asReadOnlyBuffer();
    }

    public int adcel(int i, byte[] bArr) {
        byte[] bArr2 = this.f1412e;
        for (int min = Math.min(i, bArr2.length - bArr.length); -1 < min; min--) {
            if (AbstractC7844e.yandex(bArr2, min, 0, bArr, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public C0193e admob() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f1412e;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C0193e(copyOf);
            }
            i++;
        }
    }

    public boolean advert(int i, int i2, int i3, byte[] bArr) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f1412e;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && AbstractC7844e.yandex(bArr2, i, i2, bArr, i3);
    }

    public String amazon(Charset charset) {
        return new String(this.f1412e, charset);
    }

    public String appmetrica() {
        byte[] bArr = this.f1412e;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = AbstractC6494e.vip;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0193e) {
            C0193e c0193e = (C0193e) obj;
            int license = c0193e.license();
            byte[] bArr = this.f1412e;
            if (license == bArr.length && c0193e.advert(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f1411e;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f1412e);
        this.f1411e = hashCode;
        return hashCode;
    }

    public int license() {
        return this.f1412e.length;
    }

    public C0193e loadAd(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f1412e;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException(AbstractC1786e.pro(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new C0193e(AbstractC1660e.remoteconfig(i, i2, bArr));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public void metrica(int i, int i2, int i3, byte[] bArr) {
        AbstractC1660e.smaato(this.f1412e, i2, i, bArr, i3 + i);
    }

    public void pro(C16151e c16151e, int i) {
        c16151e.write(this.f1412e, 0, i);
    }

    public int purchase(int i, byte[] bArr) {
        byte[] bArr2 = this.f1412e;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i, 0);
        if (max > length) {
            return -1;
        }
        while (!AbstractC7844e.yandex(bArr2, max, 0, bArr, bArr.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public final String remoteconfig() {
        String str = this.f1410e;
        if (str != null) {
            return str;
        }
        String str2 = new String(yandex(), AbstractC5508e.ad);
        this.f1410e = str2;
        return str2;
    }

    public boolean smaato(int i, int i2, C0193e c0193e) {
        return c0193e.advert(0, i, i2, this.f1412e);
    }

    public byte startapp(int i) {
        return this.f1412e[i];
    }

    public byte[] subscription() {
        byte[] bArr = this.f1412e;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00fb, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0137, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x013b, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00db, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x017a, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0181, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0173, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01b3, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01b6, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01b9, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0147, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01bc, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x007a, code lost:
    
        r3 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0099, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c9, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0088, code lost:
    
        if (r6 == 64) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0103, code lost:
    
        if (r6 == 64) goto L181;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0193e.toString():java.lang.String");
    }

    @Override // java.lang.Comparable
    /* renamed from: vip, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0193e c0193e) {
        int license = license();
        int license2 = c0193e.license();
        int min = Math.min(license, license2);
        for (int i = 0; i < min; i++) {
            int startapp = startapp(i) & 255;
            int startapp2 = c0193e.startapp(i) & 255;
            if (startapp != startapp2) {
                return startapp < startapp2 ? -1 : 1;
            }
        }
        if (license == license2) {
            return 0;
        }
        return license < license2 ? -1 : 1;
    }

    public byte[] yandex() {
        return this.f1412e;
    }
}
