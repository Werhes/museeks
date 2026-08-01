package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؐۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15154e implements AutoCloseable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C2866e f29991e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C11087e f29992e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C9823e f29993e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C9003e f29994e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C13155e f29995e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f29996e;

    public C15154e(C13155e c13155e, C9823e c9823e, C11087e c11087e, C9003e c9003e, C2866e c2866e) {
        this.f29995e = c13155e;
        this.f29993e = c9823e;
        this.f29992e = c11087e;
        this.f29994e = c9003e;
        this.f29991e = c2866e;
        C11498e c11498e = AbstractC1270e.ad;
        c11498e.getClass();
        this.f29996e = C11498e.vip.incrementAndGet(c11498e);
    }

    public final C8823e ad(C6510e c6510e) {
        if (!this.f29995e.ad()) {
            C11087e c11087e = this.f29992e;
            c11087e.getClass();
            return C11087e.vip(c11087e, c6510e, null, null, new C13743e(0), null, null, null, 118);
        }
        throw new IllegalStateException(("Cannot call setTorchOff on " + this + " after close.").toString());
    }

    public final void advert() {
        if (!this.f29995e.ad()) {
            this.f29993e.license(null);
            return;
        }
        throw new IllegalStateException(("Cannot call stopRepeating on " + this + " after close.").toString());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f29994e.ad) {
        }
        this.f29991e.ad();
        this.f29995e.vip();
    }

    public final C8823e license() {
        if (this.f29995e.ad()) {
            throw new IllegalStateException(("Cannot call setTorchOn on " + this + " after close.").toString());
        }
        C11087e c11087e = this.f29992e;
        C6510e c6510e = ((C15952e) c11087e.metrica.ad.ad).ad;
        List list = C6510e.vip;
        return C11087e.vip(c11087e, ((c6510e != null && c6510e.ad == 1) || (c6510e != null && c6510e.ad == 0)) ? null : new C6510e(1), null, null, new C13743e(2), null, null, null, 118);
    }

    public final void purchase(C9021e c9021e) {
        if (!this.f29995e.ad()) {
            this.f29993e.license(c9021e);
            return;
        }
        throw new IllegalStateException(("Cannot call startRepeating on " + this + " after close.").toString());
    }

    public final String toString() {
        return "CameraGraph.Session-" + this.f29996e;
    }
}
