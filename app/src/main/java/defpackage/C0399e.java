package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؑٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0399e implements InterfaceC9477e {
    public final C14514e metrica = new C14514e(C14514e.license);

    public final boolean ad(AbstractC1186e abstractC1186e, AbstractC1186e abstractC1186e2) {
        return C5170e.adcel(AbstractC15182e.vip(false, null, 6), abstractC1186e.subscription(), abstractC1186e2.subscription());
    }

    public final boolean vip(AbstractC1186e abstractC1186e, AbstractC1186e abstractC1186e2) {
        C17611e vip = AbstractC15182e.vip(true, null, 6);
        AbstractC15728e subscription = abstractC1186e.subscription();
        AbstractC15728e subscription2 = abstractC1186e2.subscription();
        if (subscription == subscription2) {
            return true;
        }
        return C5170e.f11072e.billing(vip, vip.metrica, subscription, subscription2);
    }
}
