package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۜۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8231e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f16710e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f16711e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f16712e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8231e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f16710e = i;
        this.f16711e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8231e(Object obj, Object obj2, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f16710e = i;
        this.f16712e = obj;
        this.f16711e = obj2;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f16710e) {
            case 0:
                return new C8231e((C1652e) this.f16712e, (C8745e) this.f16711e, interfaceC5083e, 0);
            case 1:
                C8231e c8231e = new C8231e((Context) this.f16711e, interfaceC5083e, 1);
                c8231e.f16712e = obj;
                return c8231e;
            case 2:
                return new C8231e((C1343e) this.f16712e, (String) this.f16711e, interfaceC5083e, 2);
            case 3:
                C8231e c8231e2 = new C8231e((C10675e) this.f16711e, interfaceC5083e, 3);
                c8231e2.f16712e = obj;
                return c8231e2;
            case 4:
                return new C8231e((C1439e) this.f16712e, (C11326e) this.f16711e, interfaceC5083e, 4);
            case 5:
                C8231e c8231e3 = new C8231e((EnumC5778e) this.f16711e, interfaceC5083e, 5);
                c8231e3.f16712e = obj;
                return c8231e3;
            case 6:
                C8231e c8231e4 = new C8231e((EnumC11700e) this.f16711e, interfaceC5083e, 6);
                c8231e4.f16712e = obj;
                return c8231e4;
            default:
                C8231e c8231e5 = new C8231e((EnumC4169e) this.f16711e, interfaceC5083e, 7);
                c8231e5.f16712e = obj;
                return c8231e5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16710e) {
            case 0:
                return ((C8231e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C8231e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C8231e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C8231e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C8231e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C8231e) advert((InterfaceC5083e) obj2, (C10876e) obj)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C8231e) advert((InterfaceC5083e) obj2, (C10876e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C8231e) advert((InterfaceC5083e) obj2, (C10876e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        Object obj2;
        Throwable th;
        Object obj3;
        Object obj4;
        Throwable th2;
        int i = this.f16710e;
        boolean z = false;
        int i2 = 1;
        Throwable th3 = null;
        r4 = null;
        Object obj5 = null;
        Object obj6 = this.f16711e;
        switch (i) {
            case 0:
                AbstractC2003e.purchase(obj);
                C1652e c1652e = (C1652e) this.f16712e;
                c1652e.crashlytics(EnumC18011e.f35323e, (C8745e) obj6);
                c1652e.f4580e = c1652e.firebase();
                return Unit.INSTANCE;
            case 1:
                AbstractC2003e.purchase(obj);
                Context context = (Context) obj6;
                try {
                    C18511e c18511e = AbstractC11062e.f21949e;
                    C16456e c16456e = C16456e.ad;
                    String str = C10675e.f21023e;
                    C13197e c13197e = new C13197e(c18511e.mo1918implements(C10215e.purchase(context.getFilesDir()).appmetrica("vkx_remote_config.json")));
                    try {
                        C11817e c11817e = C16456e.vip;
                        c11817e.getClass();
                        obj3 = (C15722e) AbstractC4508e.metrica(c11817e, C15722e.Companion.serializer(), new C9428e(c13197e, i2));
                        try {
                            c13197e.close();
                            th = null;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        try {
                            c13197e.close();
                        } catch (Throwable th6) {
                            AbstractC13362e.license(th5, th6);
                        }
                        th = th5;
                        obj3 = null;
                    }
                } catch (Throwable th7) {
                    obj2 = new C12763e(th7);
                }
                if (th != null) {
                    throw th;
                }
                obj2 = obj3;
                C15722e c15722e = (C15722e) (obj2 instanceof C12763e ? null : obj2);
                if (c15722e == null) {
                    return Boolean.FALSE;
                }
                for (Map.Entry entry : c15722e.ad.entrySet()) {
                    C16456e.license.put((String) entry.getKey(), (String) entry.getValue());
                }
                return Boolean.TRUE;
            case 2:
                AbstractC2003e.purchase(obj);
                C1343e c1343e = (C1343e) this.f16712e;
                C18464e c18464e = new C18464e(23);
                c18464e.m4486e((String) obj6);
                c18464e.m4494e("GET", null);
                C11058e purchase = c1343e.vip(new C8650e(c18464e)).purchase();
                try {
                    if (!purchase.f21939e) {
                        if (purchase.f21942e == 429) {
                        }
                        Boolean valueOf = Boolean.valueOf(z);
                        purchase.close();
                        return valueOf;
                    }
                    z = true;
                    Boolean valueOf2 = Boolean.valueOf(z);
                    purchase.close();
                    return valueOf2;
                } catch (Throwable th8) {
                    try {
                        throw th8;
                    } catch (Throwable th9) {
                        AbstractC16704e.vip(purchase, th8);
                        throw th9;
                    }
                }
            case 3:
                AbstractC2003e.purchase(obj);
                C18511e c18511e2 = AbstractC11062e.f21949e;
                C10675e c10675e = (C10675e) obj6;
                boolean isVip = c18511e2.isVip(c10675e);
                Object obj7 = C13664e.f27089e;
                if (!isVip) {
                    return obj7;
                }
                try {
                    C13197e c13197e2 = new C13197e(c18511e2.mo1918implements(c10675e));
                    try {
                        C8028e c8028e = AbstractC0232e.license;
                        c8028e.getClass();
                        Object obj8 = (List) AbstractC4508e.metrica(c8028e, new C13758e(C10620e.Companion.serializer(), 0), new C9428e(c13197e2, i2));
                        try {
                            c13197e2.close();
                        } catch (Throwable th10) {
                            th3 = th10;
                        }
                        Throwable th11 = th3;
                        obj5 = obj8;
                        th2 = th11;
                    } catch (Throwable th12) {
                        th2 = th12;
                        try {
                            c13197e2.close();
                        } catch (Throwable th13) {
                            AbstractC13362e.license(th2, th13);
                        }
                    }
                } catch (Throwable th14) {
                    obj4 = new C12763e(th14);
                }
                if (th2 != null) {
                    throw th2;
                }
                obj4 = obj5;
                if (!(obj4 instanceof C12763e)) {
                    obj7 = obj4;
                }
                return (List) obj7;
            case 4:
                AbstractC2003e.purchase(obj);
                ((C1439e) this.f16712e).appmetrica.invoke(Boolean.valueOf(((C11326e) obj6).metrica));
                return Unit.INSTANCE;
            case 5:
                C10876e c10876e = (C10876e) this.f16712e;
                AbstractC2003e.purchase(obj);
                return C10876e.vip(c10876e, false, false, false, false, false, (EnumC5778e) obj6, null, null, false, false, false, false, false, false, false, false, 262111);
            case 6:
                C10876e c10876e2 = (C10876e) this.f16712e;
                AbstractC2003e.purchase(obj);
                return C10876e.vip(c10876e2, false, false, false, false, false, null, (EnumC11700e) obj6, null, false, false, false, false, false, false, false, false, 262079);
            default:
                C10876e c10876e3 = (C10876e) this.f16712e;
                AbstractC2003e.purchase(obj);
                return C10876e.vip(c10876e3, false, false, false, false, false, null, null, (EnumC4169e) obj6, false, false, false, false, false, false, false, false, 262015);
        }
    }
}
