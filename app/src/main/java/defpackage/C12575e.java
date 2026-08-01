package defpackage;

import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_object_id_t;
import io.realm.kotlin.internal.interop.realm_uuid_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.KeyFactory;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٚۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12575e implements InterfaceC16921e, InterfaceC1598e, InterfaceC17935e, InterfaceC16759e, InterfaceC1589e, InterfaceC11962e, InterfaceC17847e, InterfaceC4317e, InterfaceC11871e, InterfaceC8292e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static C12575e f25227e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25240e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C12575e f25222e = new C12575e(1);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C12575e f25235e = new C12575e(2);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C12575e f25219e = new C12575e(3);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C12575e f25238e = new C12575e(4);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C12575e f25237e = new C12575e(5);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ C12575e f25231e = new C12575e(6);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C12575e f25236e = new C12575e(7);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C12575e f25223e = new C12575e(9);

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C12575e f25232e = new C12575e(10);

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C12575e f25221e = new C12575e(11);

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C12575e f25220e = new C12575e(12);

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C12575e f25225e = new C12575e(13);

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C12575e f25229e = new C12575e(14);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C12575e f25230e = new C12575e(15);

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final /* synthetic */ C12575e f25228e = new C12575e(16);

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final C12575e f25226e = new C12575e(17);

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public static final C12575e f25234e = new C12575e(18);

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final C12575e f25239e = new C12575e(19);

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public static final C12575e f25224e = new C12575e(20);

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public static final C12575e f25233e = new C12575e(21);

    public /* synthetic */ C12575e(int i) {
        this.f25240e = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x009c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0315 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object Signature(defpackage.C13655e r22, java.lang.String r23, defpackage.InterfaceC7227e r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12575e.Signature(eْۧ۠, java.lang.String, eؚ٘ٚ, boolean, boolean):java.lang.Object");
    }

    public static final double adcel(C13797e c13797e, boolean z, int i) {
        double tapsense = tapsense(c13797e);
        return i == 1 ? z ? (tapsense < 105.0d || tapsense >= 125.0d) ? 14 : 6 : 18 : 12;
    }

    public static C9889e admob(C13655e c13655e, String str, InterfaceC7227e interfaceC7227e, boolean z, boolean z2) {
        c13655e.ad();
        C16406e loadAd = loadAd(c13655e, str, 2, interfaceC7227e, z);
        int i = loadAd.purchase;
        return isVip(c13655e, loadAd, interfaceC7227e, i != 5 ? i != 9 ? 1 : !c13655e.f27072e.advert().ad(loadAd.startapp).yandex ? 3 : 4 : 2, true, z2);
    }

    public static int ads(InterfaceC14287e interfaceC14287e) {
        C13655e f36702e = ((InterfaceC10518e) interfaceC14287e).getF36702e();
        if (f36702e == null) {
            String str = AbstractC6766e.ad;
            return System.identityHashCode(interfaceC14287e);
        }
        boolean startapp = C7290e.startapp(interfaceC14287e);
        C4940e c4940e = f36702e.adcel().isClosed() ? new C4940e(-1L, -1L, new C17621e(0L), BuildConfig.FLAVOR) : AbstractC15792e.yandex(interfaceC14287e);
        String str2 = ((C14918e) f36702e.f27072e.inmobi().f22047e).metrica;
        int i = startapp ? 1231 : 1237;
        return str2.hashCode() + ((c4940e.hashCode() + (i * 31)) * 31);
    }

    public static void amazon(InterfaceC10518e interfaceC10518e, InterfaceC14287e interfaceC14287e, int i, Map map) {
        List<C6571e> list;
        int i2 = i;
        Map map2 = map;
        if (interfaceC10518e instanceof InterfaceC16120e) {
            DynamicMutableRealmObject dynamicMutableRealmObject = (DynamicMutableRealmObject) interfaceC10518e;
            if (!(interfaceC14287e instanceof InterfaceC16120e)) {
                Map metrica = AbstractC2863e.vip(AbstractC3820e.ad.vip(interfaceC14287e.getClass())).metrica();
                ArrayList arrayList = new ArrayList(metrica.size());
                for (Map.Entry entry : metrica.entrySet()) {
                    arrayList.add(new C6571e(entry.getKey(), ((InterfaceC0662e) entry.getValue()).get(interfaceC14287e)));
                }
                list = arrayList;
            } else {
                if (!(interfaceC14287e instanceof C16740e)) {
                    throw new RuntimeException("Unexpected import of dynamic managed object");
                }
                list = AbstractC10064e.adcel(((C16740e) interfaceC14287e).f32812e);
            }
            ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(list, 10));
            for (C6571e c6571e : list) {
                subscription(((InterfaceC10518e) dynamicMutableRealmObject).getF36702e(), (String) c6571e.f13544e, c6571e.f13543e, i2, map2);
                arrayList2.add(Unit.INSTANCE);
            }
            return;
        }
        C18085e c18085e = interfaceC10518e.getF36702e().f27076e;
        ArrayList arrayList3 = c18085e.metrica;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C16406e c16406e = (C16406e) next;
            if (!c16406e.mopub && !c16406e.yandex) {
                arrayList4.add(next);
            }
        }
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            C16406e c16406e2 = (C16406e) it2.next();
            InterfaceC0716e interfaceC0716e = c16406e2.ad;
            if (interfaceC0716e != null) {
                InterfaceC0662e interfaceC0662e = (InterfaceC0662e) interfaceC0716e;
                long j = c16406e2.license;
                int i3 = c16406e2.appmetrica;
                int m2467class = AbstractC8703e.m2467class(i3);
                int i4 = 1;
                if (m2467class == 0) {
                    int m2467class2 = AbstractC8703e.m2467class(c16406e2.purchase);
                    if (m2467class2 == 4) {
                        Object obj = interfaceC0662e.get(interfaceC14287e);
                        C13655e f36702e = interfaceC10518e.getF36702e();
                        long j2 = c16406e2.license;
                        C15816e c15816e = new C15816e(15);
                        if (obj == null) {
                            crashlytics(f36702e, j2, c15816e.m4024try());
                            Unit unit = Unit.INSTANCE;
                        } else if (obj instanceof String) {
                            crashlytics(f36702e, j2, c15816e.m4015default((String) obj));
                            Unit unit2 = Unit.INSTANCE;
                        } else if (obj instanceof byte[]) {
                            crashlytics(f36702e, j2, c15816e.advert((byte[]) obj));
                            Unit unit3 = Unit.INSTANCE;
                        } else if (obj instanceof Long) {
                            crashlytics(f36702e, j2, c15816e.m4025while((Long) obj));
                            Unit unit4 = Unit.INSTANCE;
                        } else if (obj instanceof Boolean) {
                            crashlytics(f36702e, j2, c15816e.adcel((Boolean) obj));
                            Unit unit5 = Unit.INSTANCE;
                        } else if (obj instanceof InterfaceC4476e) {
                            crashlytics(f36702e, j2, c15816e.m4019implements((InterfaceC4476e) obj));
                            Unit unit6 = Unit.INSTANCE;
                        } else if (obj instanceof Float) {
                            crashlytics(f36702e, j2, c15816e.firebase((Float) obj));
                            Unit unit7 = Unit.INSTANCE;
                        } else if (obj instanceof Double) {
                            crashlytics(f36702e, j2, c15816e.applovin((Double) obj));
                            Unit unit8 = Unit.INSTANCE;
                        } else if (obj instanceof C12355e) {
                            crashlytics(f36702e, j2, c15816e.inmobi((C12355e) obj));
                            Unit unit9 = Unit.INSTANCE;
                        } else {
                            boolean z = obj instanceof C2453e;
                            C12575e c12575e = f25237e;
                            if (z) {
                                crashlytics(f36702e, j2, c12575e.applovin(((C2453e) obj).yandex()));
                                Unit unit10 = Unit.INSTANCE;
                            } else if (obj instanceof InterfaceC17159e) {
                                crashlytics(f36702e, j2, c12575e.m3368interface(((C7588e) ((InterfaceC17159e) obj)).ad));
                                Unit unit11 = Unit.INSTANCE;
                            } else if (obj instanceof C13655e) {
                                crashlytics(f36702e, j2, c15816e.m4012break((C13655e) obj));
                                Unit unit12 = Unit.INSTANCE;
                            } else {
                                if (!(obj instanceof InterfaceC5045e)) {
                                    throw new IllegalArgumentException(AbstractC1634e.advert(obj, "Unsupported value for transport: "));
                                }
                                AbstractC6503e.vip(c15816e, (InterfaceC5045e) obj, new C10606e(f36702e, j2, i4), new C4746e(f36702e, j2, i2, map2), new C8509e(f36702e, j2, obj, i, map, 0), new C8509e(f36702e, j2, obj, i, map, 1));
                            }
                        }
                        c15816e.m4020interface();
                    } else if (m2467class2 != 8) {
                        interfaceC0662e.remoteconfig(interfaceC10518e, interfaceC0662e.get(interfaceC14287e));
                    } else if (interfaceC10518e.getF36702e().f27072e.advert().metrica(c16406e2.startapp).yandex) {
                        InterfaceC4706e interfaceC4706e = (InterfaceC4706e) interfaceC0662e.get(interfaceC14287e);
                        C13655e f36702e2 = interfaceC10518e.getF36702e();
                        if (interfaceC4706e != null) {
                            long ptr$cinterop_release = f36702e2.f27071e.getPtr$cinterop_release();
                            int i5 = AbstractC6026e.ad;
                            amazon(AbstractC15792e.subscription(new LongPointerWrapper(realmcJNI.realm_set_embedded(ptr$cinterop_release, j), false, 2, null), AbstractC3820e.ad.vip(interfaceC4706e.getClass()), f36702e2.f27074e, f36702e2.f27072e), interfaceC4706e, i2, map2);
                        } else {
                            C15816e yandex = AbstractC1414e.yandex();
                            crashlytics(f36702e2, j, yandex.m4024try());
                            Unit unit13 = Unit.INSTANCE;
                            yandex.m4020interface();
                        }
                    } else {
                        InterfaceC14287e interfaceC14287e2 = (InterfaceC17544e) interfaceC0662e.get(interfaceC14287e);
                        C13655e f36702e3 = interfaceC10518e.getF36702e();
                        f36702e3.ad();
                        C17974e c17974e = f36702e3.f27074e;
                        InterfaceC15348e interfaceC15348e = f36702e3.f27072e;
                        if (interfaceC14287e2 != null) {
                            C13655e f36702e4 = ((InterfaceC10518e) interfaceC14287e2).getF36702e();
                            if (f36702e4 == null) {
                                interfaceC14287e2 = AbstractC3422e.ad(c17974e, interfaceC15348e.crashlytics(), interfaceC14287e2, i2, map2);
                            } else if (!AbstractC7890e.billing(f36702e4.f27072e, interfaceC15348e)) {
                                throw new IllegalArgumentException("Cannot import an outdated object. Use findLatest(object) to find an\nup-to-date version of the object in the given context before importing\nit.");
                            }
                        } else {
                            interfaceC14287e2 = null;
                        }
                        C13655e f36702e5 = interfaceC14287e2 != null ? ((InterfaceC10518e) interfaceC14287e2).getF36702e() : null;
                        C15816e c15816e2 = new C15816e(15);
                        crashlytics(f36702e3, j, c15816e2.m4012break(f36702e5));
                        Unit unit14 = Unit.INSTANCE;
                        c15816e2.m4020interface();
                    }
                } else if (m2467class == 1) {
                    C9889e c9889e = (C9889e) interfaceC0662e.get(interfaceC10518e);
                    c9889e.clear();
                    c9889e.f19500e.inmobi(c9889e.subs(), (InterfaceC17101e) interfaceC0662e.get(interfaceC14287e), i2, map2);
                } else if (m2467class == 2) {
                    C12977e c12977e = (C12977e) interfaceC0662e.get(interfaceC10518e);
                    c12977e.clear();
                    c12977e.f25863e.mo2159goto((InterfaceC11775e) interfaceC0662e.get(interfaceC14287e), i2, map2);
                } else {
                    if (m2467class != 3) {
                        throw new Error(AbstractC17861e.Signature("An operation is not implemented: ", "Collection type " + AbstractC13501e.applovin(i3) + " is not supported"));
                    }
                    C3050e c3050e = (C3050e) interfaceC0662e.get(interfaceC10518e);
                    c3050e.clear();
                    c3050e.f17714e.mo1371native((InterfaceC6128e) interfaceC0662e.get(interfaceC14287e), i2, map2);
                }
            } else if (interfaceC0716e != null) {
                throw new RuntimeException(AbstractC17861e.admob("Typed object should always have an accessor: ", c18085e.ad, ".", c16406e2.vip));
            }
            i2 = i;
            map2 = map;
        }
    }

    /* renamed from: class, reason: not valid java name */
    public static double m3366class(C15073e c15073e, double d, double d2) {
        return AbstractC3062e.ad(remoteconfig(c15073e.ad, c15073e.vip, 0.0d, false), d, d2);
    }

    public static void crashlytics(C13655e c13655e, long j, realm_value_t realm_value_tVar) {
        long ptr$cinterop_release = c13655e.f27071e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_t.vip(realm_value_tVar), realm_value_tVar, false);
    }

    public static double firebase(C15073e c15073e, double d, double d2) {
        return AbstractC3062e.ad(remoteconfig(c15073e.ad, c15073e.vip * 1.0d, 100.0d, true), d, d2);
    }

    /* renamed from: goto, reason: not valid java name */
    public static synchronized void m3367goto() {
        synchronized (C12575e.class) {
            if (f25227e == null) {
                C12575e c12575e = new C12575e(0);
                new ConcurrentHashMap();
                f25227e = c12575e;
            }
        }
    }

    public static double inmobi(C13797e c13797e) {
        return AbstractC11008e.ad(c13797e, new double[]{0.0d, 38.0d, 105.0d, 140.0d, 333.0d, 360.0d}, new double[]{-14.0d, 10.0d, -14.0d, 10.0d, -14.0d});
    }

    public static C9889e isVip(C13655e c13655e, C16406e c16406e, InterfaceC7227e interfaceC7227e, int i, boolean z, boolean z2) {
        InterfaceC12556e c11980e;
        LongPointerWrapper longPointerWrapper = c13655e.f27071e;
        String str = c16406e.startapp;
        long j = c16406e.license;
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i2 = AbstractC6026e.ad;
        LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_get_list(ptr$cinterop_release, j), false, 2, null);
        C17974e c17974e = c13655e.f27074e;
        InterfaceC15348e interfaceC15348e = c13655e.f27072e;
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            c11980e = new C11980e(c17974e, interfaceC15348e, AbstractC6503e.ad(interfaceC7227e), longPointerWrapper2, 15);
            longPointerWrapper2 = longPointerWrapper2;
        } else if (m2467class == 1) {
            c11980e = new C6613e(c17974e, interfaceC15348e, longPointerWrapper2, z, z2);
        } else if (m2467class == 2) {
            c11980e = new C5236e(c17974e, interfaceC15348e, longPointerWrapper2, interfaceC7227e, interfaceC15348e.advert().metrica(str).vip, 1);
        } else {
            if (m2467class != 3) {
                throw new C14803e(10);
            }
            c11980e = new C5236e(c17974e, interfaceC15348e, longPointerWrapper2, interfaceC7227e, interfaceC15348e.advert().metrica(str).vip, 0);
        }
        return new C9889e(c13655e, longPointerWrapper2, c11980e);
    }

    public static C16406e loadAd(C13655e c13655e, String str, int i, InterfaceC7227e interfaceC7227e, boolean z) {
        EnumC11043e enumC11043e;
        InterfaceC7227e adcel = AbstractC4224e.adcel(interfaceC7227e);
        C16406e vip = c13655e.f27076e.vip(str);
        boolean z2 = vip.billing;
        int i2 = vip.appmetrica;
        int i3 = vip.purchase;
        switch (AbstractC8703e.m2467class(i3)) {
            case 0:
                enumC11043e = EnumC11043e.f21878e;
                break;
            case 1:
                enumC11043e = EnumC11043e.f21881e;
                break;
            case 2:
                enumC11043e = EnumC11043e.f21884e;
                break;
            case 3:
                enumC11043e = EnumC11043e.f21875e;
                break;
            case 4:
                enumC11043e = EnumC11043e.f21876e;
                break;
            case 5:
                enumC11043e = EnumC11043e.f21879e;
                break;
            case 6:
                enumC11043e = EnumC11043e.f21886e;
                break;
            case 7:
                enumC11043e = EnumC11043e.f21882e;
                break;
            case 8:
                enumC11043e = EnumC11043e.f21887e;
                break;
            case 9:
                enumC11043e = EnumC11043e.f21887e;
                break;
            case 10:
                enumC11043e = EnumC11043e.f21885e;
                break;
            case 11:
                enumC11043e = EnumC11043e.f21883e;
                break;
            case 12:
                enumC11043e = EnumC11043e.f21877e;
                break;
            default:
                throw new IllegalStateException("Unknown storage type: ".concat(AbstractC1634e.applovin(i3)).toString());
        }
        InterfaceC7227e interfaceC7227e2 = enumC11043e.f21888e;
        if (i == i2 && AbstractC7890e.billing(adcel, interfaceC7227e2) && z == z2) {
            return vip;
        }
        throw new IllegalArgumentException(AbstractC4653e.ads(AbstractC17861e.tapsense("Trying to access property '", c13655e.f27075e, ".", str, "' as type: '"), pro(i, adcel, z), "' but actual schema type is '", pro(i2, interfaceC7227e2, z2), "'"));
    }

    public static String premium(InterfaceC14287e interfaceC14287e) {
        String str;
        Class<?> cls = interfaceC14287e.getClass();
        C12232e c12232e = AbstractC3820e.ad;
        InterfaceC3055e ad = AbstractC2863e.ad(c12232e.vip(cls));
        String ad2 = ad != null ? ad.ad() : null;
        String license = c12232e.vip(interfaceC14287e.getClass()).license();
        C13655e f36702e = ((InterfaceC10518e) interfaceC14287e).getF36702e();
        if (f36702e != null) {
            InterfaceC15348e interfaceC15348e = f36702e.f27072e;
            if (C7290e.startapp(interfaceC14287e)) {
                C4940e yandex = AbstractC15792e.yandex(interfaceC14287e);
                long j = yandex.vip;
                long j2 = yandex.metrica.f34534e;
                String str2 = ((C14918e) interfaceC15348e.inmobi().f22047e).license;
                StringBuilder sb = new StringBuilder();
                sb.append(license);
                sb.append("{state=VALID, schemaName=");
                sb.append(ad2);
                sb.append(", objKey=");
                sb.append(j);
                sb.append(", version=");
                sb.append(j2);
                sb.append(", realm=");
                str = AbstractC1786e.signatures(sb, str2, "}");
            } else {
                String str3 = interfaceC15348e.isClosed() ? "CLOSED" : "INVALID";
                str = license + "{state=" + str3 + ", schemaName=" + ad2 + ", realm=" + ((C14918e) interfaceC15348e.inmobi().f22047e).license + ", hashCode=" + interfaceC14287e.hashCode() + "}";
            }
            if (str != null) {
                return str;
            }
        }
        return license + "{state=UNMANAGED, schemaName=" + ad2 + ", hashCode=" + interfaceC14287e.hashCode() + "}";
    }

    public static String pro(int i, InterfaceC7227e interfaceC7227e, boolean z) {
        String str;
        String str2 = interfaceC7227e + (z ? "?" : BuildConfig.FLAVOR);
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            return str2;
        }
        if (m2467class == 1) {
            str = "RealmList<";
        } else if (m2467class == 2) {
            str = "RealmSet<";
        } else {
            if (m2467class != 3) {
                throw new Error(AbstractC17861e.Signature("An operation is not implemented: ", "Unsupported collection type: ".concat(AbstractC13501e.applovin(i))));
            }
            str = "RealmDictionary<";
        }
        return AbstractC5087e.m1746extends(str, str2, ">");
    }

    public static double remoteconfig(double d, double d2, double d3, boolean z) {
        C13797e c13797e = new C13797e(AbstractC5190e.adcel(d, d2, d3));
        double d4 = d3;
        while (true) {
            double d5 = c13797e.metrica;
            if (d5 >= d2 || 0.0d > d3 || d3 > 100.0d) {
                break;
            }
            d3 += z ? -1.0d : 1.0d;
            C13797e c13797e2 = new C13797e(AbstractC5190e.adcel(d, d2, d3));
            if (d5 < c13797e2.metrica) {
                d4 = d3;
                c13797e = c13797e2;
            }
        }
        return d4;
    }

    public static ArrayList signatures(C1649e c1649e, String str, C13506e c13506e) {
        ArrayList yandex = AbstractC18491e.yandex(str, c1649e, new C2007e(25, c13506e));
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(yandex, 10));
        Iterator it = yandex.iterator();
        while (it.hasNext()) {
            arrayList.add(((C12686e) it.next()).f25426e);
        }
        return arrayList;
    }

    public static final double smaato(C13797e c13797e, int i) {
        double inmobi = inmobi(c13797e);
        int i2 = 28;
        if (i != 1 && (inmobi < 250.0d || inmobi >= 270.0d)) {
            i2 = 20;
        }
        return i2;
    }

    public static final C7109e startapp(double d) {
        return d == 1.5d ? new C7109e(1.5d, 1.5d, 3.0d, 5.5d) : d == 3.0d ? new C7109e(3.0d, 3.0d, 4.5d, 7.0d) : d == 4.5d ? new C7109e(4.5d, 4.5d, 7.0d, 11.0d) : d == 6.0d ? new C7109e(6.0d, 6.0d, 7.0d, 11.0d) : d == 7.0d ? new C7109e(7.0d, 7.0d, 11.0d, 21.0d) : d == 9.0d ? new C7109e(9.0d, 9.0d, 11.0d, 21.0d) : d == 11.0d ? new C7109e(11.0d, 11.0d, 21.0d, 21.0d) : d == 21.0d ? new C7109e(21.0d, 21.0d, 21.0d, 21.0d) : new C7109e(d, d, 7.0d, 21.0d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a8, code lost:
    
        if (defpackage.AbstractC7890e.billing(defpackage.AbstractC4224e.adcel(defpackage.AbstractC3820e.ad.vip(r31.getClass())), r10) == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0125  */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void subscription(final defpackage.C13655e r29, java.lang.String r30, final java.lang.Object r31, final int r32, final java.util.Map r33) {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12575e.subscription(eْۧ۠, java.lang.String, java.lang.Object, int, java.util.Map):void");
    }

    public static double tapsense(C13797e c13797e) {
        return AbstractC11008e.ad(c13797e, new double[]{0.0d, 71.0d, 124.0d, 253.0d, 278.0d, 300.0d, 360.0d}, new double[]{10.0d, 0.0d, 10.0d, 0.0d, 10.0d, 0.0d});
    }

    @Override // defpackage.InterfaceC17847e
    public void accept(Object obj, Object obj2) {
        ((C8988e) obj2).vip(Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC11871e
    public byte[] ad(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // defpackage.InterfaceC4317e
    public float advert(float f, float f2) {
        return 0.0f;
    }

    public realm_value_t applovin(byte[] bArr) {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.billing(bArr == null ? 0 : 9);
        if (bArr != null) {
            realm_object_id_t realm_object_id_tVar = new realm_object_id_t(realmcJNI.new_realm_object_id_t(), true);
            short[] sArr = new short[12];
            C15926e admob = AbstractC3062e.admob(0, 12);
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(admob, 10));
            Iterator it = admob.iterator();
            while (it.hasNext()) {
                sArr[((C3296e) it).nextInt()] = bArr[r4];
                arrayList.add(Unit.INSTANCE);
            }
            realmcJNI.realm_object_id_t_bytes_set(realm_object_id_tVar.ad, realm_object_id_tVar, sArr);
            realmcJNI.realm_value_t_object_id_set(realm_value_tVar.ad, realm_value_tVar, realm_object_id_tVar.ad, realm_object_id_tVar);
        }
        return realm_value_tVar;
    }

    @Override // defpackage.InterfaceC8292e
    public Object appmetrica(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }

    @Override // defpackage.InterfaceC4317e
    public float billing(float f, float f2, long j) {
        return 0.0f;
    }

    /* renamed from: interface, reason: not valid java name */
    public realm_value_t m3368interface(byte[] bArr) {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.billing(bArr == null ? 0 : 11);
        if (bArr != null) {
            realm_uuid_t realm_uuid_tVar = new realm_uuid_t(realmcJNI.new_realm_uuid_t(), true);
            short[] sArr = new short[16];
            C15926e admob = AbstractC3062e.admob(0, 16);
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(admob, 10));
            Iterator it = admob.iterator();
            while (it.hasNext()) {
                sArr[((C3296e) it).nextInt()] = bArr[r4];
                arrayList.add(Unit.INSTANCE);
            }
            realmcJNI.realm_uuid_t_bytes_set(realm_uuid_tVar.ad, realm_uuid_tVar, sArr);
            realmcJNI.realm_value_t_uuid_set(realm_value_tVar.ad, realm_value_tVar, realm_uuid_tVar.ad, realm_uuid_tVar);
        }
        return realm_value_tVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:3|(13:5|6|7|(1:(1:(5:11|12|13|(1:15)|16)(2:18|19))(3:20|21|22))(3:32|33|(2:35|36)(1:37))|23|24|25|26|(1:28)|12|13|(0)|16))|40|6|7|(0)(0)|23|24|25|26|(0)|12|13|(0)|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x003c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010b, code lost:
    
        r0 = new defpackage.C12763e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable isPro(defpackage.Csuper r22, defpackage.C18479e r23, defpackage.AbstractC10731e r24) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12575e.isPro(super, eۤۤ, eُؑ۠):java.io.Serializable");
    }

    @Override // defpackage.InterfaceC1589e
    public boolean license(Object obj, Object obj2) {
        return AbstractC7890e.billing(obj, obj2);
    }

    @Override // defpackage.InterfaceC17935e
    public void lock() {
    }

    @Override // defpackage.InterfaceC4317e
    public float metrica() {
        return 0.0f;
    }

    @Override // defpackage.InterfaceC4317e
    public long mopub(float f) {
        return 0L;
    }

    @Override // defpackage.InterfaceC4317e
    public float purchase(float f, long j) {
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object subs(java.lang.String r11, defpackage.AbstractC10731e r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.C16190e
            if (r0 == 0) goto L13
            r0 = r12
            eٖٓۖ r0 = (defpackage.C16190e) r0
            int r1 = r0.f31807e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31807e = r1
            goto L18
        L13:
            eٖٓۖ r0 = new eٖٓۖ
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f31810e
            int r1 = r0.f31807e
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            java.lang.String r11 = r0.f31806e
            java.lang.String r0 = r0.f31808e
            defpackage.AbstractC2003e.purchase(r12)
            goto L60
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            defpackage.AbstractC2003e.purchase(r12)
            eًۚ r12 = defpackage.C18353e.ad
            r12.metrica()
            int r12 = r11.length()
            if (r12 != 0) goto L45
            eٟٜؔ r11 = new eٟٜؔ
            r11.<init>()
            return r11
        L45:
            java.util.Locale r12 = java.util.Locale.ROOT
            java.lang.String r12 = r11.toLowerCase(r12)
            r0.f31808e = r11
            r0.f31806e = r12
            r0.f31807e = r2
            eۣۡ r1 = defpackage.C18353e.vip
            java.lang.Object r0 = r1.m4501e(r0)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r0 != r1) goto L5c
            return r1
        L5c:
            r9 = r0
            r0 = r11
            r11 = r12
            r12 = r9
        L60:
            eّؖٚ r12 = (defpackage.C4199e) r12
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r3 = 0
            r1[r3] = r11
            eؙّؔ r4 = defpackage.AbstractC3820e.ad
            java.lang.Class<ua.itaysonlab.vkxreborn.cache.realm.CachedTrack> r5 = ua.itaysonlab.vkxreborn.cache.realm.CachedTrack.class
            eؚ٘ٚ r6 = r4.vip(r5)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r7 = "localizedSearchTitle CONTAINS $0"
            eٓٛۘ r1 = r12.m1506e(r6, r7, r1)
            eؙؓٔ r1 = r1.metrica()
            eْؗۡ r6 = defpackage.C4858e.f10322e
            java.util.ArrayList r1 = signatures(r1, r0, r6)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r3] = r11
            eؚ٘ٚ r5 = r4.vip(r5)
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r2)
            java.lang.String r8 = "localizedSearchArtist CONTAINS $0"
            eٓٛۘ r5 = r12.m1506e(r5, r8, r6)
            eؙؓٔ r5 = r5.metrica()
            eؖۢؖ r6 = defpackage.C4444e.f9647e
            java.util.ArrayList r5 = signatures(r5, r0, r6)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r3] = r11
            java.lang.Class<ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist> r11 = ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist.class
            eؚ٘ٚ r11 = r4.vip(r11)
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r6, r2)
            eٓٛۘ r11 = r12.m1506e(r11, r7, r2)
            eؙؓٔ r11 = r11.metrica()
            eْؔؖ r12 = defpackage.C2378e.f6090e
            java.util.ArrayList r11 = signatures(r11, r0, r12)
            eٟٜؔ r12 = new eٟٜؔ
            eُٛۜ r0 = defpackage.AbstractC8228e.license(r1)
            eُٛۜ r1 = defpackage.AbstractC8228e.license(r5)
            eُٛۜ r11 = defpackage.AbstractC8228e.license(r11)
            r12.<init>(r0, r1, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12575e.subs(java.lang.String, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    @Override // defpackage.InterfaceC11962e
    /* renamed from: this */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo600this(defpackage.AbstractC16824e r11, defpackage.AbstractC10731e r12) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12575e.mo600this(eؘٗٙ, eُؑ۠):java.lang.Object");
    }

    public String toString() {
        switch (this.f25240e) {
            case 10:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC17935e
    public void unlock() {
    }

    @Override // defpackage.InterfaceC16921e
    public void vip(C2892e c2892e, C13770e c13770e, int i) {
        c13770e.m3671package(-2101003086);
        int i2 = (c13770e.purchase(this) ? 32 : 16) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            c2892e.invoke(c13770e, 6);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6949e(this, c2892e, i, 20);
        }
    }

    @Override // defpackage.InterfaceC16759e
    public long yandex(C4395e c4395e, int i) {
        return c4395e.purchase.advert(i);
    }
}
