package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۥۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC11386e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f22909e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C0423e f22910e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f22911e;

    public /* synthetic */ RunnableC11386e(C0423e c0423e, int i, int i2) {
        this.f22911e = i2;
        this.f22910e = c0423e;
        this.f22909e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22911e) {
            case 0:
                C6541e c6541e = ((C14090e) ((C0909e) this.f22910e.f2468e).f3321e).license;
                if (c6541e != null) {
                    c6541e.adcel(this.f22909e);
                    return;
                }
                return;
            default:
                C6541e c6541e2 = ((C14090e) ((C0909e) this.f22910e.f2468e).f3321e).license;
                if (c6541e2 != null) {
                    c6541e2.mopub(this.f22909e);
                    return;
                }
                return;
        }
    }
}
