package defpackage;

import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؕۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16773e {
    public static final C15378e ad = new Object();

    public static final void ad(int i, int i2) {
        if (i2 > i) {
            throw new IndexOutOfBoundsException(AbstractC8647e.inmobi(i2, i, "startIndex (0) and endIndex (", ") are not within the range [0..size(", "))"));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC8647e.applovin("startIndex (0) > endIndex (", i2, ')'));
        }
    }

    public static final int metrica(int i, String str) {
        char charAt = str.charAt(i);
        return (charAt << 7) + str.charAt(i + 1);
    }

    public static InterfaceC18315e vip(InterfaceC18315e interfaceC18315e, Size size) {
        if (!(interfaceC18315e instanceof C6060e)) {
            if (AbstractC12904e.ad.vip(MediaCodecInfoReportIncorrectInfoQuirk.class) == null) {
                if (size != null && !interfaceC18315e.mo386e(size.getWidth(), size.getHeight())) {
                    AbstractC9464e.remoteconfig("VideoEncoderInfoWrapper", "Detected that the device does not support a size " + size + " that should be valid in widths/heights = " + interfaceC18315e.mo388e() + '/' + interfaceC18315e.mo383e());
                }
            }
            interfaceC18315e = new C6060e(interfaceC18315e);
        }
        if (size != null && (interfaceC18315e instanceof C6060e)) {
            ((C6060e) interfaceC18315e).f12740e.add(size);
        }
        return interfaceC18315e;
    }
}
