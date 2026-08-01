package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۢؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9828e implements InterfaceC16707e {
    public final float ad;
    public final int vip;

    public C9828e(int i, float f) {
        this.ad = f;
        this.vip = i;
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ C16975e ad() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9828e.class == obj.getClass()) {
            C9828e c9828e = (C9828e) obj;
            if (this.ad == c9828e.ad && this.vip == c9828e.vip) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.ad).hashCode() + 527) * 31) + this.vip;
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ byte[] metrica() {
        return null;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.ad + ", svcTemporalLayerCount=" + this.vip;
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ void vip(C4761e c4761e) {
    }
}
