package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؗۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6952e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C12268e f14244e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C17424e f14245e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14246e;

    public /* synthetic */ RunnableC6952e(C17424e c17424e, C12268e c12268e, int i) {
        this.f14246e = i;
        this.f14245e = c17424e;
        this.f14244e = c12268e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f14246e;
        final C12268e c12268e = this.f14244e;
        C17424e c17424e = this.f14245e;
        switch (i) {
            case 0:
                SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e = (SurfaceHolderCallbackC0960e) c17424e.f34141e;
                String str = AbstractC9413e.ad;
                C4174e c4174e = surfaceHolderCallbackC0960e.ad.f33635e;
                final C18177e m1494package = c4174e.m1494package();
                final int i2 = 1;
                c4174e.m1501transient(m1494package, 1032, new InterfaceC12504e() { // from class: eؖٚۡ
                    @Override // defpackage.InterfaceC12504e
                    public final void invoke(Object obj) {
                        switch (i2) {
                            case 0:
                                ((InterfaceC3190e) obj).pro(m1494package, c12268e);
                                return;
                            default:
                                ((InterfaceC3190e) obj).premium(m1494package, c12268e);
                                return;
                        }
                    }
                });
                return;
            default:
                SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e2 = (SurfaceHolderCallbackC0960e) c17424e.f34141e;
                String str2 = AbstractC9413e.ad;
                C4174e c4174e2 = surfaceHolderCallbackC0960e2.ad.f33635e;
                final C18177e m1494package2 = c4174e2.m1494package();
                final int i3 = 0;
                c4174e2.m1501transient(m1494package2, 1031, new InterfaceC12504e() { // from class: eؖٚۡ
                    @Override // defpackage.InterfaceC12504e
                    public final void invoke(Object obj) {
                        switch (i3) {
                            case 0:
                                ((InterfaceC3190e) obj).pro(m1494package2, c12268e);
                                return;
                            default:
                                ((InterfaceC3190e) obj).premium(m1494package2, c12268e);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
