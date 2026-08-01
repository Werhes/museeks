package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؘٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5633e extends AbstractC5546e {
    public static final Logger billing = Logger.getLogger(C5633e.class.getName());
    public static final boolean yandex = AbstractC8314e.appmetrica;
    public final int appmetrica;
    public final byte[] license;
    public C17698e metrica;
    public int purchase;

    public C5633e(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
        }
        this.license = bArr;
        this.purchase = 0;
        this.appmetrica = i;
    }

    public static int isPro(String str) {
        int length;
        try {
            length = AbstractC18380e.metrica(str);
        } catch (C18197e unused) {
            length = str.getBytes(AbstractC12312e.ad).length;
        }
        return yandex(length) + length;
    }

    public static int startapp(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int yandex(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void Signature(long j) {
        try {
            byte[] bArr = this.license;
            int i = this.purchase;
            int i2 = i + 1;
            this.purchase = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.purchase = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.purchase = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.purchase = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.purchase = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.purchase = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.purchase = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.purchase = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C13593e(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.purchase), Integer.valueOf(this.appmetrica), 1), e, 15);
        }
    }

    public final void adcel(byte b) {
        try {
            byte[] bArr = this.license;
            int i = this.purchase;
            this.purchase = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C13593e(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.purchase), Integer.valueOf(this.appmetrica), 1), e, 15);
        }
    }

    public final void admob(int i, int i2) {
        tapsense(i << 3);
        subscription(i2);
    }

    public final void advert(int i, AbstractC13532e abstractC13532e) {
        tapsense((i << 3) | 2);
        tapsense(abstractC13532e.startapp());
        abstractC13532e.remoteconfig(this);
    }

    public final void amazon(int i) {
        try {
            byte[] bArr = this.license;
            int i2 = this.purchase;
            int i3 = i2 + 1;
            this.purchase = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.purchase = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.purchase = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.purchase = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C13593e(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.purchase), Integer.valueOf(this.appmetrica), 1), e, 15);
        }
    }

    public final void inmobi(long j) {
        boolean z = yandex;
        int i = this.appmetrica;
        byte[] bArr = this.license;
        if (!z || i - this.purchase < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i2 = this.purchase;
                    this.purchase = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C13593e(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.purchase), Integer.valueOf(i), 1), e, 15);
                }
            }
            int i3 = this.purchase;
            this.purchase = i3 + 1;
            bArr[i3] = (byte) j;
            return;
        }
        while (true) {
            int i4 = (int) j;
            if ((j & (-128)) == 0) {
                int i5 = this.purchase;
                this.purchase = i5 + 1;
                AbstractC8314e.metrica.billing(bArr, AbstractC8314e.purchase + i5, (byte) i4);
                return;
            } else {
                int i6 = this.purchase;
                this.purchase = i6 + 1;
                AbstractC8314e.metrica.billing(bArr, AbstractC8314e.purchase + i6, (byte) ((i4 | 128) & 255));
                j >>>= 7;
            }
        }
    }

    public final void isVip(int i, long j) {
        tapsense(i << 3);
        inmobi(j);
    }

    public final void loadAd(int i, long j) {
        tapsense((i << 3) | 1);
        Signature(j);
    }

    public final void mopub(int i, int i2, byte[] bArr) {
        try {
            System.arraycopy(bArr, i, this.license, this.purchase, i2);
            this.purchase += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C13593e(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.purchase), Integer.valueOf(this.appmetrica), Integer.valueOf(i2)), e, 15);
        }
    }

    public final void pro(int i, int i2) {
        tapsense((i << 3) | i2);
    }

    public final void remoteconfig(int i, String str) {
        tapsense((i << 3) | 2);
        int i2 = this.purchase;
        try {
            int yandex2 = yandex(str.length() * 3);
            int yandex3 = yandex(str.length());
            int i3 = this.appmetrica;
            byte[] bArr = this.license;
            if (yandex3 != yandex2) {
                tapsense(AbstractC18380e.metrica(str));
                int i4 = this.purchase;
                this.purchase = AbstractC18380e.vip(str, bArr, i4, i3 - i4);
            } else {
                int i5 = i2 + yandex3;
                this.purchase = i5;
                int vip = AbstractC18380e.vip(str, bArr, i5, i3 - i5);
                this.purchase = i2;
                tapsense((vip - i2) - yandex3);
                this.purchase = vip;
            }
        } catch (C18197e e) {
            this.purchase = i2;
            billing.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(AbstractC12312e.ad);
            try {
                int length = bytes.length;
                tapsense(length);
                mopub(0, length, bytes);
            } catch (IndexOutOfBoundsException e2) {
                throw new C13593e(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new C13593e(e3);
        }
    }

    public final void signatures(int i, int i2) {
        tapsense(i << 3);
        tapsense(i2);
    }

    public final void smaato(int i, int i2) {
        tapsense((i << 3) | 5);
        amazon(i2);
    }

    public final void subscription(int i) {
        if (i >= 0) {
            tapsense(i);
        } else {
            inmobi(i);
        }
    }

    public final void tapsense(int i) {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.license;
            if (i2 == 0) {
                int i3 = this.purchase;
                this.purchase = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.purchase;
                    this.purchase = i4 + 1;
                    bArr[i4] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C13593e(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.purchase), Integer.valueOf(this.appmetrica), 1), e, 15);
                }
            }
            throw new C13593e(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.purchase), Integer.valueOf(this.appmetrica), 1), e, 15);
        }
    }
}
