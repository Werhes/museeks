package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؖۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4395e {
    public final long ad;
    public final int appmetrica;
    public final int license;
    public final int metrica;
    public final C12476e purchase;
    public final int vip;

    public C4395e(long j, int i, int i2, int i3, int i4, C12476e c12476e) {
        this.ad = j;
        this.vip = i;
        this.metrica = i2;
        this.license = i3;
        this.appmetrica = i4;
        this.purchase = c12476e;
    }

    public final C14980e ad(int i) {
        return new C14980e(AbstractC8677e.license(this.purchase, i), this.ad, i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=");
        sb.append(this.ad);
        sb.append(", range=(");
        int i = this.metrica;
        sb.append(i);
        sb.append('-');
        C12476e c12476e = this.purchase;
        sb.append(AbstractC0054e.m227while(AbstractC8677e.license(c12476e, i)));
        sb.append(',');
        int i2 = this.license;
        sb.append(i2);
        sb.append('-');
        sb.append(AbstractC0054e.m227while(AbstractC8677e.license(c12476e, i2)));
        sb.append("), prevOffset=");
        return AbstractC1786e.pro(sb, this.appmetrica, ')');
    }

    public final int vip() {
        int i = this.metrica;
        int i2 = this.license;
        if (i < i2) {
            return 2;
        }
        return i > i2 ? 1 : 3;
    }
}
