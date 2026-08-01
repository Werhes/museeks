package defpackage;

import android.graphics.PointF;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۙٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16465e {
    public final PointF ad;

    public C16465e(PointF pointF) {
        this.ad = pointF;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C16465e) && this.ad.equals(((C16465e) obj).ad);
        }
        return true;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + 255;
    }

    public final String toString() {
        return "FrameState(position=" + this.ad + ", alpha=255)";
    }
}
