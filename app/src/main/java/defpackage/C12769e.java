package defpackage;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّ۟ؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12769e {
    public final int ad;
    public Object adcel;
    public Uri appmetrica;
    public Bundle billing;
    public int license;
    public int metrica;
    public CharSequence purchase;
    public C15574e startapp;
    public C11858e vip;
    public boolean yandex;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12769e(int r2) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12769e.<init>(int):void");
    }

    public C12769e(int i, int i2) {
        this.ad = i;
        this.license = i2;
        this.purchase = BuildConfig.FLAVOR;
        this.billing = Bundle.EMPTY;
        this.metrica = -1;
        this.yandex = true;
    }

    public final C11161e ad() {
        int i;
        int i2 = 1;
        AbstractC2301e.admob("Exactly one of sessionCommand and playerCommand should be set", (this.vip == null) != (this.metrica == -1));
        if (this.startapp == null) {
            int i3 = this.metrica;
            String str = C11161e.mopub;
            if (i3 != 1 && (i = this.ad) != 57399 && i != 57396) {
                if (i3 != 11 && i3 != 7) {
                    i2 = 6;
                    if (i3 != 6 && i != 57413 && i != 57376 && i != 57410 && i != 57435 && i != 57433 && i != 1040473 && i != 57434) {
                        if (i3 == 12 || i3 == 9 || i3 == 8 || i == 57412 || i == 57375 || i == 63220 || i == 57432 || i == 57430 || i == 1040470 || i == 57431) {
                            i2 = 3;
                        }
                    }
                }
                i2 = 2;
            }
            this.startapp = new C15574e(new int[]{i2});
        }
        return new C11161e(this.vip, this.metrica, this.ad, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.adcel);
    }

    public final void appmetrica(C11858e c11858e, Object obj) {
        AbstractC2301e.yandex(this.metrica == -1, "playerCommands is already set. Only one of sessionCommand and playerCommand should be set.");
        this.vip = c11858e;
        int i = c11858e.ad;
        String str = C11161e.mopub;
        this.adcel = C11161e.ad(i == 40010 ? 5 : 0, obj);
    }

    public final void license(C11858e c11858e) {
        AbstractC2301e.amazon(c11858e, "sessionCommand should not be null.");
        AbstractC2301e.yandex(this.metrica == -1, "playerCommands is already set. Only one of sessionCommand and playerCommand should be set.");
        this.vip = c11858e;
        this.adcel = null;
    }

    public final void metrica(int i) {
        AbstractC2301e.yandex(this.vip == null, "sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.");
        this.metrica = i;
        this.adcel = null;
    }

    public final void vip(Uri uri) {
        AbstractC2301e.yandex(Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"), "Only content or resource Uris are supported for CommandButton");
        this.appmetrica = uri;
    }
}
