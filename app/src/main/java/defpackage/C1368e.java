package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒ۠ؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1368e extends AbstractC12782e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C8455e f4162e = new C8455e(6);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ArrayList f4163e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1368e() {
        super(f4162e);
        ArrayList arrayList = new ArrayList();
        this.f4163e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1368e) && AbstractC7890e.billing(this.f4163e, ((C1368e) obj).f4163e);
    }

    public final int hashCode() {
        return this.f4163e.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("PluginsTrace("), AbstractC13480e.m3608try(this.f4163e, null, null, null, null, 63), ')');
    }
}
