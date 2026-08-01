package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16711e implements InterfaceC16180e {
    public final C2892e ad;
    public final C10684e vip = new C10684e();
    public final C0576e metrica = AbstractC14533e.startapp(null);

    public C16711e(C2892e c2892e) {
        this.ad = c2892e;
    }

    @Override // defpackage.InterfaceC16180e
    public final Object ad(InterfaceC1403e interfaceC1403e, AbstractC7185e abstractC7185e) {
        C17212e c17212e = new C17212e(this, new C8990e(interfaceC1403e), null, 2);
        C10684e c10684e = this.vip;
        c10684e.getClass();
        Object appmetrica = AbstractC9743e.appmetrica(new C6365e(EnumC6955e.f14256e, c10684e, c17212e, null), abstractC7185e);
        return appmetrica == EnumC2821e.f6782e ? appmetrica : Unit.INSTANCE;
    }

    public final void vip(final Function0 function0, C13770e c13770e, final int i) {
        final Function0 function02;
        C13770e c13770e2;
        c13770e.m3671package(723898654);
        int i2 = (c13770e.purchase(this) ? 32 : 16) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            C8990e c8990e = (C8990e) this.metrica.getValue();
            if (c8990e == null) {
                C2846e subscription = c13770e.subscription();
                if (subscription != null) {
                    final int i3 = 0;
                    subscription.license = new Function2(this, function0, i, i3) { // from class: eٍٝؐ

                        /* renamed from: eًؔؐ, reason: contains not printable characters */
                        public final /* synthetic */ Function0 f19045e;

                        /* renamed from: eؘٙؓ, reason: contains not printable characters */
                        public final /* synthetic */ C16711e f19046e;

                        /* renamed from: eّٖۦ, reason: contains not printable characters */
                        public final /* synthetic */ int f19047e;

                        {
                            this.f19047e = i3;
                            this.f19046e = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.f19047e;
                            C13770e c13770e3 = (C13770e) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    this.f19046e.vip(this.f19045e, c13770e3, AbstractC5190e.advert(7));
                                    return Unit.INSTANCE;
                                default:
                                    this.f19046e.vip(this.f19045e, c13770e3, AbstractC5190e.advert(7));
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            function02 = function0;
            c13770e2 = c13770e;
            this.ad.invoke(c8990e, c8990e.ad, function02, c13770e2, 384);
        } else {
            function02 = function0;
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription2 = c13770e2.subscription();
        if (subscription2 != null) {
            final int i4 = 1;
            subscription2.license = new Function2(this, function02, i, i4) { // from class: eٍٝؐ

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ Function0 f19045e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ C16711e f19046e;

                /* renamed from: eّٖۦ, reason: contains not printable characters */
                public final /* synthetic */ int f19047e;

                {
                    this.f19047e = i4;
                    this.f19046e = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.f19047e;
                    C13770e c13770e3 = (C13770e) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            this.f19046e.vip(this.f19045e, c13770e3, AbstractC5190e.advert(7));
                            return Unit.INSTANCE;
                        default:
                            this.f19046e.vip(this.f19045e, c13770e3, AbstractC5190e.advert(7));
                            return Unit.INSTANCE;
                    }
                }
            };
        }
    }
}
