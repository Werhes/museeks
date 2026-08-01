package defpackage;

import java.io.IOException;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؔٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2571e implements InterfaceC18435e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C2448e f6422e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public AbstractC0468e f6423e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC8850e f6424e;

    /* JADX WARN: Type inference failed for: r4v2, types: [eؚؖٞ, java.lang.Object] */
    public C2571e(InterfaceC8850e interfaceC8850e, InterfaceC13033e interfaceC13033e, String str, Long l, long j) {
        int i;
        char c;
        char c2;
        char c3;
        char c4;
        this.f6424e = interfaceC8850e;
        C17713e c17713e = AbstractC16588e.ad;
        C1622e c1622e = AbstractC2339e.ad;
        if (!AbstractC5304e.m1863import(str, "multipart/", true)) {
            throw new IOException("Failed to parse multipart: Content-Type should be multipart/* but it is " + ((Object) str));
        }
        int length = str.length();
        char c5 = 0;
        int i2 = 0;
        while (true) {
            c = 3;
            if (i >= length) {
                c2 = '\"';
                c3 = 2;
                c4 = ';';
                i = -1;
                break;
            }
            char charAt = str.charAt(i);
            if (c5 != 0) {
                if (c5 != 1) {
                    if (c5 == 2) {
                        if (charAt != '\"') {
                            if (charAt != ',') {
                                if (charAt != ';') {
                                }
                                c5 = 1;
                            }
                            c5 = 0;
                        }
                        c5 = 3;
                    } else if (c5 != 3) {
                        if (c5 != 4) {
                        }
                        c5 = 3;
                    } else {
                        if (charAt != '\"') {
                            if (charAt == '\\') {
                                c5 = 4;
                            }
                        }
                        c5 = 1;
                    }
                } else if (charAt == '=') {
                    c5 = 2;
                } else if (charAt != ';') {
                    if (charAt != ',') {
                        if (charAt == ' ') {
                            continue;
                        } else {
                            if (i2 == 0) {
                                c3 = 2;
                                c4 = ';';
                                c2 = '\"';
                                if (AbstractC5304e.m1862implements(str, i, "boundary=", 0, 9, true)) {
                                    break;
                                }
                            }
                            i2++;
                        }
                    }
                    c5 = 0;
                }
            } else {
                i = charAt != ';' ? i + 1 : 0;
                c5 = 1;
            }
            i2 = 0;
        }
        if (i == -1) {
            throw new IOException("Failed to parse multipart: Content-Type's boundary parameter is missing");
        }
        int i3 = i + 9;
        byte[] bArr = new byte[74];
        ?? obj = new Object();
        AbstractC16588e.metrica(obj, bArr, (byte) 13);
        AbstractC16588e.metrica(obj, bArr, (byte) 10);
        AbstractC16588e.metrica(obj, bArr, (byte) 45);
        AbstractC16588e.metrica(obj, bArr, (byte) 45);
        int length2 = str.length();
        char c6 = 0;
        while (i3 < length2) {
            char charAt2 = str.charAt(i3);
            int i4 = 65535 & charAt2;
            if (i4 > 127) {
                StringBuilder sb = new StringBuilder("Failed to parse multipart: wrong boundary byte 0x");
                AbstractC15211e.ad(16);
                sb.append(Integer.toString(i4, 16));
                sb.append(" - should be 7bit character");
                throw new IOException(sb.toString());
            }
            if (c6 == 0) {
                if (charAt2 == ' ') {
                    continue;
                } else if (charAt2 == c2) {
                    c6 = c3;
                } else {
                    if (charAt2 == ',' || charAt2 == c4) {
                        break;
                    }
                    AbstractC16588e.metrica(obj, bArr, (byte) i4);
                    c6 = 1;
                }
                i3++;
                c = 3;
            } else if (c6 == 1) {
                if (charAt2 == ' ' || charAt2 == ',' || charAt2 == c4) {
                    break;
                }
                AbstractC16588e.metrica(obj, bArr, (byte) i4);
                i3++;
                c = 3;
            } else {
                if (c6 == c3) {
                    if (charAt2 == c2) {
                        break;
                    } else if (charAt2 != '\\') {
                        AbstractC16588e.metrica(obj, bArr, (byte) i4);
                    } else {
                        c6 = c;
                    }
                } else if (c6 == c) {
                    AbstractC16588e.metrica(obj, bArr, (byte) i4);
                    c6 = c3;
                }
                i3++;
                c = 3;
            }
        }
        int i5 = obj.f8852e;
        if (i5 == 4) {
            throw new IOException("Empty multipart boundary is not allowed");
        }
        byte[] remoteconfig = AbstractC1660e.remoteconfig(0, i5, bArr);
        Function2 c17543e = new C17543e(interfaceC13033e, new C17713e(remoteconfig, 0, remoteconfig.length), j, l, null);
        C2448e c2448e = new C2448e(AbstractC6494e.loadAd(this, C2693e.f6576e), AbstractC12501e.ad(0, 1, null, 4));
        c2448e.m4472e(1, c2448e, c17543e);
        this.f6422e = c2448e;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.AbstractC15291e r5, defpackage.AbstractC10731e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C9587e
            if (r0 == 0) goto L13
            r0 = r6
            eٍٛۦ r0 = (defpackage.C9587e) r0
            int r1 = r0.f19019e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19019e = r1
            goto L18
        L13:
            eٍٛۦ r0 = new eٍٛۦ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f19017e
            int r1 = r0.f19019e
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            eٍِۙ r5 = r0.f19018e
            defpackage.AbstractC2003e.purchase(r6)     // Catch: java.lang.Throwable -> L27
            goto L4b
        L27:
            r6 = move-exception
            goto L53
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.AbstractC2003e.purchase(r6)
            boolean r6 = r5 instanceof defpackage.C11958e     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto L4e
            r6 = r5
            eٍِۙ r6 = (defpackage.C11958e) r6     // Catch: java.lang.Throwable -> L27
            r1 = r5
            eٍِۙ r1 = (defpackage.C11958e) r1     // Catch: java.lang.Throwable -> L27
            r0.f19018e = r1     // Catch: java.lang.Throwable -> L27
            r0.f19019e = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r4.vip(r6, r0)     // Catch: java.lang.Throwable -> L27
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r6 != r0) goto L4b
            return r0
        L4b:
            eٟؑؒ r6 = (defpackage.AbstractC0468e) r6     // Catch: java.lang.Throwable -> L27
            return r6
        L4e:
            r5.ad()     // Catch: java.lang.Throwable -> L27
            r5 = 0
            return r5
        L53:
            r5.ad()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2571e.ad(eؙٕؖ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f6424e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r6 == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004e -> B:12:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object appmetrica(defpackage.AbstractC10731e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C9154e
            if (r0 == 0) goto L13
            r0 = r6
            eٍؐؔ r0 = (defpackage.C9154e) r0
            int r1 = r0.f18313e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18313e = r1
            goto L18
        L13:
            eٍؐؔ r0 = new eٍؐؔ
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f18312e
            int r1 = r0.f18313e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L36
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r6)     // Catch: defpackage.C3680e -> L56
            goto L51
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.AbstractC2003e.purchase(r6)     // Catch: defpackage.C3680e -> L56
            goto L46
        L36:
            defpackage.AbstractC2003e.purchase(r6)
        L39:
            eًٟؔ r6 = r5.f6422e     // Catch: defpackage.C3680e -> L56
            r0.f18313e = r3     // Catch: defpackage.C3680e -> L56
            eٖٓٞ r6 = r6.f6257e     // Catch: defpackage.C3680e -> L56
            java.lang.Object r6 = r6.mopub(r0)     // Catch: defpackage.C3680e -> L56
            if (r6 != r4) goto L46
            goto L50
        L46:
            eؙٕؖ r6 = (defpackage.AbstractC15291e) r6     // Catch: defpackage.C3680e -> L56
            r0.f18313e = r2     // Catch: defpackage.C3680e -> L56
            java.lang.Object r6 = r5.ad(r6, r0)     // Catch: defpackage.C3680e -> L56
            if (r6 != r4) goto L51
        L50:
            return r4
        L51:
            eٟؑؒ r6 = (defpackage.AbstractC0468e) r6     // Catch: defpackage.C3680e -> L56
            if (r6 == 0) goto L39
            return r6
        L56:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2571e.appmetrica(eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r5 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0062 -> B:16:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(defpackage.AbstractC10731e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C1092e
            if (r0 == 0) goto L13
            r0 = r5
            eٖؒۛ r0 = (defpackage.C1092e) r0
            int r1 = r0.f3631e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3631e = r1
            goto L18
        L13:
            eٖؒۛ r0 = new eٖؒۛ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f3630e
            int r1 = r0.f3631e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 == r3) goto L30
            if (r1 != r2) goto L28
            defpackage.AbstractC2003e.purchase(r5)
            return r5
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L30:
            defpackage.AbstractC2003e.purchase(r5)
            goto L65
        L34:
            defpackage.AbstractC2003e.purchase(r5)
            eٟؑؒ r5 = r4.f6423e
            if (r5 == 0) goto L40
            kotlin.jvm.functions.Function0 r5 = r5.ad
            r5.invoke()
        L40:
            eًٟؔ r5 = r4.f6422e
            eٖٓٞ r5 = r5.f6257e
            java.lang.Object r5 = r5.yandex()
            java.lang.Object r5 = defpackage.C0183e.ad(r5)
            eؙٕؖ r5 = (defpackage.AbstractC15291e) r5
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r5 != 0) goto L5c
            r0.f3631e = r2
            java.lang.Object r5 = r4.appmetrica(r0)
            if (r5 != r1) goto L5b
            goto L64
        L5b:
            return r5
        L5c:
            r0.f3631e = r3
            java.lang.Object r5 = r4.ad(r5, r0)
            if (r5 != r1) goto L65
        L64:
            return r1
        L65:
            eٟؑؒ r5 = (defpackage.AbstractC0468e) r5
            if (r5 == 0) goto L40
            r4.f6423e = r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2571e.metrica(eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x004a, code lost:
    
        if (r12 == r5) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r3v6, types: [eَٖۘ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vip(final defpackage.C11958e r11, defpackage.AbstractC10731e r12) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2571e.vip(eٍِۙ, eُؑ۠):java.lang.Object");
    }
}
