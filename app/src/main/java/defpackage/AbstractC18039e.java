package defpackage;

import android.content.res.Configuration;
import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘۟ۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18039e {
    public static final C13946e ad = new C13946e(0.16f, 0.1f, 0.08f, 0.1f);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.C14718e r6, defpackage.AbstractC9049e r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C12484e
            if (r0 == 0) goto L13
            r0 = r7
            eّٕؑ r0 = (defpackage.C12484e) r0
            int r1 = r0.f24996e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24996e = r1
            goto L18
        L13:
            eّٕؑ r0 = new eّٕؑ
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f24994e
            int r1 = r0.f24996e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eِٔٔ r6 = r0.f24995e
            defpackage.AbstractC2003e.purchase(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.AbstractC2003e.purchase(r7)
        L32:
            r0.f24995e = r6
            r0.f24996e = r2
            eْۘٞ r7 = defpackage.EnumC13456e.f26727e
            java.lang.Object r7 = r6.metrica(r7, r0)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r7 != r1) goto L41
            return r1
        L41:
            eؔٓؔ r7 = (defpackage.C2561e) r7
            java.lang.Object r1 = r7.ad
            int r3 = r1.size()
            r4 = 0
        L4a:
            if (r4 >= r3) goto L5c
            java.lang.Object r5 = r1.get(r4)
            eؘؔٞ r5 = (defpackage.C2401e) r5
            boolean r5 = defpackage.AbstractC17957e.vip(r5)
            if (r5 != 0) goto L59
            goto L32
        L59:
            int r4 = r4 + 1
            goto L4a
        L5c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC18039e.ad(eِٔٔ, eٌۡۖ):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [eٍَٖ, java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, eِٓٝ, eؕٛؓ] */
    public static InterfaceC3477e appmetrica(int i, Function0 function0) {
        C15802e c15802e = C15802e.f31127e;
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            return new C5363e(function0);
        }
        if (m2467class == 1) {
            ?? obj = new Object();
            obj.f31690e = function0;
            obj.f31689e = c15802e;
            return obj;
        }
        if (m2467class != 2) {
            throw new C14803e(10);
        }
        ?? obj2 = new Object();
        obj2.f27630e = function0;
        obj2.f27629e = c15802e;
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        if (r14 == r5) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068 A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00a3, B:15:0x00ab, B:17:0x00b7, B:19:0x00c3, B:21:0x00c6, B:24:0x00c9, B:28:0x00cd, B:32:0x0041, B:34:0x0064, B:36:0x0068, B:40:0x0086, B:45:0x004b), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object billing(defpackage.C14718e r11, defpackage.InterfaceC11944e r12, defpackage.C2561e r13, defpackage.AbstractC9049e r14) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC18039e.billing(eِٔٔ, eِٖۘ, eؔٓؔ, eٌۡۖ):java.lang.Object");
    }

    public static C6473e license(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new C6473e(new C4730e(AbstractC12026e.smaato(configuration))) : C6473e.ad(configuration.locale);
    }

    public static final Object metrica(InterfaceC13742e interfaceC13742e, InterfaceC18191e interfaceC18191e, InterfaceC11944e interfaceC11944e, InterfaceC5083e interfaceC5083e) {
        C3427e c3427e = (C3427e) interfaceC13742e;
        c3427e.getClass();
        Object metrica = AbstractC13406e.metrica(interfaceC13742e, new C18042e(new Csuper(AbstractC5851e.mopub(c3427e).f27601e), interfaceC18191e, interfaceC11944e, (InterfaceC5083e) null), interfaceC5083e);
        return metrica == EnumC2821e.f6782e ? metrica : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fc A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002d, B:13:0x00e4, B:15:0x00ec, B:17:0x00f0, B:19:0x00fc, B:21:0x0108, B:62:0x00be), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:34:0x0041, B:35:0x007a, B:37:0x0082, B:39:0x008e, B:41:0x009a, B:52:0x0061), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r11v3, types: [eٍؚؔ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object purchase(defpackage.C14718e r9, defpackage.InterfaceC18191e r10, defpackage.Csuper r11, defpackage.C2561e r12, defpackage.AbstractC9049e r13) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC18039e.purchase(eِٔٔ, eؘٚ, super, eؔٓؔ, eٌۡۖ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c6, code lost:
    
        if (r14 == r5) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095 A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00c9, B:15:0x00d1, B:17:0x00de, B:19:0x00ea, B:21:0x00ed, B:24:0x00f0, B:28:0x00f4, B:35:0x0091, B:37:0x0095, B:38:0x0097, B:40:0x009b, B:42:0x00a1, B:44:0x00a5, B:46:0x00ab, B:48:0x00af, B:49:0x00b4, B:58:0x0051, B:60:0x005f, B:61:0x0064, B:64:0x0062), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00c9, B:15:0x00d1, B:17:0x00de, B:19:0x00ea, B:21:0x00ed, B:24:0x00f0, B:28:0x00f4, B:35:0x0091, B:37:0x0095, B:38:0x0097, B:40:0x009b, B:42:0x00a1, B:44:0x00a5, B:46:0x00ab, B:48:0x00af, B:49:0x00b4, B:58:0x0051, B:60:0x005f, B:61:0x0064, B:64:0x0062), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1 A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00c9, B:15:0x00d1, B:17:0x00de, B:19:0x00ea, B:21:0x00ed, B:24:0x00f0, B:28:0x00f4, B:35:0x0091, B:37:0x0095, B:38:0x0097, B:40:0x009b, B:42:0x00a1, B:44:0x00a5, B:46:0x00ab, B:48:0x00af, B:49:0x00b4, B:58:0x0051, B:60:0x005f, B:61:0x0064, B:64:0x0062), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6, types: [eؚٓٞ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object vip(defpackage.C14718e r10, defpackage.InterfaceC11944e r11, defpackage.C2561e r12, int r13, defpackage.AbstractC9049e r14) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC18039e.vip(eِٔٔ, eِٖۘ, eؔٓؔ, int, eٌۡۖ):java.lang.Object");
    }

    public static String yandex(AbstractC13532e abstractC13532e) {
        StringBuilder sb = new StringBuilder(abstractC13532e.startapp());
        for (int i = 0; i < abstractC13532e.startapp(); i++) {
            byte appmetrica = abstractC13532e.appmetrica(i);
            if (appmetrica == 34) {
                sb.append("\\\"");
            } else if (appmetrica == 39) {
                sb.append("\\'");
            } else if (appmetrica != 92) {
                switch (appmetrica) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (appmetrica < 32 || appmetrica > 126) {
                            sb.append('\\');
                            sb.append((char) (((appmetrica >>> 6) & 3) + 48));
                            sb.append((char) (((appmetrica >>> 3) & 7) + 48));
                            sb.append((char) ((appmetrica & 7) + 48));
                            break;
                        } else {
                            sb.append((char) appmetrica);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
