package defpackage;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class CallableC13061e implements Callable {
    public final /* synthetic */ int ad;
    public final /* synthetic */ String metrica;
    public final /* synthetic */ C10961e vip;

    public /* synthetic */ CallableC13061e(C10961e c10961e, String str, int i) {
        this.ad = i;
        this.vip = c10961e;
        this.metrica = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.ad) {
            case 0:
                return new C6021e(new CallableC13061e(this.vip, this.metrica, 1));
            case 1:
                C10961e c10961e = this.vip;
                C1248e c1248e = c10961e.f19060e.f30353e;
                C15398e.m3939break(c1248e);
                String str = this.metrica;
                C0956e m549e = c1248e.m549e(str);
                HashMap hashMap = new HashMap();
                hashMap.put("platform", "android");
                hashMap.put("package_name", str);
                ((C6936e) c10961e.f36443e).f14221e.m2814e();
                hashMap.put("gmp_version", 161000L);
                if (m549e != null) {
                    String m442protected = m549e.m442protected();
                    if (m442protected != null) {
                        hashMap.put("app_version", m442protected);
                    }
                    hashMap.put("app_version_int", Long.valueOf(m549e.m432abstract()));
                    hashMap.put("dynamite_version", Long.valueOf(m549e.vip()));
                }
                return hashMap;
            default:
                C7302e c7302e = new C7302e(this.vip, this.metrica, false, 7);
                C1738e c1738e = new C1738e("internal.remoteConfig", 0);
                c1738e.f20169e.put("getValue", new C6021e(c1738e, c7302e));
                return c1738e;
        }
    }
}
