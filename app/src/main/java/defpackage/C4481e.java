package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۤۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4481e extends AbstractC2635e {
    public final ArrayList ad;

    public C4481e(ArrayList arrayList) {
        this.ad = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2635e)) {
            return false;
        }
        return this.ad.equals(((C4481e) ((AbstractC2635e) obj)).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.ad + "}";
    }
}
