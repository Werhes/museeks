package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۘۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12703e {
    public C0110e[] ad = AbstractC14437e.ad;
    public int appmetrica = 1;
    public int billing;
    public int license;
    public int metrica;
    public int purchase;
    public C5602e vip;
    public final /* synthetic */ C2245e yandex;

    public C12703e(C2245e c2245e) {
        this.yandex = c2245e;
    }

    public static void vip(C12703e c12703e, InterfaceC8848e interfaceC8848e, InterfaceC18435e interfaceC18435e, InterfaceC2661e interfaceC2661e, int i, int i2) {
        c12703e.yandex.getClass();
        long smaato = interfaceC8848e.smaato(0);
        c12703e.ad(interfaceC8848e, interfaceC18435e, interfaceC2661e, i, i2, (int) (!interfaceC8848e.mopub() ? smaato & 4294967295L : smaato >> 32));
    }

    public final void ad(InterfaceC8848e interfaceC8848e, InterfaceC18435e interfaceC18435e, InterfaceC2661e interfaceC2661e, int i, int i2, int i3) {
        C0110e[] c0110eArr = this.ad;
        int length = c0110eArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                this.purchase = i;
                this.billing = i2;
                break;
            } else {
                C0110e c0110e = c0110eArr[i4];
                if (c0110e != null && c0110e.billing) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        int length2 = this.ad.length;
        for (int vip = interfaceC8848e.vip(); vip < length2; vip++) {
            C0110e c0110e2 = this.ad[vip];
            if (c0110e2 != null) {
                c0110e2.license();
            }
        }
        if (this.ad.length != interfaceC8848e.vip()) {
            this.ad = (C0110e[]) Arrays.copyOf(this.ad, interfaceC8848e.vip());
        }
        this.vip = new C5602e(interfaceC8848e.adcel());
        this.metrica = i3;
        this.license = interfaceC8848e.amazon();
        this.appmetrica = interfaceC8848e.yandex();
        int vip2 = interfaceC8848e.vip();
        for (int i5 = 0; i5 < vip2; i5++) {
            Object startapp = interfaceC8848e.startapp(i5);
            C13686e c13686e = startapp instanceof C13686e ? (C13686e) startapp : null;
            if (c13686e == null) {
                C0110e c0110e3 = this.ad[i5];
                if (c0110e3 != null) {
                    c0110e3.license();
                }
                this.ad[i5] = null;
            } else {
                C0110e c0110e4 = this.ad[i5];
                if (c0110e4 == null) {
                    c0110e4 = new C0110e(interfaceC18435e, interfaceC2661e, new C12851e(8, this.yandex));
                    this.ad[i5] = c0110e4;
                }
                c0110e4.license = c13686e.f27117e;
                c0110e4.appmetrica = c13686e.f27118e;
                c0110e4.purchase = c13686e.f27116e;
            }
        }
    }
}
