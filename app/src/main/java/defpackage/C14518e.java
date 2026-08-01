package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؖۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14518e implements InterfaceC8064e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Integer f28701e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public C4438e f28702e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f28703e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ArrayList f28704e = new ArrayList();

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public String f28705e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public C5564e f28706e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C1828e f28707e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C14943e f28708e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public boolean f28709e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Integer f28710e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C4903e f28711e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public List f28712e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public EnumC3923e f28713e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f28714e;

    @Override // defpackage.InterfaceC3811e
    public final Object ad() {
        int intValue;
        List list = this.f28712e;
        Integer num = this.f28710e;
        int i = 0;
        ArrayList arrayList = this.f28704e;
        if (num == null) {
            Iterator it = arrayList.iterator();
            float f = 0.0f;
            while (it.hasNext()) {
                C14943e c14943e = ((C6900e) it.next()).vip;
                if (c14943e != null) {
                    f = Math.max(f, c14943e.ad);
                }
            }
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        boolean z = this.f28714e;
        C1828e c1828e = this.f28707e;
        boolean z2 = !this.f28709e;
        Integer num2 = this.f28701e;
        if (num2 != null) {
            i = num2.intValue();
        }
        return new C2697e(arrayList, list, intValue, c1828e, i, z, z2, this.f28713e);
    }
}
