package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٔؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14441e extends AbstractC5255e {
    public final List ad;

    public C14441e(List list) {
        this.ad = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5255e)) {
            return false;
        }
        return this.ad.equals(((C14441e) ((AbstractC5255e) obj)).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.ad + "}";
    }
}
