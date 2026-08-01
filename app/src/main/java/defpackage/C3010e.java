package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eِؔۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3010e {
    public static final C5384e Companion = new Object();
    public static final InterfaceC3477e[] license = {AbstractC18039e.appmetrica(2, new C14582e(12)), AbstractC18039e.appmetrica(2, new C14582e(13)), null};
    public final EnumC8621e ad;
    public final String metrica;
    public final EnumC8450e vip;

    public /* synthetic */ C3010e(int i, EnumC8621e enumC8621e, EnumC8450e enumC8450e, String str) {
        if (1 != (i & 1)) {
            AbstractC5756e.billing(i, 1, C7129e.ad.appmetrica());
            throw null;
        }
        this.ad = enumC8621e;
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = enumC8450e;
        }
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3010e)) {
            return false;
        }
        C3010e c3010e = (C3010e) obj;
        return this.ad == c3010e.ad && this.vip == c3010e.vip && AbstractC7890e.billing(this.metrica, c3010e.metrica);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        EnumC8450e enumC8450e = this.vip;
        int hashCode2 = (hashCode + (enumC8450e == null ? 0 : enumC8450e.hashCode())) * 31;
        String str = this.metrica;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseLinkButtonActionDto(type=");
        sb.append(this.ad);
        sb.append(", target=");
        sb.append(this.vip);
        sb.append(", url=");
        return AbstractC1786e.signatures(sb, this.metrica, ")");
    }
}
