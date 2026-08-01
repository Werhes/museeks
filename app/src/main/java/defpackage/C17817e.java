package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ٘٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17817e {
    public static final String ads;
    public static final String applovin;

    /* renamed from: class, reason: not valid java name */
    public static final String f34914class;
    public static final String crashlytics;

    /* renamed from: extends, reason: not valid java name */
    public static final String f34915extends;
    public static final String firebase;

    /* renamed from: goto, reason: not valid java name */
    public static final String f34916goto;
    public static final String inmobi;

    /* renamed from: interface, reason: not valid java name */
    public static final String f34917interface;
    public static final String isPro;
    public static final String isVip;

    /* renamed from: native, reason: not valid java name */
    public static final String f34918native;
    public static final String premium;
    public static final String pro;
    public static final String remoteconfig;
    public static final String signatures;
    public static final String subs;
    public static final String tapsense;

    /* renamed from: this, reason: not valid java name */
    public static final String f34919this;

    /* renamed from: throw, reason: not valid java name */
    public static final String f34920throw;
    public final int Signature;
    public final CharSequence ad;
    public final float adcel;
    public final float admob;
    public final boolean advert;
    public final int amazon;
    public final float appmetrica;
    public final int billing;
    public final Bitmap license;
    public final float loadAd;
    public final Layout.Alignment metrica;
    public final float mopub;
    public final int purchase;
    public final int smaato;
    public final int startapp;
    public final int subscription;
    public final Layout.Alignment vip;
    public final float yandex;

    static {
        new C17817e(BuildConfig.FLAVOR, null, null, null, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, RecyclerView.UNDEFINED_DURATION, 0.0f, 0);
        String str = AbstractC9413e.ad;
        remoteconfig = Integer.toString(0, 36);
        pro = Integer.toString(17, 36);
        signatures = Integer.toString(1, 36);
        tapsense = Integer.toString(2, 36);
        isVip = Integer.toString(3, 36);
        inmobi = Integer.toString(18, 36);
        isPro = Integer.toString(4, 36);
        applovin = Integer.toString(5, 36);
        ads = Integer.toString(6, 36);
        premium = Integer.toString(7, 36);
        subs = Integer.toString(8, 36);
        crashlytics = Integer.toString(9, 36);
        firebase = Integer.toString(10, 36);
        f34914class = Integer.toString(11, 36);
        f34917interface = Integer.toString(12, 36);
        f34916goto = Integer.toString(13, 36);
        f34919this = Integer.toString(14, 36);
        f34918native = Integer.toString(15, 36);
        f34915extends = Integer.toString(16, 36);
        f34920throw = Integer.toString(19, 36);
    }

    public C17817e(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6, int i7) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC2301e.billing(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.ad = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.ad = charSequence.toString();
        } else {
            this.ad = null;
        }
        this.vip = alignment;
        this.metrica = alignment2;
        this.license = bitmap;
        this.appmetrica = f;
        this.purchase = i;
        this.billing = i2;
        this.yandex = f2;
        this.startapp = i3;
        this.adcel = f4;
        this.mopub = f5;
        this.advert = z;
        this.smaato = i5;
        this.amazon = i4;
        this.loadAd = f3;
        this.Signature = i6;
        this.admob = f6;
        this.subscription = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0115  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.text.SpannableString, android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C17817e ad(android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17817e.ad(android.os.Bundle):eِ٘٘");
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (obj != null && C17817e.class == obj.getClass()) {
            C17817e c17817e = (C17817e) obj;
            Bitmap bitmap2 = c17817e.license;
            if (TextUtils.equals(this.ad, c17817e.ad) && this.vip == c17817e.vip && this.metrica == c17817e.metrica && ((bitmap = this.license) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.appmetrica == c17817e.appmetrica && this.purchase == c17817e.purchase && this.billing == c17817e.billing && this.yandex == c17817e.yandex && this.startapp == c17817e.startapp && this.adcel == c17817e.adcel && this.mopub == c17817e.mopub && this.advert == c17817e.advert && this.smaato == c17817e.smaato && this.amazon == c17817e.amazon && this.loadAd == c17817e.loadAd && this.Signature == c17817e.Signature && this.admob == c17817e.admob && this.subscription == c17817e.subscription) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.ad, this.vip, this.metrica, this.license, Float.valueOf(this.appmetrica), Integer.valueOf(this.purchase), Integer.valueOf(this.billing), Float.valueOf(this.yandex), Integer.valueOf(this.startapp), Float.valueOf(this.adcel), Float.valueOf(this.mopub), Boolean.valueOf(this.advert), Integer.valueOf(this.smaato), Integer.valueOf(this.amazon), Float.valueOf(this.loadAd), Integer.valueOf(this.Signature), Float.valueOf(this.admob), Integer.valueOf(this.subscription));
    }

    public final Bundle vip() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.ad;
        if (charSequence != null) {
            bundle.putCharSequence(remoteconfig, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = AbstractC3873e.ad;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (C6292e c6292e : (C6292e[]) spanned.getSpans(0, spanned.length(), C6292e.class)) {
                    c6292e.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(C6292e.metrica, c6292e.ad);
                    bundle2.putInt(C6292e.license, c6292e.vip);
                    arrayList.add(AbstractC3873e.ad(spanned, c6292e, 1, bundle2));
                }
                for (C7990e c7990e : (C7990e[]) spanned.getSpans(0, spanned.length(), C7990e.class)) {
                    c7990e.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(C7990e.license, c7990e.ad);
                    bundle3.putInt(C7990e.appmetrica, c7990e.vip);
                    bundle3.putInt(C7990e.purchase, c7990e.metrica);
                    arrayList.add(AbstractC3873e.ad(spanned, c7990e, 2, bundle3));
                }
                for (C10422e c10422e : (C10422e[]) spanned.getSpans(0, spanned.length(), C10422e.class)) {
                    arrayList.add(AbstractC3873e.ad(spanned, c10422e, 3, null));
                }
                for (C17763e c17763e : (C17763e[]) spanned.getSpans(0, spanned.length(), C17763e.class)) {
                    c17763e.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(C17763e.vip, c17763e.ad);
                    arrayList.add(AbstractC3873e.ad(spanned, c17763e, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(pro, arrayList);
                }
            }
        }
        bundle.putSerializable(signatures, this.vip);
        bundle.putSerializable(tapsense, this.metrica);
        bundle.putFloat(isPro, this.appmetrica);
        bundle.putInt(applovin, this.purchase);
        bundle.putInt(ads, this.billing);
        bundle.putFloat(premium, this.yandex);
        bundle.putInt(subs, this.startapp);
        bundle.putInt(crashlytics, this.amazon);
        bundle.putFloat(firebase, this.loadAd);
        bundle.putFloat(f34914class, this.adcel);
        bundle.putFloat(f34917interface, this.mopub);
        bundle.putBoolean(f34919this, this.advert);
        bundle.putInt(f34916goto, this.smaato);
        bundle.putInt(f34918native, this.Signature);
        bundle.putFloat(f34915extends, this.admob);
        bundle.putInt(f34920throw, this.subscription);
        return bundle;
    }
}
