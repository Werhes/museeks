package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۧٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8368e extends AbstractC10727e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public float f17117e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f17118e = 1;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C2815e f17119e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final long f17120e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final long f17121e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C1362e f17122e;

    public C8368e(C1362e c1362e, long j) {
        int i;
        int i2;
        this.f17122e = c1362e;
        this.f17121e = j;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i = (int) (j >> 32)) < 0 || (i2 = (int) (4294967295L & j)) < 0 || i > c1362e.ad.getWidth() || i2 > c1362e.ad.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f17120e = j;
        this.f17117e = 1.0f;
    }

    @Override // defpackage.AbstractC10727e
    public final void adcel(InterfaceC2235e interfaceC2235e) {
        int round = Math.round(Float.intBitsToFloat((int) (interfaceC2235e.yandex() >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (interfaceC2235e.yandex() & 4294967295L)));
        AbstractC4653e.advert(interfaceC2235e, this.f17122e, this.f17121e, (round << 32) | (round2 & 4294967295L), this.f17117e, this.f17119e, this.f17118e, 328);
    }

    @Override // defpackage.AbstractC10727e
    public final boolean appmetrica(C2815e c2815e) {
        this.f17119e = c2815e;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8368e)) {
            return false;
        }
        C8368e c8368e = (C8368e) obj;
        return AbstractC7890e.billing(this.f17122e, c8368e.f17122e) && C11490e.vip(0L, 0L) && C12729e.vip(this.f17121e, c8368e.f17121e) && this.f17118e == c8368e.f17118e;
    }

    public final int hashCode() {
        int hashCode = (((int) 0) + (this.f17122e.hashCode() * 31)) * 31;
        long j = this.f17121e;
        return ((((int) (j ^ (j >>> 32))) + hashCode) * 31) + this.f17118e;
    }

    @Override // defpackage.AbstractC10727e
    public final boolean license(float f) {
        this.f17117e = f;
        return true;
    }

    @Override // defpackage.AbstractC10727e
    public final long startapp() {
        return AbstractC8116e.startapp(this.f17120e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f17122e);
        sb.append(", srcOffset=");
        sb.append((Object) C11490e.appmetrica(0L));
        sb.append(", srcSize=");
        sb.append((Object) C12729e.metrica(this.f17121e));
        sb.append(", filterQuality=");
        int i = this.f17118e;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
