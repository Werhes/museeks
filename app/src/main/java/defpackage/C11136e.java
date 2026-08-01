package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٟٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11136e extends AbstractC6437e {
    public final String ad;

    public C11136e(String str) {
        this.ad = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11136e) && AbstractC7890e.billing(this.ad, ((C11136e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("TypeAlias(name="), this.ad, ')');
    }
}
