package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6274e {
    public static C6274e metrica;
    public final Context ad;
    public volatile String vip;

    public C6274e(Context context) {
        this.ad = context.getApplicationContext();
    }

    public static C6274e ad(Context context) {
        AbstractC9528e.startapp(context);
        synchronized (C6274e.class) {
            try {
                if (metrica == null) {
                    AbstractC8527e.ad(context);
                    metrica = new C6274e(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return metrica;
    }

    public static AbstractBinderC7599e license(PackageInfo packageInfo, AbstractBinderC7599e... abstractBinderC7599eArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            BinderC3559e binderC3559e = new BinderC3559e(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < abstractBinderC7599eArr.length; i++) {
                if (abstractBinderC7599eArr[i].equals(binderC3559e)) {
                    return abstractBinderC7599eArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f6, code lost:
    
        r5 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean metrica(android.content.pm.PackageInfo r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6274e.metrica(android.content.pm.PackageInfo, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01de A[LOOP:0: B:6:0x0018->B:13:0x01de, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01f0 A[EDGE_INSN: B:14:0x01f0->B:15:0x01f0 BREAK  A[LOOP:0: B:6:0x0018->B:13:0x01de], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean vip(int r18) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6274e.vip(int):boolean");
    }
}
