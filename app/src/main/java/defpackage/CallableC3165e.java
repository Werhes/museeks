package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class CallableC3165e implements Callable {
    public final /* synthetic */ boolean ad;
    public final /* synthetic */ BinderC3559e metrica;
    public final /* synthetic */ String vip;

    public /* synthetic */ CallableC3165e(boolean z, String str, BinderC3559e binderC3559e) {
        this.ad = z;
        this.vip = str;
        this.metrica = binderC3559e;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z = this.ad;
        String str = this.vip;
        BinderC3559e binderC3559e = this.metrica;
        String str2 = (z || !AbstractC8527e.metrica(str, binderC3559e, true, false).f24694e) ? "not allowed" : "debug cert rejected";
        int i = 0;
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i++;
        }
        AbstractC9528e.startapp(messageDigest);
        byte[] digest = messageDigest.digest(binderC3559e.appmetrica);
        int length = digest.length;
        char[] cArr = new char[length + length];
        int i2 = 0;
        for (byte b : digest) {
            char[] cArr2 = AbstractC0865e.vip;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
            i2 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z + ", ver=12451000.false";
    }
}
