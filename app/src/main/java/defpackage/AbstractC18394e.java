package defpackage;

import android.os.Build;
import android.os.IBinder;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e۟ۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC18394e {
    public static final int ad;
    public static final UUID appmetrica;
    public static final UUID license;
    public static final UUID metrica;
    public static final UUID purchase;
    public static final UUID vip;

    static {
        ad = Build.VERSION.SDK_INT >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
        vip = new UUID(0L, 0L);
        metrica = new UUID(1186680826959645954L, -5988876978535335093L);
        license = new UUID(-2129748144642739255L, 8654423357094679310L);
        appmetrica = new UUID(-1301668207276963122L, -6645017420763422227L);
        purchase = new UUID(-7348484286925749626L, -6083546864340672619L);
    }
}
