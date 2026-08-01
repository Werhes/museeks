package defpackage;

import java.lang.reflect.Type;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٟؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16397e implements InterfaceC15088e {
    public abstract Type ad();

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC16397e) && AbstractC7890e.billing(ad(), ((AbstractC16397e) obj).ad());
    }

    public final int hashCode() {
        return ad().hashCode();
    }

    @Override // defpackage.InterfaceC16902e
    public C2430e license(C12816e c12816e) {
        Object obj;
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (AbstractC7890e.billing(AbstractC2677e.ad(((InterfaceC18155e) AbstractC14437e.appmetrica(((C2430e) obj).ad)).subs()).ad(), c12816e)) {
                break;
            }
        }
        return (C2430e) obj;
    }

    public final String toString() {
        return getClass().getName() + ": " + ad();
    }
}
