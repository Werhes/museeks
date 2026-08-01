package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۜۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18381e {
    public static final C2271e license = new C17519e(0);
    public final C2271e ad = new C17519e(0);
    public final C17548e vip = new C17548e(0);
    public final C2271e metrica = new C17519e(0);

    public final synchronized C2580e ad(C8130e c8130e, Object obj, String str) {
        C2580e license2;
        try {
            AbstractC9528e.startapp(obj);
            license2 = c8130e.license(obj, str);
            C9364e c9364e = (C9364e) license2.vip;
            AbstractC9528e.adcel(c9364e, "Key must not be null");
            Set set = (Set) this.ad.get(str);
            if (set == null) {
                set = new C17548e(0);
                this.ad.put(str, set);
            }
            set.add(c9364e);
        } catch (Throwable th) {
            throw th;
        }
        return license2;
    }

    public final synchronized C0560e license(AbstractC6950e abstractC6950e, C9364e c9364e) {
        String str;
        try {
            this.vip.remove(c9364e);
            Iterator it = ((C15627e) this.ad.keySet()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                str = (String) it.next();
                Set set = (Set) this.ad.get(str);
                if (set.contains(c9364e)) {
                    set.remove(c9364e);
                    break;
                }
            }
            if (str != null) {
                Iterator it2 = ((C10442e) this.metrica.entrySet()).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (AbstractC5092e.vip(entry.getValue(), str).equals(c9364e)) {
                        this.metrica.remove(entry.getKey());
                        break;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return abstractC6950e.metrica(c9364e, 0);
    }

    public final synchronized C0560e metrica(AbstractC6950e abstractC6950e, String str) {
        C17548e c17548e = new C17548e(0);
        Set set = (Set) this.ad.get(str);
        if (set == null) {
            return AbstractC1749e.yandex(c17548e);
        }
        C17548e c17548e2 = new C17548e(0);
        c17548e2.addAll(set);
        C6748e c6748e = new C6748e(c17548e2);
        while (c6748e.hasNext()) {
            C9364e c9364e = (C9364e) c6748e.next();
            if (this.vip.contains(c9364e)) {
                c17548e.add(license(abstractC6950e, c9364e));
            }
        }
        this.ad.remove(str);
        return AbstractC1749e.yandex(c17548e);
    }

    public final synchronized C0560e vip(C8130e c8130e, C10312e c10312e) {
        C0560e vip;
        C9364e c9364e = (C9364e) ((C2580e) ((C0462e) c10312e.f20361e).f2534e).vip;
        AbstractC9528e.adcel(c9364e, "Key must not be null");
        boolean add = this.vip.add(c9364e);
        vip = c8130e.vip(c10312e);
        C5609e c5609e = new C5609e(this, c8130e, c9364e, add);
        vip.getClass();
        vip.license(AbstractC10468e.ad, c5609e);
        return vip;
    }
}
