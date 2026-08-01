package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eُؚۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7080e {
    public static final C17133e Companion = new Object();
    public final String ad;
    public final long metrica;
    public final String vip;

    public /* synthetic */ C7080e(int i, long j, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC5756e.billing(i, 7, C18531e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = str2;
        this.metrica = j;
    }

    public C7080e(long j, String str, String str2) {
        this.ad = str;
        this.vip = str2;
        this.metrica = j;
    }

    public final C0041e ad() {
        if (AbstractC15962e.ad.purchase().f11747e < this.metrica) {
            return new C0041e(this.ad, this.vip);
        }
        return null;
    }
}
