package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10227e implements InterfaceC9659e {
    public final /* synthetic */ Function0 ad;
    public final /* synthetic */ C15274e appmetrica;
    public final /* synthetic */ InterfaceC18435e license;
    public final /* synthetic */ InterfaceC3314e metrica;
    public final /* synthetic */ InterfaceC3314e vip;

    public C10227e(Function0 function0, InterfaceC3314e interfaceC3314e, InterfaceC3314e interfaceC3314e2, InterfaceC18435e interfaceC18435e, C15274e c15274e) {
        this.ad = function0;
        this.vip = interfaceC3314e;
        this.metrica = interfaceC3314e2;
        this.license = interfaceC18435e;
        this.appmetrica = c15274e;
    }

    @Override // defpackage.InterfaceC9659e
    public final void ad() {
        InterfaceC3314e interfaceC3314e = this.vip;
        if (((Boolean) interfaceC3314e.getValue()).booleanValue()) {
            C3877e c3877e = (C3877e) this.metrica.getValue();
            if (c3877e != null) {
                AbstractC5336e.purchase(this.license, null, 0, new C15189e(this.appmetrica, c3877e, null, 0), 3);
            }
            if (((Boolean) interfaceC3314e.getValue()).booleanValue()) {
                this.ad.invoke();
            }
            interfaceC3314e.setValue(Boolean.FALSE);
        }
    }
}
