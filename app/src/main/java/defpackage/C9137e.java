package defpackage;

import androidx.car.app.model.Alert;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۧٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9137e implements InterfaceC10481e {
    public static final C11883e adcel = new C11883e(new C1870e(28), new C7983e(4), 15);
    public final C16330e ad;
    public float purchase;
    public final C6656e startapp;
    public final C6656e yandex;
    public final C16330e vip = new C16330e(0);
    public final C16330e metrica = new C16330e(0);
    public final C15274e license = new C15274e();
    public final C16330e appmetrica = new C16330e(Alert.DURATION_SHOW_INDEFINITELY);
    public final C18237e billing = new C18237e(new C13749e(17, this));

    public C9137e(int i) {
        this.ad = new C16330e(i);
        final int i2 = 0;
        this.yandex = AbstractC14533e.purchase(new Function0(this) { // from class: eّۢۦ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C9137e f25653e;

            {
                this.f25653e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        C9137e c9137e = this.f25653e;
                        return Boolean.valueOf(c9137e.ad.purchase() < c9137e.appmetrica.purchase());
                    default:
                        return Boolean.valueOf(this.f25653e.ad.purchase() > 0);
                }
            }
        });
        final int i3 = 1;
        this.startapp = AbstractC14533e.purchase(new Function0(this) { // from class: eّۢۦ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C9137e f25653e;

            {
                this.f25653e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        C9137e c9137e = this.f25653e;
                        return Boolean.valueOf(c9137e.ad.purchase() < c9137e.appmetrica.purchase());
                    default:
                        return Boolean.valueOf(this.f25653e.ad.purchase() > 0);
                }
            }
        });
    }

    @Override // defpackage.InterfaceC10481e
    public final boolean ad() {
        return this.billing.ad();
    }

    @Override // defpackage.InterfaceC10481e
    public final float appmetrica(float f) {
        return this.billing.appmetrica(f);
    }

    @Override // defpackage.InterfaceC10481e
    public final boolean license() {
        return ((Boolean) this.yandex.getValue()).booleanValue();
    }

    @Override // defpackage.InterfaceC10481e
    public final boolean metrica() {
        return ((Boolean) this.startapp.getValue()).booleanValue();
    }

    public final void purchase(int i) {
        C16330e c16330e = this.ad;
        this.appmetrica.startapp(i);
        AbstractC13717e adcel2 = AbstractC12640e.adcel();
        Function1 appmetrica = adcel2 != null ? adcel2.appmetrica() : null;
        AbstractC13717e smaato = AbstractC12640e.smaato(adcel2);
        try {
            if (c16330e.purchase() > i) {
                c16330e.startapp(i);
            }
            Unit unit = Unit.INSTANCE;
            AbstractC12640e.Signature(adcel2, smaato, appmetrica);
        } catch (Throwable th) {
            AbstractC12640e.Signature(adcel2, smaato, appmetrica);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC10481e
    public final Object vip(EnumC6955e enumC6955e, Function2 function2, InterfaceC5083e interfaceC5083e) {
        Object vip = this.billing.vip(enumC6955e, function2, interfaceC5083e);
        return vip == EnumC2821e.f6782e ? vip : Unit.INSTANCE;
    }
}
