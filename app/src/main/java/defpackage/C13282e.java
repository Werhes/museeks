package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13282e implements InterfaceC5169e {
    public final InterfaceC4719e ad;
    public final InterfaceC17873e vip;

    public C13282e(InterfaceC4719e interfaceC4719e, InterfaceC17873e interfaceC17873e) {
        this.ad = interfaceC4719e;
        this.vip = interfaceC17873e;
    }

    @Override // defpackage.InterfaceC5169e
    public final void ad() {
        InterfaceC17873e interfaceC17873e = this.vip;
        boolean z = interfaceC17873e instanceof C16455e;
        InterfaceC4719e interfaceC4719e = this.ad;
        if (z) {
            interfaceC4719e.ad(((C16455e) interfaceC17873e).ad);
        } else {
            if (!(interfaceC17873e instanceof C10574e)) {
                throw new C14803e(10);
            }
            interfaceC4719e.metrica(((C10574e) interfaceC17873e).ad);
        }
    }
}
