package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13197e implements InterfaceC4895e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f26203e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C16151e f26204e = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC2537e f26205e;

    /* JADX WARN: Type inference failed for: r1v1, types: [eِٖۢ, java.lang.Object] */
    public C13197e(InterfaceC2537e interfaceC2537e) {
        this.f26205e = interfaceC2537e;
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: abstract */
    public final String mo1677abstract() {
        long ad = ad((byte) 10, 0L, Long.MAX_VALUE);
        C16151e c16151e = this.f26204e;
        if (ad != -1) {
            return vip.metrica(c16151e, ad);
        }
        long j = c16151e.f31731e;
        if (j != 0) {
            return pro(j);
        }
        return null;
    }

    public final long ad(byte b, long j, long j2) {
        if (this.f26203e) {
            throw new IllegalStateException("closed");
        }
        if (0 > j2) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j2, "fromIndex=0 toIndex=").toString());
        }
        long j3 = 0;
        while (j3 < j2) {
            C16151e c16151e = this.f26204e;
            byte b2 = b;
            long j4 = j2;
            long isVip = c16151e.isVip(b2, j3, j4);
            if (isVip == -1) {
                long j5 = c16151e.f31731e;
                if (j5 >= j4 || this.f26205e.signatures(c16151e, 8192L) == -1) {
                    break;
                }
                j3 = Math.max(j3, j5);
                b = b2;
                j2 = j4;
            } else {
                return isVip;
            }
        }
        return -1L;
    }

    @Override // defpackage.InterfaceC4895e
    public final void admob(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    public final long advert() {
        admob(8L);
        return this.f26204e.m4125extends();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [eِٖۢ, java.lang.Object] */
    @Override // defpackage.InterfaceC4895e
    /* renamed from: case */
    public final String mo1678case(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j, "limit < 0: ").toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long ad = ad((byte) 10, 0L, j2);
        C16151e c16151e = this.f26204e;
        if (ad != -1) {
            return vip.metrica(c16151e, ad);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && c16151e.Signature(j2 - 1) == 13 && request(j2 + 1) && c16151e.Signature(j2) == 10) {
            return vip.metrica(c16151e, j2);
        }
        ?? obj = new Object();
        c16151e.loadAd(0L, Math.min(32, c16151e.f31731e), obj);
        throw new EOFException("\\n not found: limit=" + Math.min(c16151e.f31731e, j) + " content=" + obj.isPro(obj.f31731e).appmetrica() + (char) 8230);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f26203e) {
            return;
        }
        this.f26203e = true;
        this.f26205e.close();
        this.f26204e.ad();
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: eؑۥؘ */
    public final long mo1679e() {
        admob(8L);
        return this.f26204e.mo1679e();
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: eؒۖۗ */
    public final InputStream mo1680e() {
        return new C7404e(4, this);
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: eًًؓ */
    public final short mo1681e() {
        admob(2L);
        return this.f26204e.mo1681e();
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: eٓٛۢ */
    public final boolean mo1682e(long j, C0193e c0193e) {
        int license = c0193e.license();
        if (this.f26203e) {
            throw new IllegalStateException("closed");
        }
        if (license >= 0 && j >= 0 && license <= c0193e.license()) {
            return license == 0 || AbstractC5209e.ad(this, c0193e, license, j, j + 1) != -1;
        }
        return false;
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: eؙٟ٘ */
    public final String mo1683e(long j, Charset charset) {
        admob(4L);
        return this.f26204e.mo1683e(4L, charset);
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: finally */
    public final int mo1684finally() {
        admob(4L);
        return this.f26204e.mo1684finally();
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: for */
    public final long mo1685for(long j, C0193e c0193e) {
        return AbstractC5209e.ad(this, c0193e, c0193e.license(), 0L, j);
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: import */
    public final String mo1686import(Charset charset) {
        InterfaceC2537e interfaceC2537e = this.f26205e;
        C16151e c16151e = this.f26204e;
        c16151e.mo2629class(interfaceC2537e);
        return c16151e.mo1683e(c16151e.f31731e, charset);
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: instanceof */
    public final int mo1687instanceof() {
        admob(1L);
        C16151e c16151e = this.f26204e;
        byte Signature = c16151e.Signature(0L);
        if ((Signature & 224) == 192) {
            admob(2L);
        } else if ((Signature & 240) == 224) {
            admob(3L);
        } else if ((Signature & 248) == 240) {
            admob(4L);
        }
        return c16151e.mo1687instanceof();
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: interface */
    public final byte[] mo1688interface() {
        InterfaceC2537e interfaceC2537e = this.f26205e;
        C16151e c16151e = this.f26204e;
        c16151e.mo2629class(interfaceC2537e);
        return c16151e.subs(c16151e.f31731e);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f26203e;
    }

    @Override // defpackage.InterfaceC4895e
    public final C0193e isPro(long j) {
        admob(j);
        return this.f26204e.isPro(j);
    }

    public final byte[] license(long j) {
        admob(j);
        return this.f26204e.subs(j);
    }

    @Override // defpackage.InterfaceC4895e
    public final C16151e metrica() {
        return this.f26204e;
    }

    @Override // defpackage.InterfaceC4895e
    public final C13197e peek() {
        return new C13197e(new C17906e(this));
    }

    @Override // defpackage.InterfaceC4895e
    public final String pro(long j) {
        admob(j);
        C16151e c16151e = this.f26204e;
        c16151e.getClass();
        return c16151e.mo1683e(j, AbstractC5508e.ad);
    }

    public final void purchase(C16151e c16151e, long j) {
        C16151e c16151e2 = this.f26204e;
        try {
            admob(j);
            c16151e2.crashlytics(c16151e, j);
        } catch (EOFException e) {
            c16151e.mo2629class(c16151e2);
            throw e;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C16151e c16151e = this.f26204e;
        if (c16151e.f31731e == 0 && this.f26205e.signatures(c16151e, 8192L) == -1) {
            return -1;
        }
        return c16151e.read(byteBuffer);
    }

    @Override // defpackage.InterfaceC4895e
    public final byte readByte() {
        admob(1L);
        return this.f26204e.readByte();
    }

    @Override // defpackage.InterfaceC4895e
    public final int readInt() {
        admob(4L);
        return this.f26204e.readInt();
    }

    @Override // defpackage.InterfaceC4895e
    public final short readShort() {
        admob(2L);
        return this.f26204e.readShort();
    }

    @Override // defpackage.InterfaceC4895e
    public final boolean request(long j) {
        C16151e c16151e;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j, "byteCount < 0: ").toString());
        }
        if (this.f26203e) {
            throw new IllegalStateException("closed");
        }
        do {
            c16151e = this.f26204e;
            if (c16151e.f31731e >= j) {
                return true;
            }
        } while (this.f26205e.signatures(c16151e, 8192L) != -1);
        return false;
    }

    @Override // defpackage.InterfaceC2537e
    public final long signatures(C16151e c16151e, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j, "byteCount < 0: ").toString());
        }
        if (this.f26203e) {
            throw new IllegalStateException("closed");
        }
        C16151e c16151e2 = this.f26204e;
        if (c16151e2.f31731e == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.f26205e.signatures(c16151e2, 8192L) == -1) {
                return -1L;
            }
        }
        return c16151e2.signatures(c16151e, Math.min(j, c16151e2.f31731e));
    }

    @Override // defpackage.InterfaceC4895e
    public final void skip(long j) {
        if (this.f26203e) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C16151e c16151e = this.f26204e;
            if (c16151e.f31731e == 0 && this.f26205e.signatures(c16151e, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, c16151e.f31731e);
            c16151e.skip(min);
            j -= min;
        }
    }

    @Override // defpackage.InterfaceC2537e
    public final C1930e startapp() {
        return this.f26205e.startapp();
    }

    @Override // defpackage.InterfaceC4895e
    public final long tapsense(C0193e c0193e) {
        if (this.f26203e) {
            throw new IllegalStateException("closed");
        }
        long j = 0;
        while (true) {
            C16151e c16151e = this.f26204e;
            long inmobi = c16151e.inmobi(j, c0193e);
            if (inmobi != -1) {
                return inmobi;
            }
            long j2 = c16151e.f31731e;
            if (this.f26205e.signatures(c16151e, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, j2);
        }
    }

    @Override // defpackage.InterfaceC4895e
    /* renamed from: throw */
    public final long mo1689throw(InterfaceC0274e interfaceC0274e) {
        C16151e c16151e;
        long j = 0;
        while (true) {
            InterfaceC2537e interfaceC2537e = this.f26205e;
            c16151e = this.f26204e;
            if (interfaceC2537e.signatures(c16151e, 8192L) == -1) {
                break;
            }
            long purchase = c16151e.purchase();
            if (purchase > 0) {
                j += purchase;
                interfaceC0274e.mo272transient(c16151e, purchase);
            }
        }
        long j2 = c16151e.f31731e;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        interfaceC0274e.mo272transient(c16151e, j2);
        return j3;
    }

    public final String toString() {
        return "buffer(" + this.f26205e + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        return -1;
     */
    @Override // defpackage.InterfaceC4895e
    /* renamed from: while */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo1690while(defpackage.C3128e r7) {
        /*
            r6 = this;
            boolean r0 = r6.f26203e
            if (r0 != 0) goto L2d
        L4:
            r0 = 1
            eِٖۢ r1 = r6.f26204e
            int r0 = defpackage.vip.license(r1, r7, r0)
            r2 = -2
            r3 = -1
            if (r0 == r2) goto L1e
            if (r0 == r3) goto L2c
            eًؑۤ[] r7 = r7.f7203e
            r7 = r7[r0]
            int r7 = r7.license()
            long r2 = (long) r7
            r1.skip(r2)
            return r0
        L1e:
            eّؔۜ r0 = r6.f26205e
            r4 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.signatures(r1, r4)
            r4 = -1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L4
        L2c:
            return r3
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13197e.mo1690while(eٟؕؕ):int");
    }

    @Override // defpackage.InterfaceC4895e
    public final boolean yandex() {
        if (this.f26203e) {
            throw new IllegalStateException("closed");
        }
        C16151e c16151e = this.f26204e;
        return c16151e.yandex() && this.f26205e.signatures(c16151e, 8192L) == -1;
    }
}
