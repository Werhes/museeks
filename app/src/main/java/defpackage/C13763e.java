package defpackage;

import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import javax.crypto.Cipher;

/* renamed from: eٖٓؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13763e extends FilterOutputStream {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f27273e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Cipher f27274e;

    public C13763e(DataOutputStream dataOutputStream, Cipher cipher) {
        super(dataOutputStream);
        this.f27273e = new byte[1];
        this.f27274e = cipher;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(4:1|2|(1:4)|6)|7|8|(1:10)(1:12)) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r4 = this;
            javax.crypto.Cipher r0 = r4.f27274e     // Catch: java.lang.Exception -> Le java.security.GeneralSecurityException -> L10
            byte[] r0 = r0.doFinal()     // Catch: java.lang.Exception -> Le java.security.GeneralSecurityException -> L10
            if (r0 == 0) goto L12
            java.io.OutputStream r1 = r4.out     // Catch: java.lang.Exception -> Le java.security.GeneralSecurityException -> L10
            r1.write(r0)     // Catch: java.lang.Exception -> Le java.security.GeneralSecurityException -> L10
            goto L12
        Le:
            r0 = move-exception
            goto L14
        L10:
            r0 = move-exception
            goto L29
        L12:
            r0 = 0
            goto L32
        L14:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error closing stream: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
        L27:
            r0 = r1
            goto L32
        L29:
            class r1 = new class
            java.lang.String r2 = "Error during cipher finalisation"
            r3 = 2
            r1.<init>(r2, r0, r3)
            goto L27
        L32:
            r4.flush()     // Catch: java.io.IOException -> L3b
            java.io.OutputStream r1 = r4.out     // Catch: java.io.IOException -> L3b
            r1.close()     // Catch: java.io.IOException -> L3b
            goto L3f
        L3b:
            r1 = move-exception
            if (r0 != 0) goto L3f
            r0 = r1
        L3f:
            if (r0 != 0) goto L42
            return
        L42:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13763e.close():void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        byte[] bArr = this.f27273e;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        byte[] update = this.f27274e.update(bArr, i, i2);
        if (update != null) {
            ((FilterOutputStream) this).out.write(update);
        }
    }
}
