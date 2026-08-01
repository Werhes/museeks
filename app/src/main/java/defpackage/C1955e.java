package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؓۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1955e {
    public static final C1955e vip = new C1955e(AbstractC6874e.startapp(C7692e.metrica, C2597e.metrica, C0930e.metrica, C2770e.metrica));
    public final LinkedHashMap ad;

    public C1955e(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            C12816e c12816e = ((AbstractC13445e) obj).ad;
            Object obj2 = linkedHashMap.get(c12816e);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(c12816e, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.ad = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C15857e ad(defpackage.C12816e r9, java.lang.String r10) {
        /*
            r8 = this;
            java.util.LinkedHashMap r0 = r8.ad
            java.lang.Object r9 = r0.get(r9)
            java.util.List r9 = (java.util.List) r9
            r0 = 0
            if (r9 != 0) goto Lc
            goto L60
        Lc:
            java.util.Iterator r9 = r9.iterator()
        L10:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L60
            java.lang.Object r1 = r9.next()
            eْۗۛ r1 = (defpackage.AbstractC13445e) r1
            java.lang.String r2 = r1.vip
            r3 = 0
            boolean r2 = defpackage.AbstractC6507e.pro(r10, r2, r3)
            if (r2 == 0) goto L10
            java.lang.String r2 = r1.vip
            int r2 = r2.length()
            java.lang.String r2 = r10.substring(r2)
            int r4 = r2.length()
            if (r4 != 0) goto L37
        L35:
            r2 = r0
            goto L54
        L37:
            int r4 = r2.length()
            r5 = r3
        L3c:
            if (r3 >= r4) goto L50
            char r6 = r2.charAt(r3)
            int r6 = r6 + (-48)
            if (r6 < 0) goto L35
            r7 = 10
            if (r6 >= r7) goto L35
            int r5 = r5 * 10
            int r5 = r5 + r6
            int r3 = r3 + 1
            goto L3c
        L50:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
        L54:
            if (r2 == 0) goto L10
            int r9 = r2.intValue()
            eٕۧ r10 = new eٕۧ
            r10.<init>(r1, r9)
            return r10
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1955e.ad(eّۡۜ, java.lang.String):eٕۧ");
    }
}
