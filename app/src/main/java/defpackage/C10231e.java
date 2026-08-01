package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10231e implements InterfaceC12635e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public volatile List f20236e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f20237e;

    public C10231e(Object obj) {
        this.f20237e = obj;
    }

    @Override // defpackage.InterfaceC12635e
    public final int adcel() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10231e) {
            return AbstractC7890e.billing(this.f20237e, ((C10231e) obj).f20237e);
        }
        return false;
    }

    @Override // defpackage.InterfaceC12635e
    public final String getName() {
        return "PluginConfigT";
    }

    @Override // defpackage.InterfaceC12635e
    public final List getUpperBounds() {
        List list = this.f20236e;
        if (list != null) {
            return list;
        }
        C12232e c12232e = AbstractC3820e.ad;
        List singletonList = Collections.singletonList(c12232e.smaato(c12232e.vip(Object.class), Collections.EMPTY_LIST, true));
        this.f20236e = singletonList;
        return singletonList;
    }

    public final int hashCode() {
        Object obj = this.f20237e;
        return ((obj != null ? obj.hashCode() : 0) * 31) + 749883007;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int m2467class = AbstractC8703e.m2467class(1);
        if (m2467class == 0) {
            Unit unit = Unit.INSTANCE;
        } else if (m2467class == 1) {
            sb.append("in ");
        } else {
            if (m2467class != 2) {
                throw new C14803e(10);
            }
            sb.append("out ");
        }
        sb.append("PluginConfigT");
        return sb.toString();
    }
}
