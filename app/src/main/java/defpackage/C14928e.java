package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٔۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14928e extends AbstractC11861e {
    public final /* synthetic */ int appmetrica;
    public final /* synthetic */ C10640e purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14928e(C10640e c10640e, C6936e c6936e, int i) {
        super(c6936e);
        this.appmetrica = i;
        this.purchase = c10640e;
    }

    @Override // defpackage.AbstractC11861e
    public final void ad() {
        switch (this.appmetrica) {
            case 0:
                C10640e c10640e = this.purchase;
                c10640e.mo2250e();
                if (c10640e.m2862e()) {
                    C13879e c13879e = ((C6936e) c10640e.f36443e).f14227e;
                    C6936e.yandex(c13879e);
                    c13879e.f27497e.ad("Inactivity, disconnecting from the service");
                    c10640e.m2850e();
                    return;
                }
                return;
            default:
                C13879e c13879e2 = ((C6936e) this.purchase.f36443e).f14227e;
                C6936e.yandex(c13879e2);
                c13879e2.f27495e.ad("Tasks have been queued for a long time");
                return;
        }
    }
}
