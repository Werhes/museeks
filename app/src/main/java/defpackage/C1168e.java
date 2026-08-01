package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٛؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1168e extends Exception {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C10643e f3756e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f3757e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f3758e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f3759e;

    public C1168e(C16975e c16975e, C1393e c1393e, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + c16975e, c1393e, c16975e.loadAd, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : BuildConfig.FLAVOR) + Math.abs(i));
    }

    public C1168e(String str, Throwable th, String str2, boolean z, C10643e c10643e, String str3) {
        super(str, th);
        this.f3759e = str2;
        this.f3757e = z;
        this.f3756e = c10643e;
        this.f3758e = str3;
    }
}
