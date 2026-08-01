package defpackage;

import android.util.Size;
import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16433e extends C17974e {
    @Override // defpackage.C17974e
    public final Integer[] admob() {
        Integer[] admob = super.admob();
        if (AbstractC16338e.ad(PixelJpegRSupportedQuirk.class) == null) {
            return admob;
        }
        if (admob == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : admob) {
            if (num.intValue() != 4101) {
                arrayList.add(num);
            }
        }
        return (Integer[]) arrayList.toArray(new Integer[0]);
    }

    @Override // defpackage.C17974e
    public final long remoteconfig(int i, Size size) {
        if (i != 4101 || AbstractC16338e.ad(PixelJpegRSupportedQuirk.class) == null) {
            return super.remoteconfig(i, size);
        }
        return 0L;
    }

    @Override // defpackage.C17974e
    public final Size[] signatures(int i) {
        if (i != 4101 || AbstractC16338e.ad(PixelJpegRSupportedQuirk.class) == null) {
            return super.signatures(i);
        }
        return null;
    }
}
