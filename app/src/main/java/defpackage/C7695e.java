package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؔ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7695e {
    public static final C7695e startapp;
    public final boolean ad;
    public final boolean appmetrica;
    public final boolean billing;
    public final boolean license;
    public final boolean metrica;
    public final boolean purchase;
    public final boolean vip;
    public final boolean yandex;

    static {
        boolean z = false;
        startapp = new C7695e(255, z, z);
    }

    public /* synthetic */ C7695e(int i, boolean z, boolean z2) {
        this((i & 1) == 0, (i & 2) == 0, (i & 4) == 0, (i & 8) == 0, (i & 16) != 0 ? false : z, (i & 32) == 0, (i & 64) != 0 ? false : z2, false);
    }

    public C7695e(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.ad = z;
        this.vip = z2;
        this.metrica = z3;
        this.license = z4;
        this.appmetrica = z5;
        this.purchase = z6;
        this.billing = z7;
        this.yandex = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7695e.class != obj.getClass()) {
            return false;
        }
        C7695e c7695e = (C7695e) obj;
        return this.ad == c7695e.ad && this.vip == c7695e.vip && this.metrica == c7695e.metrica && this.license == c7695e.license && this.appmetrica == c7695e.appmetrica && this.purchase == c7695e.purchase && this.billing == c7695e.billing && this.yandex == c7695e.yandex;
    }

    public final int hashCode() {
        return ((((((((((((((this.ad ? 1231 : 1237) * 31) + (this.vip ? 1231 : 1237)) * 31) + (this.metrica ? 1231 : 1237)) * 31) + (this.license ? 1231 : 1237)) * 31) + (this.appmetrica ? 1231 : 1237)) * 31) + (this.purchase ? 1231 : 1237)) * 31) + (this.billing ? 1231 : 1237)) * 31) + (this.yandex ? 1231 : 1237);
    }
}
