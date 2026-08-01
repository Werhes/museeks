package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٗؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16751e implements InterfaceC0274e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f32840e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f32841e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f32842e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32843e;

    public /* synthetic */ C16751e(InterfaceC0274e interfaceC0274e, Object obj, int i) {
        this.f32843e = i;
        this.f32840e = interfaceC0274e;
        this.f32842e = obj;
    }

    public C16751e(C14005e c14005e) {
        this.f32843e = 2;
        this.f32842e = c14005e;
        this.f32840e = new C6839e(((C9674e) c14005e.metrica.f25752e).f19173e.startapp());
    }

    public void ad(boolean z) {
        C16592e m4130implements;
        int deflate;
        Deflater deflater = (Deflater) this.f32842e;
        C9674e c9674e = (C9674e) this.f32840e;
        C16151e c16151e = c9674e.f19172e;
        while (true) {
            m4130implements = c16151e.m4130implements(1);
            byte[] bArr = m4130implements.ad;
            if (z) {
                try {
                    int i = m4130implements.metrica;
                    deflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (IllegalStateException e) {
                    throw new IOException("Deflater already closed", e);
                } catch (NullPointerException e2) {
                    throw new IOException("Deflater already closed", e2);
                }
            } else {
                int i2 = m4130implements.metrica;
                deflate = deflater.deflate(bArr, i2, 8192 - i2);
            }
            if (deflate > 0) {
                m4130implements.metrica += deflate;
                c16151e.f31731e += deflate;
                c9674e.ad();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (m4130implements.vip == m4130implements.metrica) {
            c16151e.f31732e = m4130implements.ad();
            AbstractC11279e.ad(m4130implements);
        }
    }

    @Override // defpackage.InterfaceC0274e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f32843e) {
            case 0:
                Deflater deflater = (Deflater) this.f32842e;
                if (this.f32841e) {
                    return;
                }
                try {
                    deflater.finish();
                    ad(false);
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    deflater.end();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                try {
                    ((C9674e) this.f32840e).close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    }
                }
                this.f32841e = true;
                if (th != null) {
                    throw th;
                }
                return;
            case 1:
                try {
                    ((InterfaceC0274e) this.f32840e).close();
                    return;
                } catch (IOException e) {
                    this.f32841e = true;
                    ((C10739e) this.f32842e).invoke(e);
                    return;
                }
            default:
                C14005e c14005e = (C14005e) this.f32842e;
                if (this.f32841e) {
                    return;
                }
                this.f32841e = true;
                C6839e c6839e = (C6839e) this.f32840e;
                C1930e c1930e = c6839e.appmetrica;
                c6839e.appmetrica = C1930e.license;
                c1930e.ad();
                c1930e.vip();
                c14005e.license = 3;
                return;
        }
    }

    @Override // defpackage.InterfaceC0274e, java.io.Flushable
    public final void flush() {
        switch (this.f32843e) {
            case 0:
                ad(true);
                ((C9674e) this.f32840e).flush();
                return;
            case 1:
                try {
                    ((InterfaceC0274e) this.f32840e).flush();
                    return;
                } catch (IOException e) {
                    this.f32841e = true;
                    ((C10739e) this.f32842e).invoke(e);
                    return;
                }
            default:
                if (this.f32841e) {
                    return;
                }
                ((C9674e) ((C14005e) this.f32842e).metrica.f25752e).flush();
                return;
        }
    }

    @Override // defpackage.InterfaceC0274e
    public final C1930e startapp() {
        switch (this.f32843e) {
            case 0:
                return ((C9674e) this.f32840e).f19173e.startapp();
            case 1:
                return ((InterfaceC0274e) this.f32840e).startapp();
            default:
                return (C6839e) this.f32840e;
        }
    }

    public String toString() {
        switch (this.f32843e) {
            case 0:
                return "DeflaterSink(" + ((C9674e) this.f32840e) + ')';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC0274e
    /* renamed from: transient */
    public final void mo272transient(C16151e c16151e, long j) {
        switch (this.f32843e) {
            case 0:
                Deflater deflater = (Deflater) this.f32842e;
                AbstractC7844e.startapp(c16151e.f31731e, 0L, j);
                long j2 = j;
                while (j2 > 0) {
                    C16592e c16592e = c16151e.f31732e;
                    int min = (int) Math.min(j2, c16592e.metrica - c16592e.vip);
                    deflater.setInput(c16592e.ad, c16592e.vip, min);
                    ad(false);
                    long j3 = min;
                    c16151e.f31731e -= j3;
                    int i = c16592e.vip + min;
                    c16592e.vip = i;
                    if (i == c16592e.metrica) {
                        c16151e.f31732e = c16592e.ad();
                        AbstractC11279e.ad(c16592e);
                    }
                    j2 -= j3;
                }
                deflater.setInput(AbstractC9460e.mopub, 0, 0);
                return;
            case 1:
                if (this.f32841e) {
                    c16151e.skip(j);
                    return;
                }
                try {
                    ((InterfaceC0274e) this.f32840e).mo272transient(c16151e, j);
                    return;
                } catch (IOException e) {
                    this.f32841e = true;
                    ((C10739e) this.f32842e).invoke(e);
                    return;
                }
            default:
                if (this.f32841e) {
                    throw new IllegalStateException("closed");
                }
                AbstractC10220e.ad(c16151e.f31731e, 0L, j);
                ((C9674e) ((C14005e) this.f32842e).metrica.f25752e).mo272transient(c16151e, j);
                return;
        }
    }
}
