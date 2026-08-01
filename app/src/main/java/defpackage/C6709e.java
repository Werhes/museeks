package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6709e extends AbstractC13616e implements InterfaceC17303e {

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public float f13859e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public AbstractC17016e f13860e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public float f13861e;

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.appmetrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.billing(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        long j2;
        long ad;
        final AbstractC17016e abstractC17016e = this.f13860e;
        final float f = this.f13861e;
        float f2 = this.f13859e;
        boolean z = abstractC17016e instanceof C4782e;
        if (z) {
            j2 = j;
            ad = C5602e.ad(0, 0, 0, 0, 11, j2);
        } else {
            j2 = j;
            ad = C5602e.ad(0, 0, 0, 0, 14, j2);
        }
        final AbstractC2832e admob = interfaceC16719e.admob(ad);
        int mo393try = admob.mo393try(abstractC17016e);
        if (mo393try == Integer.MIN_VALUE) {
            mo393try = 0;
        }
        int i = z ? admob.f6804e : admob.f6806e;
        int billing = (z ? C5602e.billing(j2) : C5602e.yandex(j2)) - i;
        final int metrica = AbstractC3062e.metrica((!Float.isNaN(f) ? interfaceC13158e.mo493e(f) : 0) - mo393try, 0, billing);
        final int metrica2 = AbstractC3062e.metrica(((!Float.isNaN(f2) ? interfaceC13158e.mo493e(f2) : 0) - i) + mo393try, 0, billing - metrica);
        final int max = z ? admob.f6806e : Math.max(admob.f6806e + metrica + metrica2, C5602e.adcel(j2));
        final int max2 = z ? Math.max(admob.f6804e + metrica + metrica2, C5602e.startapp(j2)) : admob.f6804e;
        return interfaceC13158e.ads(max, max2, C9139e.f18290e, new Function1() { // from class: eۙۡ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AbstractC3698e abstractC3698e = (AbstractC3698e) obj;
                boolean z2 = AbstractC17016e.this instanceof C4782e;
                float f3 = f;
                int i2 = metrica;
                int i3 = metrica2;
                AbstractC2832e abstractC2832e = admob;
                int i4 = z2 ? 0 : !C15765e.vip(f3, Float.NaN) ? i2 : (max - i3) - abstractC2832e.f6806e;
                if (!z2) {
                    i2 = 0;
                } else if (C15765e.vip(f3, Float.NaN)) {
                    i2 = (max2 - i3) - abstractC2832e.f6804e;
                }
                AbstractC3698e.advert(abstractC3698e, abstractC2832e, i4, i2);
                return Unit.INSTANCE;
            }
        });
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.metrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.startapp(this, abstractC9292e, interfaceC16719e, i);
    }
}
