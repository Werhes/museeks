package defpackage;

import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۛؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC13501e {
    public static void Signature(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static Long ad(realm_value_t realm_value_tVar) {
        if (realmcJNI.realm_value_t_type_get(realm_value_tVar.ad, realm_value_tVar) == 0) {
            return null;
        }
        return Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.ad, realm_value_tVar));
    }

    public static StringBuilder adcel(String str, String str2, String str3, StringBuilder sb, ConfigurableProvider configurableProvider) {
        sb.append(str);
        sb.append(str2);
        configurableProvider.addAlgorithm(str3, sb.toString());
        return new StringBuilder();
    }

    public static void admob(HashMap hashMap, String str, Integer num, int i, String str2) {
        hashMap.put(str, num);
        hashMap.put(str2, Integer.valueOf(i));
    }

    public static /* synthetic */ String ads(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "COLLAPSED" : "NOT_CROSSED" : "CROSSED";
    }

    public static void advert(int i, String str, HashMap hashMap, String str2) {
        hashMap.put(str2, new C14983e(i, str));
    }

    public static void amazon(String str, String str2, String str3, StringBuilder sb, ConfigurableProvider configurableProvider) {
        sb.append(str);
        sb.append(str2);
        configurableProvider.addAlgorithm(str3, sb.toString());
    }

    public static /* synthetic */ String applovin(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RLM_COLLECTION_TYPE_DICTIONARY" : "RLM_COLLECTION_TYPE_SET" : "RLM_COLLECTION_TYPE_LIST" : "RLM_COLLECTION_TYPE_NONE";
    }

    public static InterfaceC11206e billing(C7646e c7646e, C5084e c5084e, int i) {
        return C6554e.ad(new Csuper(c7646e, c5084e, i, 7));
    }

    public static void inmobi(C6730e c6730e) {
        c6730e.getClass();
        c6730e.ad.premium(new C15965e(new C17433e()));
    }

    public static void isVip(C6730e c6730e) {
        c6730e.getClass();
        c6730e.ad.premium(new C15965e(new C3570e()));
    }

    public static /* synthetic */ int license(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        throw null;
    }

    public static void loadAd(StringBuilder sb, Ctry ctry, ConfigurableProvider configurableProvider, String str) {
        sb.append(ctry);
        configurableProvider.addAlgorithm(sb.toString(), str);
    }

    public static /* synthetic */ int metrica(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i2;
    }

    public static void mopub(int i, C13770e c13770e, C14865e c14865e, C13770e c13770e2, C5430e c5430e) {
        AbstractC2270e.yandex(c13770e, Integer.valueOf(i), c14865e);
        AbstractC2270e.purchase(c13770e2, c5430e);
    }

    public static /* synthetic */ String premium(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NETWORK" : "DISK" : "MEMORY" : "MEMORY_CACHE";
    }

    public static void pro(C4069e c4069e, InterfaceC12330e interfaceC12330e, InterfaceC12330e interfaceC12330e2, C14326e c14326e) {
        if (!Objects.equals(c14326e, InterfaceC13842e.f27423native)) {
            c4069e.billing(c14326e, interfaceC12330e2.mo810catch(c14326e), interfaceC12330e2.subscription(c14326e));
            return;
        }
        C8070e c8070e = (C8070e) interfaceC12330e2.smaato(c14326e, null);
        C8070e c8070e2 = (C8070e) interfaceC12330e.smaato(c14326e, null);
        EnumC13734e mo810catch = interfaceC12330e2.mo810catch(c14326e);
        if (c8070e == null) {
            c8070e = c8070e2;
        } else if (c8070e2 != null) {
            C6029e subscription = C6029e.subscription(c8070e2);
            C5401e c5401e = c8070e.ad;
            if (c5401e != null) {
                subscription.f12699e = c5401e;
            }
            C10492e c10492e = c8070e.vip;
            if (c10492e != null) {
                subscription.f12698e = c10492e;
            }
            C17687e c17687e = c8070e.metrica;
            if (c17687e != null) {
                subscription.f12700e = c17687e;
            }
            c8070e = new C8070e((C5401e) subscription.f12699e, (C10492e) subscription.f12698e, (C17687e) subscription.f12700e);
        }
        c4069e.billing(c14326e, mo810catch, c8070e);
    }

    public static int purchase(C13283e c13283e, int i, int i2) {
        return (c13283e.ad + i) * i2;
    }

    public static C17015e remoteconfig(InterfaceC12330e interfaceC12330e, InterfaceC12330e interfaceC12330e2) {
        if (interfaceC12330e == null && interfaceC12330e2 == null) {
            return C17015e.f33328e;
        }
        C4069e purchase = interfaceC12330e2 != null ? C4069e.purchase(interfaceC12330e2) : C4069e.license();
        if (interfaceC12330e != null) {
            Iterator it = interfaceC12330e.admob().iterator();
            while (it.hasNext()) {
                pro(purchase, interfaceC12330e2, interfaceC12330e, (C14326e) it.next());
            }
        }
        return C17015e.vip(purchase);
    }

    public static /* synthetic */ String signatures(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static void smaato(int i, HashMap hashMap, String str, int i2, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
    }

    public static Object startapp(C13770e c13770e, int i, boolean z, C13119e c13119e) {
        c13770e.m3676strictfp(i);
        c13770e.Signature(z);
        return c13119e.metrica();
    }

    public static void subscription(ConfigurableProvider configurableProvider, String str, String str2, String str3, Ctry ctry) {
        configurableProvider.addAlgorithm(str3, ctry, str + str2);
    }

    public static void tapsense(C6730e c6730e) {
        c6730e.getClass();
        c6730e.ad.premium(new C12433e(new C15965e(new C2248e())));
    }

    public static long vip(InterfaceC15967e interfaceC15967e) {
        byte[] bArr = (byte[]) ((C4660e) interfaceC15967e).vip.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    public static InterfaceC11206e yandex(C17338e c17338e, int i) {
        return C6554e.ad(new C13572e(c17338e, i, 3));
    }
}
