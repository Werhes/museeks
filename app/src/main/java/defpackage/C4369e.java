package defpackage;

import android.media.Image;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۚۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4369e implements InterfaceC17031e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C2673e f9502e = AbstractC14430e.metrica(false);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C15024e f9503e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC17031e f9504e;

    public C4369e(InterfaceC17031e interfaceC17031e, C15024e c15024e) {
        this.f9504e = interfaceC17031e;
        this.f9503e = c15024e;
    }

    public final C4369e ad() {
        int i;
        int i2;
        C4369e c4369e = null;
        if (!this.f9502e.vip()) {
            C15024e c15024e = this.f9503e;
            C11498e c11498e = (C11498e) c15024e.f29787e;
            do {
                i = c11498e.ad;
                i2 = i == 0 ? 0 : i + 1;
            } while (!C11498e.vip.compareAndSet(c11498e, i, i2));
            if ((i2 != 0 ? (InterfaceC17031e) c15024e.f29788e : null) != null) {
                c4369e = new C4369e(this.f9504e, this.f9503e);
            }
        }
        if (c4369e != null) {
            return c4369e;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f9502e.ad()) {
            C15024e c15024e = this.f9503e;
            C11498e c11498e = (C11498e) c15024e.f29787e;
            c11498e.getClass();
            if (C11498e.vip.decrementAndGet(c11498e) == 0) {
                C7744e c7744e = (C7744e) c15024e.f29789e;
                c7744e.getClass();
                ((InterfaceC1415e) C7744e.vip.getAndSet(c7744e, null)).ad((InterfaceC17031e) c15024e.f29788e);
            }
        }
    }

    @Override // defpackage.InterfaceC15070e
    /* renamed from: static */
    public final Object mo754static(InterfaceC7227e interfaceC7227e) {
        if (this.f9502e.vip()) {
            return null;
        }
        C12232e c12232e = AbstractC3820e.ad;
        if (interfaceC7227e.equals(c12232e.vip(C4369e.class)) || interfaceC7227e.equals(c12232e.vip(InterfaceC17031e.class)) || interfaceC7227e.equals(c12232e.vip(InterfaceC9857e.class))) {
            return this;
        }
        if (!interfaceC7227e.equals(c12232e.vip(Image.class))) {
            return this.f9504e.mo754static(interfaceC7227e);
        }
        throw new UnsupportedOperationException("Cannot unwrap " + this + " as android.media.Image. Use setFinalizerinstead and close all outstanding references.");
    }

    public final String toString() {
        return this.f9504e.toString();
    }
}
