package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3565e implements InterfaceC11259e {
    public final C12708e ad;

    public C3565e(C12708e c12708e) {
        this.ad = c12708e;
    }

    @Override // defpackage.InterfaceC11259e
    public final InterfaceC5355e ad(C16569e c16569e, C6302e c6302e) {
        ImageDecoder.Source m3768case;
        Bitmap.Config vip = AbstractC15659e.vip(c6302e);
        if ((vip == Bitmap.Config.ARGB_8888 || vip == Bitmap.Config.HARDWARE) && (m3768case = AbstractC14204e.m3768case(c16569e.ad, c6302e, false)) != null) {
            return new C3716e(m3768case, c16569e.ad, c6302e, this.ad);
        }
        return null;
    }
}
