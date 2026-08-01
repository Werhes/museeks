package defpackage;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؔؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16741e implements InterfaceC0274e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final CRC32 f32814e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C16751e f32815e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Deflater f32816e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f32817e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C9674e f32818e;

    public C16741e(C4122e c4122e) {
        C9674e c9674e = new C9674e(c4122e);
        this.f32818e = c9674e;
        Deflater deflater = new Deflater(-1, true);
        this.f32816e = deflater;
        this.f32815e = new C16751e(c9674e, deflater, 0);
        this.f32814e = new CRC32();
        C16151e c16151e = c9674e.f19172e;
        c16151e.m4135volatile(8075);
        c16151e.m4128final(8);
        c16151e.m4128final(0);
        c16151e.m4124else(0);
        c16151e.m4128final(0);
        c16151e.m4128final(0);
    }

    @Override // defpackage.InterfaceC0274e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Deflater deflater = this.f32816e;
        C9674e c9674e = this.f32818e;
        if (this.f32817e) {
            return;
        }
        try {
            C16751e c16751e = this.f32815e;
            ((Deflater) c16751e.f32842e).finish();
            c16751e.ad(false);
            c9674e.mo2630native((int) this.f32814e.getValue());
            c9674e.mo2630native((int) deflater.getBytesRead());
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
            c9674e.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f32817e = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC0274e, java.io.Flushable
    public final void flush() {
        this.f32815e.flush();
    }

    @Override // defpackage.InterfaceC0274e
    public final C1930e startapp() {
        return this.f32818e.f19173e.startapp();
    }

    @Override // defpackage.InterfaceC0274e
    /* renamed from: transient */
    public final void mo272transient(C16151e c16151e, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return;
        }
        C16592e c16592e = c16151e.f31732e;
        long j2 = j;
        while (j2 > 0) {
            int min = (int) Math.min(j2, c16592e.metrica - c16592e.vip);
            this.f32814e.update(c16592e.ad, c16592e.vip, min);
            j2 -= min;
            c16592e = c16592e.purchase;
        }
        this.f32815e.mo272transient(c16151e, j);
    }
}
