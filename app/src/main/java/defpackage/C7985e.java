package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٗۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7985e {
    public static final LinkedHashMap metrica;
    public final C12309e ad;
    public final ConcurrentHashMap vip = new ConcurrentHashMap();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC13937e enumC13937e : EnumC13937e.values()) {
            String str = enumC13937e.f27648e;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, enumC13937e);
            }
        }
        metrica = linkedHashMap;
    }

    public C7985e(C12309e c12309e) {
        this.ad = c12309e;
    }

    public static ArrayList ad(Object obj, boolean z) {
        Map advert = ((InterfaceC16566e) obj).advert();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : advert.entrySet()) {
            AbstractC13480e.inmobi(arrayList, (!z || AbstractC7890e.billing((C0520e) entry.getKey(), AbstractC15262e.vip)) ? startapp((AbstractC13656e) entry.getValue()) : C13664e.f27089e);
        }
        return arrayList;
    }

    public static boolean appmetrica(Object obj, C12816e c12816e) {
        Iterable license = license(obj);
        if ((license instanceof Collection) && ((Collection) license).isEmpty()) {
            return false;
        }
        Iterator it = license.iterator();
        while (it.hasNext()) {
            if (AbstractC7890e.billing(((InterfaceC16566e) it.next()).mopub(), c12816e)) {
                return true;
            }
        }
        return false;
    }

    public static Iterable license(Object obj) {
        InterfaceC2460e annotations;
        InterfaceC5052e license = AbstractC2876e.license((InterfaceC16566e) obj);
        return (license == null || (annotations = license.getAnnotations()) == null) ? C13664e.f27089e : annotations;
    }

    public static Object metrica(Object obj, C12816e c12816e) {
        for (Object obj2 : license(obj)) {
            if (AbstractC7890e.billing(((InterfaceC16566e) obj2).mopub(), c12816e)) {
                return obj2;
            }
        }
        return null;
    }

    public static List startapp(AbstractC13656e abstractC13656e) {
        if (!(abstractC13656e instanceof C16938e)) {
            return abstractC13656e instanceof C8259e ? Collections.singletonList(((C8259e) abstractC13656e).metrica.metrica()) : C13664e.f27089e;
        }
        Iterable iterable = (Iterable) ((C16938e) abstractC13656e).ad;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC13480e.inmobi(arrayList, startapp((AbstractC13656e) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016f  */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13, types: [eًؔۤ] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23, types: [int] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C11243e vip(defpackage.C7985e r22, defpackage.C11243e r23, defpackage.InterfaceC2460e r24) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7985e.vip(eًٗۥ, eُۚؓ, eٌؔٚ):eُۚؓ");
    }

    public final EnumC10949e billing(Object obj) {
        String str;
        ((InterfaceC16566e) obj).mopub();
        Object metrica2 = metrica(obj, AbstractC14348e.Signature);
        if (metrica2 == null || (str = (String) AbstractC13480e.m3587goto(ad(metrica2, false))) == null) {
            return null;
        }
        EnumC10949e enumC10949e = ((C17907e) this.ad.f24693e).vip;
        if (enumC10949e != null) {
            return enumC10949e;
        }
        int hashCode = str.hashCode();
        if (hashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return EnumC10949e.f21680e;
            }
            return null;
        }
        if (hashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return EnumC10949e.f21677e;
            }
            return null;
        }
        if (hashCode == 2656902 && str.equals("WARN")) {
            return EnumC10949e.f21678e;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (r9.equals("ALWAYS") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r9.equals("UNKNOWN") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r9.equals("NEVER") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (r9.equals("MAYBE") == false) goto L43;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x005c. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C16192e purchase(java.lang.Object r9, boolean r10) {
        /*
            r8 = this;
            r0 = r9
            eٖٜۡ r0 = (defpackage.InterfaceC16566e) r0
            eّۡۜ r0 = r0.mopub()
            r1 = 0
            if (r0 != 0) goto Lc
            goto L92
        Lc:
            eؘّۦ r2 = r8.ad
            java.lang.Object r2 = r2.f24695e
            eِٜ٘ r2 = (defpackage.C17877e) r2
            java.lang.Object r2 = r2.invoke(r0)
            eُِۗ r2 = (defpackage.EnumC10949e) r2
            r2.getClass()
            eُِۗ r3 = defpackage.EnumC10949e.f21680e
            if (r2 != r3) goto L20
            return r1
        L20:
            java.util.Set r3 = defpackage.AbstractC14348e.mopub
            boolean r3 = r3.contains(r0)
            r4 = 0
            eًؔۤ r5 = defpackage.EnumC7701e.f15626e
            if (r3 == 0) goto L2c
            goto L84
        L2c:
            java.util.Set r3 = defpackage.AbstractC14348e.advert
            boolean r3 = r3.contains(r0)
            eًؔۤ r6 = defpackage.EnumC7701e.f15627e
            if (r3 == 0) goto L38
        L36:
            r5 = r6
            goto L84
        L38:
            java.util.Set r3 = defpackage.AbstractC14348e.smaato
            boolean r3 = r3.contains(r0)
            eًؔۤ r7 = defpackage.EnumC7701e.f15629e
            if (r3 == 0) goto L44
        L42:
            r5 = r7
            goto L84
        L44:
            eّۡۜ r3 = defpackage.AbstractC14348e.billing
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L92
            java.util.ArrayList r9 = ad(r9, r4)
            java.lang.Object r9 = defpackage.AbstractC13480e.m3587goto(r9)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L84
            int r0 = r9.hashCode()
            switch(r0) {
                case 73135176: goto L7b;
                case 74175084: goto L72;
                case 433141802: goto L69;
                case 1933739535: goto L60;
                default: goto L5f;
            }
        L5f:
            goto L92
        L60:
            java.lang.String r0 = "ALWAYS"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L92
            goto L84
        L69:
            java.lang.String r0 = "UNKNOWN"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L42
            goto L92
        L72:
            java.lang.String r0 = "NEVER"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L36
            goto L92
        L7b:
            java.lang.String r0 = "MAYBE"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L36
            goto L92
        L84:
            eٖٓۘ r9 = new eٖٓۘ
            eُِۗ r0 = defpackage.EnumC10949e.f21678e
            if (r2 != r0) goto L8b
            goto L8d
        L8b:
            if (r10 == 0) goto L8e
        L8d:
            r4 = 1
        L8e:
            r9.<init>(r5, r4)
            return r9
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7985e.purchase(java.lang.Object, boolean):eٖٓۘ");
    }

    public final Object yandex(Object obj) {
        Object obj2;
        if (!((C17907e) this.ad.f24693e).metrica) {
            InterfaceC16566e interfaceC16566e = (InterfaceC16566e) obj;
            if (AbstractC13480e.ads(AbstractC14348e.adcel, interfaceC16566e.mopub()) || appmetrica(obj, AbstractC14348e.license)) {
                return obj;
            }
            if (appmetrica(obj, AbstractC14348e.appmetrica)) {
                InterfaceC5052e license = AbstractC2876e.license(interfaceC16566e);
                ConcurrentHashMap concurrentHashMap = this.vip;
                Object obj3 = concurrentHashMap.get(license);
                if (obj3 != null) {
                    return obj3;
                }
                Iterator it = license(obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = yandex(it.next());
                    if (obj2 != null) {
                        break;
                    }
                }
                if (obj2 != null) {
                    Object putIfAbsent = concurrentHashMap.putIfAbsent(license, obj2);
                    return putIfAbsent == null ? obj2 : putIfAbsent;
                }
            }
        }
        return null;
    }
}
