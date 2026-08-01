package defpackage;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9505e extends AbstractC6484e {
    public static final Parcelable.Creator<C9505e> CREATOR = new C18517e(3);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public ParcelFileDescriptor f18858e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public byte[] f18859e;

    public static void billing(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("ParcelByteArray", "Could not close stream", e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9505e) {
            return Arrays.equals(this.f18859e, ((C9505e) obj).f18859e);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18859e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        if (r7 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        billing(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
    
        if (r7 == null) goto L39;
     */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0062: MOVE (r4 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:47:0x0062 */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = "ParcelByteArray"
            java.lang.String r1 = "Could not create unlinked file. "
            java.lang.String r2 = "Could not write into unlinked file. "
            byte[] r3 = r9.f18859e
            r4 = 0
            if (r3 == 0) goto Lbf
            android.os.ParcelFileDescriptor r5 = r9.f18858e
            if (r5 == 0) goto L11
            goto Lbf
        L11:
            java.io.File r5 = defpackage.AbstractC0250e.ad     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68
            if (r5 == 0) goto L7c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64 java.lang.IllegalStateException -> L68 java.io.IOException -> L73
            java.lang.String r7 = "teleporter"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L64 java.lang.IllegalStateException -> L68 java.io.IOException -> L73
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L64 java.lang.IllegalStateException -> L68 java.io.IOException -> L73
            r6.append(r7)     // Catch: java.lang.Throwable -> L64 java.lang.IllegalStateException -> L68 java.io.IOException -> L73
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L64 java.lang.IllegalStateException -> L68 java.io.IOException -> L73
            java.lang.String r7 = ".tmp"
            java.io.File r5 = java.io.File.createTempFile(r6, r7, r5)     // Catch: java.lang.Throwable -> L64 java.lang.IllegalStateException -> L68 java.io.IOException -> L73
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68 java.io.FileNotFoundException -> L6a
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68 java.io.FileNotFoundException -> L6a
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r7 = android.os.ParcelFileDescriptor.open(r5, r7)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68 java.io.FileNotFoundException -> L6a
            r5.delete()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68
            android.util.Pair r5 = android.util.Pair.create(r6, r7)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68
            java.lang.Object r7 = r5.first     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68
            java.io.OutputStream r7 = (java.io.OutputStream) r7     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68
            java.io.DataOutputStream r7 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68
            int r6 = r3.length     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e java.lang.IllegalStateException -> L60
            r7.writeInt(r6)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e java.lang.IllegalStateException -> L60
            r7.write(r3)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e java.lang.IllegalStateException -> L60
            java.lang.Object r3 = r5.second     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e java.lang.IllegalStateException -> L60
            android.os.ParcelFileDescriptor r3 = (android.os.ParcelFileDescriptor) r3     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e java.lang.IllegalStateException -> L60
            billing(r7)
            goto Lb6
        L5c:
            r10 = move-exception
            goto L62
        L5e:
            r1 = move-exception
            goto L85
        L60:
            r2 = move-exception
            goto La0
        L62:
            r4 = r7
            goto Lb9
        L64:
            r10 = move-exception
            goto Lb9
        L66:
            r1 = move-exception
            goto L84
        L68:
            r2 = move-exception
            goto L9f
        L6a:
            r3 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68
            java.lang.String r6 = "Temporary file is somehow already deleted"
            r5.<init>(r6, r3)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68
            throw r5     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68
        L73:
            r3 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68
            java.lang.String r6 = "Could not create temporary file"
            r5.<init>(r6, r3)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68
            throw r5     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68
        L7c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68
            java.lang.String r5 = "Must set temp dir before writing this object to a parcel"
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68
            throw r3     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68
        L84:
            r7 = r4
        L85:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L5c
            r3.append(r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L5c
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L5c
            if (r7 == 0) goto L9d
        L9a:
            billing(r7)
        L9d:
            r3 = r4
            goto Lb6
        L9f:
            r7 = r4
        La0:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L5c
            r3.append(r2)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L5c
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L5c
            if (r7 == 0) goto L9d
            goto L9a
        Lb6:
            r9.f18858e = r3
            goto Lbf
        Lb9:
            if (r4 == 0) goto Lbe
            billing(r4)
        Lbe:
            throw r10
        Lbf:
            r0 = 1
            r11 = r11 | r0
            r1 = 20293(0x4f45, float:2.8437E-41)
            int r1 = defpackage.AbstractC16852e.applovin(r10, r1)
            android.os.ParcelFileDescriptor r2 = r9.f18858e
            defpackage.AbstractC16852e.subscription(r10, r0, r2, r11)
            defpackage.AbstractC16852e.ads(r10, r1)
            r9.f18858e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9505e.writeToParcel(android.os.Parcel, int):void");
    }
}
