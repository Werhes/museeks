package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۦٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15102e implements InterfaceC11944e {
    public final /* synthetic */ C0971e appmetrica;
    public final /* synthetic */ C1040e license;
    public final /* synthetic */ long purchase;
    public long ad = 0;
    public long vip = 0;
    public C16658e metrica = C5107e.f10953e;

    public C15102e(C1040e c1040e, C0971e c0971e, long j) {
        this.license = c1040e;
        this.appmetrica = c0971e;
        this.purchase = j;
    }

    @Override // defpackage.InterfaceC11944e
    public final void ad() {
        C18408e c18408e;
        long j = this.purchase;
        C0971e c0971e = this.appmetrica;
        if (!AbstractC5956e.ad(c0971e, j) || (c18408e = c0971e.yandex) == null) {
            return;
        }
        c18408e.invoke();
    }

    @Override // defpackage.InterfaceC11944e
    public final void appmetrica(long j) {
        InterfaceC0043e interfaceC0043e = (InterfaceC0043e) this.license.invoke();
        if (interfaceC0043e == null || !interfaceC0043e.billing()) {
            return;
        }
        C0971e c0971e = this.appmetrica;
        if (AbstractC5956e.ad(c0971e, this.purchase)) {
            long startapp = C2152e.startapp(this.vip, j);
            this.vip = startapp;
            long startapp2 = C2152e.startapp(this.ad, startapp);
            if (c0971e.vip(interfaceC0043e, startapp2, this.ad, this.metrica, true)) {
                this.ad = startapp2;
                this.vip = 0L;
            }
        }
    }

    @Override // defpackage.InterfaceC11944e
    public final void license() {
    }

    @Override // defpackage.InterfaceC11944e
    public final void metrica() {
    }

    @Override // defpackage.InterfaceC11944e
    public final void onCancel() {
        C18408e c18408e;
        long j = this.purchase;
        C0971e c0971e = this.appmetrica;
        if (!AbstractC5956e.ad(c0971e, j) || (c18408e = c0971e.yandex) == null) {
            return;
        }
        c18408e.invoke();
    }

    @Override // defpackage.InterfaceC11944e
    public final void vip(long j, C16658e c16658e) {
        this.metrica = c16658e;
        InterfaceC0043e interfaceC0043e = (InterfaceC0043e) this.license.invoke();
        C0971e c0971e = this.appmetrica;
        if (interfaceC0043e != null) {
            if (!interfaceC0043e.billing()) {
                return;
            }
            C16658e c16658e2 = this.metrica;
            C8035e c8035e = c0971e.purchase;
            if (c8035e != null) {
                c8035e.invoke(Boolean.TRUE, interfaceC0043e, new C2152e(j), c16658e2);
            }
            this.ad = j;
        }
        if (AbstractC5956e.ad(c0971e, this.purchase)) {
            this.vip = 0L;
        }
    }
}
