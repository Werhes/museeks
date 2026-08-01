package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۣۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12849e {
    public static final float ad = 2500;
    public static final float vip = 1500;
    public static final float metrica = 50;

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00c2. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da A[Catch: eؔۜۖ -> 0x01a0, TRY_ENTER, TRY_LEAVE, TryCatch #5 {eؔۜۖ -> 0x01a0, blocks: (B:26:0x00bc, B:33:0x00da, B:40:0x0100, B:42:0x0114, B:45:0x0129, B:48:0x0131), top: B:25:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0067  */
    /* JADX WARN: Type inference failed for: r12v0, types: [eؚؖٞ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.Object, eٔۦْ] */
    /* JADX WARN: Type inference failed for: r7v3, types: [eٍؚؔ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x017a -> B:21:0x0184). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.C12143e r27, int r28, int r29, defpackage.InterfaceC14388e r30, defpackage.AbstractC10731e r31) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12849e.ad(eؙِۨ, int, int, eٓۦۣ, eُؑ۠):java.lang.Object");
    }

    public static final boolean metrica(C12143e c12143e, int i) {
        return i <= c12143e.appmetrica() && c12143e.metrica() <= i;
    }

    public static final boolean vip(boolean z, C12143e c12143e, int i) {
        if (z) {
            if (c12143e.metrica() > i) {
                return true;
            }
            return c12143e.metrica() == i && c12143e.license() > 0;
        }
        if (c12143e.metrica() < i) {
            return true;
        }
        return c12143e.metrica() == i && c12143e.license() < 0;
    }
}
