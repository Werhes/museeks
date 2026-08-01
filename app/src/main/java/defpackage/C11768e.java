package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11768e {
    public static final String Signature;
    public static final String admob;
    public static final String amazon;
    public static final String inmobi;
    public static final String isVip;
    public static final String loadAd;
    public static final String pro;
    public static final String remoteconfig;
    public static final String signatures;
    public static final String smaato;
    public static final String subscription;
    public static final String tapsense;
    public final long ad;
    public final long adcel;
    public final boolean advert;
    public final C1962e[] appmetrica;
    public final long[] billing;
    public final Uri[] license;
    public final int metrica;
    public final boolean mopub;
    public final int[] purchase;
    public final C6311e[] startapp;
    public final int vip;
    public final String[] yandex;

    static {
        String str = AbstractC9413e.ad;
        smaato = Integer.toString(0, 36);
        amazon = Integer.toString(1, 36);
        loadAd = Integer.toString(2, 36);
        Signature = Integer.toString(3, 36);
        admob = Integer.toString(4, 36);
        subscription = Integer.toString(5, 36);
        remoteconfig = Integer.toString(6, 36);
        pro = Integer.toString(7, 36);
        signatures = Integer.toString(8, 36);
        tapsense = Integer.toString(9, 36);
        isVip = Integer.toString(10, 36);
        inmobi = Integer.toString(11, 36);
    }

    public C11768e(long j, int i, int i2, int[] iArr, C1962e[] c1962eArr, long[] jArr, long j2, boolean z, String[] strArr, C6311e[] c6311eArr, boolean z2) {
        Uri uri;
        int i3 = 0;
        AbstractC2301e.billing(iArr.length == c1962eArr.length);
        AbstractC2301e.billing(iArr.length == c6311eArr.length);
        this.ad = j;
        this.vip = i;
        this.metrica = i2;
        this.purchase = iArr;
        this.appmetrica = c1962eArr;
        this.billing = jArr;
        this.adcel = j2;
        this.mopub = z;
        this.license = new Uri[c1962eArr.length];
        while (true) {
            Uri[] uriArr = this.license;
            if (i3 >= uriArr.length) {
                this.yandex = strArr;
                this.startapp = c6311eArr;
                this.advert = z2;
                return;
            }
            C1962e c1962e = c1962eArr[i3];
            if (c1962e == null) {
                uri = null;
            } else {
                C16914e c16914e = c1962e.vip;
                c16914e.getClass();
                uri = c16914e.ad;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    public final int ad(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.purchase;
            if (i3 >= iArr.length || this.mopub || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11768e.class == obj.getClass()) {
            C11768e c11768e = (C11768e) obj;
            if (this.ad == c11768e.ad && this.vip == c11768e.vip && this.metrica == c11768e.metrica && Arrays.equals(this.appmetrica, c11768e.appmetrica) && Arrays.equals(this.purchase, c11768e.purchase) && Arrays.equals(this.billing, c11768e.billing) && this.adcel == c11768e.adcel && this.mopub == c11768e.mopub && Arrays.equals(this.yandex, c11768e.yandex) && Arrays.equals(this.startapp, c11768e.startapp) && this.advert == c11768e.advert) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.vip * 31) + this.metrica) * 31;
        long j = this.ad;
        int hashCode = (Arrays.hashCode(this.billing) + ((Arrays.hashCode(this.purchase) + ((Arrays.hashCode(this.appmetrica) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31)) * 31;
        long j2 = this.adcel;
        return ((Arrays.hashCode(this.startapp) + ((((((hashCode + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.mopub ? 1 : 0)) * 31) + Arrays.hashCode(this.yandex)) * 31)) * 31) + (this.advert ? 1 : 0);
    }
}
