package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۥۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3749e {
    public static final C16308e appmetrica;
    public static final C16308e license;
    public C18277e ad;
    public static final Set vip = Collections.singleton(EnumC5730e.CLASS);
    public static final Set metrica = AbstractC1660e.m664case(new EnumC5730e[]{EnumC5730e.FILE_FACADE, EnumC5730e.MULTIFILE_CLASS_PART});

    static {
        new C16308e(new int[]{1, 1, 2}, false);
        license = new C16308e(new int[]{1, 1, 11}, false);
        appmetrica = new C16308e(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (defpackage.C3749e.metrica.contains((defpackage.EnumC5730e) r0.metrica) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C11260e ad(defpackage.InterfaceC9646e r17, defpackage.C6798e r18) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3749e.ad(eٍؚٟ, eؙۧ):eًُۛ");
    }

    public final boolean appmetrica(C6798e c6798e) {
        C18277e c18277e = this.ad;
        if (c18277e == null) {
            c18277e = null;
        }
        ((C11047e) c18277e.metrica).getClass();
        C18277e c18277e2 = this.ad;
        ((C11047e) (c18277e2 != null ? c18277e2 : null).metrica).getClass();
        C4813e c4813e = c6798e.vip;
        return (c4813e.vip & 2) != 0 && ((C16308e) c4813e.license).equals(license);
    }

    public final C16308e license() {
        C18277e c18277e = this.ad;
        if (c18277e == null) {
            c18277e = null;
        }
        ((C11047e) c18277e.metrica).getClass();
        return C16308e.billing;
    }

    public final C1854e metrica(C6798e c6798e) {
        C18277e c18277e = this.ad;
        if (c18277e == null) {
            c18277e = null;
        }
        ((C11047e) c18277e.metrica).getClass();
        C16308e c16308e = (C16308e) c6798e.vip.license;
        C16308e license2 = license();
        boolean z = c16308e.purchase;
        license2.getClass();
        C16308e c16308e2 = z ? C16308e.billing : C16308e.yandex;
        int i = c16308e2.vip;
        int i2 = license2.vip;
        if (i > i2 || (i >= i2 && c16308e2.metrica > license2.metrica)) {
            license2 = c16308e2;
        }
        int i3 = c16308e.metrica;
        int i4 = c16308e.vip;
        boolean z2 = false;
        if ((i4 != 1 || i3 != 0) && i4 != 0) {
            int i5 = license2.vip;
            if (i4 > i5 || (i4 >= i5 && i3 > license2.metrica)) {
                z2 = true;
            }
            z2 = !z2;
        }
        if (z2) {
            return null;
        }
        C16308e c16308e3 = (C16308e) c6798e.vip.license;
        C16308e c16308e4 = C16308e.billing;
        C16308e license3 = license();
        C16308e license4 = license();
        boolean z3 = c16308e3.purchase;
        license4.getClass();
        C16308e c16308e5 = z3 ? c16308e4 : C16308e.yandex;
        int i6 = c16308e5.vip;
        int i7 = license4.vip;
        return new C1854e(c16308e3, c16308e4, license3, (i6 <= i7 && (i6 < i7 || c16308e5.metrica <= license4.metrica)) ? license4 : c16308e5, c6798e.ad());
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (defpackage.C3749e.vip.contains((defpackage.EnumC5730e) r1.metrica) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C5912e purchase(defpackage.C6798e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "Could not read data from "
            eِؚؗ r1 = r10.vip
            java.io.Serializable r2 = r1.appmetrica
            java.lang.String[] r2 = (java.lang.String[]) r2
            if (r2 != 0) goto Le
            java.io.Serializable r2 = r1.purchase
            java.lang.String[] r2 = (java.lang.String[]) r2
        Le:
            r3 = 0
            if (r2 == 0) goto L1e
            java.lang.Object r4 = r1.metrica
            eؘٚۗ r4 = (defpackage.EnumC5730e) r4
            java.util.Set r5 = defpackage.C3749e.vip
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L1e
            goto L1f
        L1e:
            r2 = r3
        L1f:
            if (r2 != 0) goto L23
            goto L9e
        L23:
            java.lang.Object r4 = r1.license
            eٖٙۨ r4 = (defpackage.C16308e) r4
            java.io.Serializable r1 = r1.billing
            java.lang.String[] r1 = (java.lang.String[]) r1
            if (r1 != 0) goto L2f
            goto L9e
        L2f:
            eؙۖؕ r0 = defpackage.C13814e.purchase(r2, r1)     // Catch: java.lang.Throwable -> L35 defpackage.C14226e -> L37
            goto L9c
        L35:
            r0 = move-exception
            goto L4e
        L37:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r10.ad()     // Catch: java.lang.Throwable -> L35
            r5.append(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L35
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L35
            throw r2     // Catch: java.lang.Throwable -> L35
        L4e:
            eٟٓ r1 = r9.ad
            if (r1 == 0) goto L53
            goto L54
        L53:
            r1 = r3
        L54:
            java.lang.Object r1 = r1.metrica
            eُٟٗ r1 = (defpackage.C11047e) r1
            r1.getClass()
            eٖٙۨ r1 = r9.license()
            boolean r2 = r4.purchase
            r1.getClass()
            if (r2 == 0) goto L69
            eٖٙۨ r2 = defpackage.C16308e.billing
            goto L6b
        L69:
            eٖٙۨ r2 = defpackage.C16308e.yandex
        L6b:
            int r5 = r2.vip
            int r6 = r1.vip
            if (r5 <= r6) goto L72
            goto L7b
        L72:
            if (r5 >= r6) goto L75
            goto L7c
        L75:
            int r5 = r2.metrica
            int r6 = r1.metrica
            if (r5 <= r6) goto L7c
        L7b:
            r1 = r2
        L7c:
            int r2 = r4.metrica
            int r5 = r4.vip
            r6 = 0
            r7 = 1
            if (r5 != r7) goto L87
            if (r2 != 0) goto L87
            goto L99
        L87:
            if (r5 != 0) goto L8a
            goto L99
        L8a:
            int r8 = r1.vip
            if (r5 <= r8) goto L90
        L8e:
            r6 = r7
            goto L98
        L90:
            if (r5 >= r8) goto L93
            goto L98
        L93:
            int r1 = r1.metrica
            if (r2 <= r1) goto L98
            goto L8e
        L98:
            r6 = r6 ^ r7
        L99:
            if (r6 != 0) goto Lbb
            r0 = r3
        L9c:
            if (r0 != 0) goto L9f
        L9e:
            return r3
        L9f:
            java.lang.Object r1 = r0.f13544e
            eؘؙۣ r1 = (defpackage.C6746e) r1
            java.lang.Object r0 = r0.f13543e
            eٟؓۦ r0 = (defpackage.C2009e) r0
            eؙٗؗ r2 = new eؙٗؗ
            r9.metrica(r10)
            r9.appmetrica(r10)
            r9.vip(r10)
            r2.<init>(r10)
            eؘؚۜ r10 = new eؘؚۜ
            r10.<init>(r1, r0, r4, r2)
            return r10
        Lbb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3749e.purchase(eؙۧ):eؘؚۜ");
    }

    public final int vip(C6798e c6798e) {
        C18277e c18277e = this.ad;
        if (c18277e == null) {
            c18277e = null;
        }
        ((C11047e) c18277e.metrica).getClass();
        int i = c6798e.vip.vip;
        return ((i & 16) == 0 || (i & 32) != 0) ? 1 : 2;
    }
}
