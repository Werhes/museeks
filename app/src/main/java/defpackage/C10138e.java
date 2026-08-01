package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10138e {
    public final int ad;

    public final boolean equals(Object obj) {
        if (obj instanceof C10138e) {
            return this.ad == ((C10138e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        return this.ad;
    }

    public final String toString() {
        int i = this.ad;
        return i == 16 ? "Confirm" : i == 6 ? "ContextClick" : i == 13 ? "GestureEnd" : i == 23 ? "GestureThresholdActivate" : i == 3 ? "KeyboardTap" : i == 0 ? "LongPress" : i == 17 ? "Reject" : i == 27 ? "SegmentFrequentTick" : i == 26 ? "SegmentTick" : i == 9 ? "TextHandleMove" : i == 22 ? "ToggleOff" : i == 21 ? "ToggleOn" : i == 1 ? "VirtualKey" : "Invalid";
    }
}
