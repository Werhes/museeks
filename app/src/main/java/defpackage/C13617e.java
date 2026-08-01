package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۣۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13617e implements InterfaceC17242e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ C12429e appmetrica;
    public final /* synthetic */ Function1 billing;
    public final /* synthetic */ Function1 license;
    public final /* synthetic */ Map metrica;
    public final /* synthetic */ C10014e purchase;
    public final /* synthetic */ int vip;

    public C13617e(int i, int i2, Map map, Function1 function1, C12429e c12429e, C10014e c10014e, Function1 function12) {
        this.ad = i;
        this.vip = i2;
        this.metrica = map;
        this.license = function1;
        this.appmetrica = c12429e;
        this.purchase = c10014e;
        this.billing = function12;
    }

    @Override // defpackage.InterfaceC17242e
    public final Map ad() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC17242e
    public final int getWidth() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC17242e
    public final Function1 license() {
        return this.license;
    }

    @Override // defpackage.InterfaceC17242e
    public final void metrica() {
        C12009e c12009e;
        C13915e c13915e = this.purchase.f19781e;
        boolean mo398transient = this.appmetrica.mo398transient();
        Function1 function1 = this.billing;
        if (!mo398transient || (c12009e = ((C14747e) c13915e.f27592e.license).f29168e) == null) {
            function1.invoke(((C14747e) c13915e.f27592e.license).f18510e);
        } else {
            function1.invoke(c12009e.f18510e);
        }
    }

    @Override // defpackage.InterfaceC17242e
    public final int vip() {
        return this.vip;
    }
}
