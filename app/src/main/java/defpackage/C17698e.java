package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ٘ٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17698e {
    public final C5633e ad;

    public C17698e(C5633e c5633e) {
        Charset charset = AbstractC12312e.ad;
        this.ad = c5633e;
        c5633e.metrica = this;
    }

    public final void ad(int i, Object obj, InterfaceC15433e interfaceC15433e) {
        C5633e c5633e = this.ad;
        c5633e.pro(i, 3);
        interfaceC15433e.startapp((AbstractC4291e) obj, c5633e.metrica);
        c5633e.pro(i, 4);
    }

    public final void vip(int i, Object obj, InterfaceC15433e interfaceC15433e) {
        AbstractC4291e abstractC4291e = (AbstractC4291e) obj;
        C5633e c5633e = this.ad;
        c5633e.tapsense((i << 3) | 2);
        c5633e.tapsense(abstractC4291e.vip(interfaceC15433e));
        interfaceC15433e.startapp(abstractC4291e, c5633e.metrica);
    }
}
