package defpackage;

import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؔٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0818e implements InterfaceC14414e {
    public static final C7936e advert;
    public final C8053e ad;
    public final int adcel;
    public long appmetrica;
    public final double billing;
    public final long license;
    public final C2807e metrica;
    public final String mopub;
    public final double purchase;
    public final long startapp;
    public final C16059e vip;
    public final long yandex;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        advert = new C7936e(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0162  */
    /* JADX WARN: Type inference failed for: r13v0, types: [eِٖۢ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0818e(defpackage.C12894e r22, long r23, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0818e.<init>(eّۦٜ, long, java.lang.String):void");
    }

    public final boolean ad(long j, C16151e c16151e, C12894e c12894e, String str) {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C8053e c8053e = this.ad;
        c8053e.ad();
        C7936e c7936e = advert;
        c7936e.getClass();
        int i = C1724e.ad;
        long size = ((FileChannel) c12894e.f25752e).size();
        if (c8053e.ad() > 4804) {
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            c8053e.ad();
            c7936e.getClass();
            return false;
        }
        if (c16151e.f31731e <= c8053e.ad() + 196) {
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            c7936e.getClass();
            c16151e.ad();
            c12894e.ads(j, Math.max(Math.min(5000L, size - j), 0L), c16151e);
            if (c16151e.f31731e <= 196) {
                c7936e.getClass();
                return false;
            }
        }
        c16151e.skip(c8053e.ad());
        if (!C8053e.metrica(c16151e)) {
            EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
            c7936e.getClass();
            return false;
        }
        try {
            C8053e.license(c16151e);
            EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
            c7936e.getClass();
            return true;
        } catch (C0128e unused) {
            EnumC1005e[] enumC1005eArr6 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i2 = C1724e.ad;
            return false;
        }
    }

    public final String toString() {
        C12894e billing = AbstractC1749e.billing(this);
        billing.metrica(this.ad, "mp3FrameHeader");
        billing.metrica(this.vip, "mp3XingFrame");
        billing.metrica(this.metrica, "mp3VbriFrame");
        billing.metrica(null, "audioDataStartPosition");
        billing.metrica(null, "audioDataEndPosition");
        billing.vip(this.license, "fileSize");
        billing.vip(this.appmetrica, "startByte");
        billing.license("timePerFrame", String.valueOf(this.purchase));
        billing.license("trackLength", String.valueOf(this.billing));
        billing.vip(this.yandex, "numberOfFrames");
        billing.vip(this.startapp, "numberOfFramesEstimate");
        billing.ad(this.adcel, "bitrate");
        billing.metrica(this.mopub, "encoder");
        return billing.toString();
    }
}
