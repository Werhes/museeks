package defpackage;

import android.hardware.camera2.CameraCaptureSession;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؗۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5316e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f11409e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ long f11410e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f11411e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11412e;

    public /* synthetic */ RunnableC5316e(int i, long j, Object obj, Object obj2) {
        this.f11412e = i;
        this.f11409e = obj;
        this.f11411e = obj2;
        this.f11410e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11412e;
        long j = this.f11410e;
        Object obj = this.f11411e;
        Object obj2 = this.f11409e;
        switch (i) {
            case 0:
                ((C17839e) obj2).ad.onCaptureSequenceCompleted((CameraCaptureSession) obj, -1, j);
                return;
            case 1:
                ((InterfaceC1926e) obj2).loadAd((InterfaceC9610e) obj, j);
                return;
            default:
                SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e = (SurfaceHolderCallbackC0960e) ((C10312e) obj2).f20360e;
                String str = AbstractC9413e.ad;
                C17148e c17148e = surfaceHolderCallbackC0960e.ad;
                C4174e c4174e = c17148e.f33635e;
                C18177e m1494package = c4174e.m1494package();
                c4174e.m1501transient(m1494package, 26, new C11565e(m1494package, obj, j));
                if (c17148e.f33616e == obj) {
                    c17148e.f33577e.billing(26, new C12582e(9));
                    return;
                }
                return;
        }
    }
}
