package defpackage;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؒۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16717e {
    public static final C1410e appmetrica;
    public static final C1410e billing;
    public static final C16717e purchase;
    public static final AbstractC8507e yandex;
    public final SparseArray ad = new SparseArray();
    public final AbstractC17475e license;
    public final AbstractC17475e metrica;
    public final int vip;

    static {
        C1410e ads = AbstractC17475e.ads(12);
        appmetrica = ads;
        purchase = new C16717e(AbstractC17475e.ads(C10824e.license), ads, C1410e.f4222e);
        Object[] objArr = {2, 5, 6};
        AbstractC8306e.ad(3, objArr);
        billing = AbstractC17475e.loadAd(3, objArr);
        Csuper csuper = new Csuper(4);
        csuper.mo3904implements(5, 6);
        csuper.mo3904implements(17, 6);
        csuper.mo3904implements(7, 6);
        csuper.mo3904implements(30, 10);
        csuper.mo3904implements(18, 6);
        csuper.mo3904implements(6, 8);
        csuper.mo3904implements(8, 8);
        csuper.mo3904implements(14, 8);
        yandex = csuper.mopub(true);
    }

    public C16717e(C1410e c1410e, List list, List list2) {
        for (int i = 0; i < c1410e.f4224e; i++) {
            C10824e c10824e = (C10824e) c1410e.get(i);
            this.ad.put(c10824e.ad, c10824e);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.ad.size(); i3++) {
            i2 = Math.max(i2, ((C10824e) this.ad.valueAt(i3)).vip);
        }
        this.vip = i2;
        this.metrica = AbstractC17475e.remoteconfig(list);
        this.license = AbstractC17475e.remoteconfig(list2);
    }

    public static C1410e ad(int[] iArr, int i) {
        C13304e Signature = AbstractC17475e.Signature();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            Signature.metrica(new C10824e(i2, i));
        }
        return Signature.billing();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
    
        if (r0.equals("Xiaomi") == false) goto L51;
     */
    /* JADX WARN: Type inference failed for: r11v4, types: [eّۗؐ, eؒۛٞ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C16717e vip(android.content.Context r8, android.content.Intent r9, defpackage.C3335e r10, android.media.AudioDeviceInfo r11, java.util.List r12) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16717e.vip(android.content.Context, android.content.Intent, eْٕؕ, android.media.AudioDeviceInfo, java.util.List):eٗؒۗ");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16717e)) {
            return false;
        }
        C16717e c16717e = (C16717e) obj;
        return AbstractC9413e.amazon(this.ad, c16717e.ad) && this.vip == c16717e.vip && Objects.equals(this.metrica, c16717e.metrica) && Objects.equals(this.license, c16717e.license);
    }

    public final int hashCode() {
        return Objects.hashCode(this.license) + ((Objects.hashCode(this.metrica) + ((AbstractC9413e.loadAd(this.ad) + (this.vip * 31)) * 31)) * 31);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
    
        if (r9 != 5) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair metrica(defpackage.C3335e r14, defpackage.C16975e r15) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16717e.metrica(eْٕؕ, eٌْٗ):android.util.Pair");
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.vip + ", audioProfiles=" + this.ad + ", speakerLayoutChannelMasks=" + this.metrica + ", spatializerChannelMasks=" + this.license + "]";
    }
}
