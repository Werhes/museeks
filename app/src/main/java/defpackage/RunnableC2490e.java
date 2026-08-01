package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؔۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2490e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f6337e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f6338e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C4753e f6339e;

    public /* synthetic */ RunnableC2490e(C4753e c4753e, int i, int i2) {
        this.f6339e = c4753e;
        this.f6338e = i;
        this.f6337e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        C4753e c4753e = this.f6339e;
        int i = c4753e.startapp;
        int i2 = this.f6338e;
        boolean z2 = true;
        if (i != i2) {
            c4753e.startapp = i2;
            z = true;
        } else {
            z = false;
        }
        int i3 = c4753e.yandex;
        int i4 = this.f6337e;
        if (i3 != i4) {
            c4753e.yandex = i4;
        } else {
            z2 = z;
        }
        if (z2) {
            c4753e.purchase();
        }
    }
}
