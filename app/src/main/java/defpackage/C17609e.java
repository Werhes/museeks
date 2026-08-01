package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17609e {
    public final InterfaceC18147e ad;
    public int appmetrica;
    public long billing;
    public boolean license;
    public boolean metrica;
    public int purchase;
    public boolean vip;
    public long yandex;

    public C17609e(InterfaceC18147e interfaceC18147e) {
        this.ad = interfaceC18147e;
    }

    public final void ad(int i, int i2, byte[] bArr) {
        if (this.metrica) {
            int i3 = this.purchase;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.purchase = (i2 - i) + i3;
            } else {
                this.license = ((bArr[i4] & 192) >> 6) == 0;
                this.metrica = false;
            }
        }
    }

    public final void vip(int i, long j, boolean z) {
        AbstractC2301e.subscription(this.yandex != -9223372036854775807L);
        if (this.appmetrica == 182 && z && this.vip) {
            this.ad.ad(this.yandex, this.license ? 1 : 0, (int) (j - this.billing), i, null);
        }
        if (this.appmetrica != 179) {
            this.billing = j;
        }
    }
}
