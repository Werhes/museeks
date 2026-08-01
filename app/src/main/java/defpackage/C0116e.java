package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؗۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116e implements Comparator {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Csuper f1277e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f1278e;

    public /* synthetic */ C0116e(Csuper csuper, int i) {
        this.f1278e = i;
        this.f1277e = csuper;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1278e) {
            case 0:
                Object key = ((InterfaceC8848e) obj).getKey();
                Csuper csuper = this.f1277e;
                return AbstractC0258e.vip(Integer.valueOf(csuper.applovin(key)), Integer.valueOf(csuper.applovin(((InterfaceC8848e) obj2).getKey())));
            case 1:
                Object key2 = ((InterfaceC8848e) obj).getKey();
                Csuper csuper2 = this.f1277e;
                return AbstractC0258e.vip(Integer.valueOf(csuper2.applovin(key2)), Integer.valueOf(csuper2.applovin(((InterfaceC8848e) obj2).getKey())));
            case 2:
                Object key3 = ((InterfaceC8848e) obj2).getKey();
                Csuper csuper3 = this.f1277e;
                return AbstractC0258e.vip(Integer.valueOf(csuper3.applovin(key3)), Integer.valueOf(csuper3.applovin(((InterfaceC8848e) obj).getKey())));
            default:
                Object key4 = ((InterfaceC8848e) obj2).getKey();
                Csuper csuper4 = this.f1277e;
                return AbstractC0258e.vip(Integer.valueOf(csuper4.applovin(key4)), Integer.valueOf(csuper4.applovin(((InterfaceC8848e) obj).getKey())));
        }
    }
}
