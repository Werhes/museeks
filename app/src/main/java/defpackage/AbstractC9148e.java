package defpackage;

import java.util.HashMap;
import org.conscrypt.PSKKeyManager;

/* renamed from: eٌْۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9148e {
    public static final /* synthetic */ int ad = 0;

    static {
        HashMap hashMap = new HashMap();
        new C17968e();
        hashMap.put("MD5", new C11047e(28));
        new C12013e();
        hashMap.put("SHA-1", new C4524e(28));
        new C5486e();
        hashMap.put("SHA-224", new C17354e(28));
        new C7952e();
        hashMap.put("SHA-256", new C9616e(28));
        new C9071e();
        hashMap.put("SHA-384", new C14914e(28));
        new C15708e();
        hashMap.put("SHA-512", new C15802e(28));
        int i = 28;
        hashMap.put(ad().getAlgorithmName(), new C12575e(i));
        hashMap.put(vip().getAlgorithmName(), new C5107e(i));
        hashMap.put(metrica().getAlgorithmName(), new C5170e((byte) 0, 29));
        int i2 = 28;
        hashMap.put(license().getAlgorithmName(), new C16628e(i2));
        hashMap.put(new C16253e(128).getAlgorithmName(), new C5438e(i2));
        hashMap.put(new C16253e(PSKKeyManager.MAX_KEY_LENGTH_BYTES).getAlgorithmName(), new C4590e(i2));
    }

    public static C9147e ad() {
        return new C9147e(224);
    }

    public static C9147e license() {
        return new C9147e(AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE);
    }

    public static C9147e metrica() {
        return new C9147e(384);
    }

    public static C9147e vip() {
        return new C9147e(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }
}
