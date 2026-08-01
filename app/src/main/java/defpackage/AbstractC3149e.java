package defpackage;

import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3149e {
    public static final C18478e ad;
    public static C18478e vip;

    static {
        Object obj = null;
        ad = new C18478e(24, obj, obj, obj);
    }

    public static void ad(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static final void appmetrica(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                AbstractC15211e.ad(16);
                String num = Integer.toString(charAt, 16);
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in header name: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final String billing(C11997e c11997e) {
        String appmetrica = AbstractC14436e.appmetrica(c11997e, C3166e.ad);
        if (appmetrica.length() == 0) {
            appmetrica = "/";
        }
        String vip2 = vip(c11997e);
        if (vip2.length() == 0) {
            return appmetrica;
        }
        return appmetrica + " [" + vip2 + ']';
    }

    public static void license(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
        jArr2[7] = jArr[7];
    }

    public static final void metrica(C15783e c15783e, String str, String str2) {
        ArrayList arrayList = c15783e.ad;
        arrayList.add(str);
        arrayList.add(AbstractC5304e.m1855const(str2).toString());
    }

    public static final void purchase(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                AbstractC15211e.ad(16);
                String num = Integer.toString(charAt, 16);
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(AbstractC10220e.mopub(str2) ? BuildConfig.FLAVOR : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final String vip(C11997e c11997e) {
        C11997e c11997e2 = c11997e.f23979e;
        String vip2 = c11997e2 != null ? vip(c11997e2) : null;
        AbstractC2803e abstractC2803e = c11997e.f23980e;
        if ((abstractC2803e instanceof C18110e) || (abstractC2803e instanceof C3176e) || (abstractC2803e instanceof C6810e) || (abstractC2803e instanceof C17695e) || (abstractC2803e instanceof C18358e)) {
            return vip2 == null ? BuildConfig.FLAVOR : vip2;
        }
        String obj = abstractC2803e.toString();
        return (vip2 == null || vip2.length() == 0) ? obj : obj.length() == 0 ? vip2 : AbstractC4653e.isPro(vip2, ", ", obj);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:35)
        */
    public static final defpackage.C13590e yandex(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
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
}
