package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4213e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f9281e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f9282e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AtomicBoolean f9283e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ boolean f9284e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9285e;

    public /* synthetic */ RunnableC4213e(Object obj, AtomicBoolean atomicBoolean, boolean z, boolean z2, int i) {
        this.f9285e = i;
        this.f9281e = obj;
        this.f9283e = atomicBoolean;
        this.f9282e = z;
        this.f9284e = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9285e) {
            case 0:
                C6613e c6613e = (C6613e) this.f9281e;
                c6613e.getClass();
                this.f9283e.set(false);
                C7302e.metrica((C7302e) c6613e.f13643e, this.f9282e, this.f9284e);
                return;
            default:
                C6613e c6613e2 = (C6613e) this.f9281e;
                this.f9283e.set(false);
                ((C11883e) c6613e2.f13643e).signatures(this.f9282e, this.f9284e);
                return;
        }
    }
}
