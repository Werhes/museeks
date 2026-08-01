package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؕٔٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3365e {
    public static final C10462e Companion = new Object();
    public final String ad;
    public final String license;
    public final int metrica;
    public final String vip;

    public /* synthetic */ C3365e(int i, int i2, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            AbstractC5756e.billing(i, 7, C3158e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = str2;
        this.metrica = i2;
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = str3;
        }
    }
}
