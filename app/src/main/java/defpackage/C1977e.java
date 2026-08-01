package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؓٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1977e implements InterfaceC2425e {
    public final /* synthetic */ int ad = 1;
    public final /* synthetic */ Object metrica;
    public final /* synthetic */ Object vip;

    public C1977e(C1059e c1059e, RunnableC7410e runnableC7410e) {
        this.metrica = c1059e;
        this.vip = runnableC7410e;
    }

    public C1977e(C10279e c10279e, Celse celse) {
        this.vip = c10279e;
        this.metrica = celse;
    }

    private final /* synthetic */ void license() {
    }

    private final /* synthetic */ void metrica() {
    }

    @Override // defpackage.InterfaceC2425e
    public final void ad(C9142e c9142e) {
        switch (this.ad) {
            case 0:
                c9142e.vip();
                C10279e c10279e = (C10279e) this.vip;
                if (c9142e.equals(c10279e.purchase)) {
                    c10279e.purchase = null;
                    ((Celse) this.metrica).invoke();
                    return;
                }
                return;
            default:
                C1059e c1059e = (C1059e) this.metrica;
                c1059e.f3575e = 1.0f;
                c1059e.yandex();
                ((RunnableC7410e) this.vip).run();
                return;
        }
    }

    @Override // defpackage.InterfaceC2425e
    public final /* synthetic */ void vip() {
        int i = this.ad;
    }
}
