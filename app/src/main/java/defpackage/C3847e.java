package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؖؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3847e extends AbstractC17557e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final List f8505e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ArrayList f8506e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C10068e f8507e;

    public C3847e(C10068e c10068e, C1169e c1169e, ArrayList arrayList, C1543e c1543e) {
        if (c1543e.vip != arrayList.size() + 1) {
            throw new IllegalArgumentException("Outline progress size is expected to be the cubics size + 1");
        }
        int i = c1543e.vip;
        if (i == 0) {
            AbstractC14783e.startapp("FloatList is empty.");
            throw null;
        }
        float[] fArr = c1543e.ad;
        int i2 = 0;
        float f = 0.0f;
        if (fArr[0] != 0.0f) {
            throw new IllegalArgumentException("First outline progress value is expected to be zero");
        }
        if (i == 0) {
            AbstractC14783e.startapp("FloatList is empty.");
            throw null;
        }
        if (fArr[i - 1] != 1.0f) {
            throw new IllegalArgumentException("Last outline progress value is expected to be one");
        }
        this.f8507e = c10068e;
        this.f8505e = c1169e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i2 < size) {
            int i3 = i2 + 1;
            if (c1543e.vip(i3) - c1543e.vip(i2) > 1.0E-4f) {
                arrayList2.add(new C0787e(this, (C4211e) arrayList.get(i2), f, c1543e.vip(i3)));
                f = c1543e.vip(i3);
            }
            i2 = i3;
        }
        C0787e c0787e = (C0787e) arrayList2.get(AbstractC6874e.billing(arrayList2));
        float f2 = c0787e.metrica;
        if (1.0f < f2) {
            throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
        }
        c0787e.metrica = f2;
        c0787e.license = 1.0f;
        this.f8506e = arrayList2;
    }

    @Override // defpackage.AbstractC7674e, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0787e) {
            return super.contains((C0787e) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (C0787e) this.f8506e.get(i);
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0787e) {
            return super.indexOf((C0787e) obj);
        }
        return -1;
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0787e) {
            return super.lastIndexOf((C0787e) obj);
        }
        return -1;
    }

    @Override // defpackage.AbstractC7674e
    public final int subs() {
        return this.f8506e.size();
    }
}
