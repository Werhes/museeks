package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؘْٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13412e extends AbstractC18159e implements InterfaceC16793e, InterfaceC1940e {
    public static final C10958e Companion = new Object();
    public static final InterfaceC3477e[] billing = {null, AbstractC18039e.appmetrica(2, new C8462e(15)), null, null};
    public final String appmetrica;
    public final String purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13412e(int i, String str, EnumC4755e enumC4755e, String str2, String str3) {
        super(str, enumC4755e, 0);
        if (15 != (i & 15)) {
            AbstractC5756e.billing(i, 15, C7623e.ad.appmetrica());
            throw null;
        }
        this.appmetrica = str2;
        this.purchase = str3;
    }

    public C13412e(String str, String str2) {
        super(str, EnumC4755e.SimilarTrack);
        this.appmetrica = str;
        this.purchase = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13412e)) {
            return false;
        }
        C13412e c13412e = (C13412e) obj;
        return AbstractC7890e.billing(this.appmetrica, c13412e.appmetrica) && AbstractC7890e.billing(this.purchase, c13412e.purchase);
    }

    @Override // defpackage.InterfaceC1686e
    public final String getId() {
        return this.appmetrica;
    }

    public final int hashCode() {
        return this.purchase.hashCode() + (this.appmetrica.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC1686e
    public final String metrica() {
        return this.purchase;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimilarTrack(id=");
        sb.append(this.appmetrica);
        sb.append(", displayName=");
        return AbstractC4653e.applovin(sb, this.purchase, ')');
    }
}
