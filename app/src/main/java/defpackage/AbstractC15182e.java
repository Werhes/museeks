package defpackage;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؒۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15182e {
    public static final Object ad = new Object();

    public static final LinkedHashMap ad(ArrayList arrayList) {
        String str = C10675e.f21023e;
        C10675e license = C10215e.license("/", false);
        LinkedHashMap billing = AbstractC10064e.billing(new C6571e(license, new C12243e(license, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (C12243e c12243e : AbstractC13480e.m3577else(arrayList, new C11797e(26))) {
            if (((C12243e) billing.put(c12243e.ad, c12243e)) == null) {
                while (true) {
                    C10675e c10675e = c12243e.ad;
                    C10675e metrica = c10675e.metrica();
                    if (metrica != null) {
                        C12243e c12243e2 = (C12243e) billing.get(metrica);
                        if (c12243e2 != null) {
                            c12243e2.admob.add(c10675e);
                            break;
                        }
                        C12243e c12243e3 = new C12243e(metrica, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        billing.put(metrica, c12243e3);
                        c12243e3.admob.add(c10675e);
                        c12243e = c12243e3;
                    }
                }
            }
        }
        return billing;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [eّؖٝ, java.lang.Object] */
    public static final C12243e adcel(C13197e c13197e, C12243e c12243e) {
        int mo1684finally = c13197e.mo1684finally();
        if (mo1684finally != 67324752) {
            throw new IOException("bad zip: expected " + appmetrica(67324752) + " but was " + appmetrica(mo1684finally));
        }
        c13197e.skip(2L);
        short mo1681e = c13197e.mo1681e();
        int i = mo1681e & 65535;
        if ((mo1681e & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + appmetrica(i));
        }
        c13197e.skip(18L);
        int mo1681e2 = c13197e.mo1681e() & 65535;
        c13197e.skip(c13197e.mo1681e() & 65535);
        if (c12243e == null) {
            c13197e.skip(mo1681e2);
            return null;
        }
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        startapp(c13197e, mo1681e2, new C15158e(c13197e, (Object) obj, (Object) obj2, (Object) obj3, 1));
        return new C12243e(c12243e.ad, c12243e.vip, c12243e.metrica, c12243e.license, c12243e.appmetrica, c12243e.purchase, c12243e.billing, c12243e.yandex, c12243e.startapp, c12243e.adcel, c12243e.mopub, c12243e.advert, c12243e.smaato, (Integer) obj.f9318e, (Integer) obj2.f9318e, (Integer) obj3.f9318e);
    }

    public static final String appmetrica(int i) {
        AbstractC15211e.ad(16);
        return "0x".concat(Integer.toString(i, 16));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0193, code lost:
    
        r18 = r18 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x019f, code lost:
    
        throw new java.io.IOException("bad zip: local file header offset >= central directory offset");
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01a0, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01b4, code lost:
    
        if (r7 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01b6, code lost:
    
        r4 = new defpackage.C5518e(r26, r27, ad(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01bf, code lost:
    
        r3.close();
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01c4, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01c5, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01a6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01a7, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0190, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01a9, code lost:
    
        r5.close();
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01b3, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01af, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01b0, code lost:
    
        defpackage.AbstractC13362e.license(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01ce, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        r0 = r10.mo1681e() & 65535;
        r9 = r10.mo1681e() & 65535;
        r14 = r10.mo1681e() & 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r14 != (r10.mo1681e() & 65535)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r0 != 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r9 != 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r10.skip(4);
        r13 = r10.mo1681e() & 65535;
        r12 = new defpackage.C18506e(r13, r14, r10.mo1684finally() & 4294967295L);
        r10.pro(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        r10.close();
        r4 = r4 - 20;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        if (r4 <= r18) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        r5 = new defpackage.C13197e(r3.license(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        if (r5.mo1684finally() != 117853008) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        r4 = r5.mo1684finally();
        r8 = r5.mo1679e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        if (r5.mo1684finally() != 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:
    
        if (r4 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        r6 = new defpackage.C13197e(r3.license(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        r4 = r6.mo1684finally();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        if (r4 != 101075792) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
    
        r6.skip(12);
        r4 = r6.mo1684finally();
        r8 = r6.mo1684finally();
        r22 = r6.mo1679e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
    
        if (r22 != r6.mo1679e()) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        if (r4 != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d5, code lost:
    
        if (r8 != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d7, code lost:
    
        r6.skip(8);
        r20 = new defpackage.C18506e(r13, r22, r6.mo1679e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e7, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ec, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0136, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ee, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f3, code lost:
    
        r4 = r0;
        r12 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0128, code lost:
    
        r6.close();
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0132, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012f, code lost:
    
        defpackage.AbstractC13362e.license(r4, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fc, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0125, code lost:
    
        throw new java.io.IOException("bad zip: expected " + appmetrica(101075792) + " but was " + appmetrica(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0126, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fd, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013f, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0140, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0145, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0154, code lost:
    
        if (r0 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0157, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0147, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0137, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0149, code lost:
    
        r5.close();
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0153, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0150, code lost:
    
        defpackage.AbstractC13362e.license(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015c, code lost:
    
        r4 = new java.util.ArrayList();
        r5 = new defpackage.C13197e(r3.license(r12.vip));
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x016c, code lost:
    
        r8 = r12.ad;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0172, code lost:
    
        r0 = yandex(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x017c, code lost:
    
        if (r0.yandex < r12.vip) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018a, code lost:
    
        if (((java.lang.Boolean) r28.invoke(r0)).booleanValue() != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018c, code lost:
    
        r4.add(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0136 A[Catch: all -> 0x0137, TryCatch #12 {all -> 0x0137, blocks: (B:30:0x008e, B:32:0x0097, B:35:0x00a8, B:52:0x0136, B:63:0x012f, B:70:0x013a, B:71:0x013f, B:72:0x0140, B:59:0x0128), top: B:29:0x008e, outer: #13, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0157 A[Catch: all -> 0x0158, TryCatch #13 {all -> 0x0158, blocks: (B:3:0x000a, B:5:0x0018, B:6:0x0021, B:26:0x0079, B:28:0x0085, B:78:0x0157, B:88:0x0150, B:89:0x015c, B:110:0x01b6, B:116:0x01c5, B:127:0x01b0, B:11:0x01d3, B:15:0x01e1, B:16:0x01e8, B:132:0x01e9, B:133:0x01ec, B:134:0x01ed, B:135:0x0202, B:8:0x002a, B:19:0x0033, B:25:0x005a, B:129:0x01c9, B:130:0x01ce, B:123:0x01a9, B:84:0x0149, B:91:0x016c, B:94:0x0172, B:96:0x017e, B:98:0x018c, B:100:0x0193, B:103:0x0198, B:104:0x019f, B:106:0x01a0, B:30:0x008e, B:32:0x0097, B:35:0x00a8, B:52:0x0136, B:63:0x012f, B:70:0x013a, B:71:0x013f, B:72:0x0140, B:59:0x0128), top: B:2:0x000a, inners: #3, #8, #9, #10, #12 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.C5518e billing(defpackage.C10675e r26, defpackage.AbstractC11062e r27, kotlin.jvm.functions.Function1 r28) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC15182e.billing(eَۦۦ, eُ٘ٛ, kotlin.jvm.functions.Function1):eٌؘؗ");
    }

    public static final AbstractC9510e license(String str, boolean z) {
        if (!z) {
            return AbstractC9510e.ad;
        }
        if (str != null && str.length() == 0) {
            return new C2545e(0.2d, 1, 2);
        }
        return AbstractC9510e.metrica;
    }

    public static final AbstractC9510e metrica(int i, String str, String str2, String str3, List list, boolean z) {
        String applovin;
        if (i >= list.size()) {
            return license(null, z);
        }
        String str4 = (String) list.get(i);
        if (str4.length() == 0) {
            return license(str4, z);
        }
        if (str2 == null) {
            applovin = str4;
        } else {
            if (!AbstractC6507e.pro(str4, str2, false)) {
                return license(str4, z);
            }
            applovin = AbstractC5304e.applovin(str2.length(), str4);
        }
        if (str3 != null) {
            if (!AbstractC6507e.amazon(applovin, str3, false)) {
                return license(str4, z);
            }
            applovin = AbstractC5304e.ads(str3.length(), applovin);
        }
        return new C2545e(((str2 == null || str2.length() == 0) && (str3 == null || str3.length() == 0)) ? 0.8d : 0.9d, new C8976e(str, Collections.singletonList(applovin)), 1);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, eؕٛؓ] */
    public static final boolean purchase(InterfaceC15954e interfaceC15954e) {
        AccessibleObject accessibleObject;
        InterfaceC9739e vip;
        InterfaceC9739e billing;
        AbstractC5148e abstractC5148e;
        AbstractC5148e abstractC5148e2;
        AbstractC5148e abstractC5148e3;
        AbstractC5148e abstractC5148e4;
        if (interfaceC15954e instanceof InterfaceC3996e) {
            InterfaceC8614e interfaceC8614e = (InterfaceC8614e) interfaceC15954e;
            C12816e c12816e = AbstractC5965e.ad;
            if (interfaceC8614e instanceof AbstractC5148e) {
                abstractC5148e4 = (AbstractC5148e) interfaceC8614e;
            } else {
                if (interfaceC8614e instanceof AbstractC0769e) {
                    InterfaceC15954e adcel = ((AbstractC0769e) interfaceC8614e).adcel();
                    if (adcel instanceof AbstractC5148e) {
                        abstractC5148e4 = (AbstractC5148e) adcel;
                    }
                }
                abstractC5148e4 = null;
            }
            accessibleObject = abstractC5148e4 != null ? (Field) abstractC5148e4.f11032e.getValue() : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            Method license = AbstractC4306e.license(interfaceC8614e.metrica());
            if (!(license != null ? license.isAccessible() : true)) {
                return false;
            }
            Method license2 = AbstractC4306e.license(((InterfaceC3996e) interfaceC15954e).appmetrica());
            if (!(license2 != null ? license2.isAccessible() : true)) {
                return false;
            }
        } else if (interfaceC15954e instanceof InterfaceC8614e) {
            InterfaceC8614e interfaceC8614e2 = (InterfaceC8614e) interfaceC15954e;
            C12816e c12816e2 = AbstractC5965e.ad;
            if (interfaceC8614e2 instanceof AbstractC5148e) {
                abstractC5148e3 = (AbstractC5148e) interfaceC8614e2;
            } else {
                if (interfaceC8614e2 instanceof AbstractC0769e) {
                    InterfaceC15954e adcel2 = ((AbstractC0769e) interfaceC8614e2).adcel();
                    if (adcel2 instanceof AbstractC5148e) {
                        abstractC5148e3 = (AbstractC5148e) adcel2;
                    }
                }
                abstractC5148e3 = null;
            }
            accessibleObject = abstractC5148e3 != null ? (Field) abstractC5148e3.f11032e.getValue() : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            Method license3 = AbstractC4306e.license(interfaceC8614e2.metrica());
            if (!(license3 != null ? license3.isAccessible() : true)) {
                return false;
            }
        } else if (interfaceC15954e instanceof InterfaceC0224e) {
            InterfaceC8614e adcel3 = ((InterfaceC0224e) interfaceC15954e).adcel();
            C12816e c12816e3 = AbstractC5965e.ad;
            if (AbstractC0869e.premium(adcel3)) {
                abstractC5148e2 = (AbstractC5148e) adcel3;
            } else {
                if (adcel3 instanceof AbstractC0769e) {
                    InterfaceC15954e adcel4 = ((AbstractC0769e) adcel3).adcel();
                    if (adcel4 instanceof AbstractC5148e) {
                        abstractC5148e2 = (AbstractC5148e) adcel4;
                    }
                }
                abstractC5148e2 = null;
            }
            accessibleObject = abstractC5148e2 != null ? (Field) abstractC5148e2.f11032e.getValue() : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            Method license4 = AbstractC4306e.license((InterfaceC5261e) interfaceC15954e);
            if (!(license4 != null ? license4.isAccessible() : true)) {
                return false;
            }
        } else if (interfaceC15954e instanceof InterfaceC4919e) {
            InterfaceC8614e adcel5 = ((InterfaceC4919e) interfaceC15954e).adcel();
            C12816e c12816e4 = AbstractC5965e.ad;
            if (AbstractC0869e.premium(adcel5)) {
                abstractC5148e = (AbstractC5148e) adcel5;
            } else {
                if (adcel5 instanceof AbstractC0769e) {
                    InterfaceC15954e adcel6 = ((AbstractC0769e) adcel5).adcel();
                    if (adcel6 instanceof AbstractC5148e) {
                        abstractC5148e = (AbstractC5148e) adcel6;
                    }
                }
                abstractC5148e = null;
            }
            accessibleObject = abstractC5148e != null ? (Field) abstractC5148e.f11032e.getValue() : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            Method license5 = AbstractC4306e.license((InterfaceC5261e) interfaceC15954e);
            if (!(license5 != null ? license5.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(interfaceC15954e instanceof InterfaceC5261e)) {
                throw new UnsupportedOperationException("Unknown callable: " + interfaceC15954e + " (" + interfaceC15954e.getClass() + ')');
            }
            InterfaceC5261e interfaceC5261e = (InterfaceC5261e) interfaceC15954e;
            Method license6 = AbstractC4306e.license(interfaceC5261e);
            if (!(license6 != null ? license6.isAccessible() : true)) {
                return false;
            }
            InterfaceC8826e ad2 = AbstractC5965e.ad(interfaceC15954e);
            Object vip2 = (ad2 == null || (billing = ad2.billing()) == null) ? null : billing.vip();
            AccessibleObject accessibleObject2 = vip2 instanceof AccessibleObject ? (AccessibleObject) vip2 : null;
            if (!(accessibleObject2 != null ? accessibleObject2.isAccessible() : true)) {
                return false;
            }
            InterfaceC8826e ad3 = AbstractC5965e.ad(interfaceC5261e);
            Member vip3 = (ad3 == null || (vip = ad3.vip()) == null) ? null : vip.vip();
            accessibleObject = vip3 instanceof Constructor ? (Constructor) vip3 : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static final void startapp(InterfaceC4895e interfaceC4895e, int i, Function2 function2) {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int mo1681e = interfaceC4895e.mo1681e() & 65535;
            long mo1681e2 = interfaceC4895e.mo1681e() & 65535;
            long j2 = j - 4;
            if (j2 < mo1681e2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            interfaceC4895e.admob(mo1681e2);
            long j3 = interfaceC4895e.metrica().f31731e;
            function2.invoke(Integer.valueOf(mo1681e), Long.valueOf(mo1681e2));
            long j4 = (interfaceC4895e.metrica().f31731e + mo1681e2) - j3;
            if (j4 < 0) {
                throw new IOException(AbstractC1786e.admob(mo1681e, "unsupported zip: too many bytes processed for "));
            }
            if (j4 > 0) {
                interfaceC4895e.metrica().skip(j4);
            }
            j = j2 - mo1681e2;
        }
    }

    public static C17611e vip(boolean z, C4590e c4590e, int i) {
        C10990e c10990e = C10990e.f21772e;
        if ((i & 4) != 0) {
            c4590e = C4590e.f9890e;
        }
        return new C17611e(z, true, c4590e, c10990e, C13520e.ad);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [eٍؚؔ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [eؚٓٞ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [eؚٓٞ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [eؚٓٞ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [eّؖٝ, java.lang.Object] */
    public static final C12243e yandex(final C13197e c13197e) {
        int mo1684finally = c13197e.mo1684finally();
        if (mo1684finally != 33639248) {
            throw new IOException("bad zip: expected " + appmetrica(33639248) + " but was " + appmetrica(mo1684finally));
        }
        c13197e.skip(4L);
        short mo1681e = c13197e.mo1681e();
        int i = mo1681e & 65535;
        if ((mo1681e & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + appmetrica(i));
        }
        int mo1681e2 = c13197e.mo1681e() & 65535;
        int mo1681e3 = c13197e.mo1681e() & 65535;
        int mo1681e4 = c13197e.mo1681e() & 65535;
        long mo1684finally2 = c13197e.mo1684finally() & 4294967295L;
        final ?? obj = new Object();
        obj.f14622e = c13197e.mo1684finally() & 4294967295L;
        final ?? obj2 = new Object();
        obj2.f14622e = c13197e.mo1684finally() & 4294967295L;
        int mo1681e5 = c13197e.mo1681e() & 65535;
        int mo1681e6 = c13197e.mo1681e() & 65535;
        int mo1681e7 = 65535 & c13197e.mo1681e();
        c13197e.skip(8L);
        final ?? obj3 = new Object();
        obj3.f14622e = c13197e.mo1684finally() & 4294967295L;
        String pro = c13197e.pro(mo1681e5);
        if (AbstractC5304e.isPro(pro, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        final long j = obj2.f14622e == 4294967295L ? 8 : 0L;
        if (obj.f14622e == 4294967295L) {
            j += 8;
        }
        if (obj3.f14622e == 4294967295L) {
            j += 8;
        }
        final ?? obj4 = new Object();
        final ?? obj5 = new Object();
        final ?? obj6 = new Object();
        final ?? obj7 = new Object();
        startapp(c13197e, mo1681e6, new Function2() { // from class: eُٕۗ
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj8, Object obj9) {
                int intValue = ((Integer) obj8).intValue();
                long longValue = ((Long) obj9).longValue();
                C13197e c13197e2 = c13197e;
                if (intValue == 1) {
                    C9302e c9302e = C9302e.this;
                    if (c9302e.f18534e) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    c9302e.f18534e = true;
                    if (longValue < j) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    C7142e c7142e = obj2;
                    long j2 = c7142e.f14622e;
                    if (j2 == 4294967295L) {
                        j2 = c13197e2.mo1679e();
                    }
                    c7142e.f14622e = j2;
                    C7142e c7142e2 = obj;
                    c7142e2.f14622e = c7142e2.f14622e == 4294967295L ? c13197e2.mo1679e() : 0L;
                    C7142e c7142e3 = obj3;
                    c7142e3.f14622e = c7142e3.f14622e == 4294967295L ? c13197e2.mo1679e() : 0L;
                } else if (intValue == 10) {
                    if (longValue < 4) {
                        throw new IOException("bad zip: NTFS extra too short");
                    }
                    c13197e2.skip(4L);
                    AbstractC15182e.startapp(c13197e2, (int) (longValue - 4), new C15158e(obj4, c13197e2, obj5, obj6, 2));
                }
                return Unit.INSTANCE;
            }
        });
        if (j > 0 && !obj7.f18534e) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String pro2 = c13197e.pro(mo1681e7);
        String str = C10675e.f21023e;
        return new C12243e(C10215e.license("/", false).appmetrica(pro), AbstractC6507e.amazon(pro, "/", false), pro2, mo1684finally2, obj.f14622e, obj2.f14622e, mo1681e2, obj3.f14622e, mo1681e4, mo1681e3, (Long) obj4.f9318e, (Long) obj5.f9318e, (Long) obj6.f9318e, 57344);
    }
}
