package defpackage;

import android.os.Build;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۚۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2848e implements InterfaceC12935e {
    public static final boolean metrica;
    public final UUID ad;
    public final byte[] vip;

    static {
        boolean z;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                metrica = z;
            }
        }
        z = false;
        metrica = z;
    }

    public C2848e(UUID uuid, byte[] bArr) {
        this.ad = uuid;
        this.vip = bArr;
    }
}
