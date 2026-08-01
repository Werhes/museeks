package defpackage;

import io.realm.kotlin.internal.interop.realm_value_t;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٛٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6503e {
    public static final Object ad;

    static {
        C12232e c12232e = AbstractC3820e.ad;
        C6571e c6571e = new C6571e(c12232e.vip(Byte.TYPE), C14741e.vip);
        C6571e c6571e2 = new C6571e(c12232e.vip(Character.TYPE), C14741e.metrica);
        C6571e c6571e3 = new C6571e(c12232e.vip(Short.TYPE), C14741e.appmetrica);
        C6571e c6571e4 = new C6571e(c12232e.vip(Integer.TYPE), C14741e.license);
        InterfaceC7227e vip = c12232e.vip(InterfaceC6025e.class);
        C0373e c0373e = C0373e.startapp;
        C6571e c6571e5 = new C6571e(vip, c0373e);
        C6571e c6571e6 = new C6571e(c12232e.vip(C2577e.class), c0373e);
        C6571e c6571e7 = new C6571e(c12232e.vip(C2453e.class), C0373e.yandex);
        InterfaceC7227e vip2 = c12232e.vip(InterfaceC17159e.class);
        C0373e c0373e2 = C0373e.adcel;
        ad = AbstractC10064e.purchase(c6571e, c6571e2, c6571e3, c6571e4, c6571e5, c6571e6, c6571e7, new C6571e(vip2, c0373e2), new C6571e(c12232e.vip(C7588e.class), c0373e2), new C6571e(c12232e.vip(byte[].class), C0373e.metrica), new C6571e(c12232e.vip(String.class), C0373e.mopub), new C6571e(c12232e.vip(Long.TYPE), C0373e.billing), new C6571e(c12232e.vip(Boolean.TYPE), C0373e.vip), new C6571e(c12232e.vip(Float.TYPE), C0373e.purchase), new C6571e(c12232e.vip(Double.TYPE), C0373e.appmetrica), new C6571e(c12232e.vip(C12355e.class), C0373e.license));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public static final AbstractC8441e ad(InterfaceC7227e interfaceC7227e) {
        return (AbstractC8441e) AbstractC10064e.license(interfaceC7227e, ad);
    }

    public static final Object vip(C15816e c15816e, InterfaceC5045e interfaceC5045e, Function1 function1, Function1 function12, Function1 function13, Function1 function14) {
        realm_value_t m4025while;
        C12575e c12575e = C12575e.f25237e;
        int i = interfaceC5045e != null ? ((C8648e) interfaceC5045e).ad : 0;
        switch (i == 0 ? -1 : AbstractC17029e.ad[AbstractC8703e.m2467class(i)]) {
            case -1:
                return function1.invoke(new C6600e(c15816e.m4024try()));
            case 0:
            default:
                throw new C14803e(10);
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                C8648e c8648e = (C8648e) interfaceC5045e;
                switch (AbstractC8703e.m2467class(c8648e.ad)) {
                    case 0:
                        m4025while = c15816e.m4025while(Long.valueOf(c8648e.purchase()));
                        break;
                    case 1:
                        m4025while = c15816e.adcel(Boolean.valueOf(c8648e.ad()));
                        break;
                    case 2:
                        m4025while = c15816e.m4015default(c8648e.mopub());
                        break;
                    case 3:
                        m4025while = c15816e.advert(c8648e.vip());
                        break;
                    case 4:
                        m4025while = c15816e.m4019implements((C2577e) c8648e.yandex());
                        break;
                    case 5:
                        m4025while = c15816e.firebase(Float.valueOf(c8648e.appmetrica()));
                        break;
                    case 6:
                        m4025while = c15816e.applovin(Double.valueOf(c8648e.license()));
                        break;
                    case 7:
                        m4025while = c15816e.inmobi(c8648e.metrica());
                        break;
                    case 8:
                        m4025while = c12575e.applovin(c8648e.billing().yandex());
                        break;
                    case 9:
                        m4025while = c12575e.m3368interface(((C7588e) c8648e.adcel()).ad);
                        break;
                    default:
                        throw new UnsupportedOperationException("If you want to convert a 'RealmAny' instance containing an object to a 'RealmValue' use 'realmAnyToRealmValue' (when working with 'RealmQuery') or 'realmAnyToRealmValueWithObjectImport' (when using an accessor).");
                }
                return function1.invoke(new C6600e(m4025while));
            case 11:
                return function12.invoke(interfaceC5045e);
            case 12:
                return function13.invoke(interfaceC5045e);
            case 13:
                return function14.invoke(interfaceC5045e);
        }
    }
}
