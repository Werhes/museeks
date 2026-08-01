package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9262e {
    public static final C2892e ad = new C2892e(-842556484, false, new C7478e(23));

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(final kotlin.jvm.functions.Function0 r26, final defpackage.C2892e r27, defpackage.InterfaceC12864e r28, kotlin.jvm.functions.Function2 r29, kotlin.jvm.functions.Function2 r30, final kotlin.jvm.functions.Function2 r31, final kotlin.jvm.functions.Function2 r32, defpackage.InterfaceC16154e r33, long r34, long r36, long r38, long r40, float r42, defpackage.C9207e r43, defpackage.C13770e r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9262e.ad(kotlin.jvm.functions.Function0, eؔ۟ٓ, eّۤۧ, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, eّٖؖ, long, long, long, long, float, eٍَؓ, eٓؕۥ, int, int, int):void");
    }

    public static final String appmetrica(long j, CharSequence charSequence) {
        return charSequence.subSequence(C12347e.billing(j), C12347e.purchase(j)).toString();
    }

    public static final long license(int i, long j) {
        int i2 = C12347e.metrica;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : metrica(i4, i);
    }

    public static final long metrica(int i, int i2) {
        if (i < 0 || i2 < 0) {
            AbstractC5525e.ad("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (i2 & 4294967295L) | (i << 32);
        int i3 = C12347e.metrica;
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Throwable purchase(java.lang.Throwable r3) {
        /*
            r0 = r3
        L1:
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L18
            r1 = r0
            java.util.concurrent.CancellationException r1 = (java.util.concurrent.CancellationException) r1
            java.lang.Throwable r2 = r1.getCause()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L13
            goto L1a
        L13:
            java.lang.Throwable r0 = r1.getCause()
            goto L1
        L18:
            if (r0 != 0) goto L1b
        L1a:
            return r3
        L1b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9262e.purchase(java.lang.Throwable):java.lang.Throwable");
    }

    public static final C4600e vip() {
        StringBuilder sb = new StringBuilder("https://vk.com/audios");
        C14027e.ad.getClass();
        sb.append(C14027e.metrica());
        sb.append("?section=explore");
        return new C4600e(sb.toString(), 7);
    }
}
