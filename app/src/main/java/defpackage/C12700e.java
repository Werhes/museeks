package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۘۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C12700e extends C18297e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f25435e;

    public C12700e(int i) {
        super(i == 2000 ? 2001 : i);
        this.f25435e = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12700e(int r2, int r3, java.io.IOException r4) {
        /*
            r1 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r2 != r0) goto L9
            r0 = 1
            if (r3 != r0) goto L9
            r2 = 2001(0x7d1, float:2.804E-42)
        L9:
            r1.<init>(r4, r2)
            r1.f25435e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12700e.<init>(int, int, java.io.IOException):void");
    }

    public C12700e(String str, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.f25435e = 1;
    }

    public C12700e(String str, IOException iOException, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.f25435e = 1;
    }

    public static C12700e ad(int i, IOException iOException) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !AbstractC3628e.tapsense(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new C12700e("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new C12700e(i2, i, iOException);
    }
}
