package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3417e implements InterfaceC16707e {
    public final float ad;
    public final float vip;

    public C3417e(float f, float f2) {
        AbstractC2301e.yandex(f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f, "Invalid latitude or longitude");
        this.ad = f;
        this.vip = f2;
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ C16975e ad() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3417e.class == obj.getClass()) {
            C3417e c3417e = (C3417e) obj;
            if (this.ad == c3417e.ad && this.vip == c3417e.vip) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.vip).hashCode() + ((Float.valueOf(this.ad).hashCode() + 527) * 31);
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ byte[] metrica() {
        return null;
    }

    public final String toString() {
        return "xyz: latitude=" + this.ad + ", longitude=" + this.vip;
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ void vip(C4761e c4761e) {
    }
}
