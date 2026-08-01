package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6973e {
    public static final Object purchase = new Object();
    public final String ad;
    public final Object metrica;
    public final InterfaceC13204e vip;
    public final Object license = new Object();
    public volatile Object appmetrica = null;

    public /* synthetic */ C6973e(String str, Object obj, InterfaceC13204e interfaceC13204e) {
        this.ad = str;
        this.metrica = obj;
        this.vip = interfaceC13204e;
    }

    public final Object ad(Object obj) {
        synchronized (this.license) {
        }
        if (obj != null) {
            return obj;
        }
        if (AbstractC1101e.ad == null) {
            return this.metrica;
        }
        synchronized (purchase) {
            try {
                if (C7936e.yandex()) {
                    return this.appmetrica == null ? this.metrica : this.appmetrica;
                }
                try {
                    for (C6973e c6973e : AbstractC17254e.ad) {
                        if (C7936e.yandex()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            InterfaceC13204e interfaceC13204e = c6973e.vip;
                            if (interfaceC13204e != null) {
                                obj2 = interfaceC13204e.ad();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (purchase) {
                            c6973e.appmetrica = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC13204e interfaceC13204e2 = this.vip;
                if (interfaceC13204e2 != null) {
                    try {
                        return interfaceC13204e2.ad();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.metrica;
            } finally {
            }
        }
    }
}
