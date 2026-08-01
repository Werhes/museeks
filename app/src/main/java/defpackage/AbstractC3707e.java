package defpackage;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.KeyStore;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۢۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3707e {
    static {
        new BigInteger("551222861474729630828211419619667128155611726319");
    }

    public static C11280e ad(Context context) {
        InputStream openRawResource = context.getResources().openRawResource(R.raw.vk_cacerts);
        BufferedInputStream bufferedInputStream = openRawResource instanceof BufferedInputStream ? (BufferedInputStream) openRawResource : new BufferedInputStream(openRawResource, 262144);
        try {
            KeyStore keyStore = KeyStore.getInstance("BKS");
            keyStore.load(bufferedInputStream, "vkcerts".toCharArray());
            bufferedInputStream.close();
            return new C11280e(AbstractC7762e.Signature(new C2167e(AbstractC7762e.billing(new C11927e(keyStore.aliases())), new C10981e(1, keyStore, KeyStore.class, "getCertificate", "getCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;", 0, 0, 12))), keyStore);
        } finally {
        }
    }
}
