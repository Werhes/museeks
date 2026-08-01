package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٖۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16257e extends AbstractC3370e {
    public static final C6173e vip = new C6173e(11);

    public abstract AbstractC16232e billing(InterfaceC5021e interfaceC5021e);

    @Override // defpackage.AbstractC3370e
    public final AbstractC16232e license(AbstractC1186e abstractC1186e) {
        return billing(abstractC1186e.loadAd());
    }
}
