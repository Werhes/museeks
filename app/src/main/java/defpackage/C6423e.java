package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6423e extends AbstractC2358e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2358e f13305e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final transient int f13306e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient int f13307e;

    public C6423e(AbstractC2358e abstractC2358e, int i, int i2) {
        this.f13305e = abstractC2358e;
        this.f13306e = i;
        this.f13307e = i2;
    }

    @Override // defpackage.AbstractC2358e, java.util.List
    /* renamed from: adcel, reason: merged with bridge method [inline-methods] */
    public final AbstractC2358e subList(int i, int i2) {
        AbstractC1596e.startapp(i, i2, this.f13307e);
        int i3 = this.f13306e;
        return this.f13305e.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.AbstractC14048e
    public final int billing() {
        return this.f13305e.yandex() + this.f13306e + this.f13307e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1596e.yandex(i, this.f13307e);
        return this.f13305e.get(i + this.f13306e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13307e;
    }

    @Override // defpackage.AbstractC14048e
    public final Object[] startapp() {
        return this.f13305e.startapp();
    }

    @Override // defpackage.AbstractC14048e
    public final int yandex() {
        return this.f13305e.yandex() + this.f13306e;
    }
}
