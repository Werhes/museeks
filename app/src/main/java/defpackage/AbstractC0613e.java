package defpackage;

import android.os.Build;
import j$.util.Objects;
import java.nio.charset.Charset;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑ۠۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0613e {
    public static final C6121e ad = new C6121e(2);

    public static AlgorithmParameterSpec ad(int i, int i2, byte[] bArr) {
        Charset charset = AbstractC6336e.ad;
        Integer valueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
        return (valueOf == null || valueOf.intValue() > 19) ? new GCMParameterSpec(128, bArr, i, i2) : new IvParameterSpec(bArr, i, i2);
    }

    public static Cipher metrica() {
        return (Cipher) ad.get();
    }

    public static SecretKeySpec vip(byte[] bArr) {
        AbstractC5058e.ad(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }
}
