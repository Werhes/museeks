package defpackage;

import java.util.Locale;
import java.util.UUID;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۥٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7596e {
    public final C16723e ad;
    public final C10618e vip;

    public C7596e(C16723e c16723e, C10618e c10618e) {
        this.ad = c16723e;
        this.vip = c10618e;
    }

    public final C5707e ad(C5707e c5707e) {
        String str;
        this.vip.getClass();
        String lowerCase = AbstractC6507e.subscription(UUID.randomUUID().toString(), "-", BuildConfig.FLAVOR, false).toLowerCase(Locale.ROOT);
        return new C5707e(c5707e != null ? c5707e.metrica + 1 : 0, this.ad.ad().vip, lowerCase, (c5707e == null || (str = c5707e.vip) == null) ? lowerCase : str);
    }
}
