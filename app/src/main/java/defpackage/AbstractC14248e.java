package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٓۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14248e {
    public static final Object ad;

    static {
        new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(PSKKeyManager.MAX_KEY_LENGTH_BYTES).build();
        ad = new Object();
    }
}
