package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٓٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13241e extends AbstractC13109e {
    public boolean amazon;
    public static final byte[] loadAd = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] Signature = {79, 112, 117, 115, 84, 97, 103, 115};

    public static boolean appmetrica(C1292e c1292e, byte[] bArr) {
        if (c1292e.ad() < bArr.length) {
            return false;
        }
        int i = c1292e.vip;
        byte[] bArr2 = new byte[bArr.length];
        c1292e.mopub(0, bArr.length, bArr2);
        c1292e.m571try(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.AbstractC13109e
    public final void license(boolean z) {
        super.license(z);
        if (z) {
            this.amazon = false;
        }
    }

    @Override // defpackage.AbstractC13109e
    public final boolean metrica(C1292e c1292e, long j, C10312e c10312e) {
        if (appmetrica(c1292e, loadAd)) {
            byte[] copyOf = Arrays.copyOf(c1292e.ad, c1292e.metrica);
            int i = copyOf[9] & 255;
            ArrayList vip = AbstractC7535e.vip(copyOf);
            if (((C16975e) c10312e.f20361e) == null) {
                C11445e c11445e = new C11445e();
                c11445e.smaato = AbstractC8542e.amazon("audio/ogg");
                c11445e.amazon = AbstractC8542e.amazon("audio/opus");
                c11445e.f23018class = i;
                c11445e.f23021interface = 48000;
                c11445e.admob = vip;
                c10312e.f20361e = new C16975e(c11445e);
                return true;
            }
        } else {
            if (!appmetrica(c1292e, Signature)) {
                ((C16975e) c10312e.f20361e).getClass();
                return false;
            }
            ((C16975e) c10312e.f20361e).getClass();
            if (!this.amazon) {
                this.amazon = true;
                c1292e.m568protected(8);
                C17750e mopub = AbstractC0014e.mopub(AbstractC17475e.tapsense((String[]) AbstractC0014e.advert(c1292e, false, false).f20137e));
                if (mopub != null) {
                    C11445e ad = ((C16975e) c10312e.f20361e).ad();
                    ad.mopub = mopub.vip(((C16975e) c10312e.f20361e).advert);
                    c10312e.f20361e = new C16975e(ad);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC13109e
    public final long vip(C1292e c1292e) {
        byte[] bArr = c1292e.ad;
        return (this.startapp * AbstractC7535e.amazon(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }
}
