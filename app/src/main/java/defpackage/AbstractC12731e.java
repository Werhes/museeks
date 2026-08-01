package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12731e {
    public static final C1696e ad = new C1696e("android.widget.extra.CHECKED");

    public static long ad(int i, ByteBuffer byteBuffer) {
        return ((byteBuffer.get() & 255) >> 1) | ((i & 14) << 29) | ((byteBuffer.get() & 255) << 22) | (((byteBuffer.get() & 255) >> 1) << 15) | ((byteBuffer.get() & 255) << 7);
    }

    public static long appmetrica(ByteBuffer byteBuffer) {
        return ((byteBuffer.get() & 14) << 29) | ((byteBuffer.get() & 255) << 22) | (((byteBuffer.get() & 255) >> 1) << 15) | ((byteBuffer.get() & 255) << 7) | ((byteBuffer.get() & 255) >> 1);
    }

    public static final byte[] license(InterfaceC17430e interfaceC17430e, int i) {
        if (i == -1) {
            for (long j = 2147483647L; interfaceC17430e.metrica().f24832e < 2147483647L && interfaceC17430e.request(j); j *= 2) {
            }
            if (interfaceC17430e.metrica().f24832e >= 2147483647L) {
                throw new IllegalStateException(("Can't create an array of size " + interfaceC17430e.metrica().f24832e).toString());
            }
            i = (int) interfaceC17430e.metrica().f24832e;
        } else {
            interfaceC17430e.admob(i);
        }
        byte[] bArr = new byte[i];
        C12402e metrica = interfaceC17430e.metrica();
        long j2 = i;
        int i2 = 0;
        AbstractC8913e.vip(j2, 0, j2);
        while (i2 < i) {
            int mo1230e = metrica.mo1230e(i2, i, bArr);
            if (mo1230e == -1) {
                throw new EOFException(AbstractC8647e.inmobi(i, mo1230e, "Source exhausted before reading ", " bytes. Only ", " bytes were read."));
            }
            i2 += mo1230e;
        }
        return bArr;
    }

    public static final byte[] metrica(InterfaceC17430e interfaceC17430e, int i) {
        long j = i;
        if (j >= 0) {
            return license(interfaceC17430e, i);
        }
        throw new IllegalArgumentException(AbstractC1634e.mopub(j, "byteCount (", ") < 0").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object purchase(kotlin.jvm.functions.Function1 r4, defpackage.InterfaceC5083e r5) {
        /*
            boolean r0 = r5 instanceof defpackage.C1440e
            if (r0 == 0) goto L13
            r0 = r5
            eؒۤۘ r0 = (defpackage.C1440e) r0
            int r1 = r0.f4271e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4271e = r1
            goto L18
        L13:
            eؒۤۘ r0 = new eؒۤۘ
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f4272e
            int r1 = r0.f4271e
            switch(r1) {
                case 0: goto L61;
                case 1: goto L57;
                case 2: goto L46;
                case 3: goto L46;
                case 4: goto L3c;
                case 5: goto L2b;
                case 6: goto L2b;
                case 7: goto L27;
                default: goto L1f;
            }
        L1f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L27:
            defpackage.AbstractC2003e.purchase(r5)
            return r5
        L2b:
            defpackage.AbstractC2003e.purchase(r5)     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r4 = 0
            goto L33
        L31:
            r4 = 0
            throw r4
        L33:
            r4.getClass()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        L3c:
            defpackage.AbstractC2003e.purchase(r5)
            eْؑۧ r5 = (defpackage.AbstractC12974e) r5
            r5.getClass()
            r4 = 0
            throw r4
        L46:
            defpackage.AbstractC2003e.purchase(r5)     // Catch: java.lang.Throwable -> L4a
            goto L4c
        L4a:
            r4 = 0
            goto L4e
        L4c:
            r4 = 0
            throw r4
        L4e:
            r4.getClass()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        L57:
            defpackage.AbstractC2003e.purchase(r5)
            eْؑۧ r5 = (defpackage.AbstractC12974e) r5
            r5.getClass()
            r4 = 0
            throw r4
        L61:
            defpackage.AbstractC2003e.purchase(r5)
            r5 = 7
            r0.f4271e = r5
            java.lang.Object r4 = r4.invoke(r0)
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r4 != r5) goto L70
            return r5
        L70:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12731e.purchase(kotlin.jvm.functions.Function1, eًؗۖ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d1, code lost:
    
        if (r3 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d6, code lost:
    
        if (r12 <= r3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d8, code lost:
    
        r6 = defpackage.AbstractC10432e.metrica(r8, r19, java.lang.Math.max((int) (r10 - r3), 0), java.lang.Math.min(r8.vip(), (int) (r12 - r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f0, code lost:
    
        if (r6 == (-1)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f5, code lost:
    
        r3 = r3 + r8.vip();
        r8 = r8.purchase;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fd, code lost:
    
        if (r8 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0101, code lost:
    
        if (r3 < r12) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f2, code lost:
    
        r6 = r6 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0119, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long vip(defpackage.InterfaceC17430e r18, byte r19, long r20, int r22) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12731e.vip(eٜٗۧ, byte, long, int):long");
    }
}
