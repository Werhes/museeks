package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۢؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14317e implements InterfaceC13547e {
    public final /* synthetic */ int vip;

    public /* synthetic */ C14317e(int i) {
        this.vip = i;
    }

    @Override // defpackage.InterfaceC13547e
    public final float ad(float f, float f2, float f3) {
        switch (this.vip) {
            case 0:
                InterfaceC13547e.ad.getClass();
                float f4 = f2 + f;
                if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
                    return 0.0f;
                }
                float f5 = f4 - f3;
                return Math.abs(f) < Math.abs(f5) ? f : f5;
            default:
                float abs = Math.abs((f2 + f) - f);
                float f6 = (0.3f * f3) - (0.0f * abs);
                float f7 = f3 - f6;
                if ((abs <= f3) && f7 < abs) {
                    f6 = f3 - abs;
                }
                return f - f6;
        }
    }

    @Override // defpackage.InterfaceC13547e
    public final C13540e vip() {
        switch (this.vip) {
            case 0:
            default:
                InterfaceC13547e.ad.getClass();
                return C8713e.vip;
        }
    }
}
