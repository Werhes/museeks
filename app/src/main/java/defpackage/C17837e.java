package defpackage;

import java.io.OutputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٙۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17837e extends AbstractC13874e {
    public final int appmetrica;
    public final OutputStream billing;
    public final byte[] license;
    public int purchase;

    public C17837e(OutputStream outputStream, int i) {
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.billing = outputStream;
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.license = bArr;
        this.appmetrica = bArr.length;
    }

    /* renamed from: abstract, reason: not valid java name */
    public final void m4437abstract(int i) {
        if (this.appmetrica - this.purchase < i) {
            m4439default();
        }
    }

    @Override // defpackage.AbstractC6874e
    public final void admob(int i, int i2, byte[] bArr) {
        m4438break(i, i2, bArr);
    }

    @Override // defpackage.AbstractC13874e
    public final void ads(int i, String str) {
        mo1198goto((i << 3) | 2);
        mo1202throw(str);
    }

    @Override // defpackage.AbstractC13874e
    public final void applovin(int i, boolean z) {
        m4437abstract(11);
        m4440implements(i << 3);
        int i2 = this.purchase;
        this.license[i2] = z ? (byte) 1 : (byte) 0;
        this.purchase = i2 + 1;
    }

    /* renamed from: break, reason: not valid java name */
    public final void m4438break(int i, int i2, byte[] bArr) {
        int i3 = this.purchase;
        int i4 = this.appmetrica;
        int i5 = i4 - i3;
        byte[] bArr2 = this.license;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.purchase += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        this.purchase = i4;
        m4439default();
        int i7 = i2 - i5;
        if (i7 > i4) {
            this.billing.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.purchase = i7;
        }
    }

    @Override // defpackage.AbstractC13874e
    /* renamed from: class */
    public final void mo1196class(byte b) {
        if (this.purchase == this.appmetrica) {
            m4439default();
        }
        int i = this.purchase;
        this.license[i] = b;
        this.purchase = i + 1;
    }

    @Override // defpackage.AbstractC13874e
    public final void crashlytics(int i, byte[] bArr) {
        mo1198goto(i);
        m4438break(0, i, bArr);
    }

    /* renamed from: default, reason: not valid java name */
    public final void m4439default() {
        this.billing.write(this.license, 0, this.purchase);
        this.purchase = 0;
    }

    @Override // defpackage.AbstractC13874e
    /* renamed from: extends */
    public final void mo1197extends(long j) {
        m4437abstract(8);
        m4441protected(j);
    }

    @Override // defpackage.AbstractC13874e
    public final void firebase(AbstractC17836e abstractC17836e) {
        AbstractC15319e abstractC15319e = (AbstractC15319e) abstractC17836e;
        mo1198goto(abstractC15319e.amazon());
        abstractC15319e.purchase(this);
    }

    @Override // defpackage.AbstractC13874e
    /* renamed from: goto */
    public final void mo1198goto(int i) {
        m4437abstract(5);
        m4440implements(i);
    }

    /* renamed from: implements, reason: not valid java name */
    public final void m4440implements(int i) {
        boolean z = AbstractC13874e.metrica;
        byte[] bArr = this.license;
        if (z) {
            while ((i & (-128)) != 0) {
                int i2 = this.purchase;
                this.purchase = i2 + 1;
                AbstractC1929e.mopub(bArr, i2, (byte) (i | 128));
                i >>>= 7;
            }
            int i3 = this.purchase;
            this.purchase = i3 + 1;
            AbstractC1929e.mopub(bArr, i3, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i4 = this.purchase;
            this.purchase = i4 + 1;
            bArr[i4] = (byte) (i | 128);
            i >>>= 7;
        }
        int i5 = this.purchase;
        this.purchase = i5 + 1;
        bArr[i5] = (byte) i;
    }

    @Override // defpackage.AbstractC13874e
    public final void inmobi(int i, long j) {
        m4437abstract(20);
        m4440implements(i << 3);
        m4443while(j);
    }

    @Override // defpackage.AbstractC13874e
    /* renamed from: interface */
    public final void mo1199interface(int i) {
        if (i >= 0) {
            mo1198goto(i);
        } else {
            mo1200native(i);
        }
    }

    @Override // defpackage.AbstractC13874e
    public final void isPro(int i, long j) {
        m4437abstract(18);
        m4440implements((i << 3) | 1);
        m4441protected(j);
    }

    @Override // defpackage.AbstractC13874e
    public final void isVip(int i, int i2) {
        m4437abstract(14);
        m4440implements((i << 3) | 5);
        m4442try(i2);
    }

    @Override // defpackage.AbstractC13874e
    /* renamed from: native */
    public final void mo1200native(long j) {
        m4437abstract(10);
        m4443while(j);
    }

    @Override // defpackage.AbstractC13874e
    public final void premium(int i, AbstractC7244e abstractC7244e) {
        mo1198goto((i << 3) | 2);
        subs(abstractC7244e);
    }

    @Override // defpackage.AbstractC13874e
    public final void pro(int i, int i2) {
        mo1198goto((i << 3) | i2);
    }

    /* renamed from: protected, reason: not valid java name */
    public final void m4441protected(long j) {
        int i = this.purchase;
        byte[] bArr = this.license;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.purchase = i + 8;
    }

    @Override // defpackage.AbstractC13874e
    public final void signatures(int i, int i2) {
        m4437abstract(20);
        m4440implements(i << 3);
        if (i2 >= 0) {
            m4440implements(i2);
        } else {
            m4443while(i2);
        }
    }

    @Override // defpackage.AbstractC13874e
    public final void subs(AbstractC7244e abstractC7244e) {
        mo1198goto(abstractC7244e.billing());
        abstractC7244e.adcel(this);
    }

    @Override // defpackage.AbstractC13874e
    public final void tapsense(int i, int i2) {
        m4437abstract(20);
        m4440implements(i << 3);
        m4440implements(i2);
    }

    @Override // defpackage.AbstractC13874e
    /* renamed from: this */
    public final void mo1201this(int i) {
        m4437abstract(4);
        m4442try(i);
    }

    @Override // defpackage.AbstractC13874e
    /* renamed from: throw */
    public final void mo1202throw(String str) {
        int length = str.length() * 3;
        int subscription = AbstractC13874e.subscription(length);
        int i = subscription + length;
        int i2 = this.appmetrica;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int metrica = AbstractC2059e.metrica(str, bArr, 0, length);
            mo1198goto(metrica);
            m4438break(0, metrica, bArr);
            return;
        }
        if (i > i2 - this.purchase) {
            m4439default();
        }
        int subscription2 = AbstractC13874e.subscription(str.length());
        int i3 = this.purchase;
        byte[] bArr2 = this.license;
        try {
            if (subscription2 == subscription) {
                int i4 = i3 + subscription2;
                this.purchase = i4;
                int metrica2 = AbstractC2059e.metrica(str, bArr2, i4, i2 - i4);
                this.purchase = i3;
                m4440implements((metrica2 - i3) - subscription2);
                this.purchase = metrica2;
            } else {
                int vip = AbstractC2059e.vip(str);
                m4440implements(vip);
                this.purchase = AbstractC2059e.metrica(str, bArr2, this.purchase, vip);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C13593e((IndexOutOfBoundsException) e);
        }
    }

    /* renamed from: try, reason: not valid java name */
    public final void m4442try(int i) {
        int i2 = this.purchase;
        byte[] bArr = this.license;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.purchase = i2 + 4;
    }

    /* renamed from: while, reason: not valid java name */
    public final void m4443while(long j) {
        boolean z = AbstractC13874e.metrica;
        byte[] bArr = this.license;
        if (z) {
            while (true) {
                int i = (int) j;
                if ((j & (-128)) == 0) {
                    int i2 = this.purchase;
                    this.purchase = i2 + 1;
                    AbstractC1929e.mopub(bArr, i2, (byte) i);
                    return;
                } else {
                    int i3 = this.purchase;
                    this.purchase = i3 + 1;
                    AbstractC1929e.mopub(bArr, i3, (byte) (i | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = (int) j;
                if ((j & (-128)) == 0) {
                    int i5 = this.purchase;
                    this.purchase = i5 + 1;
                    bArr[i5] = (byte) i4;
                    return;
                } else {
                    int i6 = this.purchase;
                    this.purchase = i6 + 1;
                    bArr[i6] = (byte) (i4 | 128);
                    j >>>= 7;
                }
            }
        }
    }
}
