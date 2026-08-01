package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۖۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9674e implements InterfaceC11855e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f19171e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C16151e f19172e = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC0274e f19173e;

    /* JADX WARN: Type inference failed for: r1v1, types: [eِٖۢ, java.lang.Object] */
    public C9674e(InterfaceC0274e interfaceC0274e) {
        this.f19173e = interfaceC0274e;
    }

    public final InterfaceC11855e ad() {
        if (this.f19171e) {
            throw new IllegalStateException("closed");
        }
        C16151e c16151e = this.f19172e;
        long purchase = c16151e.purchase();
        if (purchase > 0) {
            this.f19173e.mo272transient(c16151e, purchase);
        }
        return this;
    }

    @Override // defpackage.InterfaceC11855e
    public final InterfaceC11855e applovin(C0193e c0193e) {
        if (this.f19171e) {
            throw new IllegalStateException("closed");
        }
        this.f19172e.m4122catch(c0193e);
        ad();
        return this;
    }

    @Override // defpackage.InterfaceC11855e
    /* renamed from: class, reason: not valid java name */
    public final long mo2629class(InterfaceC2537e interfaceC2537e) {
        long j = 0;
        while (true) {
            long signatures = interfaceC2537e.signatures(this.f19172e, 8192L);
            if (signatures == -1) {
                return j;
            }
            j += signatures;
            ad();
        }
    }

    @Override // defpackage.InterfaceC0274e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC0274e interfaceC0274e = this.f19173e;
        if (this.f19171e) {
            return;
        }
        try {
            C16151e c16151e = this.f19172e;
            long j = c16151e.f31731e;
            if (j > 0) {
                interfaceC0274e.mo272transient(c16151e, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            interfaceC0274e.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f19171e = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC11855e, defpackage.InterfaceC0274e, java.io.Flushable
    public final void flush() {
        if (this.f19171e) {
            throw new IllegalStateException("closed");
        }
        C16151e c16151e = this.f19172e;
        long j = c16151e.f31731e;
        InterfaceC0274e interfaceC0274e = this.f19173e;
        if (j > 0) {
            interfaceC0274e.mo272transient(c16151e, j);
        }
        interfaceC0274e.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f19171e;
    }

    public final InterfaceC11855e license(long j) {
        if (this.f19171e) {
            throw new IllegalStateException("closed");
        }
        this.f19172e.m4131new(j);
        ad();
        return this;
    }

    @Override // defpackage.InterfaceC11855e
    public final C16151e metrica() {
        return this.f19172e;
    }

    @Override // defpackage.InterfaceC11855e
    /* renamed from: native, reason: not valid java name */
    public final InterfaceC11855e mo2630native(int i) {
        if (this.f19171e) {
            throw new IllegalStateException("closed");
        }
        this.f19172e.m4124else(AbstractC7844e.smaato(i));
        ad();
        return this;
    }

    @Override // defpackage.InterfaceC11855e
    public final InterfaceC11855e premium(long j) {
        if (this.f19171e) {
            throw new IllegalStateException("closed");
        }
        this.f19172e.m4123const(AbstractC7844e.amazon(j));
        ad();
        return this;
    }

    @Override // defpackage.InterfaceC11855e
    /* renamed from: private, reason: not valid java name */
    public final InterfaceC11855e mo2631private(String str) {
        if (this.f19171e) {
            throw new IllegalStateException("closed");
        }
        this.f19172e.m4126e(str);
        ad();
        return this;
    }

    public final InterfaceC11855e purchase(int i) {
        if (this.f19171e) {
            throw new IllegalStateException("closed");
        }
        this.f19172e.m4127e(i);
        ad();
        return this;
    }

    @Override // defpackage.InterfaceC11855e
    /* renamed from: return, reason: not valid java name */
    public final InterfaceC11855e mo2632return(int i, int i2, String str) {
        if (this.f19171e) {
            throw new IllegalStateException("closed");
        }
        this.f19172e.m4133public(i, i2, str);
        ad();
        return this;
    }

    @Override // defpackage.InterfaceC0274e
    public final C1930e startapp() {
        return this.f19173e.startapp();
    }

    @Override // defpackage.InterfaceC11855e
    /* renamed from: strictfp, reason: not valid java name */
    public final InterfaceC11855e mo2633strictfp(int i, byte[] bArr) {
        if (this.f19171e) {
            throw new IllegalStateException("closed");
        }
        this.f19172e.write(bArr, 0, i);
        ad();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f19173e + ')';
    }

    @Override // defpackage.InterfaceC0274e
    /* renamed from: transient */
    public final void mo272transient(C16151e c16151e, long j) {
        if (this.f19171e) {
            throw new IllegalStateException("closed");
        }
        this.f19172e.mo272transient(c16151e, j);
        ad();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f19171e) {
            throw new IllegalStateException("closed");
        }
        int write = this.f19172e.write(byteBuffer);
        ad();
        return write;
    }

    @Override // defpackage.InterfaceC11855e
    public final InterfaceC11855e write(byte[] bArr) {
        if (this.f19171e) {
            throw new IllegalStateException("closed");
        }
        this.f19172e.m4136write(bArr);
        ad();
        return this;
    }

    @Override // defpackage.InterfaceC11855e
    public final InterfaceC11855e writeByte(int i) {
        if (this.f19171e) {
            throw new IllegalStateException("closed");
        }
        this.f19172e.m4128final(i);
        ad();
        return this;
    }

    @Override // defpackage.InterfaceC11855e
    public final InterfaceC11855e writeInt(int i) {
        if (this.f19171e) {
            throw new IllegalStateException("closed");
        }
        this.f19172e.m4124else(i);
        ad();
        return this;
    }

    @Override // defpackage.InterfaceC11855e
    public final InterfaceC11855e writeShort(int i) {
        if (this.f19171e) {
            throw new IllegalStateException("closed");
        }
        this.f19172e.m4135volatile(i);
        ad();
        return this;
    }
}
