package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٚٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6491e implements InterfaceC7970e {
    public static final Object metrica = new Object();
    public volatile Object ad = metrica;
    public volatile InterfaceC7970e vip;

    public C6491e(InterfaceC7970e interfaceC7970e) {
        this.vip = interfaceC7970e;
    }

    @Override // defpackage.InterfaceC7970e
    public final Object get() {
        Object obj;
        Object obj2 = this.ad;
        Object obj3 = metrica;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.ad;
                if (obj == obj3) {
                    obj = this.vip.get();
                    this.ad = obj;
                    this.vip = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
