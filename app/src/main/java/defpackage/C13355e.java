package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13355e extends AbstractC7654e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C9414e f26608e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C13355e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final long f26609e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final EnumC14727e f26610e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final List f26611e;

    public C13355e(EnumC14727e enumC14727e, List list, long j, C0193e c0193e) {
        super(f26608e, c0193e);
        this.f26610e = enumC14727e;
        this.f26609e = j;
        this.f26611e = AbstractC4224e.billing("available_items", list);
    }

    public static C13355e vip(C13355e c13355e, EnumC14727e enumC14727e, List list, long j, int i) {
        if ((i & 1) != 0) {
            enumC14727e = c13355e.f26610e;
        }
        EnumC14727e enumC14727e2 = enumC14727e;
        if ((i & 2) != 0) {
            list = c13355e.f26611e;
        }
        C0193e ad = c13355e.ad();
        c13355e.getClass();
        return new C13355e(enumC14727e2, list, j, ad);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13355e)) {
            return false;
        }
        C13355e c13355e = (C13355e) obj;
        return AbstractC7890e.billing(ad(), c13355e.ad()) && this.f26610e == c13355e.f26610e && AbstractC7890e.billing(this.f26611e, c13355e.f26611e) && this.f26609e == c13355e.f26609e;
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int billing = AbstractC17861e.billing((this.f26610e.hashCode() + (ad().hashCode() * 37)) * 37, 37, this.f26611e);
        long j = this.f26609e;
        int i2 = billing + ((int) (j ^ (j >>> 32)));
        this.f15551e = i2;
        return i2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("source=" + this.f26610e);
        List list = this.f26611e;
        if (!list.isEmpty()) {
            arrayList.add("available_items=" + list);
        }
        arrayList.add("loaded_at=" + this.f26609e);
        return AbstractC13480e.m3608try(arrayList, ", ", "VkxPlaylistsWidgetState{", "}", null, 56);
    }
}
