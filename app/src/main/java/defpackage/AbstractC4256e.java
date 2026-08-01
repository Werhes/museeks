package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؖٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4256e {
    public static final C12916e ad;
    public static C11467e metrica;
    public static final C12916e vip;

    static {
        Boolean bool = Boolean.FALSE;
        int i = 12;
        ad = new C12916e(i, bool);
        vip = new C12916e(i, bool);
    }

    public static float ad(int i) {
        Set set = C14731e.f29144e;
        return i == 2 ? 900 : i == 1 ? 480 : 0;
    }

    public static C11467e license() {
        C11467e c11467e;
        C11467e c11467e2 = metrica;
        if (c11467e2 != null) {
            return c11467e2;
        }
        Object obj = null;
        try {
            c11467e = new C11467e(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            c11467e = new C11467e(obj, obj, obj, obj);
        }
        metrica = c11467e;
        return c11467e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        if (r1 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String metrica() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1b
            java.lang.Object r0 = defpackage.AbstractC12346e.metrica()
            if (r0 == 0) goto L20
            android.os.LocaleList r0 = defpackage.AbstractC2656e.ad(r0)
            eؙُٙ r1 = new eؙُٙ
            eًؗؔ r2 = new eًؗؔ
            r2.<init>(r0)
            r1.<init>(r2)
            goto L22
        L1b:
            eؙُٙ r1 = defpackage.AbstractC12346e.f24755e
            if (r1 == 0) goto L20
            goto L22
        L20:
            eؙُٙ r1 = defpackage.C6473e.vip
        L22:
            eٔٓٗ r0 = r1.ad
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2d
            java.lang.String r0 = ""
            return r0
        L2d:
            eٔٓٗ r0 = r1.ad
            java.lang.String r0 = r0.ad()
            java.lang.String r1 = ","
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 6
            java.util.List r0 = defpackage.AbstractC5304e.m1869private(r0, r1, r2)
            java.lang.Object r0 = defpackage.AbstractC13480e.m3591interface(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "-"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.util.List r0 = defpackage.AbstractC5304e.m1869private(r0, r1, r2)
            java.lang.Object r0 = defpackage.AbstractC13480e.m3591interface(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4256e.metrica():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e1, code lost:
    
        if (r2 != defpackage.EnumC5730e.MULTIFILE_CLASS_PART) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e5, code lost:
    
        if (r0.f10183e != null) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARN: Type inference failed for: r0v0, types: [eٌؗۖ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C6798e vip(java.lang.Class r14) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4256e.vip(java.lang.Class):eؙۧ");
    }
}
