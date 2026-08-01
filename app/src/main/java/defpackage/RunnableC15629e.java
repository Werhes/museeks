package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٞٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC15629e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC15070e f30818e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC9610e f30819e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1926e f30820e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ long f30821e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30822e;

    public /* synthetic */ RunnableC15629e(InterfaceC1926e interfaceC1926e, InterfaceC9610e interfaceC9610e, long j, InterfaceC15070e interfaceC15070e, int i) {
        this.f30822e = i;
        this.f30820e = interfaceC1926e;
        this.f30819e = interfaceC9610e;
        this.f30821e = j;
        this.f30818e = interfaceC15070e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30822e) {
            case 0:
                this.f30820e.mo731goto(this.f30819e, this.f30821e, (InterfaceC7172e) this.f30818e);
                return;
            default:
                this.f30820e.crashlytics(this.f30819e, this.f30821e, (C10224e) this.f30818e);
                return;
        }
    }
}
