package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16443e extends AbstractC0459e {
    public final String license;

    public C16443e(String str) {
        super("track", str, new C13887e(17));
        this.license = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16443e) && AbstractC7890e.billing(this.license, ((C16443e) obj).license);
    }

    public final int hashCode() {
        return this.license.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("Track(trackId="), this.license, ')');
    }
}
