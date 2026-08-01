package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜ٘ۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18110e extends AbstractC2803e implements InterfaceC1012e {
    public final String vip;

    public C18110e(String str) {
        this.vip = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18110e) && AbstractC7890e.billing(this.vip, ((C18110e) obj).vip);
    }

    public final int hashCode() {
        return this.vip.hashCode();
    }

    public final String toString() {
        return this.vip;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.AbstractC2803e
    public final AbstractC9510e yandex(C1740e c1740e, int i) {
        ?? r2 = c1740e.f4739e;
        return (i >= r2.size() || !AbstractC7890e.billing(r2.get(i), this.vip)) ? AbstractC9510e.ad : AbstractC9510e.purchase;
    }
}
