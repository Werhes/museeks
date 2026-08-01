package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٟٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8874e extends AbstractC7654e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C10108e f17827e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C8874e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f17828e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final EnumC0698e f17829e;

    public C8874e(EnumC0698e enumC0698e, boolean z, C0193e c0193e) {
        super(f17827e, c0193e);
        this.f17829e = enumC0698e;
        this.f17828e = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8874e)) {
            return false;
        }
        C8874e c8874e = (C8874e) obj;
        return AbstractC7890e.billing(ad(), c8874e.ad()) && this.f17829e == c8874e.f17829e && this.f17828e == c8874e.f17828e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = ((this.f17829e.hashCode() + (ad().hashCode() * 37)) * 37) + (this.f17828e ? 1231 : 1237);
        this.f15551e = hashCode;
        return hashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("provider=" + this.f17829e);
        AbstractC8647e.m2460this(new StringBuilder("enabled="), this.f17828e, arrayList);
        return AbstractC13480e.m3608try(arrayList, ", ", "LyricsProviderConfig{", "}", null, 56);
    }
}
