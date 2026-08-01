package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۥؘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0685e implements InterfaceC16189e {
    public final float ad;

    public C0685e(float f) {
        this.ad = f;
    }

    @Override // defpackage.InterfaceC16189e
    public final float ad(RectF rectF) {
        return this.ad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0685e) && this.ad == ((C0685e) obj).ad;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.ad)});
    }
}
