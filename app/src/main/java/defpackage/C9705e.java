package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۘۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9705e extends AbstractC6484e {
    public static final Parcelable.Creator<C9705e> CREATOR = new C1304e(23);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f19203e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f19204e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f19205e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final List f19206e;

    public C9705e(ArrayList arrayList, boolean z, String str, String str2) {
        AbstractC9528e.startapp(arrayList);
        this.f19206e = arrayList;
        this.f19204e = z;
        this.f19203e = str;
        this.f19205e = str2;
    }

    public static C9705e billing(List list, boolean z) {
        TreeSet treeSet = new TreeSet(C11797e.f23675e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((InterfaceC12533e) it.next()).ad());
        }
        return new C9705e(new ArrayList(treeSet), z, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C9705e)) {
            return false;
        }
        C9705e c9705e = (C9705e) obj;
        return this.f19204e == c9705e.f19204e && AbstractC5729e.vip(this.f19206e, c9705e.f19206e) && AbstractC5729e.vip(this.f19203e, c9705e.f19203e) && AbstractC5729e.vip(this.f19205e, c9705e.f19205e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19204e), this.f19206e, this.f19203e, this.f19205e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isVip(parcel, 1, this.f19206e);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f19204e ? 1 : 0);
        AbstractC16852e.remoteconfig(parcel, 3, this.f19203e);
        AbstractC16852e.remoteconfig(parcel, 4, this.f19205e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
