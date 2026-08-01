package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15965e implements InterfaceC7351e {
    public final InterfaceC4024e ad;

    public C15965e(InterfaceC4024e interfaceC4024e) {
        this.ad = interfaceC4024e;
    }

    @Override // defpackage.InterfaceC14232e
    public final C12469e ad() {
        return this.ad.ad();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15965e) {
            return AbstractC7890e.billing(this.ad, ((C15965e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "BasicFormatStructure(" + this.ad + ')';
    }

    @Override // defpackage.InterfaceC14232e
    public final C6195e vip() {
        return this.ad.vip();
    }
}
