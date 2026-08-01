package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: e٘ؖۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17561e {
    public static final C13068e Companion = new Object();
    public final long ad;
    public final String appmetrica;
    public final String license;
    public final String metrica;
    public final String vip;

    public /* synthetic */ C17561e(int i, long j, String str, String str2, String str3, String str4) {
        if (1 != (i & 1)) {
            AbstractC5756e.billing(i, 1, C11181e.ad.appmetrica());
            throw null;
        }
        this.ad = j;
        if ((i & 2) == 0) {
            this.vip = BuildConfig.FLAVOR;
        } else {
            this.vip = str;
        }
        if ((i & 4) == 0) {
            this.metrica = BuildConfig.FLAVOR;
        } else {
            this.metrica = str2;
        }
        if ((i & 8) == 0) {
            this.license = BuildConfig.FLAVOR;
        } else {
            this.license = str3;
        }
        if ((i & 16) == 0) {
            this.appmetrica = BuildConfig.FLAVOR;
        } else {
            this.appmetrica = str4;
        }
    }

    public C17561e(long j, String str, String str2) {
        this.ad = j;
        this.vip = BuildConfig.FLAVOR;
        this.metrica = BuildConfig.FLAVOR;
        this.license = str;
        this.appmetrica = str2;
    }

    public final String ad() {
        String str = this.appmetrica;
        if (str.length() > 0) {
            return str;
        }
        return AbstractC4653e.isPro(this.vip, " ", this.metrica);
    }
}
