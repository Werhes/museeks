package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۦٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC16648e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f32667e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ long f32668e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f32669e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ long f32670e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32671e;

    public /* synthetic */ RunnableC16648e(Object obj, int i, long j, long j2, int i2) {
        this.f32671e = i2;
        this.f32667e = obj;
        this.f32669e = i;
        this.f32668e = j;
        this.f32670e = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f32671e;
        Object obj = this.f32667e;
        switch (i) {
            case 0:
                SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e = (SurfaceHolderCallbackC0960e) ((C17424e) obj).f34141e;
                String str = AbstractC9413e.ad;
                C4174e c4174e = surfaceHolderCallbackC0960e.ad.f33635e;
                final C18177e m1494package = c4174e.m1494package();
                final int i2 = this.f32669e;
                final long j = this.f32668e;
                final long j2 = this.f32670e;
                c4174e.m1501transient(m1494package, 1011, new InterfaceC12504e() { // from class: eؚٔۦ
                    @Override // defpackage.InterfaceC12504e
                    public final void invoke(Object obj2) {
                        ((InterfaceC3190e) obj2).mo1306native(C18177e.this, i2, j, j2);
                    }
                });
                return;
            default:
                C4174e c4174e2 = ((C8562e) obj).vip;
                C2532e c2532e = c4174e2.f9204e;
                C18177e m1493new = c4174e2.m1493new(((AbstractC17475e) c2532e.f6386e).isEmpty() ? null : (C18208e) AbstractC4306e.appmetrica((AbstractC17475e) c2532e.f6386e));
                c4174e2.m1501transient(m1493new, 1006, new C13790e(m1493new, this.f32669e, this.f32668e, this.f32670e));
                return;
        }
    }
}
