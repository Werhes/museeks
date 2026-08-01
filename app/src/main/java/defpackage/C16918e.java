package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَّٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16918e extends AbstractC9512e {

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public final C0576e f33141e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public final C0576e f33142e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public final /* synthetic */ int f33143e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public final C0576e f33144e;

    public C16918e(int i) {
        this.f33143e = i;
        switch (i) {
            case 1:
                this.f33144e = AbstractC14533e.startapp(AbstractC12273e.vip.ad());
                this.f33142e = AbstractC14533e.startapp(AbstractC12273e.ad.ad());
                this.f33141e = AbstractC14533e.startapp(Boolean.FALSE);
                return;
            default:
                this.f33144e = AbstractC14533e.startapp(AbstractC12273e.license.ad());
                this.f33142e = AbstractC14533e.startapp(AbstractC12273e.metrica.ad());
                this.f33141e = AbstractC14533e.startapp(Boolean.FALSE);
                return;
        }
    }

    /* renamed from: const, reason: not valid java name */
    public boolean m4224const() {
        return ((Boolean) this.f33144e.getValue()).booleanValue();
    }

    @Override // defpackage.AbstractC9512e
    /* renamed from: else */
    public final Object mo2584else(String str) {
        C2691e c2691e;
        AbstractC8918e c1336e;
        AbstractC8918e c1336e2;
        char c;
        AbstractC3219e abstractC3219e;
        int i = this.f33143e;
        int i2 = 25;
        C0576e c0576e = this.f33142e;
        int i3 = 13;
        switch (i) {
            case 0:
                if (C2691e.f6569e == null) {
                    VKXApplication vKXApplication = VKXApplication.f36528e;
                    if (vKXApplication == null) {
                        vKXApplication = null;
                    }
                    C2691e.f6569e = new C2691e(i3, vKXApplication.getApplicationContext().getContentResolver());
                }
                C2691e c2691e2 = C2691e.f6569e;
                c2691e = c2691e2 != null ? c2691e2 : null;
                C9125e c9125e = new C9125e(0);
                int ordinal = ((EnumC12987e) c0576e.getValue()).ordinal();
                if (ordinal == 0) {
                    c1336e = new C1336e(m4225finally(), 2);
                } else if (ordinal == 1) {
                    c1336e = new AbstractC8918e("artist", m4225finally());
                } else if (ordinal == 2) {
                    c1336e = new AbstractC8918e("numsongs", !m4225finally());
                } else {
                    if (ordinal != 3) {
                        throw new C14803e(10);
                    }
                    c1336e = new AbstractC8918e("album", m4225finally());
                }
                return AbstractC17976e.appmetrica(c2691e, new C18478e(i2, c9125e, c1336e, new AbstractC3219e[]{new AbstractC3219e("album != ''"), str.length() == 0 ? new C7223e() : new AbstractC3219e(AbstractC5087e.m1746extends("album LIKE '%", str, "%'"))}));
            default:
                if (C2691e.f6569e == null) {
                    VKXApplication vKXApplication2 = VKXApplication.f36528e;
                    if (vKXApplication2 == null) {
                        vKXApplication2 = null;
                    }
                    C2691e.f6569e = new C2691e(i3, vKXApplication2.getApplicationContext().getContentResolver());
                }
                C2691e c2691e3 = C2691e.f6569e;
                c2691e = c2691e3 != null ? c2691e3 : null;
                C9125e c9125e2 = new C9125e(2);
                int ordinal2 = ((EnumC3144e) c0576e.getValue()).ordinal();
                if (ordinal2 == 0) {
                    c1336e2 = new C1336e(m4224const(), 9);
                } else if (ordinal2 == 1) {
                    c1336e2 = new AbstractC8918e("artist", m4224const());
                } else if (ordinal2 == 2) {
                    c1336e2 = new AbstractC8918e("album", m4224const());
                } else if (ordinal2 == 3) {
                    c1336e2 = new AbstractC8918e("date_added", m4224const());
                } else {
                    if (ordinal2 != 4) {
                        throw new C14803e(10);
                    }
                    c1336e2 = new AbstractC8918e("year", m4224const());
                }
                C0144e c0144e = new C0144e();
                AbstractC3219e abstractC3219e2 = new AbstractC3219e("title != ''");
                AbstractC3219e abstractC3219e3 = new AbstractC3219e("duration > 15000");
                if (str.length() == 0) {
                    abstractC3219e = new C7223e();
                    c = 2;
                } else {
                    c = 2;
                    abstractC3219e = new AbstractC3219e(AbstractC5087e.m1746extends("title LIKE '%", str, "%'"));
                }
                AbstractC3219e[] abstractC3219eArr = new AbstractC3219e[4];
                abstractC3219eArr[0] = c0144e;
                abstractC3219eArr[1] = abstractC3219e2;
                abstractC3219eArr[c] = abstractC3219e3;
                abstractC3219eArr[3] = abstractC3219e;
                return AbstractC17976e.appmetrica(c2691e, new C18478e(i2, c9125e2, c1336e2, abstractC3219eArr));
        }
    }

    /* renamed from: finally, reason: not valid java name */
    public boolean m4225finally() {
        return ((Boolean) this.f33144e.getValue()).booleanValue();
    }

    @Override // defpackage.AbstractC9512e
    /* renamed from: import */
    public final void mo2585import(int i, int i2, C13770e c13770e) {
        Object c12763e;
        Object c12763e2;
        C13770e c13770e2 = c13770e;
        int i3 = this.f33143e;
        C5170e c5170e = C2987e.ad;
        switch (i3) {
            case 0:
                c13770e2.m3671package(512526969);
                int i4 = i2 | (c13770e2.license(i) ? 4 : 2) | (c13770e2.yandex(this) ? 32 : 16);
                if (c13770e2.m3673protected(i4 & 1, (i4 & 19) != 18)) {
                    boolean z = (i4 & 14) == 4;
                    Object m3681throw = c13770e2.m3681throw();
                    if (z || m3681throw == c5170e) {
                        Context context = this.f27451e;
                        try {
                            c12763e = (context != null ? context.getResources() : null).getQuantityString(R.plurals.albums, i, Integer.valueOf(i));
                        } catch (Throwable th) {
                            c12763e = new C12763e(th);
                        }
                        if (C13523e.ad(c12763e) != null) {
                            c12763e = String.valueOf(i);
                        }
                        m3681throw = (String) c12763e;
                        c13770e2.m3682throws(m3681throw);
                    }
                    AbstractC14489e.vip((String) m3681throw, null, ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262138);
                } else {
                    c13770e.m3659default();
                }
                C2846e subscription = c13770e.subscription();
                if (subscription != null) {
                    subscription.license = new C13752e(this, i, i2, 4);
                    return;
                }
                return;
            default:
                c13770e2.m3671package(710651585);
                int i5 = i2 | (c13770e2.license(i) ? 4 : 2) | (c13770e2.yandex(this) ? 32 : 16);
                if (c13770e2.m3673protected(i5 & 1, (i5 & 19) != 18)) {
                    boolean z2 = (i5 & 14) == 4;
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (z2 || m3681throw2 == c5170e) {
                        Context context2 = this.f27451e;
                        try {
                            c12763e2 = (context2 != null ? context2.getResources() : null).getQuantityString(R.plurals.tracks, i, Integer.valueOf(i));
                        } catch (Throwable th2) {
                            c12763e2 = new C12763e(th2);
                        }
                        if (C13523e.ad(c12763e2) != null) {
                            c12763e2 = String.valueOf(i);
                        }
                        m3681throw2 = (String) c12763e2;
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC14489e.vip((String) m3681throw2, null, ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262138);
                    c13770e2 = c13770e;
                } else {
                    c13770e2.m3659default();
                }
                C2846e subscription2 = c13770e2.subscription();
                if (subscription2 != null) {
                    subscription2.license = new C13752e(this, i, i2, 6);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.AbstractC9512e
    /* renamed from: instanceof */
    public final /* bridge */ /* synthetic */ void mo2586instanceof(InterfaceC15377e interfaceC15377e, C13770e c13770e) {
        switch (this.f33143e) {
            case 0:
                m4226switch((C14163e) interfaceC15377e, c13770e, 0);
                return;
            default:
                m4227throws((C12817e) interfaceC15377e, c13770e, 0);
                return;
        }
    }

    /* renamed from: switch, reason: not valid java name */
    public void m4226switch(final C14163e c14163e, C13770e c13770e, int i) {
        c13770e.m3671package(-177889106);
        int i2 = (c13770e.yandex(c14163e) ? 4 : 2) | i | (c13770e.yandex(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean yandex = c13770e.yandex(this) | c13770e.yandex(c14163e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C1708e(this, c14163e, 8);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC12864e license = AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15);
            final int i3 = 0;
            final int i4 = 1;
            final int i5 = 2;
            AbstractC16429e.ad(AbstractC16653e.license(-1930952180, new Function2() { // from class: eؚ۠ٙ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i3) {
                        case 0:
                            C13770e c13770e2 = (C13770e) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                                AbstractC14489e.vip(c14163e.vip, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                            } else {
                                c13770e2.m3659default();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            C13770e c13770e3 = (C13770e) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if (c13770e3.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                                AbstractC14489e.vip(c14163e.license, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                            } else {
                                c13770e3.m3659default();
                            }
                            return Unit.INSTANCE;
                        default:
                            C13770e c13770e4 = (C13770e) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            if (c13770e4.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                                C15492e c15492e = AbstractC11785e.ad;
                                AbstractC8461e.vip(c14163e.startapp, null, AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 48), ((C7019e) c13770e4.adcel(c15492e)).metrica.license), new C6159e(((C7019e) c13770e4.adcel(c15492e)).ad.ads), new C6159e(((C7019e) c13770e4.adcel(c15492e)).ad.ads), C16477e.ad, c13770e4, 36912, 6, 31712);
                            } else {
                                c13770e4.m3659default();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, c13770e), license, null, AbstractC16653e.license(-1183116977, new Function2() { // from class: eؚ۠ٙ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i4) {
                        case 0:
                            C13770e c13770e2 = (C13770e) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                                AbstractC14489e.vip(c14163e.vip, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                            } else {
                                c13770e2.m3659default();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            C13770e c13770e3 = (C13770e) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if (c13770e3.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                                AbstractC14489e.vip(c14163e.license, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                            } else {
                                c13770e3.m3659default();
                            }
                            return Unit.INSTANCE;
                        default:
                            C13770e c13770e4 = (C13770e) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            if (c13770e4.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                                C15492e c15492e = AbstractC11785e.ad;
                                AbstractC8461e.vip(c14163e.startapp, null, AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 48), ((C7019e) c13770e4.adcel(c15492e)).metrica.license), new C6159e(((C7019e) c13770e4.adcel(c15492e)).ad.ads), new C6159e(((C7019e) c13770e4.adcel(c15492e)).ad.ads), C16477e.ad, c13770e4, 36912, 6, 31712);
                            } else {
                                c13770e4.m3659default();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, c13770e), AbstractC16653e.license(-933838576, new Function2() { // from class: eؚ۠ٙ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i5) {
                        case 0:
                            C13770e c13770e2 = (C13770e) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                                AbstractC14489e.vip(c14163e.vip, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                            } else {
                                c13770e2.m3659default();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            C13770e c13770e3 = (C13770e) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if (c13770e3.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                                AbstractC14489e.vip(c14163e.license, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                            } else {
                                c13770e3.m3659default();
                            }
                            return Unit.INSTANCE;
                        default:
                            C13770e c13770e4 = (C13770e) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            if (c13770e4.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                                C15492e c15492e = AbstractC11785e.ad;
                                AbstractC8461e.vip(c14163e.startapp, null, AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 48), ((C7019e) c13770e4.adcel(c15492e)).metrica.license), new C6159e(((C7019e) c13770e4.adcel(c15492e)).ad.ads), new C6159e(((C7019e) c13770e4.adcel(c15492e)).ad.ads), C16477e.ad, c13770e4, 36912, 6, 31712);
                            } else {
                                c13770e4.m3659default();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, c13770e), null, null, 0.0f, 0.0f, c13770e, 27654, 484);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C17785e(this, c14163e, i, 28);
        }
    }

    @Override // defpackage.AbstractC9512e
    /* renamed from: synchronized */
    public void mo2587synchronized(C13770e c13770e, int i) {
        switch (this.f33143e) {
            case 1:
                c13770e.m3671package(714230096);
                int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
                if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
                    InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                    boolean yandex = c13770e.yandex(this);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C14667e(this, 0);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC16429e.ad(AbstractC13510e.vip, AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), null, null, AbstractC13510e.metrica, null, null, 0.0f, 0.0f, c13770e, 24582, 492);
                } else {
                    c13770e.m3659default();
                }
                C2846e subscription = c13770e.subscription();
                if (subscription != null) {
                    subscription.license = new C2068e(this, i);
                    return;
                }
                return;
            default:
                super.mo2587synchronized(c13770e, i);
                return;
        }
    }

    /* renamed from: throws, reason: not valid java name */
    public void m4227throws(C12817e c12817e, C13770e c13770e, int i) {
        C12817e c12817e2;
        C13770e c13770e2;
        c13770e.m3671package(893161285);
        int i2 = (c13770e.purchase(c12817e) ? 4 : 2) | i | (c13770e.yandex(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            EnumC11342e m4167private = m4167private();
            AbstractC16049e m4166package = m4166package();
            String Signature = m4166package != null ? m4166package.Signature() : null;
            int i3 = i2 & 14;
            boolean yandex = c13770e.yandex(this) | (i3 == 4);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C1708e(this, c12817e, 13);
                c13770e.m3682throws(m3681throw);
            }
            c12817e2 = c12817e;
            c13770e2 = c13770e;
            AbstractC0607e.ad(c12817e2, m4167private, Signature, (Function0) m3681throw, c13770e2, i3);
        } else {
            c12817e2 = c12817e;
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C9130e(this, c12817e2, i, 2);
        }
    }

    @Override // defpackage.AbstractC9512e
    /* renamed from: transient */
    public final void mo2588transient(Function0 function0, C13770e c13770e, int i) {
        switch (this.f33143e) {
            case 0:
                c13770e.m3671package(-450273550);
                int i2 = (c13770e.yandex(function0) ? 4 : 2) | i | (c13770e.yandex(this) ? 32 : 16);
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
                        m3681throw = new Function0(this) { // from class: eؙۤۚ

                            /* renamed from: eؘٙؓ, reason: contains not printable characters */
                            public final /* synthetic */ C16918e f13973e;

                            {
                                this.f13973e = this;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i4) {
                                    case 0:
                                        this.f13973e.f33141e.setValue(Boolean.TRUE);
                                        return Unit.INSTANCE;
                                    default:
                                        this.f13973e.f33141e.setValue(Boolean.FALSE);
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC1513e.license((Function0) m3681throw, null, false, null, null, null, AbstractC16653e.license(973346447, new C17871e(0, this), c13770e), c13770e, 805306368, 510);
                    boolean booleanValue = ((Boolean) this.f33141e.getValue()).booleanValue();
                    boolean yandex2 = c13770e.yandex(this);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        final int i5 = 1;
                        m3681throw2 = new Function0(this) { // from class: eؙۤۚ

                            /* renamed from: eؘٙؓ, reason: contains not printable characters */
                            public final /* synthetic */ C16918e f13973e;

                            {
                                this.f13973e = this;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i5) {
                                    case 0:
                                        this.f13973e.f33141e.setValue(Boolean.TRUE);
                                        return Unit.INSTANCE;
                                    default:
                                        this.f13973e.f33141e.setValue(Boolean.FALSE);
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e.m3682throws(m3681throw2);
                    }
                    AbstractC4709e.ad(booleanValue, (Function0) m3681throw2, null, 0L, null, null, null, 0L, 0.0f, 0.0f, AbstractC16653e.license(-1965224153, new C17630e(this, function0, 17), c13770e), c13770e, 0, 2044);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                C2846e subscription = c13770e.subscription();
                if (subscription != null) {
                    subscription.license = new C17785e(this, function0, i, 26);
                    return;
                }
                return;
            default:
                c13770e.m3671package(-252148934);
                int i6 = i | (c13770e.yandex(function0) ? 4 : 2) | (c13770e.yandex(this) ? 32 : 16);
                if (c13770e.m3673protected(i6 & 1, (i6 & 19) != 18)) {
                    InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j2 = c13770e.f27286case;
                    int i7 = (int) ((j2 >>> 32) ^ j2);
                    InterfaceC3483e advert2 = c13770e.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, C0115e.f1276e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e2 = C2721e.vip;
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e2);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, license2, C2721e.billing);
                    AbstractC2270e.yandex(c13770e, advert2, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i7), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase2, C2721e.license);
                    boolean yandex3 = c13770e.yandex(this);
                    Object m3681throw3 = c13770e.m3681throw();
                    C5170e c5170e2 = C2987e.ad;
                    if (yandex3 || m3681throw3 == c5170e2) {
                        m3681throw3 = new C14667e(this, 1);
                        c13770e.m3682throws(m3681throw3);
                    }
                    AbstractC1513e.license((Function0) m3681throw3, null, false, null, null, null, AbstractC16653e.license(1171471063, new C17871e(1, this), c13770e), c13770e, 805306368, 510);
                    boolean booleanValue2 = ((Boolean) this.f33141e.getValue()).booleanValue();
                    boolean yandex4 = c13770e.yandex(this);
                    Object m3681throw4 = c13770e.m3681throw();
                    if (yandex4 || m3681throw4 == c5170e2) {
                        m3681throw4 = new C14667e(this, 2);
                        c13770e.m3682throws(m3681throw4);
                    }
                    AbstractC4709e.ad(booleanValue2, (Function0) m3681throw4, null, 0L, null, null, null, 0L, 0.0f, 0.0f, AbstractC16653e.license(-1767099537, new C17630e(this, function0, 19), c13770e), c13770e, 0, 2044);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                C2846e subscription2 = c13770e.subscription();
                if (subscription2 != null) {
                    subscription2.license = new C9130e(this, function0, i, 3);
                    return;
                }
                return;
        }
    }
}
