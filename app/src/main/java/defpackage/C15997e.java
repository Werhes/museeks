package defpackage;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15997e extends AbstractC17419e {
    public static final Logger billing = Logger.getLogger(C15997e.class.getName());
    public static final boolean yandex = AbstractC9259e.appmetrica;
    public int appmetrica;
    public final int license;
    public final byte[] metrica;
    public final OutputStream purchase;
    public C6594e vip;

    public C15997e(OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i, 20);
        this.metrica = new byte[max];
        this.license = max;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.purchase = outputStream;
    }

    public static int advert(String str) {
        int length;
        try {
            length = AbstractC7097e.ad(str);
        } catch (C15419e unused) {
            length = str.getBytes(AbstractC2930e.ad).length;
        }
        return amazon(length) + length;
    }

    public static int amazon(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int loadAd(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int mopub(int i, C6283e c6283e) {
        int smaato = smaato(i);
        int size = c6283e.size();
        return amazon(size) + size + smaato;
    }

    public static int smaato(int i) {
        return amazon(i << 3);
    }

    public final void Signature() {
        this.purchase.write(this.metrica, 0, this.appmetrica);
        this.appmetrica = 0;
    }

    public final void adcel(long j) {
        boolean z = yandex;
        byte[] bArr = this.metrica;
        if (z) {
            while ((j & (-128)) != 0) {
                int i = this.appmetrica;
                this.appmetrica = i + 1;
                AbstractC9259e.adcel(bArr, i, (byte) (((int) j) | 128));
                j >>>= 7;
            }
            int i2 = this.appmetrica;
            this.appmetrica = i2 + 1;
            AbstractC9259e.adcel(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i3 = this.appmetrica;
            this.appmetrica = i3 + 1;
            bArr[i3] = (byte) (((int) j) | 128);
            j >>>= 7;
        }
        int i4 = this.appmetrica;
        this.appmetrica = i4 + 1;
        bArr[i4] = (byte) j;
    }

    public final void admob(int i) {
        if (this.license - this.appmetrica < i) {
            Signature();
        }
    }

    public final void ads(int i, int i2) {
        admob(20);
        yandex(i, 0);
        if (i2 >= 0) {
            startapp(i2);
        } else {
            adcel(i2);
        }
    }

    public final void applovin(long j) {
        admob(8);
        billing(j);
    }

    @Override // defpackage.AbstractC17419e
    public final void appmetrica(int i, int i2, byte[] bArr) {
        remoteconfig(bArr, i, i2);
    }

    public final void billing(long j) {
        int i = this.appmetrica;
        byte[] bArr = this.metrica;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.appmetrica = i + 8;
    }

    /* renamed from: class, reason: not valid java name */
    public final void m4097class(int i, int i2) {
        admob(20);
        yandex(i, 0);
        startapp(i2);
    }

    public final void crashlytics(String str) {
        try {
            int length = str.length() * 3;
            int amazon = amazon(length);
            int i = amazon + length;
            int i2 = this.license;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int license = AbstractC7097e.ad.license(str, bArr, 0, length);
                m4099interface(license);
                remoteconfig(bArr, 0, license);
                return;
            }
            if (i > i2 - this.appmetrica) {
                Signature();
            }
            int amazon2 = amazon(str.length());
            int i3 = this.appmetrica;
            byte[] bArr2 = this.metrica;
            try {
                try {
                    if (amazon2 == amazon) {
                        int i4 = i3 + amazon2;
                        this.appmetrica = i4;
                        int license2 = AbstractC7097e.ad.license(str, bArr2, i4, i2 - i4);
                        this.appmetrica = i3;
                        startapp((license2 - i3) - amazon2);
                        this.appmetrica = license2;
                    } else {
                        int ad = AbstractC7097e.ad(str);
                        startapp(ad);
                        this.appmetrica = AbstractC7097e.ad.license(str, bArr2, this.appmetrica, ad);
                    }
                } catch (C15419e e) {
                    this.appmetrica = i3;
                    throw e;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new C13593e((IndexOutOfBoundsException) e2);
            }
        } catch (C15419e e3) {
            billing.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(AbstractC2930e.ad);
            try {
                m4099interface(bytes.length);
                appmetrica(0, bytes.length, bytes);
            } catch (IndexOutOfBoundsException e4) {
                throw new C13593e(e4);
            }
        }
    }

    public final void firebase(int i, int i2) {
        m4099interface((i << 3) | i2);
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m4098goto(int i, long j) {
        admob(20);
        yandex(i, 0);
        adcel(j);
    }

    public final void inmobi(int i) {
        admob(4);
        purchase(i);
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m4099interface(int i) {
        admob(5);
        startapp(i);
    }

    public final void isPro(int i, long j) {
        admob(18);
        yandex(i, 1);
        billing(j);
    }

    public final void isVip(int i, int i2) {
        admob(14);
        yandex(i, 5);
        purchase(i2);
    }

    public final void premium(int i) {
        if (i >= 0) {
            m4099interface(i);
        } else {
            m4100this(i);
        }
    }

    public final void pro(int i, boolean z) {
        admob(11);
        yandex(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.appmetrica;
        this.metrica[i2] = b;
        this.appmetrica = i2 + 1;
    }

    public final void purchase(int i) {
        int i2 = this.appmetrica;
        byte[] bArr = this.metrica;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.appmetrica = i2 + 4;
    }

    public final void remoteconfig(byte[] bArr, int i, int i2) {
        int i3 = this.appmetrica;
        int i4 = this.license;
        int i5 = i4 - i3;
        byte[] bArr2 = this.metrica;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.appmetrica += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.appmetrica = i4;
        Signature();
        if (i7 > i4) {
            this.purchase.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.appmetrica = i7;
        }
    }

    public final void signatures(int i, C6283e c6283e) {
        firebase(i, 2);
        tapsense(c6283e);
    }

    public final void startapp(int i) {
        boolean z = yandex;
        byte[] bArr = this.metrica;
        if (z) {
            while ((i & (-128)) != 0) {
                int i2 = this.appmetrica;
                this.appmetrica = i2 + 1;
                AbstractC9259e.adcel(bArr, i2, (byte) (i | 128));
                i >>>= 7;
            }
            int i3 = this.appmetrica;
            this.appmetrica = i3 + 1;
            AbstractC9259e.adcel(bArr, i3, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i4 = this.appmetrica;
            this.appmetrica = i4 + 1;
            bArr[i4] = (byte) (i | 128);
            i >>>= 7;
        }
        int i5 = this.appmetrica;
        this.appmetrica = i5 + 1;
        bArr[i5] = (byte) i;
    }

    public final void subs(int i, String str) {
        firebase(i, 2);
        crashlytics(str);
    }

    public final void subscription(byte b) {
        if (this.appmetrica == this.license) {
            Signature();
        }
        int i = this.appmetrica;
        this.metrica[i] = b;
        this.appmetrica = i + 1;
    }

    public final void tapsense(C6283e c6283e) {
        m4099interface(c6283e.size());
        appmetrica(c6283e.adcel(), c6283e.size(), c6283e.f13094e);
    }

    /* renamed from: this, reason: not valid java name */
    public final void m4100this(long j) {
        admob(10);
        adcel(j);
    }

    public final void yandex(int i, int i2) {
        startapp((i << 3) | i2);
    }
}
