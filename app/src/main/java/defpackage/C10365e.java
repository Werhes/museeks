package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٚ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10365e extends AbstractC2803e {
    public final C3434e vip;

    public C10365e(C3434e c3434e) {
        this.vip = c3434e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10365e) && AbstractC7890e.billing(this.vip, ((C10365e) obj).vip);
    }

    public final int hashCode() {
        return this.vip.ad.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("(method:"), this.vip.ad, ')');
    }

    @Override // defpackage.AbstractC2803e
    public final AbstractC9510e yandex(C1740e c1740e, int i) {
        return ((C3434e) ((C17790e) AbstractC10337e.ad(((InterfaceC8376e) c1740e.f4735e).license())).f34883e).equals(this.vip) ? AbstractC9510e.license : AbstractC9510e.vip;
    }
}
