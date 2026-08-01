package defpackage;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٟۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11177e extends AbstractC8769e {
    public int appmetrica;
    public final int license;
    public final byte[] metrica;
    public C16554e vip;
    public static final Logger purchase = Logger.getLogger(C11177e.class.getName());
    public static final boolean billing = AbstractC9914e.appmetrica;

    public C11177e(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(AbstractC1786e.Signature(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.metrica = bArr;
        this.appmetrica = 0;
        this.license = i;
    }

    public static int inmobi(String str) {
        int length;
        try {
            length = AbstractC8604e.ad(str);
        } catch (C9785e unused) {
            length = str.getBytes(AbstractC9561e.ad).length;
        }
        return tapsense(length) + length;
    }

    public static int isVip(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int tapsense(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void Signature(int i) {
        if (i >= 0) {
            admob(i);
        } else {
            remoteconfig(i);
        }
    }

    public final void adcel(int i, int i2) {
        admob(i << 3);
        admob(i2);
    }

    public final void admob(int i) {
        int i2;
        int i3 = this.appmetrica;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.metrica;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.appmetrica = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new C13593e(i2, this.license, 1, e, 18);
                }
            }
            throw new C13593e(i2, this.license, 1, e, 18);
        }
    }

    public final void advert(int i, long j) {
        admob(i << 3);
        remoteconfig(j);
    }

    public final void amazon(int i, String str) {
        admob((i << 3) | 2);
        int i2 = this.appmetrica;
        try {
            int tapsense = tapsense(str.length() * 3);
            int tapsense2 = tapsense(str.length());
            int i3 = this.license;
            byte[] bArr = this.metrica;
            if (tapsense2 != tapsense) {
                admob(AbstractC8604e.ad(str));
                int i4 = this.appmetrica;
                this.appmetrica = AbstractC8604e.vip(str, bArr, i4, i3 - i4);
            } else {
                int i5 = i2 + tapsense2;
                this.appmetrica = i5;
                int vip = AbstractC8604e.vip(str, bArr, i5, i3 - i5);
                this.appmetrica = i2;
                admob((vip - i2) - tapsense2);
                this.appmetrica = vip;
            }
        } catch (C9785e e) {
            this.appmetrica = i2;
            purchase.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(AbstractC9561e.ad);
            try {
                int length = bytes.length;
                admob(length);
                signatures(length, bytes);
            } catch (IndexOutOfBoundsException e2) {
                throw new C13593e(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new C13593e(e3);
        }
    }

    public final void loadAd(int i, C11133e c11133e) {
        admob((i << 3) | 2);
        admob(c11133e.yandex());
        signatures(c11133e.yandex(), c11133e.f22050e);
    }

    public final void mopub(int i, int i2) {
        admob((i << 3) | 5);
        subscription(i2);
    }

    public final void pro(long j) {
        int i = this.appmetrica;
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new C13593e(i, this.license, 8, e, 18);
        }
    }

    public final void remoteconfig(long j) {
        int i;
        int i2 = this.appmetrica;
        int i3 = this.license;
        byte[] bArr = this.metrica;
        if (!billing || i3 - i2 < 10) {
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j2) | 128);
                    j2 >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new C13593e(i, i3, 1, e, 18);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new C13593e(i, i3, 1, e, 18);
            }
        } else {
            long j3 = j;
            while ((j3 & (-128)) != 0) {
                AbstractC9914e.metrica.vip(bArr, AbstractC9914e.purchase + i2, (byte) (((int) j3) | 128));
                j3 >>>= 7;
                i2++;
            }
            i = i2 + 1;
            AbstractC9914e.metrica.vip(bArr, AbstractC9914e.purchase + i2, (byte) j3);
        }
        this.appmetrica = i;
    }

    public final void signatures(int i, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.metrica, this.appmetrica, i);
            this.appmetrica += i;
        } catch (IndexOutOfBoundsException e) {
            throw new C13593e(this.appmetrica, this.license, i, e, 18);
        }
    }

    public final void smaato(int i, long j) {
        admob((i << 3) | 1);
        pro(j);
    }

    public final void startapp(int i, int i2) {
        admob(i << 3);
        Signature(i2);
    }

    public final void subscription(int i) {
        int i2 = this.appmetrica;
        try {
            byte[] bArr = this.metrica;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.appmetrica = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new C13593e(i2, this.license, 4, e, 18);
        }
    }

    public final void yandex(int i, int i2) {
        admob((i << 3) | i2);
    }
}
