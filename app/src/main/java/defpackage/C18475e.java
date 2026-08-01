package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18475e implements InterfaceC3703e {
    public final String ad;

    public C18475e(String str) {
        this.ad = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18475e) {
            return AbstractC7890e.billing(this.ad, ((C18475e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.ad, ')');
    }
}
