package defpackage;

import java.io.ByteArrayOutputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۣؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0192e extends AbstractC13258e {
    public final byte[] adcel;
    public int advert;
    public final int mopub;
    public final ByteArrayOutputStream smaato;

    public C0192e(int i, ByteArrayOutputStream byteArrayOutputStream) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i, 20);
        this.adcel = new byte[max];
        this.mopub = max;
        this.smaato = byteArrayOutputStream;
    }

    @Override // defpackage.AbstractC13258e
    public final void Signature(int i, int i2) {
        m260goto(14);
        crashlytics(i, 5);
        premium(i2);
    }

    @Override // defpackage.AbstractC13258e
    public final void admob(int i) {
        m260goto(4);
        premium(i);
    }

    @Override // defpackage.AbstractC13258e
    public final void ads(long j) {
        m260goto(10);
        m259class(j);
    }

    @Override // defpackage.AbstractC13258e
    public final void amazon(int i, boolean z) {
        m260goto(11);
        crashlytics(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.advert;
        this.adcel[i2] = b;
        this.advert = i2 + 1;
    }

    @Override // defpackage.AbstractC13258e
    public final void applovin(int i, long j) {
        m260goto(20);
        crashlytics(i, 0);
        m259class(j);
    }

    /* renamed from: class, reason: not valid java name */
    public final void m259class(long j) {
        boolean z = AbstractC13258e.startapp;
        byte[] bArr = this.adcel;
        if (z) {
            while ((j & (-128)) != 0) {
                int i = this.advert;
                this.advert = i + 1;
                AbstractC5314e.mopub(bArr, i, (byte) (((int) j) | 128));
                j >>>= 7;
            }
            int i2 = this.advert;
            this.advert = i2 + 1;
            AbstractC5314e.mopub(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i3 = this.advert;
            this.advert = i3 + 1;
            bArr[i3] = (byte) (((int) j) | 128);
            j >>>= 7;
        }
        int i4 = this.advert;
        this.advert = i4 + 1;
        bArr[i4] = (byte) j;
    }

    public final void crashlytics(int i, int i2) {
        firebase((i << 3) | i2);
    }

    public final void firebase(int i) {
        boolean z = AbstractC13258e.startapp;
        byte[] bArr = this.adcel;
        if (z) {
            while ((i & (-128)) != 0) {
                int i2 = this.advert;
                this.advert = i2 + 1;
                AbstractC5314e.mopub(bArr, i2, (byte) (i | 128));
                i >>>= 7;
            }
            int i3 = this.advert;
            this.advert = i3 + 1;
            AbstractC5314e.mopub(bArr, i3, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i4 = this.advert;
            this.advert = i4 + 1;
            bArr[i4] = (byte) (i | 128);
            i >>>= 7;
        }
        int i5 = this.advert;
        this.advert = i5 + 1;
        bArr[i5] = (byte) i;
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m260goto(int i) {
        if (this.mopub - this.advert < i) {
            m261interface();
        }
    }

    @Override // defpackage.AbstractC13258e
    public final void inmobi(int i, int i2) {
        m260goto(20);
        crashlytics(i, 0);
        firebase(i2);
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m261interface() {
        this.smaato.write(this.adcel, 0, this.advert);
        this.advert = 0;
    }

    @Override // defpackage.AbstractC13258e
    public final void isPro(int i) {
        m260goto(5);
        firebase(i);
    }

    @Override // defpackage.AbstractC13258e
    public final void isVip(int i, int i2) {
        isPro((i << 3) | i2);
    }

    @Override // defpackage.AbstractC16082e
    public final void license(int i, int i2, byte[] bArr) {
        m262this(bArr, i, i2);
    }

    @Override // defpackage.AbstractC13258e
    public final void loadAd(int i, AbstractC10498e abstractC10498e) {
        isVip(i, 2);
        isPro(abstractC10498e.size());
        C2096e c2096e = (C2096e) abstractC10498e;
        license(c2096e.advert(), c2096e.size(), c2096e.f5426e);
    }

    public final void premium(int i) {
        int i2 = this.advert;
        byte[] bArr = this.adcel;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.advert = i2 + 4;
    }

    @Override // defpackage.AbstractC13258e
    public final void pro(int i, int i2) {
        m260goto(20);
        crashlytics(i, 0);
        if (i2 >= 0) {
            firebase(i2);
        } else {
            m259class(i2);
        }
    }

    @Override // defpackage.AbstractC13258e
    public final void remoteconfig(long j) {
        m260goto(8);
        subs(j);
    }

    @Override // defpackage.AbstractC13258e
    public final void signatures(int i) {
        if (i >= 0) {
            isPro(i);
        } else {
            ads(i);
        }
    }

    @Override // defpackage.AbstractC13258e
    public final void smaato(byte b) {
        if (this.advert == this.mopub) {
            m261interface();
        }
        int i = this.advert;
        this.adcel[i] = b;
        this.advert = i + 1;
    }

    public final void subs(long j) {
        int i = this.advert;
        byte[] bArr = this.adcel;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.advert = i + 8;
    }

    @Override // defpackage.AbstractC13258e
    public final void subscription(int i, long j) {
        m260goto(18);
        crashlytics(i, 1);
        subs(j);
    }

    @Override // defpackage.AbstractC13258e
    public final void tapsense(int i, String str) {
        isVip(i, 2);
        try {
            int length = str.length() * 3;
            int adcel = AbstractC13258e.adcel(length);
            int i2 = adcel + length;
            int i3 = this.mopub;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int adcel2 = AbstractC18226e.ad.adcel(str, bArr, 0, length);
                isPro(adcel2);
                m262this(bArr, 0, adcel2);
                return;
            }
            if (i2 > i3 - this.advert) {
                m261interface();
            }
            int adcel3 = AbstractC13258e.adcel(str.length());
            int i4 = this.advert;
            byte[] bArr2 = this.adcel;
            try {
                if (adcel3 != adcel) {
                    int vip = AbstractC18226e.vip(str);
                    firebase(vip);
                    this.advert = AbstractC18226e.ad.adcel(str, bArr2, this.advert, vip);
                    return;
                }
                int i5 = i4 + adcel3;
                this.advert = i5;
                int adcel4 = AbstractC18226e.ad.adcel(str, bArr2, i5, i3 - i5);
                this.advert = i4;
                firebase((adcel4 - i4) - adcel3);
                this.advert = adcel4;
            } catch (C8300e e) {
                this.advert = i4;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new C13593e((IndexOutOfBoundsException) e2);
            }
        } catch (C8300e e3) {
            advert(str, e3);
        }
    }

    /* renamed from: this, reason: not valid java name */
    public final void m262this(byte[] bArr, int i, int i2) {
        int i3 = this.advert;
        int i4 = this.mopub;
        int i5 = i4 - i3;
        byte[] bArr2 = this.adcel;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.advert += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.advert = i4;
        m261interface();
        if (i7 > i4) {
            this.smaato.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.advert = i7;
        }
    }
}
