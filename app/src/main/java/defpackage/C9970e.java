package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؐۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9970e implements InterfaceC5974e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final Charset f19701e = Charset.forName("UTF-8");

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C13431e f19702e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final File f19703e;

    public C9970e(File file) {
        this.f19703e = file;
    }

    public final void ad() {
        File file = this.f19703e;
        if (this.f19702e == null) {
            try {
                this.f19702e = new C13431e(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }

    @Override // defpackage.InterfaceC5974e
    public final void billing(long j, String str) {
        ad();
        if (this.f19702e == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.f19702e.ad(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f19701e));
            while (!this.f19702e.loadAd() && this.f19702e.crashlytics() > 65536) {
                this.f19702e.inmobi();
            }
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004d  */
    /* JADX WARN: Type inference failed for: r4v1, types: [eٖٗٓ, java.lang.Object] */
    @Override // defpackage.InterfaceC5974e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String license() {
        /*
            r7 = this;
            java.io.File r0 = r7.f19703e
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r2
            goto L3e
        Lc:
            r7.ad()
            eْۖۘ r0 = r7.f19702e
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r1}
            int r0 = r0.crashlytics()
            byte[] r0 = new byte[r0]
            eْۖۘ r4 = r7.f19702e     // Catch: java.io.IOException -> L2b
            eَٗٞ r5 = new eَٗٞ     // Catch: java.io.IOException -> L2b
            r6 = 13
            r5.<init>(r0, r3, r6)     // Catch: java.io.IOException -> L2b
            r4.advert(r5)     // Catch: java.io.IOException -> L2b
            goto L33
        L2b:
            r4 = move-exception
            java.lang.String r5 = "A problem occurred while reading the Crashlytics log file."
            java.lang.String r6 = "FirebaseCrashlytics"
            android.util.Log.e(r6, r5, r4)
        L33:
            eٖٗٓ r4 = new eٖٗٓ
            r3 = r3[r1]
            r4.<init>()
            r4.ad = r0
            r4.vip = r3
        L3e:
            if (r4 != 0) goto L42
            r3 = r2
            goto L4b
        L42:
            int r0 = r4.vip
            byte[] r3 = new byte[r0]
            byte[] r4 = r4.ad
            java.lang.System.arraycopy(r4, r1, r3, r1, r0)
        L4b:
            if (r3 == 0) goto L55
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = defpackage.C9970e.f19701e
            r0.<init>(r3, r1)
            return r0
        L55:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9970e.license():java.lang.String");
    }

    @Override // defpackage.InterfaceC5974e
    public final void vip() {
        AbstractC6494e.billing(this.f19702e, "There was a problem closing the Crashlytics log file.");
        this.f19702e = null;
    }
}
