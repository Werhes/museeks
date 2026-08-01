package defpackage;

import android.graphics.PathMeasure;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۖٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7357e {
    public final PathMeasure ad;

    public C7357e(PathMeasure pathMeasure) {
        this.ad = pathMeasure;
    }

    public final boolean ad(float f, float f2, C17985e c17985e) {
        if (!(c17985e instanceof C17985e)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.ad.getSegment(f, f2, c17985e.ad, true);
    }

    public final void vip(C17985e c17985e) {
        this.ad.setPath(c17985e != null ? c17985e.ad : null, false);
    }
}
