package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16151e implements InterfaceC4895e, InterfaceC11855e, Cloneable, ByteChannel {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long f31731e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C16592e f31732e;

    public final byte Signature(long j) {
        AbstractC7844e.startapp(this.f31731e, j, 1L);
        C16592e c16592e = this.f31732e;
        c16592e.getClass();
        long j2 = this.f31731e;
        if (j2 - j < j) {
            while (j2 > j) {
                c16592e = c16592e.billing;
                j2 -= c16592e.metrica - c16592e.vip;
            }
            return c16592e.ad[(int) ((c16592e.vip + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = c16592e.metrica;
            int i2 = c16592e.vip;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return c16592e.ad[(int) ((i2 + j) - j3)];
            }
            c16592e = c16592e.purchase;
            j3 = j4;
        }
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: abstract */
    public final String mo1677abstract() {
        long isVip = isVip((byte) 10, 0L, Long.MAX_VALUE);
        if (isVip != -1) {
            return vip.metrica(this, isVip);
        }
        long j = this.f31731e;
        if (j != 0) {
            return mo1683e(j, AbstractC5508e.ad);
        }
        return null;
    }

    public final void ad() {
        skip(this.f31731e);
    }

    @Override // defpackage.InterfaceC4895e
    public final void admob(long j) {
        if (this.f31731e < j) {
            throw new EOFException();
        }
    }

    public final boolean ads(long j, C0193e c0193e, int i) {
        if (i >= 0 && j >= 0 && i + j <= this.f31731e && i <= c0193e.license()) {
            return i == 0 || vip.ad(this, c0193e, j, j + 1, i) != -1;
        }
        return false;
    }

    @Override // defpackage.InterfaceC11855e
    public final /* bridge */ /* synthetic */ InterfaceC11855e applovin(C0193e c0193e) {
        m4122catch(c0193e);
        return this;
    }

    /* renamed from: break, reason: not valid java name */
    public final C0193e m4121break(int i) {
        if (i == 0) {
            return C0193e.f1409e;
        }
        AbstractC7844e.startapp(this.f31731e, 0L, i);
        C16592e c16592e = this.f31732e;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c16592e.metrica;
            int i6 = c16592e.vip;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            c16592e = c16592e.purchase;
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        C16592e c16592e2 = this.f31732e;
        int i7 = 0;
        while (i2 < i) {
            bArr[i7] = c16592e2.ad;
            i2 += c16592e2.metrica - c16592e2.vip;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c16592e2.vip;
            c16592e2.license = true;
            i7++;
            c16592e2 = c16592e2.purchase;
        }
        return new C13324e(bArr, iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [eِٖۢ, java.lang.Object] */
    @Override // defpackage.InterfaceC4895e
    /* renamed from: case */
    public final String mo1678case(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j, "limit < 0: ").toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long isVip = isVip((byte) 10, 0L, j2);
        if (isVip != -1) {
            return vip.metrica(this, isVip);
        }
        if (j2 < this.f31731e && Signature(j2 - 1) == 13 && Signature(j2) == 10) {
            return vip.metrica(this, j2);
        }
        ?? obj = new Object();
        loadAd(0L, Math.min(32, this.f31731e), obj);
        throw new EOFException("\\n not found: limit=" + Math.min(this.f31731e, j) + " content=" + obj.isPro(obj.f31731e).appmetrica() + (char) 8230);
    }

    /* renamed from: catch, reason: not valid java name */
    public final void m4122catch(C0193e c0193e) {
        c0193e.pro(this, c0193e.license());
    }

    @Override // defpackage.InterfaceC11855e
    /* renamed from: class */
    public final long mo2629class(InterfaceC2537e interfaceC2537e) {
        long j = 0;
        while (true) {
            long signatures = interfaceC2537e.signatures(this, 8192L);
            if (signatures == -1) {
                return j;
            }
            j += signatures;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.InterfaceC0274e
    public final void close() {
    }

    /* renamed from: const, reason: not valid java name */
    public final void m4123const(long j) {
        C16592e m4130implements = m4130implements(8);
        byte[] bArr = m4130implements.ad;
        int i = m4130implements.metrica;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        m4130implements.metrica = i + 8;
        this.f31731e += 8;
    }

    public final void crashlytics(C16151e c16151e, long j) {
        long j2 = this.f31731e;
        if (j2 >= j) {
            c16151e.mo272transient(this, j);
        } else {
            c16151e.mo272transient(this, j2);
            throw new EOFException();
        }
    }

    /* renamed from: else, reason: not valid java name */
    public final void m4124else(int i) {
        C16592e m4130implements = m4130implements(4);
        byte[] bArr = m4130implements.ad;
        int i2 = m4130implements.metrica;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        m4130implements.metrica = i2 + 4;
        this.f31731e += 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16151e)) {
            return false;
        }
        long j = this.f31731e;
        C16151e c16151e = (C16151e) obj;
        if (j != c16151e.f31731e) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        C16592e c16592e = this.f31732e;
        C16592e c16592e2 = c16151e.f31732e;
        int i = c16592e.vip;
        int i2 = c16592e2.vip;
        long j2 = 0;
        while (j2 < this.f31731e) {
            long min = Math.min(c16592e.metrica - i, c16592e2.metrica - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (c16592e.ad[i] != c16592e2.ad[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == c16592e.metrica) {
                c16592e = c16592e.purchase;
                i = c16592e.vip;
            }
            if (i2 == c16592e2.metrica) {
                c16592e2 = c16592e2.purchase;
                i2 = c16592e2.vip;
            }
            j2 += min;
        }
        return true;
    }

    /* renamed from: extends, reason: not valid java name */
    public final long m4125extends() {
        long j = this.f31731e;
        if (j < 8) {
            throw new EOFException();
        }
        C16592e c16592e = this.f31732e;
        int i = c16592e.vip;
        int i2 = c16592e.metrica;
        if (i2 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = c16592e.ad;
        int i3 = i + 7;
        long j2 = ((bArr[i + 1] & 255) << 48) | ((bArr[i] & 255) << 56) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i4 = i + 8;
        long j3 = j2 | (bArr[i3] & 255);
        this.f31731e = j - 8;
        if (i4 != i2) {
            c16592e.vip = i4;
            return j3;
        }
        this.f31732e = c16592e.ad();
        AbstractC11279e.ad(c16592e);
        return j3;
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: eؑۥؘ */
    public final long mo1679e() {
        return AbstractC7844e.amazon(m4125extends());
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: eؒۖۗ */
    public final InputStream mo1680e() {
        return new C7404e(1, this);
    }

    /* renamed from: eؒۤۨ, reason: contains not printable characters */
    public final void m4126e(String str) {
        m4133public(0, str.length(), str);
    }

    /* renamed from: eؘْؖ, reason: contains not printable characters */
    public final void m4127e(int i) {
        if (i < 128) {
            m4128final(i);
            return;
        }
        if (i < 2048) {
            C16592e m4130implements = m4130implements(2);
            byte[] bArr = m4130implements.ad;
            int i2 = m4130implements.metrica;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            m4130implements.metrica = i2 + 2;
            this.f31731e += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            m4128final(63);
            return;
        }
        if (i < 65536) {
            C16592e m4130implements2 = m4130implements(3);
            byte[] bArr2 = m4130implements2.ad;
            int i3 = m4130implements2.metrica;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            m4130implements2.metrica = i3 + 3;
            this.f31731e += 3;
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(AbstractC7844e.loadAd(i)));
        }
        C16592e m4130implements3 = m4130implements(4);
        byte[] bArr3 = m4130implements3.ad;
        int i4 = m4130implements3.metrica;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        m4130implements3.metrica = i4 + 4;
        this.f31731e += 4;
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: eًًؓ */
    public final short mo1681e() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: eٓٛۢ */
    public final boolean mo1682e(long j, C0193e c0193e) {
        return ads(j, c0193e, c0193e.license());
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: eؙٟ٘ */
    public final String mo1683e(long j, Charset charset) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j, "byteCount: ").toString());
        }
        if (this.f31731e < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return BuildConfig.FLAVOR;
        }
        C16592e c16592e = this.f31732e;
        int i = c16592e.vip;
        if (i + j > c16592e.metrica) {
            return new String(subs(j), charset);
        }
        int i2 = (int) j;
        String str = new String(c16592e.ad, i, i2, charset);
        int i3 = c16592e.vip + i2;
        c16592e.vip = i3;
        this.f31731e -= j;
        if (i3 == c16592e.metrica) {
            this.f31732e = c16592e.ad();
            AbstractC11279e.ad(c16592e);
        }
        return str;
    }

    /* renamed from: final, reason: not valid java name */
    public final void m4128final(int i) {
        C16592e m4130implements = m4130implements(1);
        byte[] bArr = m4130implements.ad;
        int i2 = m4130implements.metrica;
        m4130implements.metrica = i2 + 1;
        bArr[i2] = (byte) i;
        this.f31731e++;
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: finally */
    public final int mo1684finally() {
        return AbstractC7844e.smaato(readInt());
    }

    @Override // defpackage.InterfaceC11855e, defpackage.InterfaceC0274e, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: for */
    public final long mo1685for(long j, C0193e c0193e) {
        byte[] bArr = vip.ad;
        return vip.ad(this, c0193e, 0L, j, c0193e.license());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f A[EDGE_INSN: B:40:0x009f->B:37:0x009f BREAK  A[LOOP:0: B:4:0x000c->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Type inference failed for: r0v7, types: [eِٖۢ, java.lang.Object] */
    /* renamed from: goto, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m4129goto() {
        /*
            r15 = this;
            long r0 = r15.f31731e
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La6
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            eٖۣؗ r7 = r15.f31732e
            byte[] r8 = r7.ad
            int r9 = r7.vip
            int r10 = r7.metrica
        L14:
            if (r9 >= r10) goto L8b
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L23
            r12 = 57
            if (r11 > r12) goto L23
            int r12 = r11 + (-48)
            goto L38
        L23:
            r12 = 97
            if (r11 < r12) goto L2e
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L2e
            int r12 = r11 + (-87)
            goto L38
        L2e:
            r12 = 65
            if (r11 < r12) goto L63
            r12 = 70
            if (r11 > r12) goto L63
            int r12 = r11 + (-55)
        L38:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L48
            r11 = 4
            long r4 = r4 << r11
            long r11 = (long) r12
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L14
        L48:
            eِٖۢ r0 = new eِٖۢ
            r0.<init>()
            r0.m4134static(r4)
            r0.m4128final(r11)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.m4132protected()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L63:
            r6 = 1
            if (r1 == 0) goto L67
            goto L8b
        L67:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            char[] r2 = defpackage.AbstractC6494e.vip
            int r3 = r11 >> 4
            r3 = r3 & 15
            char r3 = r2[r3]
            r4 = r11 & 15
            char r2 = r2[r4]
            r4 = 2
            char[] r4 = new char[r4]
            r4[r0] = r3
            r4[r6] = r2
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L8b:
            if (r9 != r10) goto L97
            eٖۣؗ r8 = r7.ad()
            r15.f31732e = r8
            defpackage.AbstractC11279e.ad(r7)
            goto L99
        L97:
            r7.vip = r9
        L99:
            if (r6 != 0) goto L9f
            eٖۣؗ r7 = r15.f31732e
            if (r7 != 0) goto Lc
        L9f:
            long r2 = r15.f31731e
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f31731e = r2
            return r4
        La6:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16151e.m4129goto():long");
    }

    public final int hashCode() {
        C16592e c16592e = this.f31732e;
        if (c16592e == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c16592e.metrica;
            for (int i3 = c16592e.vip; i3 < i2; i3++) {
                i = (i * 31) + c16592e.ad[i3];
            }
            c16592e = c16592e.purchase;
        } while (c16592e != this.f31732e);
        return i;
    }

    /* renamed from: implements, reason: not valid java name */
    public final C16592e m4130implements(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C16592e c16592e = this.f31732e;
        if (c16592e == null) {
            C16592e vip = AbstractC11279e.vip();
            this.f31732e = vip;
            vip.billing = vip;
            vip.purchase = vip;
            return vip;
        }
        C16592e c16592e2 = c16592e.billing;
        if (c16592e2.metrica + i <= 8192 && c16592e2.appmetrica) {
            return c16592e2;
        }
        C16592e vip2 = AbstractC11279e.vip();
        c16592e2.vip(vip2);
        return vip2;
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: import */
    public final String mo1686import(Charset charset) {
        return mo1683e(this.f31731e, charset);
    }

    public final long inmobi(long j, C0193e c0193e) {
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j, "fromIndex < 0: ").toString());
        }
        C16592e c16592e = this.f31732e;
        if (c16592e == null) {
            return -1L;
        }
        long j3 = this.f31731e;
        if (j3 - j < j) {
            while (j3 > j) {
                c16592e = c16592e.billing;
                j3 -= c16592e.metrica - c16592e.vip;
            }
            if (c0193e.license() == 2) {
                byte startapp = c0193e.startapp(0);
                byte startapp2 = c0193e.startapp(1);
                while (j3 < this.f31731e) {
                    byte[] bArr = c16592e.ad;
                    int i = c16592e.metrica;
                    for (int i2 = (int) ((c16592e.vip + j) - j3); i2 < i; i2++) {
                        byte b = bArr[i2];
                        if (b == startapp || b == startapp2) {
                            return (i2 - c16592e.vip) + j3;
                        }
                    }
                    j3 += c16592e.metrica - c16592e.vip;
                    c16592e = c16592e.purchase;
                    j = j3;
                }
            } else {
                byte[] yandex = c0193e.yandex();
                while (j3 < this.f31731e) {
                    byte[] bArr2 = c16592e.ad;
                    int i3 = c16592e.metrica;
                    for (int i4 = (int) ((c16592e.vip + j) - j3); i4 < i3; i4++) {
                        byte b2 = bArr2[i4];
                        for (byte b3 : yandex) {
                            if (b2 == b3) {
                                return (i4 - c16592e.vip) + j3;
                            }
                        }
                    }
                    j3 += c16592e.metrica - c16592e.vip;
                    c16592e = c16592e.purchase;
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = (c16592e.metrica - c16592e.vip) + j2;
            if (j4 > j) {
                break;
            }
            c16592e = c16592e.purchase;
            j2 = j4;
        }
        if (c0193e.license() == 2) {
            byte startapp3 = c0193e.startapp(0);
            byte startapp4 = c0193e.startapp(1);
            while (j2 < this.f31731e) {
                byte[] bArr3 = c16592e.ad;
                int i5 = c16592e.metrica;
                for (int i6 = (int) ((c16592e.vip + j) - j2); i6 < i5; i6++) {
                    byte b4 = bArr3[i6];
                    if (b4 == startapp3 || b4 == startapp4) {
                        return (i6 - c16592e.vip) + j2;
                    }
                }
                j2 += c16592e.metrica - c16592e.vip;
                c16592e = c16592e.purchase;
                j = j2;
            }
        } else {
            byte[] yandex2 = c0193e.yandex();
            while (j2 < this.f31731e) {
                byte[] bArr4 = c16592e.ad;
                int i7 = c16592e.metrica;
                for (int i8 = (int) ((c16592e.vip + j) - j2); i8 < i7; i8++) {
                    byte b5 = bArr4[i8];
                    for (byte b6 : yandex2) {
                        if (b5 == b6) {
                            return (i8 - c16592e.vip) + j2;
                        }
                    }
                }
                j2 += c16592e.metrica - c16592e.vip;
                c16592e = c16592e.purchase;
                j = j2;
            }
        }
        return -1L;
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: instanceof */
    public final int mo1687instanceof() {
        int i;
        int i2;
        int i3;
        if (this.f31731e == 0) {
            throw new EOFException();
        }
        byte Signature = Signature(0L);
        if ((Signature & 128) == 0) {
            i = Signature & Byte.MAX_VALUE;
            i3 = 0;
            i2 = 1;
        } else if ((Signature & 224) == 192) {
            i = Signature & 31;
            i2 = 2;
            i3 = 128;
        } else if ((Signature & 240) == 224) {
            i = Signature & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((Signature & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = Signature & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.f31731e < j) {
            StringBuilder premium = AbstractC4653e.premium("size < ", i2, ": ");
            premium.append(this.f31731e);
            premium.append(" (to read code point prefixed 0x");
            char[] cArr = AbstractC6494e.vip;
            premium.append(new String(new char[]{cArr[(Signature >> 4) & 15], cArr[Signature & 15]}));
            premium.append(')');
            throw new EOFException(premium.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte Signature2 = Signature(j2);
            if ((Signature2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (Signature2 & 63);
        }
        skip(j);
        if (i <= 1114111 && ((55296 > i || i >= 57344) && i >= i3)) {
            return i;
        }
        return 65533;
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: interface */
    public final byte[] mo1688interface() {
        return subs(this.f31731e);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.InterfaceC4895e
    public final C0193e isPro(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j, "byteCount: ").toString());
        }
        if (this.f31731e < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new C0193e(subs(j));
        }
        C0193e m4121break = m4121break((int) j);
        skip(j);
        return m4121break;
    }

    public final long isVip(byte b, long j, long j2) {
        C16592e c16592e;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            throw new IllegalArgumentException(("size=" + this.f31731e + " fromIndex=" + j3 + " toIndex=" + j4).toString());
        }
        long j6 = this.f31731e;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (c16592e = this.f31732e) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                c16592e = c16592e.billing;
                j6 -= c16592e.metrica - c16592e.vip;
            }
            while (j6 < j4) {
                byte[] bArr = c16592e.ad;
                long j8 = j7;
                int min = (int) Math.min(c16592e.metrica, (c16592e.vip + j4) - j6);
                for (int i = (int) ((c16592e.vip + j3) - j6); i < min; i++) {
                    if (bArr[i] == b) {
                        return (i - c16592e.vip) + j6;
                    }
                }
                j6 += c16592e.metrica - c16592e.vip;
                c16592e = c16592e.purchase;
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = (c16592e.metrica - c16592e.vip) + j5;
            if (j9 > j3) {
                break;
            }
            c16592e = c16592e.purchase;
            j5 = j9;
        }
        while (j5 < j4) {
            byte[] bArr2 = c16592e.ad;
            int min2 = (int) Math.min(c16592e.metrica, (c16592e.vip + j4) - j5);
            for (int i2 = (int) ((c16592e.vip + j3) - j5); i2 < min2; i2++) {
                if (bArr2[i2] == b) {
                    return (i2 - c16592e.vip) + j5;
                }
            }
            j5 += c16592e.metrica - c16592e.vip;
            c16592e = c16592e.purchase;
            j3 = j5;
        }
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eِٖۢ, java.lang.Object] */
    /* renamed from: license, reason: merged with bridge method [inline-methods] */
    public final C16151e clone() {
        ?? obj = new Object();
        if (this.f31731e == 0) {
            return obj;
        }
        C16592e c16592e = this.f31732e;
        C16592e metrica = c16592e.metrica();
        obj.f31732e = metrica;
        metrica.billing = metrica;
        metrica.purchase = metrica;
        for (C16592e c16592e2 = c16592e.purchase; c16592e2 != c16592e; c16592e2 = c16592e2.purchase) {
            metrica.billing.vip(c16592e2.metrica());
        }
        obj.f31731e = this.f31731e;
        return obj;
    }

    public final void loadAd(long j, long j2, C16151e c16151e) {
        long j3 = j;
        AbstractC7844e.startapp(this.f31731e, j3, j2);
        if (j2 == 0) {
            return;
        }
        c16151e.f31731e += j2;
        C16592e c16592e = this.f31732e;
        while (true) {
            long j4 = c16592e.metrica - c16592e.vip;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            c16592e = c16592e.purchase;
        }
        C16592e c16592e2 = c16592e;
        long j5 = j2;
        while (j5 > 0) {
            C16592e metrica = c16592e2.metrica();
            int i = metrica.vip + ((int) j3);
            metrica.vip = i;
            metrica.metrica = Math.min(i + ((int) j5), metrica.metrica);
            C16592e c16592e3 = c16151e.f31732e;
            if (c16592e3 == null) {
                metrica.billing = metrica;
                metrica.purchase = metrica;
                c16151e.f31732e = metrica;
            } else {
                c16592e3.billing.vip(metrica);
            }
            j5 -= metrica.metrica - metrica.vip;
            c16592e2 = c16592e2.purchase;
            j3 = 0;
        }
    }

    @Override // defpackage.InterfaceC4895e
    public final C16151e metrica() {
        return this;
    }

    @Override // defpackage.InterfaceC11855e
    /* renamed from: native */
    public final InterfaceC11855e mo2630native(int i) {
        m4124else(AbstractC7844e.smaato(i));
        return this;
    }

    /* renamed from: new, reason: not valid java name */
    public final void m4131new(long j) {
        boolean z;
        if (j == 0) {
            m4128final(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m4133public(0, 20, "-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = vip.ad;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = numberOfLeadingZeros + (j > vip.vip[numberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        C16592e m4130implements = m4130implements(i);
        byte[] bArr2 = m4130implements.ad;
        int i2 = m4130implements.metrica + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr2[i2] = vip.ad[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        m4130implements.metrica += i;
        this.f31731e += i;
    }

    @Override // defpackage.InterfaceC4895e
    public final C13197e peek() {
        return new C13197e(new C17906e(this));
    }

    @Override // defpackage.InterfaceC11855e
    public final InterfaceC11855e premium(long j) {
        m4123const(AbstractC7844e.amazon(j));
        return this;
    }

    @Override // defpackage.InterfaceC11855e
    /* renamed from: private */
    public final /* bridge */ /* synthetic */ InterfaceC11855e mo2631private(String str) {
        m4126e(str);
        return this;
    }

    @Override // defpackage.InterfaceC4895e
    public final String pro(long j) {
        return mo1683e(j, AbstractC5508e.ad);
    }

    /* renamed from: protected, reason: not valid java name */
    public final String m4132protected() {
        return mo1683e(this.f31731e, AbstractC5508e.ad);
    }

    /* renamed from: public, reason: not valid java name */
    public final void m4133public(int i, int i2, String str) {
        char charAt;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC1786e.Signature(i2, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i2 > str.length()) {
            StringBuilder premium = AbstractC4653e.premium("endIndex > string.length: ", i2, " > ");
            premium.append(str.length());
            throw new IllegalArgumentException(premium.toString().toString());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                C16592e m4130implements = m4130implements(1);
                byte[] bArr = m4130implements.ad;
                int i3 = m4130implements.metrica - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = m4130implements.metrica;
                int i6 = (i3 + i) - i5;
                m4130implements.metrica = i5 + i6;
                this.f31731e += i6;
            } else {
                if (charAt2 < 2048) {
                    C16592e m4130implements2 = m4130implements(2);
                    byte[] bArr2 = m4130implements2.ad;
                    int i7 = m4130implements2.metrica;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    m4130implements2.metrica = i7 + 2;
                    this.f31731e += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    C16592e m4130implements3 = m4130implements(3);
                    byte[] bArr3 = m4130implements3.ad;
                    int i8 = m4130implements3.metrica;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    m4130implements3.metrica = i8 + 3;
                    this.f31731e += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        m4128final(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        C16592e m4130implements4 = m4130implements(4);
                        byte[] bArr4 = m4130implements4.ad;
                        int i11 = m4130implements4.metrica;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        m4130implements4.metrica = i11 + 4;
                        this.f31731e += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final long purchase() {
        long j = this.f31731e;
        if (j == 0) {
            return 0L;
        }
        C16592e c16592e = this.f31732e.billing;
        return (c16592e.metrica >= 8192 || !c16592e.appmetrica) ? j : j - (r3 - c16592e.vip);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C16592e c16592e = this.f31732e;
        if (c16592e == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c16592e.metrica - c16592e.vip);
        byteBuffer.put(c16592e.ad, c16592e.vip, min);
        int i = c16592e.vip + min;
        c16592e.vip = i;
        this.f31731e -= min;
        if (i == c16592e.metrica) {
            this.f31732e = c16592e.ad();
            AbstractC11279e.ad(c16592e);
        }
        return min;
    }

    public final int read(byte[] bArr, int i, int i2) {
        AbstractC7844e.startapp(bArr.length, i, i2);
        C16592e c16592e = this.f31732e;
        if (c16592e == null) {
            return -1;
        }
        int min = Math.min(i2, c16592e.metrica - c16592e.vip);
        byte[] bArr2 = c16592e.ad;
        int i3 = c16592e.vip;
        AbstractC1660e.smaato(bArr2, i, i3, bArr, i3 + min);
        int i4 = c16592e.vip + min;
        c16592e.vip = i4;
        this.f31731e -= min;
        if (i4 == c16592e.metrica) {
            this.f31732e = c16592e.ad();
            AbstractC11279e.ad(c16592e);
        }
        return min;
    }

    @Override // defpackage.InterfaceC4895e
    public final byte readByte() {
        long j = this.f31731e;
        if (j == 0) {
            throw new EOFException();
        }
        C16592e c16592e = this.f31732e;
        int i = c16592e.vip;
        int i2 = c16592e.metrica;
        int i3 = i + 1;
        byte b = c16592e.ad[i];
        this.f31731e = j - 1;
        if (i3 != i2) {
            c16592e.vip = i3;
            return b;
        }
        this.f31732e = c16592e.ad();
        AbstractC11279e.ad(c16592e);
        return b;
    }

    @Override // defpackage.InterfaceC4895e
    public final int readInt() {
        long j = this.f31731e;
        if (j < 4) {
            throw new EOFException();
        }
        C16592e c16592e = this.f31732e;
        int i = c16592e.vip;
        int i2 = c16592e.metrica;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c16592e.ad;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.f31731e = j - 4;
        if (i5 != i2) {
            c16592e.vip = i5;
            return i6;
        }
        this.f31732e = c16592e.ad();
        AbstractC11279e.ad(c16592e);
        return i6;
    }

    @Override // defpackage.InterfaceC4895e
    public final short readShort() {
        long j = this.f31731e;
        if (j < 2) {
            throw new EOFException();
        }
        C16592e c16592e = this.f31732e;
        int i = c16592e.vip;
        int i2 = c16592e.metrica;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c16592e.ad;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f31731e = j - 2;
        if (i5 == i2) {
            this.f31732e = c16592e.ad();
            AbstractC11279e.ad(c16592e);
        } else {
            c16592e.vip = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.InterfaceC4895e
    public final boolean request(long j) {
        return this.f31731e >= j;
    }

    @Override // defpackage.InterfaceC11855e
    /* renamed from: return */
    public final /* bridge */ /* synthetic */ InterfaceC11855e mo2632return(int i, int i2, String str) {
        m4133public(i, i2, str);
        return this;
    }

    @Override // defpackage.InterfaceC2537e
    public final long signatures(C16151e c16151e, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j, "byteCount < 0: ").toString());
        }
        long j2 = this.f31731e;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c16151e.mo272transient(this, j);
        return j;
    }

    @Override // defpackage.InterfaceC4895e
    public final void skip(long j) {
        while (j > 0) {
            C16592e c16592e = this.f31732e;
            if (c16592e == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, c16592e.metrica - c16592e.vip);
            long j2 = min;
            this.f31731e -= j2;
            j -= j2;
            int i = c16592e.vip + min;
            c16592e.vip = i;
            if (i == c16592e.metrica) {
                this.f31732e = c16592e.ad();
                AbstractC11279e.ad(c16592e);
            }
        }
    }

    @Override // defpackage.InterfaceC2537e
    public final C1930e startapp() {
        return C1930e.license;
    }

    /* renamed from: static, reason: not valid java name */
    public final void m4134static(long j) {
        if (j == 0) {
            m4128final(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        C16592e m4130implements = m4130implements(i);
        byte[] bArr = m4130implements.ad;
        int i2 = m4130implements.metrica;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = vip.ad[(int) (15 & j)];
            j >>>= 4;
        }
        m4130implements.metrica += i;
        this.f31731e += i;
    }

    @Override // defpackage.InterfaceC11855e
    /* renamed from: strictfp */
    public final /* bridge */ /* synthetic */ InterfaceC11855e mo2633strictfp(int i, byte[] bArr) {
        write(bArr, 0, i);
        return this;
    }

    public final byte[] subs(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j, "byteCount: ").toString());
        }
        if (this.f31731e < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
        return bArr;
    }

    @Override // defpackage.InterfaceC4895e
    public final long tapsense(C0193e c0193e) {
        return inmobi(0L, c0193e);
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: throw */
    public final long mo1689throw(InterfaceC0274e interfaceC0274e) {
        long j = this.f31731e;
        if (j > 0) {
            interfaceC0274e.mo272transient(this, j);
        }
        return j;
    }

    public final String toString() {
        long j = this.f31731e;
        if (j <= 2147483647L) {
            return m4121break((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f31731e).toString());
    }

    @Override // defpackage.InterfaceC0274e
    /* renamed from: transient */
    public final void mo272transient(C16151e c16151e, long j) {
        C16592e vip;
        if (c16151e == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC7844e.startapp(c16151e.f31731e, 0L, j);
        while (j > 0) {
            C16592e c16592e = c16151e.f31732e;
            int i = c16592e.metrica - c16592e.vip;
            if (j < i) {
                C16592e c16592e2 = this.f31732e;
                C16592e c16592e3 = c16592e2 != null ? c16592e2.billing : null;
                if (c16592e3 != null && c16592e3.appmetrica) {
                    if ((c16592e3.metrica + j) - (c16592e3.license ? 0 : c16592e3.vip) <= 8192) {
                        c16592e.license(c16592e3, (int) j);
                        c16151e.f31731e -= j;
                        this.f31731e += j;
                        return;
                    }
                }
                int i2 = (int) j;
                if (i2 <= 0 || i2 > i) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i2 >= 1024) {
                    vip = c16592e.metrica();
                } else {
                    vip = AbstractC11279e.vip();
                    byte[] bArr = c16592e.ad;
                    byte[] bArr2 = vip.ad;
                    int i3 = c16592e.vip;
                    AbstractC1660e.admob(bArr, 0, i3, bArr2, i3 + i2, 2);
                }
                vip.metrica = vip.vip + i2;
                c16592e.vip += i2;
                c16592e.billing.vip(vip);
                c16151e.f31732e = vip;
            }
            C16592e c16592e4 = c16151e.f31732e;
            long j2 = c16592e4.metrica - c16592e4.vip;
            c16151e.f31732e = c16592e4.ad();
            C16592e c16592e5 = this.f31732e;
            if (c16592e5 == null) {
                this.f31732e = c16592e4;
                c16592e4.billing = c16592e4;
                c16592e4.purchase = c16592e4;
            } else {
                c16592e5.billing.vip(c16592e4);
                C16592e c16592e6 = c16592e4.billing;
                if (c16592e6 == c16592e4) {
                    throw new IllegalStateException("cannot compact");
                }
                if (c16592e6.appmetrica) {
                    int i4 = c16592e4.metrica - c16592e4.vip;
                    if (i4 <= (8192 - c16592e6.metrica) + (c16592e6.license ? 0 : c16592e6.vip)) {
                        c16592e4.license(c16592e6, i4);
                        c16592e4.ad();
                        AbstractC11279e.ad(c16592e4);
                    }
                }
            }
            c16151e.f31731e -= j2;
            this.f31731e += j2;
            j -= j2;
        }
    }

    /* renamed from: volatile, reason: not valid java name */
    public final void m4135volatile(int i) {
        C16592e m4130implements = m4130implements(2);
        byte[] bArr = m4130implements.ad;
        int i2 = m4130implements.metrica;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        m4130implements.metrica = i2 + 2;
        this.f31731e += 2;
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: while */
    public final int mo1690while(C3128e c3128e) {
        int license = vip.license(this, c3128e, false);
        if (license == -1) {
            return -1;
        }
        skip(c3128e.f7203e[license].license());
        return license;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C16592e m4130implements = m4130implements(1);
            int min = Math.min(i, 8192 - m4130implements.metrica);
            byteBuffer.get(m4130implements.ad, m4130implements.metrica, min);
            i -= min;
            m4130implements.metrica += min;
        }
        this.f31731e += remaining;
        return remaining;
    }

    @Override // defpackage.InterfaceC11855e
    public final InterfaceC11855e write(byte[] bArr) {
        write(bArr, 0, bArr.length);
        return this;
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m4136write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        long j = i2;
        AbstractC7844e.startapp(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C16592e m4130implements = m4130implements(1);
            int min = Math.min(i3 - i, 8192 - m4130implements.metrica);
            int i4 = i + min;
            AbstractC1660e.smaato(bArr, m4130implements.metrica, i, m4130implements.ad, i4);
            m4130implements.metrica += min;
            i = i4;
        }
        this.f31731e += j;
    }

    @Override // defpackage.InterfaceC11855e
    public final /* bridge */ /* synthetic */ InterfaceC11855e writeByte(int i) {
        m4128final(i);
        return this;
    }

    @Override // defpackage.InterfaceC11855e
    public final /* bridge */ /* synthetic */ InterfaceC11855e writeInt(int i) {
        m4124else(i);
        return this;
    }

    @Override // defpackage.InterfaceC11855e
    public final /* bridge */ /* synthetic */ InterfaceC11855e writeShort(int i) {
        m4135volatile(i);
        return this;
    }

    @Override // defpackage.InterfaceC4895e
    public final boolean yandex() {
        return this.f31731e == 0;
    }
}
