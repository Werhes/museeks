package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؓٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1635e {
    public static final String[] metrica = {"*", "FCM", "GCM", BuildConfig.FLAVOR};
    public final SharedPreferences ad;
    public final String vip;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r1.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1635e(defpackage.C14679e r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.ad()
            android.content.Context r0 = r4.ad
            java.lang.String r1 = "com.google.android.gms.appid"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r3.ad = r0
            r4.ad()
            eِۣ٘ r0 = r4.metrica
            java.lang.String r1 = r0.appmetrica
            if (r1 == 0) goto L1b
            goto L48
        L1b:
            r4.ad()
            java.lang.String r1 = r0.vip
            java.lang.String r4 = "1:"
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L31
            java.lang.String r4 = "2:"
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L31
            goto L48
        L31:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r1.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L3e
        L3c:
            r1 = r2
            goto L48
        L3e:
            r0 = 1
            r1 = r4[r0]
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L48
            goto L3c
        L48:
            r3.vip = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1635e.<init>(eّٜٔ):void");
    }

    public final String ad() {
        String string;
        synchronized (this.ad) {
            string = this.ad.getString("|S|id", null);
        }
        return string;
    }

    public final String vip() {
        PublicKey publicKey;
        synchronized (this.ad) {
            String str = null;
            String string = this.ad.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                Log.w("ContentValues", "Invalid key stored " + e);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return str;
        }
    }
}
