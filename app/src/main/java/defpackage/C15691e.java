package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۙٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15691e extends C15929e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final List f30904e;

    public C15691e(String str, String str2) {
        this(Collections.singletonList(str), AbstractC17861e.subscription("Field '", str, "' is required for type with serial name '", str2, "', but it was missing"), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C15691e(java.lang.String r5, java.util.ArrayList r6) {
        /*
            r4 = this;
            int r0 = r6.size()
            r1 = 1
            if (r0 != r1) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Field '"
            r0.<init>(r1)
            r1 = 0
            java.lang.Object r1 = r6.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "' is required for type with serial name '"
            java.lang.String r3 = "', but it was missing"
            java.lang.String r5 = defpackage.AbstractC4653e.ads(r0, r1, r2, r5, r3)
            goto L39
        L1e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Fields "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = " are required for type with serial name '"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = "', but they were missing"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
        L39:
            r0 = 0
            r4.<init>(r6, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15691e.<init>(java.lang.String, java.util.ArrayList):void");
    }

    public C15691e(List list, String str, C15691e c15691e) {
        super(str, c15691e);
        this.f30904e = list;
    }
}
