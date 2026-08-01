package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4270e implements InterfaceC16189e {
    public final InterfaceC16189e ad;
    public final float vip;

    public C4270e(float f, InterfaceC16189e interfaceC16189e) {
        while (interfaceC16189e instanceof C4270e) {
            interfaceC16189e = ((C4270e) interfaceC16189e).ad;
            f += ((C4270e) interfaceC16189e).vip;
        }
        this.ad = interfaceC16189e;
        this.vip = f;
    }

    @Override // defpackage.InterfaceC16189e
    public final float ad(RectF rectF) {
        return Math.max(0.0f, this.ad.ad(rectF) + this.vip);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4270e)) {
            return false;
        }
        C4270e c4270e = (C4270e) obj;
        return this.ad.equals(c4270e.ad) && this.vip == c4270e.vip;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.ad, Float.valueOf(this.vip)});
    }
}
