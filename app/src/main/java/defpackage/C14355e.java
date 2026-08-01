package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٓۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14355e extends C0521e {
    public final long amazon;
    public EnumC7461e loadAd = EnumC7461e.UNKNOWN;
    public EnumC5331e Signature = EnumC5331e.f11433e;
    public String admob = BuildConfig.FLAVOR;

    public C14355e(long j) {
        this.amazon = j;
    }

    @Override // defpackage.C0521e
    public final C12894e ad() {
        C12894e ad = super.ad();
        ad.vip(this.amazon, "fileSize");
        ad.metrica(this.loadAd, "kind");
        ad.metrica(this.Signature, "profile");
        ad.metrica(this.admob, "brand");
        return ad;
    }
}
