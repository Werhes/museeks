package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC16706e implements Callable {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object license;
    public final /* synthetic */ String metrica;
    public final /* synthetic */ SharedPreferences vip;

    public /* synthetic */ CallableC16706e(SharedPreferences sharedPreferences, String str, Object obj, int i) {
        this.ad = i;
        this.vip = sharedPreferences;
        this.metrica = str;
        this.license = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.ad) {
            case 0:
                return Boolean.valueOf(this.vip.getBoolean(this.metrica, ((Boolean) this.license).booleanValue()));
            case 1:
                return Integer.valueOf(this.vip.getInt(this.metrica, ((Integer) this.license).intValue()));
            case 2:
                return Long.valueOf(this.vip.getLong(this.metrica, ((Long) this.license).longValue()));
            default:
                return this.vip.getString(this.metrica, (String) this.license);
        }
    }
}
