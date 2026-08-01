package defpackage;

import androidx.car.app.model.Alert;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٜۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5875e {
    public static final /* synthetic */ int amazon = 0;
    public final boolean ad;
    public final boolean adcel;
    public final boolean advert;
    public final boolean appmetrica;
    public final boolean billing;
    public final int license;
    public final int metrica;
    public final boolean mopub;
    public final boolean purchase;
    public String smaato;
    public final int startapp;
    public final boolean vip;
    public final int yandex;

    static {
        C17647e c17647e = C14157e.f27993e;
        EnumC15934e enumC15934e = EnumC15934e.SECONDS;
        long yandex = C14157e.yandex(AbstractC0326e.Signature(Alert.DURATION_SHOW_INDEFINITELY, enumC15934e), enumC15934e);
        if (yandex < 0) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(yandex, "maxStale < 0: ").toString());
        }
    }

    public C5875e(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.ad = z;
        this.vip = z2;
        this.metrica = i;
        this.license = i2;
        this.appmetrica = z3;
        this.purchase = z4;
        this.billing = z5;
        this.yandex = i3;
        this.startapp = i4;
        this.adcel = z6;
        this.mopub = z7;
        this.advert = z8;
        this.smaato = str;
    }

    public final String toString() {
        String str = this.smaato;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.ad) {
            sb.append("no-cache, ");
        }
        if (this.vip) {
            sb.append("no-store, ");
        }
        int i = this.metrica;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.license;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.appmetrica) {
            sb.append("private, ");
        }
        if (this.purchase) {
            sb.append("public, ");
        }
        if (this.billing) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.yandex;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.startapp;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.adcel) {
            sb.append("only-if-cached, ");
        }
        if (this.mopub) {
            sb.append("no-transform, ");
        }
        if (this.advert) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        this.smaato = sb2;
        return sb2;
    }
}
