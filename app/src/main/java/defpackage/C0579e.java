package defpackage;

import android.media.MediaCodec;
import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؑۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0579e {
    public byte[] ad;
    public final C1125e adcel;
    public int[] appmetrica;
    public int billing;
    public int[] license;
    public int metrica;
    public int purchase;
    public final MediaCodec.CryptoInfo startapp;
    public byte[] vip;
    public int yandex;

    public C0579e() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.startapp = cryptoInfo;
        this.adcel = Build.VERSION.SDK_INT >= 24 ? new C1125e(cryptoInfo) : null;
    }
}
