package defpackage;

import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٔۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1822e {
    public final Object ad;
    public final AbstractC7185e appmetrica;
    public Object billing;
    public final Object license;
    public final Function3 metrica;
    public final Function3 purchase;
    public final /* synthetic */ C16259e startapp;
    public final Function3 vip;
    public int yandex = -1;

    public C1822e(C16259e c16259e, Object obj, Function3 function3, Function3 function32, C2443e c2443e, AbstractC7185e abstractC7185e, Function3 function33) {
        this.startapp = c16259e;
        this.ad = obj;
        this.vip = function3;
        this.metrica = function32;
        this.license = c2443e;
        this.appmetrica = abstractC7185e;
        this.purchase = function33;
    }

    public final void ad() {
        Object obj = this.billing;
        if (obj instanceof AbstractC12466e) {
            ((AbstractC12466e) obj).yandex(this.yandex, this.startapp.f31939e);
            return;
        }
        InterfaceC1232e interfaceC1232e = obj instanceof InterfaceC1232e ? (InterfaceC1232e) obj : null;
        if (interfaceC1232e != null) {
            interfaceC1232e.ad();
        }
    }
}
