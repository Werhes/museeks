package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٓۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13811e {
    public final byte[] ad = new byte[10];
    public int appmetrica;
    public int billing;
    public long license;
    public int metrica;
    public int purchase;
    public boolean vip;

    public final void ad(InterfaceC18147e interfaceC18147e, C17737e c17737e) {
        if (this.metrica > 0) {
            interfaceC18147e.ad(this.license, this.appmetrica, this.purchase, this.billing, c17737e);
            this.metrica = 0;
        }
    }

    public final void metrica(InterfaceC2283e interfaceC2283e) {
        if (this.vip) {
            return;
        }
        byte[] bArr = this.ad;
        interfaceC2283e.ad(0, 10, bArr);
        interfaceC2283e.smaato();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                r1 = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (r1 == 0) {
            return;
        }
        this.vip = true;
    }

    public final void vip(InterfaceC18147e interfaceC18147e, long j, int i, int i2, int i3, C17737e c17737e) {
        AbstractC2301e.admob("TrueHD chunk samples must be contiguous in the sample queue.", this.billing <= i2 + i3);
        if (this.vip) {
            int i4 = this.metrica;
            int i5 = i4 + 1;
            this.metrica = i5;
            if (i4 == 0) {
                this.license = j;
                this.appmetrica = i;
                this.purchase = 0;
            }
            this.purchase += i2;
            this.billing = i3;
            if (i5 >= 16) {
                ad(interfaceC18147e, c17737e);
            }
        }
    }
}
