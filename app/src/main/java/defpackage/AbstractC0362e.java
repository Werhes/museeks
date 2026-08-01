package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Hashtable;

/* renamed from: eؑ٘ؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0362e {
    public final InterfaceC13441e ad;
    public BigInteger appmetrica;
    public BigInteger license;
    public AbstractC7861e metrica;
    public AbstractC7861e vip;
    public int purchase = 0;
    public C0961e billing = null;
    public AbstractC16982e yandex = null;

    public AbstractC0362e(InterfaceC13441e interfaceC13441e) {
        this.ad = interfaceC13441e;
    }

    public final void Signature(AbstractC9932e[] abstractC9932eArr, int i, int i2, AbstractC7861e abstractC7861e) {
        if (i < 0 || i2 < 0 || i > abstractC9932eArr.length - i2) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            AbstractC9932e abstractC9932e = abstractC9932eArr[i + i3];
            if (abstractC9932e != null && this != abstractC9932e.ad) {
                throw new IllegalArgumentException("'points' entries must be null or on this curve");
            }
        }
        int i4 = this.purchase;
        if (i4 == 0 || i4 == 5) {
            if (abstractC7861e != null) {
                throw new IllegalArgumentException("'iso' not valid for affine coordinates");
            }
            return;
        }
        AbstractC7861e[] abstractC7861eArr = new AbstractC7861e[i2];
        int[] iArr = new int[i2];
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = i + i6;
            AbstractC9932e abstractC9932e2 = abstractC9932eArr[i7];
            if (abstractC9932e2 != null && (abstractC7861e != null || !abstractC9932e2.smaato())) {
                abstractC7861eArr[i5] = abstractC9932e2.adcel();
                iArr[i5] = i7;
                i5++;
            }
        }
        if (i5 == 0) {
            return;
        }
        AbstractC7861e[] abstractC7861eArr2 = new AbstractC7861e[i5];
        abstractC7861eArr2[0] = abstractC7861eArr[0];
        int i8 = 0;
        while (true) {
            int i9 = i8 + 1;
            if (i9 >= i5) {
                break;
            }
            abstractC7861eArr2[i9] = abstractC7861eArr2[i8].remoteconfig(abstractC7861eArr[i9]);
            i8 = i9;
        }
        if (abstractC7861e != null) {
            abstractC7861eArr2[i8] = abstractC7861eArr2[i8].remoteconfig(abstractC7861e);
        }
        AbstractC7861e Signature = abstractC7861eArr2[i8].Signature();
        while (i8 > 0) {
            int i10 = i8 - 1;
            AbstractC7861e abstractC7861e2 = abstractC7861eArr[i8];
            abstractC7861eArr[i8] = abstractC7861eArr2[i10].remoteconfig(Signature);
            Signature = Signature.remoteconfig(abstractC7861e2);
            i8 = i10;
        }
        abstractC7861eArr[0] = Signature;
        for (int i11 = 0; i11 < i5; i11++) {
            int i12 = iArr[i11];
            abstractC9932eArr[i12] = abstractC9932eArr[i12].admob(abstractC7861eArr[i11]);
        }
    }

    public abstract AbstractC0362e ad();

    public abstract AbstractC7861e adcel(BigInteger bigInteger);

    public final InterfaceC6396e admob(AbstractC9932e abstractC9932e, String str, InterfaceC2868e interfaceC2868e) {
        Hashtable hashtable;
        InterfaceC6396e appmetrica;
        if (abstractC9932e == null || this != abstractC9932e.ad) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
        synchronized (abstractC9932e) {
            try {
                hashtable = abstractC9932e.appmetrica;
                if (hashtable == null) {
                    hashtable = new Hashtable(4);
                    abstractC9932e.appmetrica = hashtable;
                }
            } finally {
            }
        }
        synchronized (hashtable) {
            try {
                InterfaceC6396e interfaceC6396e = (InterfaceC6396e) hashtable.get(str);
                appmetrica = interfaceC2868e.appmetrica(interfaceC6396e);
                if (appmetrica != interfaceC6396e) {
                    hashtable.put(str, appmetrica);
                }
            } finally {
            }
        }
        return appmetrica;
    }

    public abstract int advert();

    public AbstractC9932e amazon(AbstractC9932e abstractC9932e) {
        if (this == abstractC9932e.ad) {
            return abstractC9932e;
        }
        if (abstractC9932e.advert()) {
            return smaato();
        }
        AbstractC9932e Signature = abstractC9932e.Signature();
        return license(Signature.vip.firebase(), Signature.startapp().firebase());
    }

    public abstract AbstractC9932e appmetrica(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2);

    public final AbstractC9932e billing(byte[] bArr) {
        AbstractC9932e smaato;
        int mopub = mopub();
        byte b = bArr[0];
        if (b != 0) {
            if (b == 2 || b == 3) {
                if (bArr.length != mopub + 1) {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
                smaato = yandex(b & 1, AbstractC5907e.purchase(1, mopub, bArr));
                if (!smaato.mopub(true, true)) {
                    throw new IllegalArgumentException("Invalid point");
                }
            } else if (b != 4) {
                if (b != 6 && b != 7) {
                    throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(b, 16));
                }
                if (bArr.length != (mopub * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
                BigInteger purchase = AbstractC5907e.purchase(1, mopub, bArr);
                BigInteger purchase2 = AbstractC5907e.purchase(mopub + 1, mopub, bArr);
                if (purchase2.testBit(0) != (b == 7)) {
                    throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                }
                smaato = pro(purchase, purchase2);
            } else {
                if (bArr.length != (mopub * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
                }
                smaato = pro(AbstractC5907e.purchase(1, mopub, bArr), AbstractC5907e.purchase(mopub + 1, mopub, bArr));
            }
        } else {
            if (bArr.length != 1) {
                throw new IllegalArgumentException("Incorrect length for infinity encoding");
            }
            smaato = smaato();
        }
        if (b == 0 || !smaato.advert()) {
            return smaato;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AbstractC0362e) && startapp((AbstractC0362e) obj);
        }
        return true;
    }

    public final int hashCode() {
        return (this.ad.hashCode() ^ Integer.rotateLeft(this.vip.firebase().hashCode(), 8)) ^ Integer.rotateLeft(this.metrica.firebase().hashCode(), 16);
    }

    public AbstractC9932e license(BigInteger bigInteger, BigInteger bigInteger2) {
        return appmetrica(adcel(bigInteger), adcel(bigInteger2));
    }

    public abstract boolean loadAd(BigInteger bigInteger);

    public AbstractC16982e metrica() {
        C0961e c0961e = this.billing;
        return c0961e instanceof C0961e ? new C0450e(this, c0961e) : new C4630e(1);
    }

    public final int mopub() {
        return (advert() + 7) / 8;
    }

    public final AbstractC9932e pro(BigInteger bigInteger, BigInteger bigInteger2) {
        AbstractC9932e license = license(bigInteger, bigInteger2);
        if (license.mopub(false, true)) {
            return license;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    public abstract AbstractC9932e purchase(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr);

    public abstract boolean remoteconfig(int i);

    public abstract AbstractC9932e smaato();

    public final boolean startapp(AbstractC0362e abstractC0362e) {
        if (this != abstractC0362e) {
            return abstractC0362e != null && this.ad.equals(abstractC0362e.ad) && this.vip.firebase().equals(abstractC0362e.vip.firebase()) && this.metrica.firebase().equals(abstractC0362e.metrica.firebase());
        }
        return true;
    }

    public abstract AbstractC7861e subscription(SecureRandom secureRandom);

    public AbstractC2413e vip(AbstractC9932e[] abstractC9932eArr, int i) {
        int mopub = mopub();
        byte[] bArr = new byte[i * mopub * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC9932e abstractC9932e = abstractC9932eArr[i3];
            AbstractC7861e abstractC7861e = abstractC9932e.vip;
            BigInteger firebase = abstractC7861e.firebase();
            int amazon = abstractC7861e.amazon();
            BigInteger bigInteger = AbstractC5907e.ad;
            byte[] byteArray = firebase.toByteArray();
            if (byteArray.length == amazon) {
                System.arraycopy(byteArray, 0, bArr, i2, amazon);
            } else {
                int i4 = (byteArray[0] != 0 || byteArray.length == 1) ? 0 : 1;
                int length = byteArray.length - i4;
                if (length > amazon) {
                    throw new IllegalArgumentException("standard length exceeded for value");
                }
                int i5 = (amazon - length) + i2;
                Arrays.fill(bArr, i2, i5, (byte) 0);
                System.arraycopy(byteArray, i4, bArr, i5, length);
            }
            int i6 = i2 + mopub;
            AbstractC7861e abstractC7861e2 = abstractC9932e.metrica;
            BigInteger firebase2 = abstractC7861e2.firebase();
            int amazon2 = abstractC7861e2.amazon();
            byte[] byteArray2 = firebase2.toByteArray();
            if (byteArray2.length == amazon2) {
                System.arraycopy(byteArray2, 0, bArr, i6, amazon2);
            } else {
                int i7 = (byteArray2[0] != 0 || byteArray2.length == 1) ? 0 : 1;
                int length2 = byteArray2.length - i7;
                if (length2 > amazon2) {
                    throw new IllegalArgumentException("standard length exceeded for value");
                }
                int i8 = (amazon2 - length2) + i6;
                Arrays.fill(bArr, i6, i8, (byte) 0);
                System.arraycopy(byteArray2, i7, bArr, i8, length2);
            }
            i2 = i6 + mopub;
        }
        return new C17458e(this, i, mopub, bArr);
    }

    public abstract AbstractC9932e yandex(int i, BigInteger bigInteger);
}
