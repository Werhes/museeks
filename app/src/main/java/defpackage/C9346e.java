package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9346e implements InterfaceC2747e {
    public final /* synthetic */ int ad;
    public final Object vip;

    public /* synthetic */ C9346e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    @Override // defpackage.InterfaceC2747e
    public final int ad(InterfaceC0732e interfaceC0732e, List list, int i) {
        switch (this.ad) {
            case 0:
                return AbstractC5087e.smaato(this, interfaceC0732e, list, i);
            case 1:
                return AbstractC5087e.smaato(this, interfaceC0732e, list, i);
            default:
                return AbstractC5087e.smaato(this, interfaceC0732e, list, i);
        }
    }

    @Override // defpackage.InterfaceC2747e
    public final int appmetrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        switch (this.ad) {
            case 0:
                return AbstractC5087e.loadAd(this, interfaceC0732e, list, i);
            case 1:
                return AbstractC5087e.loadAd(this, interfaceC0732e, list, i);
            default:
                return AbstractC5087e.loadAd(this, interfaceC0732e, list, i);
        }
    }

    @Override // defpackage.InterfaceC2747e
    public final int license(InterfaceC0732e interfaceC0732e, List list, int i) {
        switch (this.ad) {
            case 0:
                return AbstractC5087e.mopub(this, interfaceC0732e, list, i);
            case 1:
                return AbstractC5087e.mopub(this, interfaceC0732e, list, i);
            default:
                return AbstractC5087e.mopub(this, interfaceC0732e, list, i);
        }
    }

    @Override // defpackage.InterfaceC2747e
    public final int metrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        switch (this.ad) {
            case 0:
                return AbstractC5087e.admob(this, interfaceC0732e, list, i);
            case 1:
                return AbstractC5087e.admob(this, interfaceC0732e, list, i);
            default:
                return AbstractC5087e.admob(this, interfaceC0732e, list, i);
        }
    }

    @Override // defpackage.InterfaceC2747e
    public final InterfaceC17242e vip(final InterfaceC13158e interfaceC13158e, List list, long j) {
        final AbstractC2832e abstractC2832e;
        switch (this.ad) {
            case 0:
                return interfaceC13158e.ads(C5602e.yandex(j), C5602e.billing(j), C9139e.f18290e, new C10869e(list, this, 2));
            case 1:
                AbstractC2832e admob = ((InterfaceC16719e) AbstractC13480e.m3591interface(list)).admob(j);
                int i = admob.f6806e;
                int i2 = admob.f6804e;
                C12339e c12339e = (C12339e) this.vip;
                c12339e.startapp.startapp(0.0f);
                c12339e.billing.startapp(i);
                return interfaceC13158e.ads(i, i2, C9139e.f18290e, new C4889e(admob, 10));
            default:
                final AbstractC2832e abstractC2832e2 = null;
                if (((Function2) this.vip) != null) {
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        InterfaceC16719e interfaceC16719e = (InterfaceC16719e) list.get(i3);
                        if (AbstractC7890e.billing(AbstractC11203e.metrica(interfaceC16719e), "text")) {
                            abstractC2832e = interfaceC16719e.admob(C5602e.ad(0, 0, 0, 0, 11, j));
                        }
                    }
                    AbstractC17404e.vip("Collection contains no element matching the predicate.");
                    throw new C14803e(9);
                }
                abstractC2832e = null;
                final int max = Math.max(abstractC2832e != null ? abstractC2832e.f6806e : 0, 0);
                final int max2 = Math.max(interfaceC13158e.mo493e(AbstractC12843e.ad), interfaceC13158e.mo491const(AbstractC12843e.appmetrica) + 0 + (abstractC2832e != null ? abstractC2832e.f6804e : 0));
                final Integer valueOf = abstractC2832e != null ? Integer.valueOf(abstractC2832e.mo393try(AbstractC14806e.ad)) : null;
                final Integer valueOf2 = abstractC2832e != null ? Integer.valueOf(abstractC2832e.mo393try(AbstractC14806e.vip)) : null;
                return interfaceC13158e.ads(max, max2, C9139e.f18290e, new Function1() { // from class: eَِۚ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        AbstractC3698e abstractC3698e = (AbstractC3698e) obj;
                        AbstractC2832e abstractC2832e3 = AbstractC2832e.this;
                        AbstractC2832e abstractC2832e4 = abstractC2832e2;
                        int i4 = max2;
                        if (abstractC2832e3 != null && abstractC2832e4 != null) {
                            int intValue = valueOf.intValue();
                            int intValue2 = valueOf2.intValue();
                            float f = intValue == intValue2 ? AbstractC12843e.metrica : AbstractC12843e.license;
                            InterfaceC13158e interfaceC13158e2 = interfaceC13158e;
                            int mo493e = interfaceC13158e2.mo493e(AbstractC11550e.ad) + interfaceC13158e2.mo493e(f);
                            int mo491const = (interfaceC13158e2.mo491const(AbstractC12843e.appmetrica) + abstractC2832e4.f6804e) - intValue;
                            int i5 = abstractC2832e3.f6806e;
                            int i6 = max;
                            int i7 = (i4 - intValue2) - mo493e;
                            AbstractC3698e.advert(abstractC3698e, abstractC2832e3, (i6 - i5) / 2, i7);
                            AbstractC3698e.advert(abstractC3698e, abstractC2832e4, (i6 - abstractC2832e4.f6806e) / 2, i7 - mo491const);
                        } else if (abstractC2832e3 != null) {
                            float f2 = AbstractC12843e.ad;
                            AbstractC3698e.advert(abstractC3698e, abstractC2832e3, 0, (i4 - abstractC2832e3.f6804e) / 2);
                        } else if (abstractC2832e4 != null) {
                            float f3 = AbstractC12843e.ad;
                            AbstractC3698e.advert(abstractC3698e, abstractC2832e4, 0, (i4 - abstractC2832e4.f6804e) / 2);
                        }
                        return Unit.INSTANCE;
                    }
                });
        }
    }
}
