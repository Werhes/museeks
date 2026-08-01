package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؒؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0756e extends AbstractC16049e {
    public static final C0756e ad = new Object();

    @Override // defpackage.AbstractC16049e
    public final C4721e admob() {
        return new C4721e(BuildConfig.FLAVOR, BuildConfig.FLAVOR, null);
    }

    @Override // defpackage.AbstractC16049e
    /* renamed from: advert */
    public final String getMetrica() {
        return BuildConfig.FLAVOR;
    }

    @Override // defpackage.AbstractC16049e
    public final int amazon() {
        return 0;
    }

    @Override // defpackage.AbstractC16049e
    /* renamed from: loadAd */
    public final String getAd() {
        return BuildConfig.FLAVOR;
    }

    @Override // defpackage.AbstractC16049e
    public final String mopub() {
        return null;
    }

    @Override // defpackage.AbstractC16049e
    public final String remoteconfig() {
        return "noop";
    }

    @Override // defpackage.AbstractC16049e
    public final /* bridge */ /* synthetic */ String smaato() {
        return null;
    }

    @Override // defpackage.AbstractC16049e
    /* renamed from: subscription */
    public final String getVip() {
        return BuildConfig.FLAVOR;
    }
}
