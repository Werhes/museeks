package defpackage;

import java.io.OutputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٕۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7615e extends AbstractC16754e {
    public final byte[] appmetrica;
    public int billing;
    public final int purchase;
    public final OutputStream yandex;

    public C7615e(OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i, 20);
        this.appmetrica = new byte[max];
        this.purchase = max;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.yandex = outputStream;
    }

    @Override // defpackage.AbstractC16754e
    public final void Signature(int i, AbstractC4002e abstractC4002e) {
        isPro(i, 2);
        ads(abstractC4002e.size());
        C11507e c11507e = (C11507e) abstractC4002e;
        appmetrica(c11507e.adcel(), c11507e.size(), c11507e.f23125e);
    }

    @Override // defpackage.AbstractC16754e
    public final void admob(int i, int i2) {
        m2300native(14);
        m2296class(i, 5);
        crashlytics(i2);
    }

    @Override // defpackage.AbstractC16754e
    public final void ads(int i) {
        m2300native(5);
        m2299interface(i);
    }

    @Override // defpackage.AbstractC16754e
    public final void amazon(byte b) {
        if (this.billing == this.purchase) {
            m2301this();
        }
        int i = this.billing;
        this.billing = i + 1;
        this.appmetrica[i] = b;
    }

    @Override // defpackage.AbstractC16754e
    public final void applovin(int i, int i2) {
        m2300native(20);
        m2296class(i, 0);
        m2299interface(i2);
    }

    @Override // defpackage.AbstractC16275e
    public final void appmetrica(int i, int i2, byte[] bArr) {
        m2297extends(bArr, i, i2);
    }

    /* renamed from: class, reason: not valid java name */
    public final void m2296class(int i, int i2) {
        m2299interface((i << 3) | i2);
    }

    public final void crashlytics(int i) {
        int i2 = this.billing;
        int i3 = i2 + 1;
        this.billing = i3;
        byte[] bArr = this.appmetrica;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.billing = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.billing = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.billing = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    /* renamed from: extends, reason: not valid java name */
    public final void m2297extends(byte[] bArr, int i, int i2) {
        int i3 = this.billing;
        int i4 = this.purchase;
        int i5 = i4 - i3;
        byte[] bArr2 = this.appmetrica;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.billing += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.billing = i4;
        m2301this();
        if (i7 > i4) {
            this.yandex.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.billing = i7;
        }
    }

    public final void firebase(long j) {
        int i = this.billing;
        int i2 = i + 1;
        this.billing = i2;
        byte[] bArr = this.appmetrica;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.billing = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.billing = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.billing = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.billing = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.billing = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.billing = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.billing = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m2298goto(long j) {
        boolean z = AbstractC16754e.license;
        byte[] bArr = this.appmetrica;
        if (z) {
            while ((j & (-128)) != 0) {
                int i = this.billing;
                this.billing = i + 1;
                AbstractC14352e.mopub(bArr, i, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            int i2 = this.billing;
            this.billing = i2 + 1;
            AbstractC14352e.mopub(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i3 = this.billing;
            this.billing = i3 + 1;
            bArr[i3] = (byte) ((((int) j) | 128) & 255);
            j >>>= 7;
        }
        int i4 = this.billing;
        this.billing = i4 + 1;
        bArr[i4] = (byte) j;
    }

    @Override // defpackage.AbstractC16754e
    public final void inmobi(int i, String str) {
        isPro(i, 2);
        try {
            int length = str.length() * 3;
            int mopub = AbstractC16754e.mopub(length);
            int i2 = mopub + length;
            int i3 = this.purchase;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int license = AbstractC15375e.ad.license(str, bArr, 0, length);
                ads(license);
                m2297extends(bArr, 0, license);
                return;
            }
            if (i2 > i3 - this.billing) {
                m2301this();
            }
            int mopub2 = AbstractC16754e.mopub(str.length());
            int i4 = this.billing;
            byte[] bArr2 = this.appmetrica;
            try {
                if (mopub2 != mopub) {
                    int vip = AbstractC15375e.vip(str);
                    m2299interface(vip);
                    this.billing = AbstractC15375e.ad.license(str, bArr2, this.billing, vip);
                    return;
                }
                int i5 = i4 + mopub2;
                this.billing = i5;
                int license2 = AbstractC15375e.ad.license(str, bArr2, i5, i3 - i5);
                this.billing = i4;
                m2299interface((license2 - i4) - mopub2);
                this.billing = license2;
            } catch (C4035e e) {
                this.billing = i4;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new C13593e((IndexOutOfBoundsException) e2);
            }
        } catch (C4035e e3) {
            smaato(str, e3);
        }
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m2299interface(int i) {
        boolean z = AbstractC16754e.license;
        byte[] bArr = this.appmetrica;
        if (z) {
            while ((i & (-128)) != 0) {
                int i2 = this.billing;
                this.billing = i2 + 1;
                AbstractC14352e.mopub(bArr, i2, (byte) ((i | 128) & 255));
                i >>>= 7;
            }
            int i3 = this.billing;
            this.billing = i3 + 1;
            AbstractC14352e.mopub(bArr, i3, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i4 = this.billing;
            this.billing = i4 + 1;
            bArr[i4] = (byte) ((i | 128) & 255);
            i >>>= 7;
        }
        int i5 = this.billing;
        this.billing = i5 + 1;
        bArr[i5] = (byte) i;
    }

    @Override // defpackage.AbstractC16754e
    public final void isPro(int i, int i2) {
        ads((i << 3) | i2);
    }

    @Override // defpackage.AbstractC16754e
    public final void isVip(int i, AbstractC6866e abstractC6866e, InterfaceC3028e interfaceC3028e) {
        isPro(i, 2);
        ads(abstractC6866e.vip(interfaceC3028e));
        interfaceC3028e.purchase(abstractC6866e, this.vip);
    }

    @Override // defpackage.AbstractC16754e
    public final void loadAd(int i, boolean z) {
        m2300native(11);
        m2296class(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.billing;
        this.billing = i2 + 1;
        this.appmetrica[i2] = b;
    }

    /* renamed from: native, reason: not valid java name */
    public final void m2300native(int i) {
        if (this.purchase - this.billing < i) {
            m2301this();
        }
    }

    @Override // defpackage.AbstractC16754e
    public final void premium(int i, long j) {
        m2300native(20);
        m2296class(i, 0);
        m2298goto(j);
    }

    @Override // defpackage.AbstractC16754e
    public final void pro(long j) {
        m2300native(8);
        firebase(j);
    }

    @Override // defpackage.AbstractC16754e
    public final void remoteconfig(int i, long j) {
        m2300native(18);
        m2296class(i, 1);
        firebase(j);
    }

    @Override // defpackage.AbstractC16754e
    public final void signatures(int i, int i2) {
        m2300native(20);
        m2296class(i, 0);
        if (i2 >= 0) {
            m2299interface(i2);
        } else {
            m2298goto(i2);
        }
    }

    @Override // defpackage.AbstractC16754e
    public final void subs(long j) {
        m2300native(10);
        m2298goto(j);
    }

    @Override // defpackage.AbstractC16754e
    public final void subscription(int i) {
        m2300native(4);
        crashlytics(i);
    }

    @Override // defpackage.AbstractC16754e
    public final void tapsense(int i) {
        if (i >= 0) {
            ads(i);
        } else {
            subs(i);
        }
    }

    /* renamed from: this, reason: not valid java name */
    public final void m2301this() {
        this.yandex.write(this.appmetrica, 0, this.billing);
        this.billing = 0;
    }
}
