package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۧٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15116e {
    public final String ad;
    public final long metrica;
    public final long vip;

    public C15116e(String str, long j, long j2) {
        this.ad = str;
        this.vip = j;
        this.metrica = j2;
    }

    public final String toString() {
        long j = this.vip;
        long j2 = this.metrica;
        return this.ad + ":StartLocation:" + AbstractC6069e.ad(j) + ":SizeIncHeader:" + j2 + "8:EndLocation:" + AbstractC6069e.ad(j + j2 + 8);
    }
}
