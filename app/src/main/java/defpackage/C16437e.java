package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۗٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16437e {
    public static final String billing;
    public static final String purchase;
    public final int ad;
    public int appmetrica;
    public final C16975e[] license;
    public final int metrica;
    public final String vip;

    static {
        String str = AbstractC9413e.ad;
        purchase = Integer.toString(0, 36);
        billing = Integer.toString(1, 36);
    }

    public C16437e(String str, C16975e... c16975eArr) {
        AbstractC2301e.billing(c16975eArr.length > 0);
        this.vip = str;
        this.license = c16975eArr;
        this.ad = c16975eArr.length;
        String str2 = c16975eArr[0].loadAd;
        this.metrica = TextUtils.isEmpty(str2) ? AbstractC8542e.yandex(c16975eArr[0].amazon) : AbstractC8542e.yandex(str2);
        String str3 = c16975eArr[0].license;
        str3 = (str3 == null || str3.equals("und")) ? BuildConfig.FLAVOR : str3;
        int i = c16975eArr[0].purchase | 16384;
        for (int i2 = 1; i2 < c16975eArr.length; i2++) {
            String str4 = c16975eArr[i2].license;
            if (!str3.equals((str4 == null || str4.equals("und")) ? BuildConfig.FLAVOR : str4)) {
                metrica(i2, "languages", c16975eArr[0].license, c16975eArr[i2].license);
                return;
            } else {
                if (i != (c16975eArr[i2].purchase | 16384)) {
                    metrica(i2, "role flags", Integer.toBinaryString(c16975eArr[0].purchase), Integer.toBinaryString(c16975eArr[i2].purchase));
                    return;
                }
            }
        }
    }

    public static C16437e ad(Bundle bundle) {
        C1410e metrica;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(purchase);
        if (parcelableArrayList == null) {
            C2171e c2171e = AbstractC17475e.f34223e;
            metrica = C1410e.f4222e;
        } else {
            metrica = AbstractC5092e.metrica(new C10612e(17), parcelableArrayList);
        }
        return new C16437e(bundle.getString(billing, BuildConfig.FLAVOR), (C16975e[]) metrica.toArray(new C16975e[0]));
    }

    public static void metrica(int i, String str, String str2, String str3) {
        StringBuilder tapsense = AbstractC17861e.tapsense("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        tapsense.append(str3);
        tapsense.append("' (track ");
        tapsense.append(i);
        tapsense.append(")");
        AbstractC2803e.billing("TrackGroup", BuildConfig.FLAVOR, new IllegalStateException(tapsense.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C16437e.class == obj.getClass()) {
            C16437e c16437e = (C16437e) obj;
            if (this.vip.equals(c16437e.vip) && Arrays.equals(this.license, c16437e.license)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.appmetrica == 0) {
            this.appmetrica = Arrays.hashCode(this.license) + AbstractC1786e.advert(527, 31, this.vip);
        }
        return this.appmetrica;
    }

    public final Bundle license() {
        Bundle bundle = new Bundle();
        C16975e[] c16975eArr = this.license;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(c16975eArr.length);
        for (C16975e c16975e : c16975eArr) {
            List list = c16975e.subscription;
            Bundle bundle2 = new Bundle();
            bundle2.putString(C16975e.f33261implements, c16975e.ad);
            bundle2.putString(C16975e.f33239case, c16975e.vip);
            String str = C16975e.f33248e;
            AbstractC17475e<C12016e> abstractC17475e = c16975e.metrica;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(abstractC17475e.size());
            for (C12016e c12016e : abstractC17475e) {
                c12016e.getClass();
                Bundle bundle3 = new Bundle();
                String str2 = c12016e.ad;
                if (str2 != null) {
                    bundle3.putString(C12016e.metrica, str2);
                }
                bundle3.putString(C12016e.license, c12016e.vip);
                arrayList2.add(bundle3);
            }
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(C16975e.f33240catch, c16975e.license);
            bundle2.putInt(C16975e.f33258final, c16975e.appmetrica);
            bundle2.putInt(C16975e.f33271super, c16975e.purchase);
            int i = c16975e.billing;
            if (i != C16975e.f33243default.billing) {
                bundle2.putInt(C16975e.f33255e, i);
            }
            bundle2.putInt(C16975e.f33264new, c16975e.yandex);
            bundle2.putInt(C16975e.f33270strictfp, c16975e.startapp);
            bundle2.putString(C16975e.f33266private, c16975e.mopub);
            String str3 = c16975e.smaato;
            if (str3 != null) {
                bundle2.putString(C16975e.f33254e, str3);
            }
            bundle2.putString(C16975e.f33265package, c16975e.amazon);
            bundle2.putString(C16975e.f33275transient, c16975e.loadAd);
            bundle2.putInt(C16975e.f33262import, c16975e.Signature);
            for (int i2 = 0; i2 < list.size(); i2++) {
                bundle2.putByteArray(C16975e.f33263instanceof + "_" + Integer.toString(i2, 36), (byte[]) list.get(i2));
            }
            bundle2.putParcelable(C16975e.f33269static, c16975e.remoteconfig);
            bundle2.putLong(C16975e.f33273synchronized, c16975e.pro);
            bundle2.putInt(C16975e.f33268return, c16975e.tapsense);
            bundle2.putInt(C16975e.f33244else, c16975e.isVip);
            bundle2.putInt(C16975e.f33249e, c16975e.inmobi);
            bundle2.putInt(C16975e.f33250e, c16975e.isPro);
            bundle2.putFloat(C16975e.f33272switch, c16975e.applovin);
            bundle2.putInt(C16975e.f33274throws, c16975e.ads);
            bundle2.putFloat(C16975e.f33259finally, c16975e.premium);
            bundle2.putByteArray(C16975e.f33241const, c16975e.subs);
            bundle2.putInt(C16975e.f33276volatile, c16975e.crashlytics);
            C14754e c14754e = c16975e.firebase;
            if (c14754e != null) {
                String str4 = C16975e.f33260for;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(C14754e.startapp, c14754e.ad);
                bundle4.putInt(C14754e.adcel, c14754e.vip);
                bundle4.putInt(C14754e.mopub, c14754e.metrica);
                bundle4.putByteArray(C14754e.advert, c14754e.license);
                bundle4.putInt(C14754e.smaato, c14754e.appmetrica);
                bundle4.putInt(C14754e.amazon, c14754e.purchase);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(C16975e.f33256e, c16975e.f33279class);
            bundle2.putInt(C16975e.f33242continue, c16975e.f33282interface);
            bundle2.putInt(C16975e.f33267public, c16975e.f33281goto);
            bundle2.putInt(C16975e.f33257e, c16975e.f33285this);
            bundle2.putInt(C16975e.f33251e, c16975e.f33283native);
            bundle2.putInt(C16975e.f33253e, c16975e.f33280extends);
            bundle2.putInt(C16975e.f33246e, c16975e.f33286throw);
            bundle2.putInt(C16975e.f33247e, c16975e.f33287try);
            bundle2.putInt(C16975e.f33252e, c16975e.f33284protected);
            bundle2.putInt(C16975e.f33245e, c16975e.f33278break);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(purchase, arrayList);
        bundle.putString(billing, this.vip);
        return bundle;
    }

    public final String toString() {
        return this.vip + ": " + Arrays.toString(this.license);
    }

    public final int vip(C16975e c16975e) {
        int i = 0;
        while (true) {
            C16975e[] c16975eArr = this.license;
            if (i >= c16975eArr.length) {
                return -1;
            }
            if (c16975e == c16975eArr[i]) {
                return i;
            }
            i++;
        }
    }
}
