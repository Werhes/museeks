package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؒٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1019e {
    public static final boolean[] ads;
    public static final int[] applovin;
    public static final int[] crashlytics;
    public static final int[] firebase;
    public static final int[] inmobi;
    public static final int[] isPro;
    public static final int isVip;
    public static final int[] premium;
    public static final int[] subs;
    public static final int tapsense = metrica(2, 2, 2, 0);
    public int Signature;
    public int adcel;
    public int admob;
    public int advert;
    public int amazon;
    public int appmetrica;
    public int billing;
    public boolean license;
    public int loadAd;
    public boolean metrica;
    public int mopub;
    public int pro;
    public boolean purchase;
    public int remoteconfig;
    public int signatures;
    public int smaato;
    public int startapp;
    public int subscription;
    public int yandex;
    public final ArrayList ad = new ArrayList();
    public final SpannableStringBuilder vip = new SpannableStringBuilder();

    static {
        int metrica = metrica(0, 0, 0, 0);
        isVip = metrica;
        int metrica2 = metrica(0, 0, 0, 3);
        inmobi = new int[]{0, 0, 0, 0, 0, 2, 0};
        isPro = new int[]{0, 0, 0, 0, 0, 0, 2};
        applovin = new int[]{3, 3, 3, 3, 3, 3, 1};
        ads = new boolean[]{false, false, false, true, true, true, false};
        premium = new int[]{metrica, metrica2, metrica, metrica, metrica2, metrica, metrica};
        subs = new int[]{0, 1, 2, 3, 4, 3, 4};
        crashlytics = new int[]{0, 0, 0, 0, 0, 3, 3};
        firebase = new int[]{metrica, metrica, metrica, metrica, metrica, metrica2, metrica2};
    }

    public C1019e() {
        license();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int metrica(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            defpackage.AbstractC2301e.mopub(r4, r0)
            defpackage.AbstractC2301e.mopub(r5, r0)
            defpackage.AbstractC2301e.mopub(r6, r0)
            defpackage.AbstractC2301e.mopub(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L1b
            if (r7 == r1) goto L1b
            r3 = 2
            if (r7 == r3) goto L1f
            r3 = 3
            if (r7 == r3) goto L1d
        L1b:
            r7 = r2
            goto L21
        L1d:
            r7 = r0
            goto L21
        L1f:
            r7 = 127(0x7f, float:1.78E-43)
        L21:
            if (r4 <= r1) goto L25
            r4 = r2
            goto L26
        L25:
            r4 = r0
        L26:
            if (r5 <= r1) goto L2a
            r5 = r2
            goto L2b
        L2a:
            r5 = r0
        L2b:
            if (r6 <= r1) goto L2e
            r0 = r2
        L2e:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1019e.metrica(int, int, int, int):int");
    }

    public final void ad(char c) {
        SpannableStringBuilder spannableStringBuilder = this.vip;
        if (c != '\n') {
            spannableStringBuilder.append(c);
            return;
        }
        SpannableString vip = vip();
        ArrayList arrayList = this.ad;
        arrayList.add(vip);
        spannableStringBuilder.clear();
        if (this.loadAd != -1) {
            this.loadAd = 0;
        }
        if (this.Signature != -1) {
            this.Signature = 0;
        }
        if (this.admob != -1) {
            this.admob = 0;
        }
        if (this.remoteconfig != -1) {
            this.remoteconfig = 0;
        }
        while (true) {
            if (arrayList.size() < this.adcel && arrayList.size() < 15) {
                this.signatures = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    public final void appmetrica(boolean z, boolean z2) {
        int i = this.loadAd;
        SpannableStringBuilder spannableStringBuilder = this.vip;
        if (i != -1) {
            if (!z) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.loadAd, spannableStringBuilder.length(), 33);
                this.loadAd = -1;
            }
        } else if (z) {
            this.loadAd = spannableStringBuilder.length();
        }
        if (this.Signature == -1) {
            if (z2) {
                this.Signature = spannableStringBuilder.length();
            }
        } else {
            if (z2) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.Signature, spannableStringBuilder.length(), 33);
            this.Signature = -1;
        }
    }

    public final void license() {
        this.ad.clear();
        this.vip.clear();
        this.loadAd = -1;
        this.Signature = -1;
        this.admob = -1;
        this.remoteconfig = -1;
        this.signatures = 0;
        this.metrica = false;
        this.license = false;
        this.appmetrica = 4;
        this.purchase = false;
        this.billing = 0;
        this.yandex = 0;
        this.startapp = 0;
        this.adcel = 15;
        this.mopub = 0;
        this.advert = 0;
        this.smaato = 0;
        int i = isVip;
        this.amazon = i;
        this.subscription = tapsense;
        this.pro = i;
    }

    public final void purchase(int i, int i2) {
        int i3 = this.admob;
        SpannableStringBuilder spannableStringBuilder = this.vip;
        if (i3 != -1 && this.subscription != i) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.subscription), this.admob, spannableStringBuilder.length(), 33);
        }
        if (i != tapsense) {
            this.admob = spannableStringBuilder.length();
            this.subscription = i;
        }
        if (this.remoteconfig != -1 && this.pro != i2) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.pro), this.remoteconfig, spannableStringBuilder.length(), 33);
        }
        if (i2 != isVip) {
            this.remoteconfig = spannableStringBuilder.length();
            this.pro = i2;
        }
    }

    public final SpannableString vip() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.vip);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.loadAd != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.loadAd, length, 33);
            }
            if (this.Signature != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.Signature, length, 33);
            }
            if (this.admob != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.subscription), this.admob, length, 33);
            }
            if (this.remoteconfig != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.pro), this.remoteconfig, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }
}
