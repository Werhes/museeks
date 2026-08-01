package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC16492e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ long f32318e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C10312e f32319e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f32320e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32321e = 0;

    public /* synthetic */ RunnableC16492e(C10312e c10312e, int i, long j) {
        this.f32319e = c10312e;
        this.f32320e = i;
        this.f32318e = j;
    }

    public /* synthetic */ RunnableC16492e(C10312e c10312e, long j, int i) {
        this.f32319e = c10312e;
        this.f32318e = j;
        this.f32320e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f32321e;
        int i2 = this.f32320e;
        long j = this.f32318e;
        C10312e c10312e = this.f32319e;
        switch (i) {
            case 0:
                SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e = (SurfaceHolderCallbackC0960e) c10312e.f20360e;
                String str = AbstractC9413e.ad;
                C4174e c4174e = surfaceHolderCallbackC0960e.ad.f33635e;
                C18177e m1493new = c4174e.m1493new((C18208e) c4174e.f9204e.f6384e);
                c4174e.m1501transient(m1493new, 1018, new C5055e(i2, j, m1493new));
                return;
            default:
                SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e2 = (SurfaceHolderCallbackC0960e) c10312e.f20360e;
                String str2 = AbstractC9413e.ad;
                C4174e c4174e2 = surfaceHolderCallbackC0960e2.ad.f33635e;
                C18177e m1493new2 = c4174e2.m1493new((C18208e) c4174e2.f9204e.f6384e);
                c4174e2.m1501transient(m1493new2, 1021, new C7815e(i2, j, m1493new2));
                return;
        }
    }
}
