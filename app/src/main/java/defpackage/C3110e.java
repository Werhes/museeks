package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؔٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3110e {
    public final int ad;

    public /* synthetic */ C3110e(int i) {
        this.ad = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3110e) {
            return this.ad == ((C3110e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        return this.ad;
    }

    public final String toString() {
        int i = this.ad;
        if (i == 0) {
            return "PENDING";
        }
        if (i == 1) {
            return "AVAILABLE";
        }
        if (i == 2) {
            return "UNAVAILABLE";
        }
        switch (i) {
            case 10:
                return "ERROR_OUTPUT_FAILED";
            case 11:
                return "ERROR_OUTPUT_ABORTED";
            case 12:
                return "ERROR_OUTPUT_MISSING";
            case 13:
                return "ERROR_OUTPUT_DROPPED";
            default:
                return AbstractC8647e.applovin("OutputStatus(value=", i, ')');
        }
    }
}
