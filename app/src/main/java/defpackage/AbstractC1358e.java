package defpackage;

import java.io.IOException;
import java.security.Provider;
import java.security.Security;
import java.util.Hashtable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒ۟ٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1358e {
    public static C8496e ad;
    public static final String[] vip = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static void ad(StringBuilder sb, C16221e c16221e, Hashtable hashtable) {
        boolean z = true;
        if (c16221e.f31872e.f36388e.length <= 1) {
            if (c16221e.loadAd() != null) {
                vip(sb, c16221e.loadAd(), hashtable);
                return;
            }
            return;
        }
        C0153e[] admob = c16221e.admob();
        for (int i = 0; i != admob.length; i++) {
            if (z) {
                z = false;
            } else {
                sb.append('+');
            }
            vip(sb, admob[i], hashtable);
        }
    }

    public static synchronized C10682e adcel(C9257e c9257e) {
        C10682e c10682e;
        synchronized (AbstractC1358e.class) {
            try {
                if (ad == null) {
                    ad = new C8496e(0);
                }
                c10682e = (C10682e) ad.m4615e(c9257e);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c10682e;
    }

    public static final long appmetrica(InterfaceC17430e interfaceC17430e, long j) {
        interfaceC17430e.request(j);
        long min = Math.min(j, interfaceC17430e.metrica().f24832e);
        interfaceC17430e.metrica().skip(min);
        return min;
    }

    public static Provider billing() {
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(vip[i]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:35)
        */
    public static defpackage.C7179e license(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r46v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        if (r7 >= r0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String metrica(defpackage.subs r9) {
        /*
            java.lang.String r9 = startapp(r9)
            int r0 = r9.length()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L41
            char r0 = r9.charAt(r1)
            r3 = 35
            if (r0 != r3) goto L41
            int r0 = r9.length()     // Catch: java.io.IOException -> L2c
            int r0 = r0 - r2
            byte[] r0 = defpackage.AbstractC7240e.vip(r0, r9)     // Catch: java.io.IOException -> L2c
            default r0 = defpackage.Cdefault.inmobi(r0)     // Catch: java.io.IOException -> L2c
            boolean r3 = r0 instanceof defpackage.Cnew
            if (r3 == 0) goto L41
            new r0 = (defpackage.Cnew) r0
            java.lang.String r9 = r0.yandex()
            goto L41
        L2c:
            r9 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unknown encoding in name: "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L41:
            java.lang.String r9 = defpackage.AbstractC1433e.license(r9)
            int r0 = r9.length()
            r3 = 2
            if (r0 >= r3) goto L4d
            return r9
        L4d:
            int r0 = r0 - r2
            r3 = r1
        L4f:
            r4 = 92
            r5 = 32
            if (r3 >= r0) goto L66
            char r6 = r9.charAt(r3)
            if (r6 != r4) goto L66
            int r6 = r3 + 1
            char r6 = r9.charAt(r6)
            if (r6 != r5) goto L66
            int r3 = r3 + 2
            goto L4f
        L66:
            int r6 = r3 + 1
            r7 = r0
        L69:
            if (r7 <= r6) goto L7c
            int r8 = r7 + (-1)
            char r8 = r9.charAt(r8)
            if (r8 != r4) goto L7c
            char r8 = r9.charAt(r7)
            if (r8 != r5) goto L7c
            int r7 = r7 + (-2)
            goto L69
        L7c:
            if (r3 > 0) goto L80
            if (r7 >= r0) goto L85
        L80:
            int r7 = r7 + r2
            java.lang.String r9 = r9.substring(r3, r7)
        L85:
            java.lang.String r0 = "  "
            int r0 = r9.indexOf(r0)
            if (r0 >= 0) goto L8e
            return r9
        L8e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r9.charAt(r1)
            r0.append(r1)
        L9a:
            int r3 = r9.length()
            if (r2 >= r3) goto Laf
            char r3 = r9.charAt(r2)
            if (r1 != r5) goto La8
            if (r3 == r5) goto Lac
        La8:
            r0.append(r3)
            r1 = r3
        Lac:
            int r2 = r2 + 1
            goto L9a
        Laf:
            java.lang.String r9 = r0.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1358e.metrica(subs):java.lang.String");
    }

    public static final boolean purchase(long j, long j2) {
        return j == j2;
    }

    public static String startapp(subs subsVar) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (!(subsVar instanceof Cnew) || (subsVar instanceof C12180e)) {
            try {
                sb.append('#');
                byte[] smaato = subsVar.billing().smaato();
                C2873e c2873e = AbstractC7240e.ad;
                sb.append(AbstractC7240e.appmetrica(0, smaato.length, smaato));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String yandex = ((Cnew) subsVar).yandex();
            if (yandex.length() > 0 && yandex.charAt(0) == '#') {
                sb.append('\\');
            }
            sb.append(yandex);
        }
        int length = sb.length();
        int i2 = (sb.length() >= 2 && sb.charAt(0) == '\\' && sb.charAt(1) == '#') ? 2 : 0;
        while (i2 != length) {
            char charAt = sb.charAt(i2);
            if (charAt != '\"' && charAt != '\\' && charAt != '+' && charAt != ',') {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i2++;
                        continue;
                }
            }
            sb.insert(i2, "\\");
            i2 += 2;
            length++;
        }
        if (sb.length() > 0) {
            while (sb.length() > i && sb.charAt(i) == ' ') {
                sb.insert(i, "\\");
                i += 2;
            }
        }
        for (int length2 = sb.length() - 1; length2 >= i && sb.charAt(length2) == ' '; length2--) {
            sb.insert(length2, '\\');
        }
        return sb.toString();
    }

    public static void vip(StringBuilder sb, C0153e c0153e, Hashtable hashtable) {
        String str = (String) hashtable.get(c0153e.f1387e);
        if (str == null) {
            str = c0153e.f1387e.m4673class();
        }
        sb.append(str);
        sb.append('=');
        sb.append(startapp(c0153e.f1386e));
    }

    public static boolean yandex(C16221e c16221e, C16221e c16221e2) {
        if (c16221e.f31872e.f36388e.length != c16221e2.f31872e.f36388e.length) {
            return false;
        }
        C0153e[] admob = c16221e.admob();
        C0153e[] admob2 = c16221e2.admob();
        if (admob.length != admob2.length) {
            return false;
        }
        for (int i = 0; i != admob.length; i++) {
            C0153e c0153e = admob[i];
            C0153e c0153e2 = admob2[i];
            if (c0153e != c0153e2 && (c0153e == null || c0153e2 == null || !c0153e.f1387e.isVip(c0153e2.f1387e) || !metrica(c0153e.f1386e).equals(metrica(c0153e2.f1386e)))) {
                return false;
            }
        }
        return true;
    }
}
