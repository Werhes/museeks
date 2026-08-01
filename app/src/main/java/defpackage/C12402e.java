package defpackage;

import java.io.EOFException;
import java.io.Flushable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَّۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12402e implements InterfaceC17430e, AutoCloseable, Flushable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public long f24832e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C0378e f24833e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C0378e f24834e;

    public final /* synthetic */ void Signature() {
        C0378e c0378e = this.f24833e;
        C0378e c0378e2 = c0378e.billing;
        this.f24833e = c0378e2;
        if (c0378e2 == null) {
            this.f24834e = null;
        } else {
            c0378e2.purchase = null;
        }
        c0378e.billing = null;
        AbstractC16402e.ad(c0378e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eَّۙ, java.lang.Object] */
    public final C12402e ad() {
        ?? obj = new Object();
        if (this.f24832e == 0) {
            return obj;
        }
        C0378e c0378e = this.f24834e;
        C0378e appmetrica = c0378e.appmetrica();
        obj.f24834e = appmetrica;
        obj.f24833e = appmetrica;
        for (C0378e c0378e2 = c0378e.purchase; c0378e2 != null; c0378e2 = c0378e2.purchase) {
            C0378e c0378e3 = obj.f24833e;
            C0378e appmetrica2 = c0378e2.appmetrica();
            c0378e3.license(appmetrica2);
            obj.f24833e = appmetrica2;
        }
        obj.f24832e = this.f24832e;
        return obj;
    }

    @Override // defpackage.InterfaceC17430e
    public final void admob(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j, "byteCount: ").toString());
        }
        if (this.f24832e >= j) {
            return;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.f24832e + ", required: " + j + ')');
    }

    public final long ads(C12402e c12402e) {
        long j = this.f24832e;
        if (j > 0) {
            c12402e.crashlytics(this, j);
        }
        return j;
    }

    public final void advert(C12402e c12402e, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1634e.mopub(j, "byteCount (", ") < 0").toString());
        }
        long j2 = this.f24832e;
        if (j2 >= j) {
            c12402e.crashlytics(this, j);
        } else {
            c12402e.crashlytics(this, j2);
            throw new EOFException(AbstractC5087e.m1750native(this.f24832e, " bytes were written.", AbstractC1786e.inmobi(j, "Buffer exhausted before writing ", " bytes. Only ")));
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    public final void crashlytics(C12402e c12402e, long j) {
        C0378e vip;
        if (c12402e == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC8913e.metrica(c12402e.f24832e, 0L, j);
        while (j > 0) {
            if (j < c12402e.f24834e.vip()) {
                C0378e c0378e = this.f24833e;
                if (c0378e != null && c0378e.appmetrica) {
                    long j2 = c0378e.metrica + j;
                    AbstractC5679e abstractC5679e = c0378e.license;
                    if (j2 - ((abstractC5679e == null || ((C10447e) abstractC5679e).metrica <= 0) ? c0378e.vip : 0) <= 8192) {
                        c12402e.f24834e.purchase(c0378e, (int) j);
                        c12402e.f24832e -= j;
                        this.f24832e += j;
                        return;
                    }
                }
                C0378e c0378e2 = c12402e.f24834e;
                int i = (int) j;
                if (i <= 0) {
                    c0378e2.getClass();
                } else if (i <= c0378e2.metrica - c0378e2.vip) {
                    if (i >= 1024) {
                        vip = c0378e2.appmetrica();
                    } else {
                        vip = AbstractC16402e.vip();
                        byte[] bArr = c0378e2.ad;
                        byte[] bArr2 = vip.ad;
                        int i2 = c0378e2.vip;
                        AbstractC1660e.admob(bArr, 0, i2, bArr2, i2 + i, 2);
                    }
                    vip.metrica = vip.vip + i;
                    c0378e2.vip += i;
                    C0378e c0378e3 = c0378e2.billing;
                    if (c0378e3 != null) {
                        c0378e3.license(vip);
                    } else {
                        vip.purchase = c0378e2;
                        c0378e2.billing = vip;
                    }
                    c12402e.f24834e = vip;
                }
                throw new IllegalArgumentException("byteCount out of range");
            }
            C0378e c0378e4 = c12402e.f24834e;
            long vip2 = c0378e4.vip();
            C0378e c0378e5 = c0378e4.purchase;
            C0378e c0378e6 = c0378e4.billing;
            if (c0378e6 != null) {
                c0378e6.purchase = c0378e5;
            }
            C0378e c0378e7 = c0378e4.purchase;
            if (c0378e7 != null) {
                c0378e7.billing = c0378e6;
            }
            c0378e4.purchase = null;
            c0378e4.billing = null;
            c12402e.f24834e = c0378e5;
            if (c0378e5 == null) {
                c12402e.f24833e = null;
            }
            if (this.f24834e == null) {
                this.f24834e = c0378e4;
                this.f24833e = c0378e4;
            } else {
                this.f24833e.license(c0378e4);
                C0378e c0378e8 = c0378e4.billing;
                if (c0378e8 == null) {
                    throw new IllegalStateException("cannot compact");
                }
                if (c0378e8.appmetrica) {
                    int i3 = c0378e4.metrica - c0378e4.vip;
                    int i4 = 8192 - c0378e8.metrica;
                    AbstractC5679e abstractC5679e2 = c0378e8.license;
                    if (i3 <= i4 + ((abstractC5679e2 == null || ((C10447e) abstractC5679e2).metrica <= 0) ? c0378e4.billing.vip : 0)) {
                        C0378e c0378e9 = c0378e4.billing;
                        c0378e4.purchase(c0378e9, i3);
                        C0378e c0378e10 = c0378e4.purchase;
                        C0378e c0378e11 = c0378e4.billing;
                        if (c0378e11 != null) {
                            c0378e11.purchase = c0378e10;
                        }
                        C0378e c0378e12 = c0378e4.purchase;
                        if (c0378e12 != null) {
                            c0378e12.billing = c0378e11;
                        }
                        c0378e4.purchase = null;
                        c0378e4.billing = null;
                        if (c0378e10 != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        AbstractC16402e.ad(c0378e4);
                        c0378e4 = c0378e9;
                    }
                }
                this.f24833e = c0378e4;
                if (c0378e4.billing == null) {
                    this.f24834e = c0378e4;
                }
            }
            c12402e.f24832e -= vip2;
            this.f24832e += vip2;
            j -= vip2;
        }
    }

    @Override // defpackage.InterfaceC17430e
    /* renamed from: eِؗؓ */
    public final int mo1230e(int i, int i2, byte[] bArr) {
        AbstractC8913e.vip(bArr.length, i, i2);
        C0378e c0378e = this.f24834e;
        if (c0378e == null) {
            return -1;
        }
        int min = Math.min(i2 - i, c0378e.vip());
        int i3 = (i + min) - i;
        byte[] bArr2 = c0378e.ad;
        int i4 = c0378e.vip;
        AbstractC1660e.smaato(bArr2, i, i4, bArr, i4 + i3);
        c0378e.vip += i3;
        this.f24832e -= min;
        if (AbstractC10432e.license(c0378e)) {
            loadAd();
        }
        return min;
    }

    @Override // java.io.Flushable
    public final void flush() {
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m3339goto(byte b) {
        C0378e subs = subs(1);
        byte[] bArr = subs.ad;
        int i = subs.metrica;
        subs.metrica = i + 1;
        bArr[i] = b;
        this.f24832e++;
    }

    public final long inmobi(InterfaceC6079e interfaceC6079e) {
        long j = 0;
        while (true) {
            long mo805this = interfaceC6079e.mo805this(this, 8192L);
            if (mo805this == -1) {
                return j;
            }
            j += mo805this;
        }
    }

    public final void isVip(long j) {
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.f24832e + ", required: " + j + ')');
    }

    public final byte license(long j) {
        long j2 = 0;
        if (j < 0 || j >= this.f24832e) {
            throw new IndexOutOfBoundsException(AbstractC5087e.m1750native(this.f24832e, "))", AbstractC1786e.inmobi(j, "position (", ") is not within the range [0..size(")));
        }
        if (j == 0) {
            return this.f24834e.metrica(0);
        }
        this.f24834e.getClass();
        long j3 = this.f24832e;
        if (j3 - j < j) {
            C0378e c0378e = this.f24833e;
            while (c0378e != null && j3 > j) {
                j3 -= c0378e.metrica - c0378e.vip;
                if (j3 <= j) {
                    break;
                }
                c0378e = c0378e.billing;
            }
            return c0378e.metrica((int) (j - j3));
        }
        C0378e c0378e2 = this.f24834e;
        while (c0378e2 != null) {
            long j4 = (c0378e2.metrica - c0378e2.vip) + j2;
            if (j4 > j) {
                break;
            }
            c0378e2 = c0378e2.purchase;
            j2 = j4;
        }
        return c0378e2.metrica((int) (j - j2));
    }

    public final void loadAd() {
        C0378e c0378e = this.f24834e;
        C0378e c0378e2 = c0378e.purchase;
        this.f24834e = c0378e2;
        if (c0378e2 == null) {
            this.f24833e = null;
        } else {
            c0378e2.billing = null;
        }
        c0378e.purchase = null;
        AbstractC16402e.ad(c0378e);
    }

    @Override // defpackage.InterfaceC17430e
    public final C12402e metrica() {
        return this;
    }

    public final void purchase() {
    }

    @Override // defpackage.InterfaceC17430e
    public final byte readByte() {
        C0378e c0378e = this.f24834e;
        if (c0378e == null) {
            isVip(1L);
            throw null;
        }
        int vip = c0378e.vip();
        if (vip == 0) {
            loadAd();
            return readByte();
        }
        byte[] bArr = c0378e.ad;
        int i = c0378e.vip;
        c0378e.vip = i + 1;
        byte b = bArr[i];
        this.f24832e--;
        if (vip == 1) {
            loadAd();
        }
        return b;
    }

    public final short readShort() {
        C0378e c0378e = this.f24834e;
        if (c0378e == null) {
            isVip(2L);
            throw null;
        }
        int vip = c0378e.vip();
        if (vip < 2) {
            admob(2L);
            if (vip != 0) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            loadAd();
            return readShort();
        }
        byte[] bArr = c0378e.ad;
        int i = c0378e.vip;
        short s = (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
        c0378e.vip = i + 2;
        this.f24832e -= 2;
        if (vip == 2) {
            loadAd();
        }
        return s;
    }

    @Override // defpackage.InterfaceC17430e
    public final boolean request(long j) {
        if (j >= 0) {
            return this.f24832e >= j;
        }
        throw new IllegalArgumentException(AbstractC1634e.mopub(j, "byteCount: ", " < 0").toString());
    }

    public final void skip(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1634e.mopub(j, "byteCount (", ") < 0").toString());
        }
        long j2 = j;
        while (j2 > 0) {
            C0378e c0378e = this.f24834e;
            if (c0378e == null) {
                throw new EOFException(AbstractC1634e.mopub(j, "Buffer exhausted before skipping ", " bytes."));
            }
            int min = (int) Math.min(j2, c0378e.metrica - c0378e.vip);
            long j3 = min;
            this.f24832e -= j3;
            j2 -= j3;
            int i = c0378e.vip + min;
            c0378e.vip = i;
            if (i == c0378e.metrica) {
                loadAd();
            }
        }
    }

    public final /* synthetic */ C0378e subs(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("unexpected capacity (", i, "), should be in range [1, 8192]").toString());
        }
        C0378e c0378e = this.f24833e;
        if (c0378e == null) {
            C0378e vip = AbstractC16402e.vip();
            this.f24834e = vip;
            this.f24833e = vip;
            return vip;
        }
        if (c0378e.metrica + i <= 8192 && c0378e.appmetrica) {
            return c0378e;
        }
        C0378e vip2 = AbstractC16402e.vip();
        c0378e.license(vip2);
        this.f24833e = vip2;
        return vip2;
    }

    @Override // defpackage.InterfaceC6079e
    /* renamed from: this */
    public final long mo805this(C12402e c12402e, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1634e.mopub(j, "byteCount (", ") < 0").toString());
        }
        long j2 = this.f24832e;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c12402e.crashlytics(this, j);
        return j;
    }

    public final String toString() {
        long j = this.f24832e;
        if (j == 0) {
            return "Buffer(size=0)";
        }
        long j2 = 64;
        int min = (int) Math.min(j2, j);
        StringBuilder sb = new StringBuilder((min * 2) + (this.f24832e > j2 ? 1 : 0));
        int i = 0;
        for (C0378e c0378e = this.f24834e; c0378e != null; c0378e = c0378e.purchase) {
            int i2 = 0;
            while (i < min && i2 < c0378e.vip()) {
                int i3 = i2 + 1;
                byte metrica = c0378e.metrica(i2);
                i++;
                char[] cArr = AbstractC8913e.billing;
                sb.append(cArr[(metrica >> 4) & 15]);
                sb.append(cArr[metrica & 15]);
                i2 = i3;
            }
        }
        if (this.f24832e > j2) {
            sb.append((char) 8230);
        }
        return "Buffer(size=" + this.f24832e + " hex=" + ((Object) sb) + ')';
    }

    public final void write(byte[] bArr, int i, int i2) {
        AbstractC8913e.vip(bArr.length, i, i2);
        int i3 = i;
        while (i3 < i2) {
            C0378e subs = subs(1);
            int min = Math.min(i2 - i3, subs.ad()) + i3;
            AbstractC1660e.smaato(bArr, subs.metrica, i3, subs.ad, min);
            subs.metrica = (min - i3) + subs.metrica;
            i3 = min;
        }
        this.f24832e += i2 - i;
    }

    @Override // defpackage.InterfaceC17430e
    public final boolean yandex() {
        return this.f24832e == 0;
    }
}
