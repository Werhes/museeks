package defpackage;

import android.media.MediaCodec;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒ٘ۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1125e {
    public final MediaCodec.CryptoInfo ad;
    public final MediaCodec.CryptoInfo.Pattern vip = AbstractC6418e.metrica();

    public C1125e(MediaCodec.CryptoInfo cryptoInfo) {
        this.ad = cryptoInfo;
    }

    public static void ad(C1125e c1125e, int i, int i2) {
        c1125e.vip.set(i, i2);
        c1125e.ad.setPattern(c1125e.vip);
    }
}
