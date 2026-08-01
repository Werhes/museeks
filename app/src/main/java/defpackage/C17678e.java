package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17678e implements InterfaceC12523e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AtomicReference f34642e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34643e;

    public /* synthetic */ C17678e(AtomicReference atomicReference, int i) {
        this.f34643e = i;
        this.f34642e = atomicReference;
    }

    @Override // defpackage.InterfaceC12523e
    public final Object amazon(C7169e c7169e) {
        switch (this.f34643e) {
            case 0:
                this.f34642e.set(c7169e);
                return "Data closed";
            case 1:
                this.f34642e.set(c7169e);
                return "acquireInputBuffer";
            case 2:
                this.f34642e.set(c7169e);
                return "mReleasedFuture";
            default:
                this.f34642e.set(c7169e);
                return "Terminate InputBuffer";
        }
    }
}
