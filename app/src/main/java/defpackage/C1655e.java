package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؓۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1655e extends EdgeEffect {
    public final float ad;
    public float vip;

    public C1655e(Context context) {
        super(context);
        this.ad = AbstractC12315e.ad(context).f24964e * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.vip = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.vip = 0.0f;
        super.onPull(f);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.vip = 0.0f;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.vip = 0.0f;
        super.onRelease();
    }
}
