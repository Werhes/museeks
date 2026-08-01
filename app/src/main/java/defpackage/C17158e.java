package defpackage;

import android.content.Context;
import android.provider.MediaStore;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٝۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17158e extends AbstractC9512e {

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public final C0576e f33648e = AbstractC14533e.startapp(AbstractC12273e.appmetrica.ad());

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public final C0576e f33649e = AbstractC14533e.startapp(Boolean.FALSE);

    @Override // defpackage.AbstractC9512e
    /* renamed from: else */
    public final Object mo2584else(String str) {
        if (C2691e.f6569e == null) {
            VKXApplication vKXApplication = VKXApplication.f36528e;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            C2691e.f6569e = new C2691e(13, vKXApplication.getApplicationContext().getContentResolver());
        }
        C2691e c2691e = C2691e.f6569e;
        return AbstractC17976e.appmetrica(c2691e != null ? c2691e : null, new C18478e(25, new AbstractC7919e(1, AbstractC12681e.vip(4) ? MediaStore.Audio.Artists.getContentUri("external") : MediaStore.Audio.Artists.EXTERNAL_CONTENT_URI, new String[]{"_id", "artist"}, new C3114e(1)), new AbstractC8918e("artist", ((Boolean) this.f33648e.getValue()).booleanValue()), new AbstractC3219e[]{new AbstractC3219e("artist != ''"), str.length() == 0 ? new C7223e() : new AbstractC3219e(AbstractC5087e.m1746extends("artist LIKE '%", str, "%'"))}));
    }

    @Override // defpackage.AbstractC9512e
    /* renamed from: import */
    public final void mo2585import(int i, int i2, C13770e c13770e) {
        Object c12763e;
        c13770e.m3671package(-2146215913);
        int i3 = (c13770e.license(i) ? 4 : 2) | i2 | (c13770e.yandex(this) ? 32 : 16);
        if (c13770e.m3673protected(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 14) == 4;
            Object m3681throw = c13770e.m3681throw();
            if (z || m3681throw == C2987e.ad) {
                Context context = this.f27451e;
                try {
                    c12763e = (context == null ? null : context.getResources()).getQuantityString(R.plurals.artists, i, Integer.valueOf(i));
                } catch (Throwable th) {
                    c12763e = new C12763e(th);
                }
                if (C13523e.ad(c12763e) != null) {
                    c12763e = String.valueOf(i);
                }
                m3681throw = (String) c12763e;
                c13770e.m3682throws(m3681throw);
            }
            AbstractC14489e.vip((String) m3681throw, null, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262138);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C13752e(this, i, i2, 5);
        }
    }

    @Override // defpackage.AbstractC9512e
    /* renamed from: instanceof */
    public final /* bridge */ /* synthetic */ void mo2586instanceof(InterfaceC15377e interfaceC15377e, C13770e c13770e) {
        m4272switch((C16607e) interfaceC15377e, c13770e, 0);
    }

    /* renamed from: switch, reason: not valid java name */
    public final void m4272switch(final C16607e c16607e, C13770e c13770e, int i) {
        c13770e.m3671package(1012494775);
        int i2 = (c13770e.purchase(c16607e) ? 4 : 2) | i | (c13770e.yandex(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean yandex = c13770e.yandex(this) | ((i2 & 14) == 4);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C1708e(this, c16607e, 10);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC12864e license = AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15);
            final int i3 = 0;
            final int i4 = 1;
            AbstractC16429e.ad(AbstractC16653e.license(-740568299, new Function2() { // from class: eٕؗۤ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i3) {
                        case 0:
                            C13770e c13770e2 = (C13770e) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                                AbstractC14489e.vip(c16607e.vip, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                            } else {
                                c13770e2.m3659default();
                            }
                            return Unit.INSTANCE;
                        default:
                            C13770e c13770e3 = (C13770e) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if (c13770e3.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                                C15492e c15492e = AbstractC11785e.ad;
                                AbstractC8461e.vip(c16607e.metrica, null, AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 48), AbstractC6549e.ad), new C6159e(((C7019e) c13770e3.adcel(c15492e)).ad.ads), new C6159e(((C7019e) c13770e3.adcel(c15492e)).ad.ads), C16477e.ad, c13770e3, 36912, 6, 31712);
                            } else {
                                c13770e3.m3659default();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, c13770e), license, null, null, AbstractC16653e.license(256545305, new Function2() { // from class: eٕؗۤ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i4) {
                        case 0:
                            C13770e c13770e2 = (C13770e) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                                AbstractC14489e.vip(c16607e.vip, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                            } else {
                                c13770e2.m3659default();
                            }
                            return Unit.INSTANCE;
                        default:
                            C13770e c13770e3 = (C13770e) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if (c13770e3.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                                C15492e c15492e = AbstractC11785e.ad;
                                AbstractC8461e.vip(c16607e.metrica, null, AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 48), AbstractC6549e.ad), new C6159e(((C7019e) c13770e3.adcel(c15492e)).ad.ads), new C6159e(((C7019e) c13770e3.adcel(c15492e)).ad.ads), C16477e.ad, c13770e3, 36912, 6, 31712);
                            } else {
                                c13770e3.m3659default();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, c13770e), null, null, 0.0f, 0.0f, c13770e, 24582, 492);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C17785e(this, c16607e, i, 29);
        }
    }

    @Override // defpackage.AbstractC9512e
    /* renamed from: transient */
    public final void mo2588transient(Function0 function0, C13770e c13770e, int i) {
        c13770e.m3671package(315421264);
        int i2 = i | (c13770e.yandex(function0) ? 4 : 2) | (c13770e.yandex(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
            long j = c13770e.f27286case;
            int i3 = (int) ((j >>> 32) ^ j);
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, C0115e.f1276e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (yandex || m3681throw == c5170e) {
                final int i4 = 0;
                m3681throw = new Function0(this) { // from class: eِٖ۟

                    /* renamed from: eؘٙؓ, reason: contains not printable characters */
                    public final /* synthetic */ C17158e f24036e;

                    {
                        this.f24036e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                this.f24036e.f33649e.setValue(Boolean.TRUE);
                                return Unit.INSTANCE;
                            default:
                                this.f24036e.f33649e.setValue(Boolean.FALSE);
                                return Unit.INSTANCE;
                        }
                    }
                };
                c13770e.m3682throws(m3681throw);
            }
            AbstractC0014e.metrica((Function0) m3681throw, null, false, null, null, null, AbstractC17331e.ad, c13770e, 1572864, 62);
            boolean booleanValue = ((Boolean) this.f33649e.getValue()).booleanValue();
            boolean yandex2 = c13770e.yandex(this);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex2 || m3681throw2 == c5170e) {
                final int i5 = 1;
                m3681throw2 = new Function0(this) { // from class: eِٖ۟

                    /* renamed from: eؘٙؓ, reason: contains not printable characters */
                    public final /* synthetic */ C17158e f24036e;

                    {
                        this.f24036e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                this.f24036e.f33649e.setValue(Boolean.TRUE);
                                return Unit.INSTANCE;
                            default:
                                this.f24036e.f33649e.setValue(Boolean.FALSE);
                                return Unit.INSTANCE;
                        }
                    }
                };
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC4709e.ad(booleanValue, (Function0) m3681throw2, null, 0L, null, null, null, 0L, 0.0f, 0.0f, AbstractC16653e.license(441805125, new C17630e(this, function0, 18), c13770e), c13770e, 0, 2044);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9130e(this, function0, i, 0);
        }
    }
}
