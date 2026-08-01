package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۛۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7460e extends AbstractC3160e implements InterfaceC17282e, InterfaceC5261e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f15232e;

    public C7460e(int i, Class cls, String str, String str2, int i2) {
        this(i, C11625e.f23330e, cls, str, str2, i2, 0);
    }

    public C7460e(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f15232e = i;
    }

    @Override // defpackage.AbstractC3160e
    public final InterfaceC15954e admob() {
        return (InterfaceC5261e) super.admob();
    }

    @Override // defpackage.AbstractC3160e
    public final InterfaceC15954e advert() {
        return AbstractC3820e.ad.ad(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7460e) {
            C7460e c7460e = (C7460e) obj;
            return this.f7267e.equals(c7460e.f7267e) && this.f7264e.equals(c7460e.f7264e) && AbstractC7890e.billing(this.f7266e, c7460e.f7266e) && AbstractC7890e.billing(amazon(), c7460e.amazon());
        }
        if (obj instanceof InterfaceC5261e) {
            return obj.equals(adcel());
        }
        return false;
    }

    @Override // defpackage.InterfaceC5261e
    /* renamed from: eٕٗٛ */
    public final boolean mo1845e() {
        return ((InterfaceC5261e) super.admob()).mo1845e();
    }

    @Override // defpackage.InterfaceC17282e
    public final int getArity() {
        return this.f15232e;
    }

    public final int hashCode() {
        return this.f7264e.hashCode() + AbstractC1786e.advert(amazon() == null ? 0 : amazon().hashCode() * 31, 31, this.f7267e);
    }

    @Override // defpackage.InterfaceC5261e
    /* renamed from: return */
    public final boolean mo1846return() {
        return ((InterfaceC5261e) super.admob()).mo1846return();
    }

    @Override // defpackage.AbstractC3160e, defpackage.InterfaceC15954e
    public final boolean tapsense() {
        return ((InterfaceC5261e) super.admob()).tapsense();
    }

    public final String toString() {
        InterfaceC15954e adcel = adcel();
        if (adcel != this) {
            return adcel.toString();
        }
        String str = this.f7267e;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC5087e.m1746extends("function ", str, " (Kotlin reflection is not available)");
    }

    @Override // defpackage.InterfaceC5261e
    public final boolean yandex() {
        return ((InterfaceC5261e) super.admob()).yandex();
    }
}
