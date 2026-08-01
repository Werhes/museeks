package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؓۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2055e extends AbstractC8589e {
    public final String ad;

    public C2055e(String str) {
        this.ad = str;
    }

    @Override // defpackage.AbstractC8589e
    public final Object ad() {
        return this.ad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2055e) && AbstractC7890e.billing(this.ad, ((C2055e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }
}
