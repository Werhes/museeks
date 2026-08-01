package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٓٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14013e {
    public static final C14013e appmetrica = new C14013e(InterfaceC6744e.ad, 1, C3295e.f7451e);
    public final InterfaceC6744e ad;
    public final int vip;
    public final LinkedHashMap metrica = new LinkedHashMap();
    public final LinkedHashMap license = new LinkedHashMap();

    public C14013e(InterfaceC6744e interfaceC6744e, int i, Set set) {
        this.ad = interfaceC6744e;
        this.vip = i;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C14677e c14677e = (C14677e) it.next();
            C13047e c13047e = new C13047e(new C8397e(this.ad, c14677e), this.vip);
            if (!new ArrayList(c13047e.ad.keySet()).isEmpty()) {
                this.metrica.put(c14677e, c13047e);
            }
        }
        this.metrica.keySet();
    }

    public final C13047e ad(C14677e c14677e) {
        boolean vip = c14677e.vip();
        LinkedHashMap linkedHashMap = this.metrica;
        if (vip) {
            return (C13047e) linkedHashMap.get(c14677e);
        }
        LinkedHashMap linkedHashMap2 = this.license;
        Object obj = linkedHashMap2.get(c14677e);
        if (obj == null) {
            obj = AbstractC17140e.vip(c14677e, linkedHashMap.keySet()) ? new C13047e(new C8397e(this.ad, c14677e), this.vip) : null;
            linkedHashMap2.put(c14677e, obj);
        }
        return (C13047e) obj;
    }
}
