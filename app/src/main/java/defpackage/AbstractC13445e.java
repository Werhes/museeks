package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13445e {
    public final C12816e ad;
    public final String vip;

    public AbstractC13445e(C12816e c12816e, String str) {
        this.ad = c12816e;
        this.vip = str;
    }

    public final C0520e ad(int i) {
        return C0520e.appmetrica(this.vip + i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.ad);
        sb.append('.');
        return AbstractC4653e.applovin(sb, this.vip, 'N');
    }
}
