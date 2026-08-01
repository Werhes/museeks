package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11547e {
    public final C7869e ad;
    public final C6553e appmetrica;
    public final InterfaceC4871e license;
    public final C12007e metrica;
    public final String vip;

    public C11547e(C7869e c7869e, String str, C12007e c12007e, InterfaceC4871e interfaceC4871e, C6553e c6553e) {
        this.ad = c7869e;
        this.vip = str;
        this.metrica = c12007e;
        this.license = interfaceC4871e;
        this.appmetrica = c6553e;
    }

    public final void ad(C7101e c7101e, InterfaceC7424e interfaceC7424e) {
        InterfaceC4871e interfaceC4871e = this.license;
        if (interfaceC4871e == null) {
            throw new NullPointerException("Null transformer");
        }
        C6553e c6553e = this.appmetrica;
        InterfaceC6963e interfaceC6963e = c6553e.metrica;
        C7869e vip = this.ad.vip(c7101e.metrica);
        C14742e c14742e = new C14742e(1);
        c14742e.billing = new HashMap();
        c14742e.appmetrica = Long.valueOf(c6553e.ad.vip());
        c14742e.purchase = Long.valueOf(c6553e.vip.vip());
        c14742e.vip = this.vip;
        c14742e.license = new C0974e(this.metrica, (byte[]) interfaceC4871e.apply(c7101e.vip));
        c14742e.metrica = c7101e.ad;
        C8406e c8406e = c7101e.license;
        if (c8406e != null) {
            c14742e.yandex = c8406e.ad;
        }
        C12878e c12878e = (C12878e) interfaceC6963e;
        c12878e.vip.execute(new RunnableC6795e(c12878e, vip, interfaceC7424e, c14742e.metrica(), 3));
    }
}
