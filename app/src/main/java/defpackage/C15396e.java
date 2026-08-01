package defpackage;

import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15396e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Context f30342e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C16007e f30343e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30344e = 0;

    public /* synthetic */ C15396e(Context context, C16007e c16007e) {
        this.f30342e = context;
        this.f30343e = c16007e;
    }

    public /* synthetic */ C15396e(C16007e c16007e, Context context) {
        this.f30343e = c16007e;
        this.f30342e = context;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C16007e c16007e;
        Context context;
        switch (this.f30344e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c13770e.ads()) {
                    c13770e.m3659default();
                } else {
                    C15492e c15492e = AbstractC4449e.vip;
                    Context context2 = this.f30342e;
                    C14815e ad = c15492e.ad(context2);
                    C15492e c15492e2 = AbstractC4449e.license;
                    C16007e c16007e2 = this.f30343e;
                    C14815e ad2 = c15492e2.ad(c16007e2.purchase);
                    C5015e c5015e = AbstractC3860e.ad;
                    Bundle bundle = (Bundle) c16007e2.mopub.getValue();
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    AbstractC1101e.vip(new C14815e[]{ad, ad2, c5015e.ad(bundle), AbstractC4449e.metrica.ad(c16007e2.adcel.getValue())}, AbstractC16653e.license(-1811403166, new C15396e(c16007e2, context2), c13770e), c13770e, 56);
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c13770e2.ads()) {
                    c13770e2.m3659default();
                } else {
                    Object m3681throw = c13770e2.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    Object obj3 = m3681throw;
                    if (m3681throw == c5170e) {
                        C0576e startapp = AbstractC14533e.startapp(new C16109e(0L));
                        c13770e2.m3682throws(startapp);
                        obj3 = startapp;
                    }
                    InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj3;
                    Boolean bool = Boolean.FALSE;
                    C16007e c16007e3 = this.f30343e;
                    boolean yandex = c13770e2.yandex(c16007e3);
                    Context context3 = this.f30342e;
                    boolean yandex2 = yandex | c13770e2.yandex(context3);
                    Object m3681throw2 = c13770e2.m3681throw();
                    Unit unit = null;
                    boolean z = false;
                    boolean z2 = false;
                    if (yandex2 || m3681throw2 == c5170e) {
                        C1247e c1247e = new C1247e((Object) c16007e3, (Object) context3, (Object) interfaceC3314e, (InterfaceC5083e) (z ? 1 : 0), 6);
                        c16007e = c16007e3;
                        context = context3;
                        c13770e2.m3682throws(c1247e);
                        m3681throw2 = c1247e;
                    } else {
                        c16007e = c16007e3;
                        context = context3;
                    }
                    if (((Boolean) AbstractC14533e.adcel(c13770e2, bool, (Function2) m3681throw2).getValue()).booleanValue()) {
                        c13770e2.m3676strictfp(-1541018146);
                        Object m3681throw3 = c13770e2.m3681throw();
                        if (m3681throw3 == c5170e) {
                            C1247e c1247e2 = new C1247e((Object) c16007e.appmetrica, (Object) context, (Object) c16007e.purchase, (InterfaceC5083e) (z2 ? 1 : 0), 7);
                            unit = null;
                            C14578e c14578e = new C14578e(c1247e2, C2693e.f6576e, -2, 1);
                            c13770e2.m3682throws(c14578e);
                            m3681throw3 = c14578e;
                        }
                        Function2 function2 = (Function2) AbstractC14533e.metrica((InterfaceC1108e) m3681throw3, unit, c13770e2, 48).getValue();
                        if (function2 == null) {
                            c13770e2.m3676strictfp(-1540889931);
                            c13770e2.Signature(false);
                        } else {
                            c13770e2.m3676strictfp(-1540889930);
                            AbstractC5418e.ad(0, ((C16109e) interfaceC3314e.getValue()).ad, c13770e2, c16007e.yandex, function2);
                            c13770e2.Signature(false);
                            unit = Unit.INSTANCE;
                        }
                        if (unit == null) {
                            c13770e2.m3676strictfp(-1296630672);
                            AbstractC0863e.ad(c13770e2, 0);
                            c13770e2.Signature(false);
                        } else {
                            c13770e2.m3676strictfp(-1296636252);
                            c13770e2.Signature(false);
                        }
                        c13770e2.Signature(false);
                    } else {
                        c13770e2.m3676strictfp(-1540810446);
                        AbstractC0863e.ad(c13770e2, 0);
                        c13770e2.Signature(false);
                    }
                    boolean yandex3 = c13770e2.yandex(c16007e);
                    Object m3681throw4 = c13770e2.m3681throw();
                    Object obj4 = m3681throw4;
                    if (yandex3 || m3681throw4 == c5170e) {
                        C14515e c14515e = new C14515e(7, c16007e);
                        c13770e2.m3682throws(c14515e);
                        obj4 = c14515e;
                    }
                    AbstractC17680e.purchase((Function0) obj4, c13770e2);
                }
                return Unit.INSTANCE;
        }
    }
}
