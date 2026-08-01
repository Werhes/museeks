package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۣٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7929e implements InterfaceC16189e {
    public final float ad;

    public C7929e(float f) {
        this.ad = f;
    }

    @Override // defpackage.InterfaceC16189e
    public final float ad(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.ad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7929e) && this.ad == ((C7929e) obj).ad;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.ad)});
    }
}
