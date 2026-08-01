package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۥۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11387e {
    public int ad;
    public int adcel;
    public int advert;
    public int appmetrica;
    public int billing;
    public int license;
    public int metrica;
    public long mopub;
    public int purchase;
    public int startapp;
    public int vip;
    public int yandex;

    public final String toString() {
        int i = this.ad;
        int i2 = this.vip;
        int i3 = this.metrica;
        int i4 = this.license;
        int i5 = this.appmetrica;
        int i6 = this.purchase;
        int i7 = this.billing;
        int i8 = this.yandex;
        int i9 = this.startapp;
        int i10 = this.adcel;
        long j = this.mopub;
        int i11 = this.advert;
        String str = AbstractC9413e.ad;
        Locale locale = Locale.US;
        StringBuilder pro = AbstractC17861e.pro(i, i2, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        AbstractC10257e.signatures(pro, i3, "\n skippedInputBuffers=", i4, "\n renderedOutputBuffers=");
        AbstractC10257e.signatures(pro, i5, "\n skippedOutputBuffers=", i6, "\n droppedBuffers=");
        AbstractC10257e.signatures(pro, i7, "\n droppedInputBuffers=", i8, "\n maxConsecutiveDroppedBuffers=");
        AbstractC10257e.signatures(pro, i9, "\n droppedToKeyframeEvents=", i10, "\n totalVideoFrameProcessingOffsetUs=");
        pro.append(j);
        pro.append("\n videoFrameProcessingOffsetCount=");
        pro.append(i11);
        pro.append("\n}");
        return pro.toString();
    }
}
