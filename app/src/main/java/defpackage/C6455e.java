package defpackage;

import android.util.Log;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6455e {
    public final C12383e ad;
    public final C5363e adcel;
    public final InterfaceC16964e appmetrica;
    public final int billing;
    public final InterfaceC16964e license;
    public final InterfaceC7865e metrica;
    public final InterfaceC16964e purchase;
    public final C5363e startapp;
    public final C8591e vip;
    public final C2673e yandex;

    public C6455e(C12383e c12383e, C8591e c8591e, InterfaceC7865e interfaceC7865e, InterfaceC16964e interfaceC16964e, InterfaceC16964e interfaceC16964e2, InterfaceC16964e interfaceC16964e3) {
        this.ad = c12383e;
        this.vip = c8591e;
        this.metrica = interfaceC7865e;
        this.license = interfaceC16964e;
        this.appmetrica = interfaceC16964e2;
        this.purchase = interfaceC16964e3;
        C11498e c11498e = AbstractC13788e.ad;
        c11498e.getClass();
        this.billing = C11498e.vip.incrementAndGet(c11498e);
        this.yandex = AbstractC14430e.metrica(false);
        if (AbstractC9464e.smaato("CXCP")) {
            Log.d("CXCP", "Configured " + this);
        }
        final int i = 0;
        this.startapp = new C5363e(new Function0(this) { // from class: eْؓۦ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C6455e f4851e;

            {
                this.f4851e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (C11728e) this.f4851e.license.get();
                    case 1:
                        return (C8020e) this.f4851e.appmetrica.get();
                    default:
                        return (InterfaceC1373e) this.f4851e.purchase.get();
                }
            }
        });
        final int i2 = 1;
        this.adcel = new C5363e(new Function0(this) { // from class: eْؓۦ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C6455e f4851e;

            {
                this.f4851e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (C11728e) this.f4851e.license.get();
                    case 1:
                        return (C8020e) this.f4851e.appmetrica.get();
                    default:
                        return (InterfaceC1373e) this.f4851e.purchase.get();
                }
            }
        });
        final int i3 = 2;
        new C5363e(new Function0(this) { // from class: eْؓۦ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C6455e f4851e;

            {
                this.f4851e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (C11728e) this.f4851e.license.get();
                    case 1:
                        return (C8020e) this.f4851e.appmetrica.get();
                    default:
                        return (InterfaceC1373e) this.f4851e.purchase.get();
                }
            }
        });
    }

    public final String toString() {
        return "UseCaseCamera-" + this.billing;
    }
}
