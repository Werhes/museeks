package defpackage;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۦۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5291e {
    public static final C5291e metrica = new C5291e(100);
    public final EnumMap ad;
    public final int vip;

    public C5291e(int i) {
        EnumMap enumMap = new EnumMap(EnumC9102e.class);
        this.ad = enumMap;
        EnumC9102e enumC9102e = EnumC9102e.AD_STORAGE;
        EnumC18450e enumC18450e = EnumC18450e.UNINITIALIZED;
        enumMap.put((EnumMap) enumC9102e, (EnumC9102e) enumC18450e);
        enumMap.put((EnumMap) EnumC9102e.ANALYTICS_STORAGE, (EnumC9102e) enumC18450e);
        this.vip = i;
    }

    public C5291e(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(EnumC9102e.class);
        this.ad = enumMap2;
        enumMap2.putAll(enumMap);
        this.vip = i;
    }

    public static String ad(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static boolean advert(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public static EnumC18450e appmetrica(char c) {
        return c != '+' ? c != '0' ? c != '1' ? EnumC18450e.UNINITIALIZED : EnumC18450e.GRANTED : EnumC18450e.DENIED : EnumC18450e.POLICY;
    }

    public static EnumC18450e license(String str) {
        EnumC18450e enumC18450e = EnumC18450e.UNINITIALIZED;
        return str == null ? enumC18450e : str.equals("granted") ? EnumC18450e.GRANTED : str.equals("denied") ? EnumC18450e.DENIED : enumC18450e;
    }

    public static C5291e metrica(int i, String str) {
        EnumMap enumMap = new EnumMap(EnumC9102e.class);
        EnumC9102e[] enumC9102eArr = EnumC7033e.STORAGE.f14395e;
        for (int i2 = 0; i2 < enumC9102eArr.length; i2++) {
            String str2 = str == null ? BuildConfig.FLAVOR : str;
            EnumC9102e enumC9102e = enumC9102eArr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put((EnumMap) enumC9102e, (EnumC9102e) appmetrica(str2.charAt(i3)));
            } else {
                enumMap.put((EnumMap) enumC9102e, (EnumC9102e) EnumC18450e.UNINITIALIZED);
            }
        }
        return new C5291e(enumMap, i);
    }

    public static C5291e vip(int i, Bundle bundle) {
        if (bundle == null) {
            return new C5291e(i);
        }
        EnumMap enumMap = new EnumMap(EnumC9102e.class);
        for (EnumC9102e enumC9102e : EnumC7033e.STORAGE.f14395e) {
            enumMap.put((EnumMap) enumC9102e, (EnumC9102e) license(bundle.getString(enumC9102e.f18238e)));
        }
        return new C5291e(enumMap, i);
    }

    public static char yandex(EnumC18450e enumC18450e) {
        if (enumC18450e == null) {
            return '-';
        }
        int ordinal = enumC18450e.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C5291e adcel(defpackage.C5291e r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<eٌۤۧ> r1 = defpackage.EnumC9102e.class
            r0.<init>(r1)
            eٌؚۦ r1 = defpackage.EnumC7033e.STORAGE
            eٌۤۧ[] r1 = r1.f14395e
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L48
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.ad
            java.lang.Object r5 = r5.get(r4)
            eًۣ r5 = (defpackage.EnumC18450e) r5
            java.util.EnumMap r6 = r9.ad
            java.lang.Object r6 = r6.get(r4)
            eًۣ r6 = (defpackage.EnumC18450e) r6
            if (r5 != 0) goto L24
            goto L31
        L24:
            if (r6 == 0) goto L40
            eًۣ r7 = defpackage.EnumC18450e.UNINITIALIZED
            if (r5 != r7) goto L2b
            goto L31
        L2b:
            if (r6 == r7) goto L40
            eًۣ r7 = defpackage.EnumC18450e.POLICY
            if (r5 != r7) goto L33
        L31:
            r5 = r6
            goto L40
        L33:
            if (r6 == r7) goto L40
            eًۣ r7 = defpackage.EnumC18450e.DENIED
            if (r5 == r7) goto L3f
            if (r6 != r7) goto L3c
            goto L3f
        L3c:
            eًۣ r5 = defpackage.EnumC18450e.GRANTED
            goto L40
        L3f:
            r5 = r7
        L40:
            if (r5 == 0) goto L45
            r0.put(r4, r5)
        L45:
            int r3 = r3 + 1
            goto Ld
        L48:
            eؗۦۢ r9 = new eؗۦۢ
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5291e.adcel(eؗۦۢ):eؗۦۢ");
    }

    public final String billing() {
        StringBuilder sb = new StringBuilder("G1");
        for (EnumC9102e enumC9102e : EnumC7033e.STORAGE.f14395e) {
            sb.append(yandex((EnumC18450e) this.ad.get(enumC9102e)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5291e)) {
            return false;
        }
        C5291e c5291e = (C5291e) obj;
        for (EnumC9102e enumC9102e : EnumC7033e.STORAGE.f14395e) {
            if (this.ad.get(enumC9102e) != c5291e.ad.get(enumC9102e)) {
                return false;
            }
        }
        return this.vip == c5291e.vip;
    }

    public final int hashCode() {
        Iterator it = this.ad.values().iterator();
        int i = this.vip * 17;
        while (it.hasNext()) {
            i = (i * 31) + ((EnumC18450e) it.next()).hashCode();
        }
        return i;
    }

    public final C5291e mopub(C5291e c5291e) {
        EnumMap enumMap = new EnumMap(EnumC9102e.class);
        for (EnumC9102e enumC9102e : EnumC7033e.STORAGE.f14395e) {
            EnumC18450e enumC18450e = (EnumC18450e) this.ad.get(enumC9102e);
            if (enumC18450e == EnumC18450e.UNINITIALIZED) {
                enumC18450e = (EnumC18450e) c5291e.ad.get(enumC9102e);
            }
            if (enumC18450e != null) {
                enumMap.put((EnumMap) enumC9102e, (EnumC9102e) enumC18450e);
            }
        }
        return new C5291e(enumMap, this.vip);
    }

    public final String purchase() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (EnumC9102e enumC9102e : EnumC7033e.STORAGE.f14395e) {
            EnumC18450e enumC18450e = (EnumC18450e) this.ad.get(enumC9102e);
            char c = '-';
            if (enumC18450e != null && (ordinal = enumC18450e.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c = '1';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final boolean startapp(EnumC9102e enumC9102e) {
        return ((EnumC18450e) this.ad.get(enumC9102e)) != EnumC18450e.DENIED;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(ad(this.vip));
        for (EnumC9102e enumC9102e : EnumC7033e.STORAGE.f14395e) {
            sb.append(",");
            sb.append(enumC9102e.f18238e);
            sb.append("=");
            EnumC18450e enumC18450e = (EnumC18450e) this.ad.get(enumC9102e);
            if (enumC18450e == null) {
                enumC18450e = EnumC18450e.UNINITIALIZED;
            }
            sb.append(enumC18450e);
        }
        return sb.toString();
    }
}
