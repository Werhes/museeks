package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؗٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5034e implements InterfaceC16060e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C15677e f10725e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C10815e f10726e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C10815e f10727e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f10728e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C9541e f10729e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC14388e f10730e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C9580e f10731e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C9541e f10732e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C5776e f10733e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C9541e f10734e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f10735e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C9580e f10736e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C15677e f10737e;

    public C5034e(long j, InterfaceC14388e interfaceC14388e, C5776e c5776e) {
        int mo493e = interfaceC14388e.mo493e(AbstractC5711e.ad);
        this.f10735e = j;
        this.f10730e = interfaceC14388e;
        this.f10728e = mo493e;
        this.f10733e = c5776e;
        int mo493e2 = interfaceC14388e.mo493e(C8163e.ad(j));
        C9577e c9577e = C5438e.f11672e;
        this.f10725e = new C15677e(c9577e, c9577e, mo493e2);
        C9577e c9577e2 = C5438e.f11680e;
        this.f10737e = new C15677e(c9577e2, c9577e2, mo493e2);
        this.f10736e = new C9580e(AbstractC15849e.metrica);
        this.f10731e = new C9580e(AbstractC15849e.license);
        int mo493e3 = interfaceC14388e.mo493e(C8163e.vip(j));
        C14544e c14544e = C5438e.f11685e;
        C14544e c14544e2 = C5438e.f11667e;
        this.f10734e = new C9541e(c14544e, c14544e2, mo493e3);
        this.f10729e = new C9541e(c14544e2, c14544e, mo493e3);
        this.f10732e = new C9541e(C5438e.f11668e, c14544e, mo493e3);
        this.f10727e = new C10815e(c14544e, mo493e);
        this.f10726e = new C10815e(c14544e2, mo493e);
    }

    @Override // defpackage.InterfaceC16060e
    public final long advert(C10163e c10163e, long j, EnumC7792e enumC7792e, long j2) {
        C10163e c10163e2;
        long j3;
        char c;
        int i;
        int i2;
        char c2 = ' ';
        int i3 = (int) (j >> 32);
        int i4 = 0;
        List startapp = AbstractC6874e.startapp(this.f10725e, this.f10737e, ((int) (c10163e.ad() >> 32)) < i3 / 2 ? this.f10736e : this.f10731e);
        int size = startapp.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                c10163e2 = c10163e;
                j3 = j;
                c = c2;
                i = 0;
                break;
            }
            InterfaceC16047e interfaceC16047e = (InterfaceC16047e) startapp.get(i5);
            int i6 = (int) (j2 >> c2);
            int i7 = size;
            c = c2;
            j3 = j;
            int i8 = i5;
            c10163e2 = c10163e;
            i = interfaceC16047e.ad(c10163e2, j3, i6, enumC7792e);
            if (i8 == AbstractC6874e.billing(startapp) || (i >= 0 && i6 + i <= i3)) {
                break;
            }
            i5 = i8 + 1;
            size = i7;
            c2 = c;
        }
        int i9 = (int) (j3 & 4294967295L);
        List startapp2 = AbstractC6874e.startapp(this.f10734e, this.f10729e, this.f10732e, ((int) (c10163e2.ad() & 4294967295L)) < i9 / 2 ? this.f10727e : this.f10726e);
        int size2 = startapp2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            int i11 = (int) (j2 & 4294967295L);
            int ad = ((InterfaceC6065e) startapp2.get(i10)).ad(c10163e2, j3, i11);
            if (i10 == AbstractC6874e.billing(startapp2) || (ad >= (i2 = this.f10728e) && i11 + ad <= i9 - i2)) {
                i4 = ad;
                break;
            }
        }
        long j4 = (i << c) | (i4 & 4294967295L);
        this.f10733e.invoke(c10163e2, AbstractC18366e.vip(j4, j2));
        return j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5034e) {
            C5034e c5034e = (C5034e) obj;
            if (this.f10735e == c5034e.f10735e && AbstractC7890e.billing(this.f10730e, c5034e.f10730e) && this.f10728e == c5034e.f10728e && AbstractC7890e.billing(this.f10733e, c5034e.f10733e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f10735e;
        return this.f10733e.hashCode() + ((((this.f10730e.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31) + this.f10728e) * 961);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) C8163e.metrica(this.f10735e)) + ", density=" + this.f10730e + ", verticalMargin=" + this.f10728e + ", horizontalMargin=0, onPositionCalculated=" + this.f10733e + ')';
    }
}
