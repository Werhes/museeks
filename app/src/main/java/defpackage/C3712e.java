package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۣؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3712e {
    public final /* synthetic */ int ad;
    public int appmetrica;
    public int license;
    public char[] metrica;
    public int vip;

    public final int ad() {
        int i;
        int i2;
        switch (this.ad) {
            case 0:
                i = this.appmetrica;
                i2 = this.license;
                break;
            default:
                i = this.appmetrica;
                i2 = this.license;
                break;
        }
        return i - i2;
    }

    public final String toString() {
        switch (this.ad) {
            case 0:
                return BuildConfig.FLAVOR;
            default:
                return BuildConfig.FLAVOR;
        }
    }
}
