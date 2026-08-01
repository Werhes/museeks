package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۚٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17249e extends AbstractC1837e implements InterfaceC3143e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final transient int f33786e;

    public C17249e() {
        super(C3638e.vip(12));
        this.f33786e = 2;
        this.f33786e = 2;
    }

    @Override // defpackage.AbstractC1837e
    public final Collection billing() {
        return C11313e.appmetrica(this.f33786e);
    }

    @Override // defpackage.AbstractC1837e, defpackage.InterfaceC3143e
    public final Collection get(Object obj) {
        return (Set) super.get(obj);
    }

    @Override // defpackage.AbstractC10415e, defpackage.InterfaceC3143e
    public final Collection mopub() {
        return (Set) super.mopub();
    }

    @Override // defpackage.AbstractC1837e
    public final Collection startapp(Object obj, Collection collection) {
        return new C9691e(this, obj, (Set) collection);
    }
}
