package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؖؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3937e extends AbstractC4609e {
    public final C8275e ad;

    public C3937e(C8275e c8275e) {
        this.ad = c8275e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4609e)) {
            return false;
        }
        return this.ad.equals(((C3937e) ((AbstractC4609e) obj)).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.ad + "}";
    }
}
