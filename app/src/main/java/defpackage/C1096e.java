package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1096e {
    public final int ad;

    public /* synthetic */ C1096e(int i) {
        this.ad = i;
    }

    public static String ad(int i) {
        return AbstractC4653e.applovin(new StringBuilder("CameraError("), i == 0 ? "ERROR_UNDETERMINED" : i == 1 ? "ERROR_CAMERA_IN_USE" : i == 2 ? "ERROR_CAMERA_LIMIT_EXCEEDED" : i == 3 ? "ERROR_CAMERA_DISABLED" : i == 4 ? "ERROR_CAMERA_DEVICE" : i == 5 ? "ERROR_CAMERA_SERVICE" : i == 6 ? "ERROR_CAMERA_DISCONNECTED" : i == 7 ? "ERROR_ILLEGAL_ARGUMENT_EXCEPTION" : i == 8 ? "ERROR_SECURITY_EXCEPTION" : i == 9 ? "ERROR_GRAPH_CONFIG" : i == 10 ? "ERROR_DO_NOT_DISTURB_ENABLED" : i == 11 ? "ERROR_UNKNOWN_EXCEPTION" : i == 12 ? "ERROR_CAMERA_OPENER" : i == 13 ? "ERROR_CAMERA_OPEN_TIMEOUT" : "ERROR_UNKNOWN", ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1096e) {
            return this.ad == ((C1096e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        return this.ad;
    }

    public final String toString() {
        return ad(this.ad);
    }
}
