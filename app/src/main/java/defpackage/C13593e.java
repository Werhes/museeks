package defpackage;

import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۣۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C13593e extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C13593e(int r5, int r6, int r7, java.lang.IndexOutOfBoundsException r8) {
        /*
            r4 = this;
            long r0 = (long) r5
            long r5 = (long) r6
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r2 = "Pos: "
            java.lang.String r3 = ", limit: "
            java.lang.StringBuilder r0 = defpackage.AbstractC1786e.inmobi(r0, r2, r3)
            r0.append(r5)
            java.lang.String r5 = ", len: "
            r0.append(r5)
            r0.append(r7)
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            java.lang.String r5 = r6.concat(r5)
            r4.<init>(r5, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13593e.<init>(int, int, int, java.lang.IndexOutOfBoundsException):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C13593e(long r2, long r4, int r6, java.lang.IndexOutOfBoundsException r7, int r8) {
        /*
            r1 = this;
            switch(r8) {
                case 18: goto L26;
                default: goto L3;
            }
        L3:
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r8 = "Pos: "
            java.lang.String r0 = ", limit: "
            java.lang.StringBuilder r2 = defpackage.AbstractC1786e.inmobi(r2, r8, r0)
            r2.append(r4)
            java.lang.String r3 = ", len: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            java.lang.String r2 = r3.concat(r2)
            r1.<init>(r2, r7)
            return
        L26:
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r8 = "Pos: "
            java.lang.String r0 = ", limit: "
            java.lang.StringBuilder r2 = defpackage.AbstractC1786e.inmobi(r2, r8, r0)
            r2.append(r4)
            java.lang.String r3 = ", len: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            java.lang.String r2 = r3.concat(r2)
            r1.<init>(r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13593e.<init>(long, long, int, java.lang.IndexOutOfBoundsException, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C13593e(java.io.File r3, java.io.File r4, java.lang.String r5) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            if (r4 == 0) goto L1c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = " -> "
            r3.<init>(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
        L1c:
            if (r5 == 0) goto L27
            java.lang.String r3 = ": "
            java.lang.String r3 = r3.concat(r5)
            r0.append(r3)
        L27:
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13593e.<init>(java.io.File, java.io.File, java.lang.String):void");
    }

    public C13593e(IOException iOException, Object... objArr) {
        super(String.format(Locale.getDefault(), "Cannot modify %s because do not have permissions to create files in the folder", objArr), iOException);
    }

    public /* synthetic */ C13593e(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13593e(String str, IndexOutOfBoundsException indexOutOfBoundsException, int i) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        switch (i) {
            case 15:
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
                return;
            default:
                return;
        }
    }

    public C13593e(Throwable th) {
        super(th != null ? th.getMessage() : null, th);
    }
}
