package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٟٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5804e extends AbstractC2803e implements InterfaceC1012e {
    public static final C5804e vip = new Object();

    public final String toString() {
        return "<slash>";
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.AbstractC2803e
    public final AbstractC9510e yandex(C1740e c1740e, int i) {
        InterfaceC8376e interfaceC8376e = (InterfaceC8376e) c1740e.f4735e;
        ?? r1 = c1740e.f4739e;
        C8208e c8208e = AbstractC7925e.ad;
        return interfaceC8376e.getAttributes().vip(AbstractC7925e.ad) ? AbstractC9510e.appmetrica : r1.isEmpty() ? AbstractC9510e.license : i < AbstractC6874e.billing(r1) ? AbstractC9510e.appmetrica : i > AbstractC6874e.billing(r1) ? AbstractC9510e.ad : ((CharSequence) r1.get(i)).length() > 0 ? AbstractC9510e.appmetrica : c1740e.f4737e ? AbstractC9510e.purchase : AbstractC9510e.ad;
    }
}
