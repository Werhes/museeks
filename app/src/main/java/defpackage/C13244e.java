package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٓۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13244e extends AbstractC11130e {
    public final boolean equals(Object obj) {
        if (!(obj instanceof C13244e)) {
            return false;
        }
        C13244e c13244e = (C13244e) obj;
        return AbstractC7890e.billing((String) this.f22047e, (String) c13244e.f22047e) && AbstractC7890e.billing((List) this.f22046e, (List) c13244e.f22046e);
    }

    public final int hashCode() {
        return ((List) this.f22046e).hashCode() + (((String) this.f22047e).hashCode() * 31);
    }
}
