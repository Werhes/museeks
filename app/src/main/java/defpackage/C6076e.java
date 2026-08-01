package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۧ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6076e implements InterfaceC2784e {
    public final /* synthetic */ C14402e ad;
    public final /* synthetic */ C6884e appmetrica;
    public final /* synthetic */ InterfaceC12438e license;
    public final /* synthetic */ String metrica;
    public final /* synthetic */ C6884e purchase;
    public final /* synthetic */ String vip;

    public /* synthetic */ C6076e(C14402e c14402e, String str, String str2, InterfaceC12438e interfaceC12438e, C6884e c6884e, C6884e c6884e2) {
        this.ad = c14402e;
        this.vip = str;
        this.metrica = str2;
        this.license = interfaceC12438e;
        this.appmetrica = c6884e;
        this.purchase = c6884e2;
    }

    @Override // defpackage.InterfaceC2784e
    public final void ad(C11469e c11469e) {
        C14402e c14402e = this.ad;
        if (c14402e.license() == null) {
            return;
        }
        c14402e.m3797goto();
        c14402e.m4158class(c14402e.m3799this(this.vip, this.metrica, this.license, this.appmetrica, this.purchase));
        c14402e.admob();
        C8200e c8200e = c14402e.pro;
        c8200e.getClass();
        AbstractC13062e.metrica();
        Iterator it = c8200e.f16692e.iterator();
        while (it.hasNext()) {
            c8200e.metrica((AbstractC16510e) it.next());
        }
    }
}
